package com.item_bank.springboot.utils;

import org.springframework.util.ClassUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUploadUtils {
    public  static String saveFile(MultipartFile file,String teacherId) throws IOException {
        // 获取上传的文件名称，并结合存放路径，构建新的文件名称
        String fileName = file.getOriginalFilename();
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        fileName = UUID.randomUUID()+suffixName;
        //指定本地文件夹存储图片

        String filePath = ClassUtils.getDefaultClassLoader().getResource("").getPath();

        filePath= filePath+"/static/images/"+teacherId+"/";

        File file1=new File(filePath+fileName);
        // 判断路径是否存在，不存在则新创建一个
        if (!file1.getParentFile().exists()) {
            file1.getParentFile().mkdirs();
        }
        // 将上传文件保存到目标文件目录
        //网络传输的是字节流，所以需要建一个文件（相当于一个容器把这些流水接住），下面这个方法就是灌流操作
        file.transferTo(file1);
        return fileName;
    }

}
