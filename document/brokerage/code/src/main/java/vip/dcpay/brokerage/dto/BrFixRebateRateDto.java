package vip.dcpay.brokerage.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class BrFixRebateRateDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 商家ID
	 */
	private Long merchantId;

	/**
	 * 订单类型
	 */
	private Integer orderType;

	/**
	 * 支付方式
	 */
	private String payWay;
	
	/**
	 * 固定点位值
	 */
	private BigDecimal value;


	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	

}
