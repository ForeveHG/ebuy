package dao;

import java.util.List;

import po.GOODSMALLTYPE;

/**
 * 商品小类型操作接口
 * @author Administrator
 *
 */
public interface GoodSmallTypeDAO {
	
	/**
	 * 添加商品小类型
	 * @param goodSmallType
	 * @return
	 * @throws Exception
	 */
	public int addGoodSmallType(GOODSMALLTYPE goodSmallType) throws Exception;
	
	/**
	 * 删除商品小类型
	 * @param goodSmallType
	 * @return
	 * @throws Exception
	 */
	public int delGoodSmallType(GOODSMALLTYPE goodSmallType) throws Exception;
	
	/**
	 * 修改商品小类型
	 * @param goodSmallType
	 * @return
	 * @throws Exception
	 */
	public int updateGoodSmallType(GOODSMALLTYPE goodSmallType) throws Exception;
	
	/**
	 * 查找商品小类型
	 * @param goodSmallType
	 * @return
	 * @throws Exception
	 */
	public List<GOODSMALLTYPE> queryGoodSmallType(GOODSMALLTYPE goodSmallType) throws Exception;
}
