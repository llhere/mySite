package com.example.demo.pojo;

import lombok.Data;

@Data
public class TrafficAccident {
	private String pkId;

	private String guaranteeId;
	//序号
	private String TRAFFIC_ACCIDENT_NO;
	//出险时间
	private String OUT_INSURANCE_TIME;
	//结案时间/赔付时间
	private String PAY_TIME;
	//交强险赔案中是否造成受害人死亡
	private String INSURANCE_CLAIM_VICTIM;
}