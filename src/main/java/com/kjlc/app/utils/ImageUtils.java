package com.kjlc.app.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class ImageUtils {
    
    private static String iconBasePath = "src/main/resources/static/images/uploads/";
    
    public static String save(MultipartFile icon) throws IOException{

        String fileName = FileNameGenerator.generate();
        File thumbnailPath = new File(iconBasePath + fileName + ".png" );
        try {
            FileOutputStream thumbnailOutput = new FileOutputStream(thumbnailPath);
            thumbnailOutput.write(icon.getBytes());
            thumbnailOutput.close();
            thumbnailPath.createNewFile();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return(fileName);
    }
}
