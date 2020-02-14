package com.cap.delightorder.dao;

import com.cap.delightorder.dto.RawMaterialBean;
import com.cap.delightorder.util.RawmaterialRepo;

public class RawMaterialDao
{
	RawmaterialRepo repo = new RawmaterialRepo();
	
	public boolean rawMaterialDao(RawMaterialBean bean)
	{
		
		return(repo.addRawMaterial(bean));
				
	}
	
}
