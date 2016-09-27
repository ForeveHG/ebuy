package dao;

import java.util.List;

import po.GOODTYPE;

/**
 * 商品大类型操作接口
 * @author Administrator
 *
 */
public interface GoodTypeDAO {
	/**
	 * 添加商品大类型
	 * @param goodType
	 * @return
	 * @throws Exception
	 */
	public int addGoodType(GOODTYPE goodType) throws Exception;
	
	/**
	 * 删除商品大类型
	 * @param goodType
	 * @return
	 * @throws Exception
	 */
	public int delGoodType(GOODTYPE goodType) throws Exception;
	
	/**
	 * 修改商品大类型
	 * @param goodType
	 * @return
	 * @throws Exception
	 */
	public int updateGoodType(GOODTYPE goodType) throws Exception;
	
	/**
	 * 查询商品大类型
	 * @param goodType
	 * @return
	 * @throws Exception
	 */
	public List<GOODTYPE> queryGoodType(GOODTYPE goodType) throws Exception;
}
