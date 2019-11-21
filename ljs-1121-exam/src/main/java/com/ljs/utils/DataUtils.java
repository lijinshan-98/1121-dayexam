package com.ljs.utils;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



public class DataUtils {
	public static void main(String[] args) {
		getDateByInitMonth();
	}
	public static String  getDateByInitMonth(){
		
		Date date = new Date();
		DateFormat d1Date = DateFormat.getInstance();
		String date2 = d1Date.format(date);
		System.out.println(date2);
		
		
		return date2;
		//TODO 实现代码
	}
}
