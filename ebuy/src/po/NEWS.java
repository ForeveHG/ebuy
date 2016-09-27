package po;

import java.util.Date;

/**
 * 公告，新闻实体类
 * @author Administrator
 *
 */
public class NEWS {
	private String nid; //编号(自动生成)
	private String ntitle; //标题
	private String ncontent; //内容
	private Date ndate; //发表日期(自动生成)
	private String ntype; //类型（公告或者新闻）

	public NEWS(String nid, String ntitle, String ncontent, Date ndate,
			String ntype) {
		this.nid = nid;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.ndate = ndate;
		this.ntype = ntype;
	}

	public NEWS() {

	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public Date getNdate() {
		return ndate;
	}

	public void setNdate(Date ndate) {
		this.ndate = ndate;
	}

	public String getNtype() {
		return ntype;
	}

	public void setNtype(String ntype) {
		this.ntype = ntype;
	}

}
