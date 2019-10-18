package vip.dcpay.brokerage.application;

import java.util.Date;
import java.util.List;

import vip.dcpay.brokerage.dto.BrMerchantDto;
import vip.dcpay.brokerage.dto.BrOrderInfoDto;
import vip.dcpay.brokerage.dto.BrPage;
import vip.dcpay.brokerage.dto.BrPagination;
import vip.dcpay.brokerage.dto.BrResult;
import vip.dcpay.brokerage.param.AddBrokerageParam;

public interface BrokerageService {
	
	/**
	 * 查询品牌下商家信息
	 */
	public BrResult<BrPage<BrMerchantDto>> getMerchantPage(String brandNo,List<Integer> activateStatus,BrPagination brPagination);
	
	/**
	 * 查询品牌下订单信息
	 */
	public BrResult<BrPage<BrOrderInfoDto>> getOrderPage(Date day,String brandNo,List<String> payWays,BrPagination brPagination);
	
	/**
	 * 添加佣金任务
	 */
	public BrResult<Object> addBrokerage(AddBrokerageParam param);
	

	

}
