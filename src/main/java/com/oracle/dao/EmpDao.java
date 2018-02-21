package com.oracle.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.oracle.vo.Emp;

public interface EmpDao {
	//ddddd
	public  Emp getEmp(@Param("empId")int empId);
	public void save(Emp e);
	public List<Emp> selectEmp(Emp emp);
	public void update(Emp emp);
	public void delete(@Param("empIds")int[] empIds);
}
