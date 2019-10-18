# 佣金交互接口

# 更新记录

| 版本号  | 作者 | 日期       | 说明                 |
| ------- | ---- | ---------- | -------------------- |
| v.0.0.1 | MK   | 2019-10-17 | 定义佣金计算相关接口 |

# 说明

## 文档说明

该文档用于钻石支付佣金计算模块接口定义

## 开发环境

java8 & dubbo-2.6.2

## 通信协议

dubbo

## 接口定义源码

[佣金接口声明](./code)

# 交互接口



## 查询品牌下商家信息

> 以商家ID排序

### 方法签名

```java
public BrResult<BrPage<BrMerchantDto>> getMerchantPage(String brandNo,List<Integer> activateStatus,BrPagination brPagination);
```

### 参数列表

| 字段           | 类型   |是否必传        | 说明     | 跳转                                           |
| -------------- | -------------  | --------| -------- | ---------------------------------------------- |
| brandNo        | String        |是| 品牌编号 |                                                |
| activateStatus | List<Integer> | 是|激活状态 | [MerchantActivateState][MerchantActivateState] |
| brPagination   | BrPagination  | 是|分页信息 | [BrPagination][BrPagination]                   |

### 返回信息

[BrResult][BrResult]<[BrPage][BrPage]<[BrMerchantDto][BrMerchantDto]>>



## 查询品牌下订单信息

> 以订单信息ID排序

### 方法签名

```java
public BrResult<BrPage<BrOrderRecordDto>> getOrderPage(Date day,String brandNo,List<String> payWays,BrPagination brPagination);
```

### 参数列表

| 字段         | 类型         |是否必传| 说明         | 跳转                         |
| ------------ | ------------ | ------------ |------------ | ---------------------------- |
| day          | Date         |是| 查询的日期   |                              |
| brandNo      | String       |是| 品牌编号     |                              |
| payWays      | List<String> | 是|支付方式列表 | [PayWay][PayWay]             |
| brPagination | BrPagination | 是|分页页码     | [BrPagination][BrPagination] |

### 返回信息

[BrResult][BrResult]<[BrPage][BrPage]<[BrOrderRecordDto][BrOrderRecordDto]>> 



## 添加佣金任务

### 方法签名

```java
public BrResult<Object> addBrokerage(AddBrokerageParam param);
```

### 参数列表

> AddBrokerageParam 内部结构

| 字段 | 类型 | 是否必传 | 说明 | 跳转 |
| ---- | ---- | -------- | ---- | ---- |
|String	|commissionNum	|是	|佣金业务号,唯一不可重复	||
|String	|brandNo	|是	|订单编号	||
|Integer	|commissionMode	|是	|佣金模式,格式 yyyy-MM-dd	||
|String	|commissionDate	|是	|佣金日期	||
|Long	|merchantId	|是	|商户id	||
|String	|merchantUid	|是	|商户uid	||
|String	|parentId	|是	|父级uid	||
|String	|parentUid	|是	|父级uid	||
|BigDecimal	|commission	|是	|佣金值	||
|BigDecimal	|selfFlow	|是	|自己的流水	||
|BigDecimal	|selfPerf	|是	|自己的业绩	||
|BigDecimal	|teamFlow	|是	|团队的流水	||
|BigDecimal	|teamPerf	|是	|团队的业绩	||
|String	|commissionExplain	|是	|说明,记录佣金计算过程中的关键数据	||
|String	|remark	|是	|备注	||
|Date	|createTime	|是	|创建时间	||
|Date	|modifyTime	|是	|修改时间	||


### 返回信息

[BrResult][BrResult]<Object>



# 数据结构说明



## BrResult
[BrResult]:#BrResult

> 作为通用的返回结构，业务接口仅描述data数据结构。泛型类型是data的类型

| 字段    | 类型    | 说明                           | 跳转 |
| ------- | ------- | ------------------------------ | ---- |
| success | boolean | 业务执行结果状态标识 true-成功 |      |
| code    | int     | 业务执行结果code               |      |
| message | string  | 业务执行结果描述               |      |
| data    | T       | 业务返回的数据,详见各业务接口  |      |

## BrPage

[BrPage]:#BrPage

> 分页结构，泛型类型是content每条数据的类型

| 字段       | 类型    | 说明               | 跳转                         |
| ---------- | ------- | ------------------ | ---------------------------- |
| pagination | object  | 分页页码信息       | [BrPagination][BrPagination] |
| content    | List<T> | 分页具体内容的数组 |                              |

## BrPagination

[BrPagination]: #BrPagination

> 页码信息

| 字段  | 类型 | 说明           | 跳转 |
| ----- | ---- | -------------- | ---- |
| num   | int  | 当前页码       |      |
| size  | int  | 当前页最大条数 |      |
| total | int  | 总条数         |      |



## BrMerchantDto

[BrMerchantDto]:#BrMerchantDto

> 商家信息

