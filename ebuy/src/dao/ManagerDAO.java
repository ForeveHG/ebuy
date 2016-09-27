package dao;
import java.util.List;

import po.*;

/**
 * 管路员操作
 * @author Administrator
 *
 */
public interface ManagerDAO {
	
	/**
	 * 验证管理员登陆
	 * @param manager
	 * @return
	 * @throws Exception
	 */
	public boolean checkMg(MANAGER manager) throws Exception;
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delt(String id) throws Exception;
	
	/**
	 * 查找管理员
	 * @param where
	 * @return
	 * @throws Exception
	 */
	public List findUser(String where) throws Exception;
	
	/**
	 * 修改管理员信息
	 * @param userinfo
	 * @return
	 * @throws Exception
	 */
	public int edit(USERINFO userinfo) throws Exception;
	
}
