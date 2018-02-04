package com.iot.spring.service;

import java.util.List;

import com.iot.spring.vo.MenuInfo;

public interface MenuService {
	public List<MenuInfo> getMenuList();
	public MenuInfo getMenu();
	public int insertMenu(MenuInfo menuDTO);
	public int updateMenu();
	public int deleteMenu();
}
