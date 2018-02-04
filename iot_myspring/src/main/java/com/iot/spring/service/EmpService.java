package com.iot.spring.service;

import java.util.List;
import java.util.Map;

import com.iot.spring.vo.Emp;


public interface EmpService {
	
	public List<Emp> getEmpList();
	public Emp getEmp(Map<String, String> map);
	public int insertEmp(Emp empDTO);
	public int updateEmp(Map<String, String> map);
	public int deleteEmp(Map<String, String> map);
}
