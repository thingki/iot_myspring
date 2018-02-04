package com.iot.spring.dao;


import java.util.List;

import com.iot.spring.vo.MenuInfo;

public interface MenuDAO {
	public List<MenuInfo> selectMenuList();
	public MenuInfo selectMenu();
	public int insertMenu(MenuInfo MenuDTO);
	public int updateMenu();
	public int deleteMenu();
}