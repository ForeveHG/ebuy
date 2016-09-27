package dao;

import java.util.List;

import po.GOODINFO;

/**
 * 商品操作接口
 * @author Administrator
 *
 */
public interface GoodInfoDAO {
	
	/**
	 * 添加商品
	 * @param good
	 * @return
	 * @throws Exception
	 */
	public int addGood(GOODINFO good) throws Exception;
	
	/**
	 * 删除商品
	 * @param good
	 * @return
	 * @throws Exception
	 */
	public int delGood(GOODINFO good) throws Exception;
	
	/**
	 * 修改商品
	 * @param good
	 * @return
	 * @throws Exception
	 */
	public int updateGood(GOODINFO good) throws Exception;
	
	/**
	 * 查找商品
	 * @return
	 * @throws Exception
	 */
	public List<GOODINFO> queryGood() throws Exception;
}
