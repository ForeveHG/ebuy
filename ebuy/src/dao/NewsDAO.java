package dao;

import po.NEWS;

/**
 * 公告和留言(消息)操作接口
 * @author Administrator
 *
 */
public interface NewsDAO {
	
	/**
	 * 添加消息
	 * @param news
	 * @return
	 */
	public NEWS addNews(NEWS news);
	
	/**
	 * 删除消息
	 * @param news
	 * @return
	 */
	public int delNews(NEWS news);
	
	/**
	 * 修改消息
	 * @param news
	 * @return
	 */
	public int updateNews(NEWS news);
	
	/**
	 * 显示消息
	 * @param news
	 * @return
	 */
	public int showNews(NEWS news);
}
