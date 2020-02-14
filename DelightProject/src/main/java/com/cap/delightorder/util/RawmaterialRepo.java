package com.cap.delightorder.util;
import java.util.LinkedList;

import com.cap.delightorder.dto.RawMaterialBean;

public class RawmaterialRepo 
{	
	static LinkedList<RawMaterialBean> llref =new LinkedList<RawMaterialBean>();

	public LinkedList<RawMaterialBean> getLlref() {
		return llref;
	}

	public void setLlref(LinkedList<RawMaterialBean> llref) {
		RawmaterialRepo.llref = llref;
	}

	public boolean addRawMaterial(RawMaterialBean bean)
	{
		llref.add(bean);
		return true;
	}
}