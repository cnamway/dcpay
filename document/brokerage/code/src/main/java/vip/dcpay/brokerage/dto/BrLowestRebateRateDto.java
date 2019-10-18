package vip.dcpay.brokerage.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class BrLowestRebateRateDto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 商家ID
	 */
	private Long merchantId;

	/**
	 * 保底返佣率
	 */
	private BigDecimal value;

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