| 字段           | 类型                  | 说明                         | 跳转                                           |
| -------------- | --------------------- | ---------------------------- | ---------------------------------------------- |
| id             | Long                  | 商家ID                       |                                                |
| uid            | String                | 商家UID                      |                                                |
| parentId       | Long                  | 商家上级ID                   |                                                |
| realname       | String                | 商家实名信息                 |                                                |
| brandNo        | String                | 商家所属品牌编号             |                                                |
| phoneArea      | String                | 商家手机号国码               |                                                |
| phone          | String                | 商家手机号                   |                                                |
| activateStatus | Integer               | 商家激活状态                 | [MerchantActivateState][MerchantActivateState] |
| fixRate        | BrFixRebateRateDto    | 佣金点位(固定点位模式使用)   | [BrFixRebateRateDto][BrFixRebateRateDto]       |
| lowestRate     | BrLowestRebateRateDto | 保底佣金率(无限代理模式使用) | [BrLowestRebateRateDto][BrLowestRebateRateDto] |



## BrFixRebateRateDto

[BrFixRebateRateDto]:#BrFixRebateRateDto

> 佣金点位信息

| 字段       | 类型       | 说明       | 跳转                   |
| ---------- | ---------- | ---------- | ---------------------- |
| merchantId | Long       | 商家ID     |                        |
| orderType  | Integer    | 订单类型   | [OrderType][OrderType] |
| payWay     | String     | 支付方式   | [PayWay][PayWay]       |
| value      | BigDecimal | 固定点位值 |                        |



## BrLowestRebateRateDto

[BrLowestRebateRateDto]:#BrLowestRebateRateDto

> 保底佣金率

| 字段       | 类型       | 说明       | 跳转 |
| ---------- | ---------- | ---------- | ---- |
| merchantId | Long       | 商家ID     |      |
| value      | BigDecimal | 保底返佣率 |      |



## BrOrderRecordDto

[BrOrderRecordDto]:#BrOrderRecordDto

> 订单记录信息

| 字段 | 类型 | 说明 | 跳转 |
| ---- | ---- | ---- | ---- |
|	id	|	Long	|	记录ID	|	|
|	createTime	|	Date	|	记录创建时间	|	|
|	modifyTime	|	Date	|	记录修改时间	|	|
|	orderId	|	String	|	订单ID	|	|
|	customerId	|	Long	|	发起方ID	|	|
|	customerUid	|	String	|	发起方UID	|	|
|	customerType	|	Integer	|	发起方类型	|	|
|	merchantId	|	Long	|	领取订单的商家ID	|	|
|	merchantUid	|	String	|	领取订单的商家UID	|	|
|	merchantBrandNo	|	String	|	领取商家所属品牌	|	|
|	orderType	|	Integer	|	订单类型	| [OrderType][OrderType] |
|	orderStatus	|	Integer	|	订单状态	| [OrderStatus][OrderStatus] |
|	complaintStatus	|	Integer	|	订单投诉状态	|	|
|	currency	|	String	|	订单交易币种	|	|
|	accuracy	|	Integer	|	订单交易币种的精度	|	|
|	tradeAmount	|	BigDecimal	|	交易的金额,币的个数	|	|
|	enoughPaymentAmount	|	BigDecimal	|	预期应该足额支付的金额,法币金额	|	|
|	realPaymentAmount	|	BigDecimal	|	支付方实际支付的金额,法币金额	|	|
|	gotAmount	|	BigDecimal	|	给支付方\购买方的金额,币的个数	|	|
|	returnedAmount	|	BigDecimal	|	给收款方\出售方退回的金额,币的个数	|	|
|	totalFee	|	BigDecimal	|	总手续费	|	|
|	baseFee	|	BigDecimal	|	基础手续费	|	|
|	platformAgentFee	|	BigDecimal	|	平台代理提佣金额	|	|
|	companyIncome	|	BigDecimal	|	公司收益	|	|
|	merchantIncome	|	BigDecimal	|	商家收益	|	|
|	revcPaymentWay	|	String	|	收款的收款方式	| [PayWay][PayWay] |
|	orderCreateTime	|	Date	|	订单创建时间	|	|
|	orderReadyTime	|	Date	|	订单准备完成时间	|	|
|	orderMatchTime	|	Date	|	订单匹配时间	|	|
|	orderPayMoneyTime	|	Date	|	订单支付时间	|	|
|	orderRecvMoneyTime	|	Date	|	订单收款时间	|	|
|	orderFinishTime	|	Date	|	订单完成时间	|	|
|	orderComplaintTime	|	Date	|	订单投诉时间	|	|







# 枚举说明

## MerchantActivateState

[MerchantActivateState]:#MerchantActivateState

> 商家激活状态
>
> > 1-未申请激活 2-申请激活后审批中 3-已激活,可交易 4-申请激活被驳回



## BrandBrokerageMode

[BrandBrokerageMode]:#BrandBrokerageMode

> 品牌佣金模式
>
> > 0-无限代理 1-固定点位



## OrderType

[OrderType]:#OrderType

> 订单类型
>
> > 1-玩家充值 2-平台提现 3-商家买币 4-商家卖币 5-代理下发



## PayWay

[PayWay]:#PayWay

> 支付方式
>
> > Bankcard - 银行卡 , AliPay-支付宝 , WechatPay-微信 , AliPay_QN-淘宝代付码



## OrderStatus

[orderStatus]:#orderStatus

> 订单状态
>
> > 100-已完成 110-已取消  130-已放弃 140-已终止