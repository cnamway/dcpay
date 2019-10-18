package vip.dcpay.brokerage.dto;

import java.io.Serializable;

/**
 * 商家信息
 */
public class BrMerchantDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 商家ID
	 */
	private Long id;
	
	/**
	 * 商家UID
	 */
	private String uid;
	
	/**
	 * 商家上级ID
	 */
	private Long parentId;
	
	/**
	 * 商家实名信息
	 */
	private String realname;
	
	/**
	 * 商家所属品牌编号
	 */
	private String brandNo;

	/**
	 * 商家手机号国码
	 */
	private String phoneArea;
	
	/**
	 * 商家手机号
	 */
	private String phone;
	
	/**
	 * 商家激活状态
	 */
	private Integer activateStatus;
	
	/**
	 * 固定点位
	 */
	private BrFixRebateRateDto fixRate;
	
	/**
	 * 保底佣金率
	 */
	private BrLowestRebateRateDto lowestRate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getBrandNo() {
		return brandNo;
	}

	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public String getPhoneArea() {
		return phoneArea;
	}

	public void setPhoneArea(String phoneArea) {
		this.phoneArea = phoneArea;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getActivateStatus() {
		return activateStatus;
	}

	public void setActivateStatus(Integer activateStatus) {
		this.activateStatus = activateStatus;
	}

	public BrFixRebateRateDto getFixRate() {
		return fixRate;
	}

	public void setFixRate(BrFixRebateRateDto fixRate) {
		this.fixRate = fixRate;
	}

	public BrLowestRebateRateDto getLowestRate() {
		return lowestRate;
	}

	public void setLowestRate(BrLowestRebateRateDto lowestRate) {
		this.lowestRate = lowestRate;
	}
	
	

}
