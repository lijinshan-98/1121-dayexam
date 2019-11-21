package com.ljs.utils;

import java.io.File;

public class FileUtils {
	public static void main(String[] args) {
		File file = new File("D://图片/123.png");
		
		String fileString = file.getName();
		getExtendName(fileString);
	}
	public static String getExtendName(String fileName){
		//TODO 实现代码
		System.out.println("文件名："+fileName);
		String subString = fileName.substring(3);
		System.out.println("文件后缀名："+subString);
		return "";
	}
}
