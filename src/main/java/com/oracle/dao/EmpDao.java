package com.oracle.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.oracle.vo.Emp;

public interface EmpDao {
	//dddddqwq我在github上修改了注释，简单的使用了git
	public  Emp getEmp(@Param("empId")int empId);
	public void save(Emp e);
	public List<Emp> selectEmp(Emp emp);
	public void update(Emp emp);
	public void delete(@Param("empIds")int[] empIds);
}
