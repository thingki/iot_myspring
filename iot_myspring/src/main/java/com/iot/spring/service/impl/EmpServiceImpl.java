package com.iot.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.spring.dao.EmpDAO;
import com.iot.spring.service.EmpService;
import com.iot.spring.vo.Emp;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDAO edao;
	
	@Override
	public List<Emp> getEmpList() {
		return edao.selectEmpList();
	}

	@Override
	public Emp getEmp() {
		return null;
	}

	@Override
	public int insertEmp(Emp empDTO) {
		return edao.insertEmp(empDTO);
	}

	@Override
	public int updateEmp() {
		return 0;
	}

	@Override
	public int deleteEmp() {
		return 0;
	}

}
