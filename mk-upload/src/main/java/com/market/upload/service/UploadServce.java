package com.market.upload.service;

import com.market.utils.UploadUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
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

    public String upload(MultipartFile file){

        String fileName = file.getOriginalFilename();
        try {
            InputStream inputStream=file.getInputStream();
            Boolean flag= UploadUtil.uploadFile(fileName,inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "http://47.97.90.118/images/"+fileName;
    }
}
