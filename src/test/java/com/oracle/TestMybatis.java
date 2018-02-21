package com.oracle;

import java.io.IOException;
import org.junit.Test;
import com.oracle.service.EmpService;
import com.oracle.service.EmpServiceImpl;
import com.oracle.vo.Emp;
import com.oracle.vo.Role;

public class TestMybatis {

	@Test
	public void test1() throws IOException {
		EmpService service=new EmpServiceImpl();
//		System.out.println(service.getEmp(2));
//		Emp emp=new Emp();
//		emp.setEmpName("Áõæ¿");
//		emp.setEmpNo("1111");
//		emp.setPassWord("777");
//		emp.setTel("18899997777");
//		Role r=new Role();
//		r.setRoleId(1);
//		emp.setRole(r);
//		service.save(emp);
//		Emp emp=new Emp();
//		emp.setEmpName("Áõ");
//		System.out.println(service.selectEmp(emp));
//		service.udpate(emp);
		service.delete(new int[]{7,8});
	}

}
