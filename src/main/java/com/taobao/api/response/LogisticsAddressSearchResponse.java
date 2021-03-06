package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.logistics.address.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2728371469713421941L;

	/** 
	 * 一组地址库数据，
	 */
	@ApiListField("addresses")
	@ApiField("address_result")
	private List<AddressResult> addresses;


	public void setAddresses(List<AddressResult> addresses) {
		this.addresses = addresses;
	}
	public List<AddressResult> getAddresses( ) {
		return this.addresses;
	}
	


}
