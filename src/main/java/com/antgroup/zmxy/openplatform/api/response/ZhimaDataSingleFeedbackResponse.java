package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.data.single.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-31 14:34:57
 */
public class ZhimaDataSingleFeedbackResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7616467314472252314L;

	/** 
	 * 
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
