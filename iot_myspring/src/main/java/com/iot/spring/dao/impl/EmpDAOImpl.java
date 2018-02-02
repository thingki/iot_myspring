package com.iot.spring.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot.spring.dao.EmpDAO;
import com.iot.spring.vo.Emp;

@Repository
public class EmpDAOImpl implements EmpDAO{

	@Autowired
	private SqlSessionFactory ssf;
	
	@Override
	public List<Emp> selectEmpList() {
		SqlSession ss = ssf.openSession();
		List<Emp> empList = ss.selectList("emp.selectEmp");
		return empList;
	}

	@Override
	public Emp selectEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertEmp(Emp empDTO) {
		SqlSession ss = ssf.openSession();
		int result = ss.insert("emp.insertEmp", empDTO);
		return result;
	}

	@Override
	public int updateEmp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmp() {
		// TODO Auto-generated method stub
		return 0;
	}

}
