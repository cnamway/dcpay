package vip.dcpay.brokerage.dto;

import java.io.Serializable;

public class BrPagination implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 页面
	 */
	private int num;
	/**
	 * 单页最大条数
	 */
	private int size;
	/**
	 * 总条数
	 */
	private int total;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
