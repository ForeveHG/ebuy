package po;

/**
 * 用户实体类
 * @author Administrator
 *
 */
public class LOGININFO {
	private String userid; //用户编号
	private String uloginname; //用户登录名
	private String uloginpwd; //用户登录密码

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUloginname() {
		return uloginname;
	}

	public void setUloginname(String uloginname) {
		this.uloginname = uloginname;
	}

	public String getUloginpwd() {
		return uloginpwd;
	}

	public void setUloginpwd(String uloginpwd) {
		this.uloginpwd = uloginpwd;
	}

	public LOGININFO(String userid, String uloginname, String uloginpwd) {
		this.userid = userid;
		this.uloginname = uloginname;
		this.uloginpwd = uloginpwd;
	}

	public LOGININFO() {

	}
}
