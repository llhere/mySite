package com.example.demo.pojo;

import lombok.Data;

import java.util.List;
@Data
public class GuaranteeSlip {
	private String pkId;
	//公司名称全称
	private String COMPANY_NAME;
	//公司名称简称
	private String COMPANY_SHORT_NAME;
	//号牌号码
	private String CAR_MARK;
	//号牌种类
	private String CAR_TYPE;
	//号牌底色
	private String CAR_COLOUR;
	//发动机号
	private String ENGINE_NO;
	//车架号/VIN
	private String CAR_RACK_NO;
	//行驶证车主
	private String DRIV_LICENSENO;
	//厂牌车型
	private String BRAND_CAR_MODEL;
	//机动车种类
	private String VEHICLE_CATEGORY;
	//车身颜色
	private String CAR_COLOR;
	//车辆产地
	private String CAR_VEHICLEORIGIN;
	//车辆使用性质
	private String CAR_USE_NATURE;
	//初登日期
	private String FIRSTLOGINTIME;
	//新车购置价
	private String NEWCAR_PRICE;
	//核定载客
	private String LIMIT_LOAD_PERSON;
	//核定载质量
	private String LIMIT_LOAD;
	//排气量/功率
	private String DISPLACEMENT;
	//整备质量
	private String CURB_WEIGHT;
	//已使用年限
	private String USE_AGES;
	//缴纳税款年限
	private String TAX_PAYMENT_PERIOD;
	//车船税当年应缴
	private String CURRENT_TAX;
	//车船税往年补缴
	private String FORMER_TAX;
	//车船税滞纳金
	private String LATE_FEE;
	//代收车船税合计
	private String COLLECT_VEH_COUNT;
	//纳税人识别号
	private String TAX_PAYER_IDENTIFICATION_CODE;
	//完税凭证号
	private String PAY_NO;
	//税务机关
	private String DEPARTMENT;
	//交强险保险费
	private String TRAVELTAX_PREMIUM;
	//交强险保险费（大写）
	private String TRAVELTAX_PREMIUM_MAX;
	//交强险含车船税保费合计（小写）
	private String TRAVELTAX_CAR_PREMIUM;
	//交强险含车船税保费合计（大写）
	private String TRAVELTAX_CAR_PREMIUM_MAX;
	//商业险保费合计（小写）
	private String COMMERCIAL_PREMIUM;
	//商业险保费合计（大写）
	private String COMMERCIAL_PREMIUM_MAX;
	//公司官网
	private String WEBSITE;
	//保险公司客户服务电话
	private String SERVICETELEPHONENUMBER;
	//投保人名称
	private String POLICY_HOLDER;
	//投保人地址
	private String POLICY_MAIL_ADDRESS;
	//投保人联系电话
	private String POLICY_TELEPHONE;
	//投保人邮箱地址
	private String POLICY_EMAIL;
	//投保人证件类型
	private String POLICY_CERTI_TYPE;
	//投保人证件号
	private String POLICY_CERTI_CODE;
	//被保险人名称
	private String INSURED_NAME;
	//被保险人证件类型
	private String INSURED_CERTI_TYPE;
	//被保险人证件号码
	private String INSURED_CERTI_CODE;
	//被保险人地址
	private String INSURED_MAIL_ADDRESS;
	//被保险人联系电话
	private String INSURED_TELEPHONE;
	//被保险人邮箱
	private String INSURED_EMAIL;
	//联系人名称
	private String LINKER_NAME;
	//联系人电话
	private String PHONE_NO;
	//联系人邮箱
	private String LINKER_EMAIL;
	//交强险投保单号
	private String TRAVELTAX_POLICY_NO;
	//商业险投保单号
	private String COMMERCIAL_POLICY_NO;
	//上年度交通违法记录
	private String LAST_TRAFFIC_RECORD;
	//上年是否在本公司投保
	private String LAST_IS_COMPANY;
	//交强险上年赔款次数
	private String LAST_TRAVELTAX_SUM;
	//商业险上年赔款次数
	private String LAST_COMMERCIAL_SUM;
	//特别约定
	private String ASSUMPTION;
	//温馨提示
	private String TIPS;
	//被保险人与车辆的关系
	private String INSURED_CAR_RELATION;
	//是否过户车
	private String IS_TRANSFER_CAR;
	//是否贷款车
	private String IS_LOANS_CAR;
	//是否涉农业务
	private String IS_FARMING_BUSINESS;
	//保险争议解决方式
	private String INSUREDPOLICY_CONTRACT_DISPUTE_RESOLUTION;
	//商业险条款名称
	private String APPLICABLE_TERMS_CONDITIONS;
	//交强险保险期限
	private String TRAVELTAX_DEADLINE;
	//商业险保险期限
	private String COMMERCIAL_DEADLINE;
	//验车情况
	private String CHECK_CAR_SITUATION;
	//验车检验人员
	private String CHECK_CAR_PERSON;
	//验车检验时间
	private String CHECK_CAR_TIME;
	//业务员名称
	private String COMMERCE_NAME;
	//车辆协商实际价值
	private String TRUEPRICE;
	//保险公司偿付能力提示
	private String SOLVENCY_TIPS;
	//业务来源
	private String COMMERCE_ORIGIN;
	//渠道名称
	private String CHANNEL_NAME;
	//渠道代码
	private String CHANNEL_CODE;
	//归属单位
	private String AFFILIATION_UNIT;
	//归属单位机构代码
	private String AFFILIATION_UNIT_CODE;
	//交强险投保查询时间
	private String TRAVELTAX_QUERYTIME;
	//交强险浮动因素计算区间起期
	private String TRAVELTAX_FLOAT_START;
	//交强险基础保费
	private String TRAVELTAX_BASIC_PREM;
	//道路交通事故浮动比例
	private String ACCID_FL_RATIO;
	//饮酒驾驶违法行为次数
	private String DRINK_ILL_TIMES;
	//醉酒驾驶违法行为次数
	private String DRUNK_ILL_TIMES;
	//酒后驾驶行为相联系的比率
	private String DRUNK_RELATI_RATIO;
	//尾号限行减免告知
	private String TAILNO_LIMIT_REMIT_INFORM;
	//车船税征收告知
	private String TAX_LEVY_INFORM;
	//商业险投保查询时间
	private String COMMERCE_QUERYTIME;
	//商业险浮动因素计算区间起期
	private String COMMERCE_FLOAT_PERIOD;
	//理赔记录浮动系数
	private String CLAIMS_COEFFICIENT;
	//自主核保系数
	private String UNDERWRITING_COEFFICIENT;
	//自主渠道系数
	private String CHANNEL_COEFFICIENT;
	//交通违法系数
	private String TRAFFIC_LAW_COEFFICIENT;
	//最终浮动系数
	private String FINAL_FLOAT_COEFFICIENT;
	//投保商业险险别信息
	private List<CommerceInsuredRisks> COMMERCE_INSURED_RISKS_LIST;
	//交强险事故索赔记录
	private List<TrafficAccident> TRAFFIC_ACCIDENT_LIST;
	//商业险事故索赔记录
	private List<CommerceAccident> COMMERCE_ACCIDENT_LIST;
	//交通违法记录
	private List<TrafficIllegal> TRAFFIC_ILLEGAL_LIST;

}
