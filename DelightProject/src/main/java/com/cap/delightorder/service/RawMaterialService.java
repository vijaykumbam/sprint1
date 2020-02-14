package com.cap.delightorder.service;

import com.cap.delightorder.dao.RawMaterialDao;
import com.cap.delightorder.dto.RawMaterialBean;

public class RawMaterialService 
{
	RawMaterialDao rawdao = new RawMaterialDao();
	
	public boolean rawMaterialService(RawMaterialBean bean)
	{
		return(rawdao.rawMaterialDao(bean));
	}
	
}
