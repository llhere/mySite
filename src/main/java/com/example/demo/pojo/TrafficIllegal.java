package com.example.demo.pojo;

import lombok.Data;

//交通违法记录
@Data
public class TrafficIllegal {
	private String pkId;

	private String guaranteeId;
	//序号
	private String TRAFFIC_ILLEGAL_NO;  
	//违法时间
	private String UNLAWFUL_TIME;   
	//违法地点
	private String UNLAWFUL_PLACE;    
	//处理时间
	private String DISPOSE_TIME;    
	//违法行为
	private String UNLAWFUL_ACT;
}
