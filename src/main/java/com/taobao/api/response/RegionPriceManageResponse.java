package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.region.price.manage response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RegionPriceManageResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3149596953438832547L;

	/** 
	 * success
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
