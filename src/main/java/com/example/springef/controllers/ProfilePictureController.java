package com.example.springef.controllers;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

import static java.io.File.createTempFile;

@Controller
public class ProfilePictureController
{
    public static final Resource PICTURES_DIR = new FileSystemResource("./pictures");

    public static final String DOT = ".";

    @RequestMapping
    public String uploadPage()
    {
        return "profile/uploadPage";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String onUpload(MultipartFile file) throws IOException
    {
        String filename = file.getOriginalFilename();
        File tempFile = createTempFile("pic", getFileExtension(filename), PICTURES_DIR.getFile());

        try (InputStream in = file.getInputStream(); OutputStream out = new FileOutputStream(tempFile))
        {
            IOUtils.copy(in, out);
        }
        return "profile/uploadPage";
    }

    private static String getFileExtension(String name)
    {
        return name.substring(name.lastIndexOf(DOT));
    }
}
