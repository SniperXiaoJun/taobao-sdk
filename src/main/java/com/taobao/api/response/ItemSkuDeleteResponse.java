package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.sku.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkuDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7674597545176466375L;

	/** 
	 * Sku结构
	 */
	@ApiField("sku")
	private Sku sku;


	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Sku getSku( ) {
		return this.sku;
	}
	


}
