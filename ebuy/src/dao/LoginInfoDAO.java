package dao;

import po.*;

/**
 * 用户登录注册操作
 * @author Administrator
 *
 */
public interface LoginInfoDAO {
	/**
	 * 验证用户登录
	 * @param userinfo
	 * @return
	 * @throws Exception
	 */
	public boolean checkuser(LOGININFO userinfo) throws Exception;
}
