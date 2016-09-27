package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.MESSAGE;
import dao.BaseDAO;
import dao.MessageDAO;

public class MessageDaoImpl extends BaseDAO implements MessageDAO{
	
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	/**
	 * 通过构造方法获得数据库连接
	 * @throws Exception
	 */
	public MessageDaoImpl() throws Exception{
		try {
			conn=getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("留言时连接数据库出错！");
		}
	}
	
	/**
	 * 添加留言
	 */
	@Override
	public int addMessage(MESSAGE m)throws Exception {
		String sql="insert into Message(messcontent,userid) values(?,?)";
		int result=0;
		try {
			ps=conn.prepareStatement(sql);
			ps.setObject(1, m.getMesscontent());
			ps.setObject(2, m.getUserid());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("插入留言出错！");
		}finally{
			closeConn(rs, ps, conn);
		}
		return result;
	}
	
	/**
	 * 删除留言
	 */
	@Override
	public MESSAGE delMessage(MESSAGE m) {
		
		return null;
	}
	
	/**
	 * 显示留言
	 */
	@Override
	public List<MESSAGE> showMessage(int currPage,int pageSize)throws Exception{
		String sql="select t.* from (select m.*,rownum r from (select * from message order by messtime desc)m where rownum<=?)t where r>?";
		int start=(currPage-1)*pageSize;
		int end=pageSize*currPage;
		List<MESSAGE> list=new ArrayList<MESSAGE>();
		MESSAGE m=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setObject(1, end);
			ps.setObject(2, start);
			rs=ps.executeQuery();
			while(rs.next()){
				m=new MESSAGE();
				m.setMessid(rs.getString(1));
				m.setMesscontent(rs.getString(2));
				m.setMesstime(rs.getDate(3));
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("查询留言出错");
		}
		return list;
	}
	
	/**
	 * 计算总的留言数量
	 */
	@Override
	public int countMessage() throws Exception {
		String sql="select count(*) from Message";
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		if(rs.next()){
			return rs.getInt(1);
		}
		return 0;
	}
}
