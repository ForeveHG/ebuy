package dao;

import java.util.List;

import po.ORDERDETAIL;
import po.USERINFO;

/**
 * 订单总体信息表的数据访问接口定义
 * */
public interface OrderInfoDAO {

	/**
	 * 添加订单到数据库
	 * */
	public int addOrder(ORDERDETAIL ORDER)throws Exception;
	
	
	/**
	 * 删除订单
	 * 因为支付，取消订单
	 * 
	 * */
	public int delOrder(ORDERDETAIL ORDER) throws Exception; 
	
	
	/**
	 * 修改订单<br/>
	 * 对于已经生成的订单进行一个数量上的修改操作
	 * */
	public int updateOrder(ORDERDETAIL ORDER)throws Exception;
	
	
	/**
	 * 获取单个订单
	 * */
	public int getOrder(ORDERDETAIL ORDER)throws Exception;
	
	
	/**
	 * 查询某用户所有订单
	 */
	public List<ORDERDETAIL> getUserOrders(USERINFO USER)throws Exception;
	 
}
