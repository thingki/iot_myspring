package com.iot.spring.service;

import java.util.List;
import com.iot.spring.vo.Emp;


public interface EmpService {
	
	public List<Emp> getEmpList();
	public Emp getEmp();
	public int insertEmp(Emp empDTO);
	public int updateEmp();
	public int deleteEmp();
}
