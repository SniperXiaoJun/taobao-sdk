package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LoginUser;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.login.user.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoLoginUserGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5364182985753612977L;

	/** 
	 * 登录用户信息
	 */
	@ApiField("login_user")
	private LoginUser loginUser;


	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}
	public LoginUser getLoginUser( ) {
		return this.loginUser;
	}
	


}
