package com.iot.spring.controller;



import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.spring.service.MenuService;
import com.iot.spring.vo.Emp;
import com.iot.spring.vo.MenuInfo;

@Controller("")
@RequestMapping
public class UrlController {
	
	private static final Logger logger = LoggerFactory.getLogger(UrlController.class);
	@Autowired
	private MenuService ms;
	
	private String getUrl(String url, String rootPath) {
		return url.replace(rootPath+"/path", "");		
	}
	@RequestMapping("/path/**")
	public String forwardJsp(HttpServletRequest request) {
		String url=request.getRequestURI();
		String rootPath = request.getContextPath();
		url=getUrl(url, rootPath);
		logger.info("path=>{}", url);
		return url;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model m) {
		m.addAttribute("title", "IOT-SPRING-2");
		List<MenuInfo> menuList = ms.getMenuList();
		m.addAttribute("menuList", menuList);
		
		return "index";
	}
}
