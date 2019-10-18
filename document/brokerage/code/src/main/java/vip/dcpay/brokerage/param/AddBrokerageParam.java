package vip.dcpay.brokerage.param;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 佣金信息
 */
public class AddBrokerageParam implements Serializable{

	private static final long serialVersionUID = -1L;
	
	/**
	 * 佣金业务号
	 */
	private String commissionNum;

	/**
	 * 订单编号
	 */
	private String brandNo;

	/**
	 * 佣金模式 1-无限代理 2-固定定位
	 */
	private Integer commissionMode;

	/**
	 * 佣金日期
	 */
	private String commissionDate;

	/**
	 * 商户id
	 */
	private Long merchantId;

	/**
	 * 商户uid
	 */
	private String merchantUid;

	/**
	 * 父级uid
	 */
	private String parentId;

	/**
	 * 父级uid
	 */
	private String parentUid;

	/**
	 * 佣金值
	 */
	private BigDecimal commission;

	/**
	 * 自己的流水
	 */
	private BigDecimal selfFlow;

	/**
	 * 自己的业绩
	 */
	private BigDecimal selfPerf;

	/**
	 * 团队的流水
	 */
	private BigDecimal teamFlow;

	/**
	 * 团队的业绩
	 */
	private BigDecimal teamPerf;

	/**
	 * 说明
	 */
	private String commissionExplain;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 修改时间
	 */
	private Date modifyTime;

	public String getCommissionNum() {
		return commissionNum;
	}

	public void setCommissionNum(String commissionNum) {
		this.commissionNum = commissionNum;
	}

	public String getBrandNo() {
		return brandNo;
	}

	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public Integer getCommissionMode() {
		return commissionMode;
	}

	public void setCommissionMode(Integer commissionMode) {
		this.commissionMode = commissionMode;
	}

	public String getCommissionDate() {
		return commissionDate;
	}

	public void setCommissionDate(String commissionDate) {
		this.commissionDate = commissionDate;
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

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentUid() {
		return parentUid;
	}

	public void setParentUid(String parentUid) {
		this.parentUid = parentUid;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getSelfFlow() {
		return selfFlow;
	}

	public void setSelfFlow(BigDecimal selfFlow) {
		this.selfFlow = selfFlow;
	}

	public BigDecimal getSelfPerf() {
		return selfPerf;
	}

	public void setSelfPerf(BigDecimal selfPerf) {
		this.selfPerf = selfPerf;
	}

	public BigDecimal getTeamFlow() {
		return teamFlow;
	}

	public void setTeamFlow(BigDecimal teamFlow) {
		this.teamFlow = teamFlow;
	}

	public BigDecimal getTeamPerf() {
		return teamPerf;
	}

	public void setTeamPerf(BigDecimal teamPerf) {
		this.teamPerf = teamPerf;
	}

	public String getCommissionExplain() {
		return commissionExplain;
	}

	public void setCommissionExplain(String commissionExplain) {
		this.commissionExplain = commissionExplain;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

}
