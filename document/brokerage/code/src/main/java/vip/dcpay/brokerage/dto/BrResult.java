package vip.dcpay.brokerage.dto;

import java.io.Serializable;

/**
 * 返回结构
 */
public class BrResult<T> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private boolean success;// 返回是否成功
    
    private int code;// 提示代码
    
    private String message;// 返回信息
    
    private T data;// 返回其他对象信息

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
    
    
    
}
