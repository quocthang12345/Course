package com.SpringMVC.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Component
public class UploadFileUtils {
	@Autowired
	private ServletContext servletContext;
	public String saveFile(CommonsMultipartFile path) {
		CommonsMultipartFile multipartFile = path;
		String namePath =  multipartFile.getOriginalFilename();
		String realPath = "template\\web\\image\\" + multipartFile.getOriginalFilename();
		String pathFile = servletContext.getRealPath("") + "template\\web\\image\\";
		File file = new File(servletContext.getRealPath("") + "template\\web\\image\\"); 
		if(!file.exists()) {
			file.mkdir();
		}
		if(multipartFile != null || !(multipartFile.isEmpty())) {
			try {
				InputStream inputStream  = multipartFile.getInputStream();
				OutputStream outputStream = new FileOutputStream(file);
				int read = 0;
	            byte[] bytes = new byte[1024];
	            while ((read = inputStream.read(bytes)) != -1) {
	                outputStream.write(bytes, 0, read);
	            }
//				multipartFile.transferTo(new File(pathFile));
			} catch (IllegalStateException | IOException  e) {
				e.printStackTrace();
			} 
		}
		return realPath;
	}
}
