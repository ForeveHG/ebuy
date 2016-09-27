package dao;
import po.*;
/**
 * 用户操作接口
 * @author Administrator
 *
 */
public interface UserInfoDAO {
	/**
	 * 添加用户
	 * @param logininfo
	 * @return
	 * @throws Exception
	 */
	public int adduser(LOGININFO logininfo)throws Exception;
	
	/**
	 * 修改用户
	 * @param userinfo
	 * @return
	 * @throws Exception
	 */
	public int edituser(USERINFO userinfo)throws Exception;

}
