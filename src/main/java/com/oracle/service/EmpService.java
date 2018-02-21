package com.oracle.service;

import java.util.List;

import com.oracle.vo.Emp;

public interface EmpService {
	public Emp getEmp(int empId);
	public void save(Emp e);
	public List<Emp> selectEmp(Emp emp);
	public void udpate(Emp emp);
	public void delete(int[] empIds);
}
