package dao;

import java.util.List;

import po.MESSAGE;

/**
 * 留言操作接口
 * @author Administrator
 *
 */
public interface MessageDAO {
	
	/**
	 * 添加
	 * @return
	 */
	public int addMessage(MESSAGE m)throws Exception;
	
	/**
	 * 删除
	 * @return
	 */
	public MESSAGE delMessage(MESSAGE m)throws Exception;
	
	/**
	 * 查询总的留言数量
	 */
	public int countMessage()throws Exception;
	
	/**
	 * 显示
	 */
	public List<MESSAGE> showMessage(int currPage,int pageSize)throws Exception;

}
