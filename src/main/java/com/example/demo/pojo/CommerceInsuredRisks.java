package com.example.demo.pojo;

import lombok.Data;

@Data
public class CommerceInsuredRisks {
    private String pkId;

    private String guaranteeId;
	//投保险别
	private String ASSIGNDRI_NAME;
	//保险金额/赔偿限额(元)
	private String ASSIGNDRI_SEX;
	//标准保费
	private String ASSIGNDRI_ISSUEDATE;
	//应交保费
	private String PATENTE_FILE_NO;
	//
	private String ISNONDEDUCTIBLE;
	

}
