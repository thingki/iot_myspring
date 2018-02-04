package com.iot.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.dao.MenuDAO;
import com.iot.spring.service.MenuService;
import com.iot.spring.vo.MenuInfo;

@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDAO mdao;
	
	@Override
	public List<MenuInfo> getMenuList() {
		return mdao.selectMenuList();
	}
	
	@Override
	public MenuInfo getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMenu(MenuInfo menuDTO) {
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
