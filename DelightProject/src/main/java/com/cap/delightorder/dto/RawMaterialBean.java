package com.cap.delightorder.dto;

public class RawMaterialBean {
	//data members were private for this class
		private String orderId;
		private String name;                     //user
		private double price_per_unit;           //
		private double quantityValue;            //user          5kgs..etc
		private double quantityUnit;             //user          kgs,liters,grams
		private double price;
		private String warehouseId;              //user
		private String qualityCheck;
		
		
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice_per_unit() {
			return price_per_unit;
		}
		public void setPrice_per_unit(double price_per_unit) {
			this.price_per_unit = price_per_unit;
		}
		public double getQuantityValue() {
			return quantityValue;
		}
		public void setQuantityValue(double quantityValue) {
			this.quantityValue = quantityValue;
		}
		public double getQuantityUnit() {
			return quantityUnit;
		}
		public void setQuantityUnit(double quantityUnit) {
			this.quantityUnit = quantityUnit;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getWarehouseId() {
			return warehouseId;
		}
		public void setWarehouseId(String warehouseId) {
			this.warehouseId = warehouseId;
		}
		public String getQualityCheck() {
			return qualityCheck;
		}
		public void setQualityCheck(String qualityCheck) {
			this.qualityCheck = qualityCheck;
		}
		
		//Constructor ........
		public RawMaterialBean(String orderId, String name, double price_per_unit, double quantityValue,
				double quantityUnit, double price, String warehouseId, String qualityCheck)
		{
		
			this.orderId = orderId;
			this.name = name;
			this.price_per_unit = price_per_unit;
			this.quantityValue = quantityValue;
			this.quantityUnit = quantityUnit;
			this.price = price;
			this.warehouseId = warehouseId;
			this.qualityCheck = qualityCheck;
		} 

}
