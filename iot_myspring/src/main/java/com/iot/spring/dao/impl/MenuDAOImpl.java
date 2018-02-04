package com.iot.spring.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.spring.dao.MenuDAO;
import com.iot.spring.vo.MenuInfo;

@Repository
public class MenuDAOImpl implements MenuDAO {
	
	@Autowired
	private SqlSessionFactory ssf;
	
	@Override
	public List<MenuInfo> selectMenuList() {
		SqlSession ss = ssf.openSession();
		List<MenuInfo> menuList = ss.selectList("menu.selectMenu");
		return menuList;
	}

	@Override
	public MenuInfo selectMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMenu(MenuInfo MenuDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
