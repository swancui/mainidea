package com.store.utils;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUp {

	public static String fileUpload(HttpServletRequest request, MultipartFile pimage) {
		String pathroot = request.getSession().getServletContext().getRealPath("");
		String path = null;
		if(!pimage.isEmpty()){
			String prefix = UUIDUtil.getUUID();
			String contentType = pimage.getContentType();
			String suffix = contentType.substring(contentType.indexOf("/")+1);
			path = "/upload/"+prefix+"."+suffix;
			File file = new File(pathroot+path);
			if(!file.exists()){
				file.mkdirs();
			}
			try {
				pimage.transferTo(new File(pathroot+path));
			} catch (Exception e) {
				e.printStackTrace();
			}
			path=path.replace("/", "\\");
		}
		return path;
	}
}
