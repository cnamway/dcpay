package vip.dcpay.brokerage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 分页信息
 */
public class BrPage<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 页码信息
	 */
	private BrPagination brPagination;

	/**
	 * 分页内容
	 */
	private List<T> content;

	public BrPagination getPagination() {
		return brPagination;
	}

	public void setPagination(BrPagination brPagination) {
		this.brPagination = brPagination;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

}
