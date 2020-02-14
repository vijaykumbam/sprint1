package com.cap.delightorder.ui;

import com.cap.delightorder.dto.RawMaterialBean;
import com.cap.delightorder.service.RawMaterialService;

public class UiClass 
{
	
	public static void main(String...args) 
	{
		RawMaterialService rmdobj = new RawMaterialService();
		if(rmdobj.rawMaterialService(new RawMaterialBean("Raworx12345", "Orange", 40, 4000, 100, 30, "vijayvenkatwarehouse", "Checked")));
		{
			System.out.println("added successfully");
		}
	}
}