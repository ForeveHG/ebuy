package test;

import java.util.List;

import po.GOODINFO;
import dao.GoodInfoDAO;
import dao.impl.GoodInfoDAOImpl;

/**
 * 
 * @author U2
 * GoodInfoDAOImpl的测试方法
 *
 */
public class GoodInfoTest {
	public static void main(String[] args) {
		queryTest();
	}
	
	//商品查询测试方法
	public static void queryTest(){
		GoodInfoDAO goodInfoDAO = new GoodInfoDAOImpl();
		GOODINFO goodInfo = new GOODINFO();
		goodInfo.setGid("01");
		try {
			List<GOODINFO> result = goodInfoDAO.queryGood();
			for(GOODINFO tempGoodInfo : result){
				System.out.println(tempGoodInfo.getGname());
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
