package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BaseDAO {

	private String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

	// 此URL为组长的Oracle数据库地址(地址为实验室)
	private String URL = "jdbc:oracle:thin:localhost:1521:orcl";

	// 此登录名为组长的Oracle登录名(地址为实验室)
	private String LOGINNAME = "teamten2";

	// 此密码为组长的Oracle数据库密码(地址为实验室)
	private String LOGINPWD = "123456";

	// 普通的数据库连接
	public Connection getConnection() throws Exception {
		Connection conn = null;
		try {

			Class.forName(DRIVER_CLASS);

			conn = DriverManager.getConnection(URL, LOGINNAME, LOGINPWD);

		} catch (Exception ex) {
			throw new Exception(ex);
		}
		return conn;
	}

	// 连接池连接数据库，需要配合tomcat的连接池配置文件，具体参阅/util/Note.txt
	public Connection getConnectionWithPool() throws Exception {
		Connection conn = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/ebuy");
			conn = ds.getConnection();
		} catch (Exception ex) {
			throw new Exception(ex);
		}
		System.out.println("getConnectionWithPool OK!");
		return conn;
	}

	// 数据库update操作，老庞的基础框架,默认使用getConnection()方法连接
	public int executeUpdate(String sql, Object... param) throws Exception {
		int result = 0;

		Connection conn = null;
		PreparedStatement ps = null;

		try {

			conn = getConnection();
			ps = conn.prepareStatement(sql);//可在此更改连接方式(getConnection()或getConnectionWithPool()二选一)

			for (int i = 0; i < param.length; i++) {
				ps.setObject((i + 1), param[i]);
			}
			result = ps.executeUpdate();

			ps.close();
			conn.close();
		} catch (Exception ex) {
			throw new Exception("操作失败：" + ex.getMessage());
		}
		return result;

	}

	//实体类封装，慎用
	public List<Object> executeProcedure(String sql, Object[] inputParm,
			int[] outputParm) throws Exception {
		List<Object> list = new ArrayList<Object>();
		try {
			Connection conn = getConnection();
			CallableStatement cs = conn.prepareCall(sql);

			/**
			 * 封装输入参数
			 */
			int i = 1;
			for (Object obj : inputParm) {
				cs.setObject(i, obj);
				i++;
			}
			int j = i;
			for (int obj : outputParm) {
				cs.registerOutParameter(i, obj);
				i++;
			}
			cs.execute();

			for (int k = j; k < i; k++) {
				list.add(cs.getObject(k));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception(ex);
		}
		return list;
	}

	// 关闭数据库连接

	public void closeConn(ResultSet rs, PreparedStatement ps, Connection conn)
			throws Exception {
		try {

			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (Exception ex) {
			throw new Exception(ex);
		}
	}

}
