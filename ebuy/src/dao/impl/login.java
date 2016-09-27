package dao.impl;

import java.util.List;

import po.LOGININFO;
import po.MANAGER;
import po.USERINFO;
import dao.BaseDAO;
import dao.LoginInfoDAO;
import dao.ManagerDAO;

public class login  extends BaseDAO implements LoginInfoDAO,ManagerDAO{

	@Override
	public boolean checkuser(LOGININFO userinfo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMg(MANAGER manager) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delt(String id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List findUser(String where) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int edit(USERINFO userinfo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
