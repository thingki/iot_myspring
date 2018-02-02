package com.iot.spring.controller;



import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("")
@RequestMapping
public class UrlController {
	
	private static final Logger logger = LoggerFactory.getLogger(UrlController.class);
	
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
	public String home(Locale locale, Model model) {
		model.addAttribute("title", "IOT-SPRING-2");
		return "index";
	}
}
