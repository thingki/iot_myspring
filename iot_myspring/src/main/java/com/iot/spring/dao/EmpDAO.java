package com.iot.spring.dao;

import java.util.List;

import com.iot.spring.vo.Emp;

public interface EmpDAO {
	
	public List<Emp> selectEmpList();
	public Emp selectEmp();
	public int insertEmp(Emp empDTO);
	public int updateEmp();
	public int deleteEmp();
}
