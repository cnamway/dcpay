package vip.dcpay.brokerage.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单信息
 */
public class BrOrderInfoDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id; // 记录ID
	private Date createTime; // 记录创建时间
	private Date modifyTime; // 记录修改时间

	// 基础信息
	// ////////////////////////////////////////////////////////////////////////
	private String orderId;// 订单ID

	private Long customerId; // 发起方ID

	private String customerUid; // 发起方UID

	private Integer customerType; // 发起方类型

	private Long merchantId; // 领取订单的商家ID

	private String merchantUid;// 领取订单的商家UID
	
	private String merchantBrandNo;//领取商家所属品牌
	
	private Integer orderType;//订单类型 OrderTypeEnum

	private Integer orderStatus;//订单状态 OrderStatusEnum
	
	private Integer complaintStatus; // 订单投诉状态 ComplaintStatusEnum

	// 金额信息 ///////////////////////////////////////////////////////////////////
	private String currency; // 订单交易币种

	private Integer accuracy; // 订单交易币种的精度

	private BigDecimal tradeAmount;// 交易的金额,币的个数

	private BigDecimal enoughPaymentAmount;// 预期应该足额支付的金额,法币金额

	private BigDecimal realPaymentAmount;// 支付方实际支付的金额,法币金额

	private BigDecimal gotAmount;// 给支付方\购买方的金额,币的个数

	private BigDecimal returnedAmount;// 给收款方\出售方退回的金额,币的个数

	// 手续费 ///////////////////////////////////////////////////////////////////
	private BigDecimal totalFee; // 总手续费

	private BigDecimal baseFee; //基础手续费

	private BigDecimal platformAgentFee; // 平台代理提佣金额

	private BigDecimal companyIncome; // 公司收益

	private BigDecimal merchantIncome; // 商家收益
	
	// 收款信息 //////////////////////////////////////////////////////////////

	private String revcPaymentWay;//收款的收款方式

	// 时间信息 //////////////////////////////////////////////////////////////

	private Date orderCreateTime;//订单创建时间
	
	private Date orderReadyTime;//订单准备完成时间

	private Date orderMatchTime;//订单匹配时间

	private Date orderPayMoneyTime;// 订单支付时间

	private Date orderRecvMoneyTime; // 订单收款时间

	private Date orderFinishTime; // 订单完成时间

	private Date orderComplaintTime; // 订单投诉时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerUid() {
		return customerUid;
	}

	public void setCustomerUid(String customerUid) {
		this.customerUid = customerUid;
	}

	public Integer getCustomerType() {
		return customerType;
	}

	public void setCustomerType(Integer customerType) {
		this.customerType = customerType;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantUid() {
		return merchantUid;
	}

	public void setMerchantUid(String merchantUid) {
		this.merchantUid = merchantUid;
	}

	public String getMerchantBrandNo() {
		return merchantBrandNo;
	}

	public void setMerchantBrandNo(String merchantBrandNo) {
		this.merchantBrandNo = merchantBrandNo;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(Integer complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}

	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public BigDecimal getEnoughPaymentAmount() {
		return enoughPaymentAmount;
	}

	public void setEnoughPaymentAmount(BigDecimal enoughPaymentAmount) {
		this.enoughPaymentAmount = enoughPaymentAmount;
	}

	public BigDecimal getRealPaymentAmount() {
		return realPaymentAmount;
	}

	public void setRealPaymentAmount(BigDecimal realPaymentAmount) {
		this.realPaymentAmount = realPaymentAmount;
	}

	public BigDecimal getGotAmount() {
		return gotAmount;
	}

	public void setGotAmount(BigDecimal gotAmount) {
		this.gotAmount = gotAmount;
	}

	public BigDecimal getReturnedAmount() {
		return returnedAmount;
	}

	public void setReturnedAmount(BigDecimal returnedAmount) {
		this.returnedAmount = returnedAmount;
	}

	public BigDecimal getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	public BigDecimal getBaseFee() {
		return baseFee;
	}

	public void setBaseFee(BigDecimal baseFee) {
		this.baseFee = baseFee;
	}

	public BigDecimal getPlatformAgentFee() {
		return platformAgentFee;
	}

	public void setPlatformAgentFee(BigDecimal platformAgentFee) {
		this.platformAgentFee = platformAgentFee;
	}

	public BigDecimal getCompanyIncome() {
		return companyIncome;
	}

	public void setCompanyIncome(BigDecimal companyIncome) {
		this.companyIncome = companyIncome;
	}

	public BigDecimal getMerchantIncome() {
		return merchantIncome;
	}

	public void setMerchantIncome(BigDecimal merchantIncome) {
		this.merchantIncome = merchantIncome;
	}

	public String getRevcPaymentWay() {
		return revcPaymentWay;
	}

	public void setRevcPaymentWay(String revcPaymentWay) {
		this.revcPaymentWay = revcPaymentWay;
	}

	public Date getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderReadyTime() {
		return orderReadyTime;
	}

	public void setOrderReadyTime(Date orderReadyTime) {
		this.orderReadyTime = orderReadyTime;
	}

	public Date getOrderMatchTime() {
		return orderMatchTime;
	}

	public void setOrderMatchTime(Date orderMatchTime) {
		this.orderMatchTime = orderMatchTime;
	}

	public Date getOrderPayMoneyTime() {
		return orderPayMoneyTime;
	}

	public void setOrderPayMoneyTime(Date orderPayMoneyTime) {
		this.orderPayMoneyTime = orderPayMoneyTime;
	}

	public Date getOrderRecvMoneyTime() {
		return orderRecvMoneyTime;
	}

	public void setOrderRecvMoneyTime(Date orderRecvMoneyTime) {
		this.orderRecvMoneyTime = orderRecvMoneyTime;
	}

	public Date getOrderFinishTime() {
		return orderFinishTime;
	}

	public void setOrderFinishTime(Date orderFinishTime) {
		this.orderFinishTime = orderFinishTime;
	}

	public Date getOrderComplaintTime() {
		return orderComplaintTime;
	}

	public void setOrderComplaintTime(Date orderComplaintTime) {
		this.orderComplaintTime = orderComplaintTime;
	}
	
}
