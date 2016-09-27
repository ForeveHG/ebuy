package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import po.GOODINFO;
import dao.BaseDAO;
import dao.GoodInfoDAO;

/**
 * 
 * @author U2
 * @version 1.0 商品DAO的实现方法，继承BaseDAO
 * 
 */

public class GoodInfoDAOImpl extends BaseDAO implements GoodInfoDAO {

	// 添加商品，输入商品实体类，返回改动行数，调用BaseDAO的executeUpdate()方法
	@Override
	public int addGood(GOODINFO good) throws Exception {
		String sql = "insert into GOODINFO(gtsmallid,gname,gprice,ginventory,gdesc,gpic,gbrand,gcode) values(?,?,?,?,?,?,?,?)";
		int result = super.executeUpdate(sql, good.getGtsmallid(),
				good.getGname(), good.getGprice(), good.getGinventory(),
				good.getGdesc(), good.getGpic(), good.getGbrand(),
				good.getGcode());
		System.out.println("addGood OK!");
		return result;
	}

	// 删除商品，输入商品实体类，返回改动行数，调用BaseDAO的executeUpdate()方法
	@Override
	public int delGood(GOODINFO good) throws Exception {
		String sql = "delete from GOODINFO where gid=?";
		int result = super.executeUpdate(sql, good.getGid());
		System.out.println("delGood OK!");
		return result;
	}

	// 修改商品，输入商品实体类，返回改动行数，调用BaseDAO的executeUpdate()方法
	@Override
	public int updateGood(GOODINFO good) throws Exception {
		String sql = "update GOODINFO set gtsmallid=?,gname=?,gprice=?,ginventory=?,gdesc=?,gpic=?,gbrand=?,gcode=? where gid=?";
		int result = super.executeUpdate(sql, good.getGtsmallid(),
				good.getGname(), good.getGprice(), good.getGinventory(),
				good.getGdesc(), good.getGpic(), good.getGbrand(),
				good.getGcode(), good.getGid());
		System.out.println("updateGood OK!");
		return result;
	}

	// 查询商品表，查询的关键词是商品ID
	// 此处的考虑为：此表需要在用户登陆或注册后再调用，此时用户ID已经生成
	@Override
	public List<GOODINFO> queryGood() throws Exception {
		List<GOODINFO> goodList = new ArrayList<GOODINFO>();
		GOODINFO goodInfo = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from GOODINFO";
			conn = super.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				goodInfo = new GOODINFO();
				goodInfo.setGid(rs.getString("gid"));
				goodInfo.setGtsmallid(rs.getString("gtsmallid"));
				goodInfo.setGname(rs.getString("gname"));
				goodInfo.setGprice(rs.getDouble("gprice"));
				goodInfo.setGinventory(rs.getInt("ginventory"));
				goodInfo.setGdesc(rs.getString("gdesc"));
				goodInfo.setGpic(rs.getString("gpic"));
				goodInfo.setGbrand(rs.getString("gbrand"));
				goodInfo.setGcode(rs.getString("gcode"));
				goodList.add(goodInfo);
			}
		} catch (Exception e) {
			throw new Exception("登陆错误" + e.getMessage());
		} finally {
			super.closeConn(rs, ps, conn);
			System.out.println("queryGood OK!");
		}
		return goodList;
	}

}
