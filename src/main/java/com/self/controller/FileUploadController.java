package com.self.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

@Controller
public class FileUploadController {

    @Value("${file.path}")
    private String filePath;
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file){
        try {
            System.out.println("文件："+file.getOriginalFilename());
            String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            System.out.println(extName);
            String fileName = UUID.randomUUID().toString() + extName;
            System.out.println(fileName);
            FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(new File(filePath + fileName)));
//            file.transferTo(new File(filePath+fileName));
        }catch(Exception e){

e.printStackTrace();
        }
//       file.transferTo(new File(filePath+fileName));
        return "filename";
    }
}
