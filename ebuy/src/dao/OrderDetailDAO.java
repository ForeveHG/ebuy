package dao;

import java.util.List;

import po.ORDERINFO;
import po.USERINFO;

/**
 * @author U1
 * 订单项的操作数据库访问接口 
 * 
 * */

public interface OrderDetailDAO {

	/**
	 * 添加多条订单详细信息，订单中的项[orderDetail]
	 * 将来自购物车的信息批量存储到数据库
	 * */
	public int addOrdDetailList(List<ORDERINFO> orderDetailList)throws Exception;
	
	/**
	 * 删除某条商品项的订单详情
	 * */
	public int delOrderDetail(ORDERINFO OREDERDETAIL)throws Exception;
	
	/**
	 * 修改某条商品项订单详情信息
	 * 商品的数量，价格
	 * */
	public int upadateOrderDetail(ORDERINFO ORDERDEATIL)throws Exception;
	
	
	/**
	 * 获取单条订单详情信息
	 * */
	public ORDERINFO getOrderDetail(ORDERINFO ORDERTAIL)throws Exception;
	
	/**
	 * 获取某用户的订单详情列表
	 * */
	public List<ORDERINFO> getOrderDetail(USERINFO USER)throws Exception;
	
	
}
