package vip.dcpay.brokerage.dto;

import java.io.Serializable;

/**
 * 品牌信息
 */
public class BrBrandDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌名称
	 */
	String brandName;

	/**
	 * 品牌编号
	 */
	String brandNo;
	
	/**
	 * 品牌身份key
	 */
	String brandKey;
	
	/**
	 * 品牌佣金模式(0,无限代理模式,1,固定层级模式)
	 */
	Integer commissionMode;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandNo() {
		return brandNo;
	}

	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public String getBrandKey() {
		return brandKey;
	}

	public void setBrandKey(String brandKey) {
		this.brandKey = brandKey;
	}

	public Integer getCommissionMode() {
		return commissionMode;
	}

	public void setCommissionMode(Integer commissionMode) {
		this.commissionMode = commissionMode;
	}
	
	

}
