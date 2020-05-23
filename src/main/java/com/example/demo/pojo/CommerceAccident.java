package com.example.demo.pojo;

import lombok.Data;

//商业保险事故索赔记录
@Data
public class CommerceAccident {
	private String pkId;

    private String guaranteeId;
	//序号
	private String COMMERCE_ACCIDENT_NO;    
	//出险时间
	private String OUT_INSURANCE_TIME;  
	//结案日期
	private String CLOSE_DATE; 
	//赔款金额
	private String REPARATIONS_MONEY;  
	//投保公司
	private String INSURANCE_COMPANY;
	

}
