package po;

/**
 * 订单详细信息实体类
 * @author Administrator
 *
 */
public class ORDERDETAIL {
	private String orderdetail_id; //编号(自动生成)
	private String gid; //商品编号
	private int gcount; //商品数量
	private int gprice;//商品金额
	private String orderinfo_id; //订单编号（外键）
	public String getOrderdetail_id() {
		return orderdetail_id;
	}
	public void setOrderdetail_id(String orderdetail_id) {
		this.orderdetail_id = orderdetail_id;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public int getGcount() {
		return gcount;
	}
	public void setGcount(int gcount) {
		this.gcount = gcount;
	}
	public int getGprice() {
		return gprice;
	}
	public void setGprice(int gprice) {
		this.gprice = gprice;
	}
	public String getOrderinfo_id() {
		return orderinfo_id;
	}
	public void setOrderinfo_id(String orderinfo_id) {
		this.orderinfo_id = orderinfo_id;
	}
	public ORDERDETAIL(String orderdetail_id, String gid, int gcount,
			int gprice, String orderinfo_id) {
		super();
		this.orderdetail_id = orderdetail_id;
		this.gid = gid;
		this.gcount = gcount;
		this.gprice = gprice;
		this.orderinfo_id = orderinfo_id;
	}
	
	public ORDERDETAIL(){
		
	}
}
