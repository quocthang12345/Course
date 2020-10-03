package com.SpringMVC.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadFileUtils {
	@Autowired
	private ServletContext servletContext;
	public MultipartFile saveFile(MultipartFile path) {
		MultipartFile multipartFile = path;
		if(multipartFile != null || !(multipartFile.isEmpty())) {
			String pathFile = servletContext.getRealPath("/") + "/template/web/image/" + multipartFile.getOriginalFilename();
			try {
				multipartFile.transferTo(new File(pathFile));
			} catch (IllegalStateException | IOException  e) {
				e.printStackTrace();
			} 
		}
		return multipartFile;
	}
}
