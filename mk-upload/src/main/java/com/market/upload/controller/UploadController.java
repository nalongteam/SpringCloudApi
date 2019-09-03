package com.market.upload.controller;

import com.market.upload.service.UploadServce;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.security.PublicKey;

/**
 * @ClassName UploadController
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/2
 * @Version V1.0
 **/
@RestController
@RequestMapping("upload")
public class UploadController {
    @Autowired
    private UploadServce uploadServce;

    @PostMapping("image")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file){
       String url=this.uploadServce.uploadByFastDFS(file);
       if (StringUtils.isBlank(url)){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }

       return ResponseEntity.status(HttpStatus.OK).body(url);
    }
}
