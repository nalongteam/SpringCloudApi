package com.market.upload.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName UploadServce
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
@Service
public class UploadServce {
    //支持的文件类型
    private static final List<String> suffixes= Arrays.asList("image/png","image/jpeg");

    @Autowired
    FastFileStorageClient storageClient;

    public String upload(MultipartFile file){
        //1.图片类型校验
        String type=file.getContentType();
        if(!suffixes.contains(type)){
            return null;
        }

        //2.图片内容校验
        try {
            BufferedImage image= ImageIO.read(file.getInputStream());
            if (image==null){
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //3.保存图片
        File dir=new File("D:\\upload");
        if(!dir.exists()){
            dir.mkdirs();
        }

        //4.保存图片
        try {
            file.transferTo(new File(dir,file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //5.拼接图片地址
        String url="http://image.market.com/upload/"+file.getOriginalFilename();

        return url;
    }

    public String uploadByFastDFS(MultipartFile file){
        try {
            // 1、图片信息校验
            // 1)校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                return null;
            }
            // 2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                return null;
            }

            // 2、将图片上传到FastDFS
            // 2.1、获取文件后缀名
            String extension = StringUtils.substringAfterLast(file.getOriginalFilename(), ".");
            // 2.2、上传
            StorePath storePath = this.storageClient.uploadFile(
                    file.getInputStream(), file.getSize(), extension, null);
            // 2.3、返回完整路径
            return "http://image.market.com/" + storePath.getFullPath();
        } catch (Exception e) {
            return null;
        }
    }
}
