package com.oracle.service;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.oracle.dao.EmpDao;
import com.oracle.utils.SessionUtils;
import com.oracle.vo.Emp;

public class EmpServiceImpl implements EmpService {

	public Emp getEmp(int empId) {
		SqlSession session=null;
		Emp emp=null;
		try {
			session=SessionUtils.getSession();
			EmpDao dao=session.getMapper(EmpDao.class);
			emp=dao.getEmp(empId);
			session.commit();
		}catch(Exception e){
			if(session!=null) {
				session.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return emp;
	}

	public void save(Emp emp) {
		SqlSession session=null;
		try {
			session=SessionUtils.getSession();
			EmpDao dao=session.getMapper(EmpDao.class);
			dao.save(emp);
			session.commit();
		}catch(Exception e){
			if(session!=null) {
				session.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
	}

	public List<Emp> selectEmp(Emp emp) {
		SqlSession session=null;
		List<Emp> list=null;
		try {
			session=SessionUtils.getSession();
			EmpDao dao=session.getMapper(EmpDao.class);
			list=dao.selectEmp(emp);
			session.commit();
		}catch(Exception e){
			if(session!=null) {
				session.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return list;
	}

	public void udpate(Emp emp) {
		SqlSession session=null;
		try {
			session=SessionUtils.getSession();
			EmpDao dao=session.getMapper(EmpDao.class);
			dao.update(emp);
			session.commit();
		}catch(Exception e){
			if(session!=null) {
				session.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}

	public void delete(int[] empIds) {
		SqlSession session=null;
		try {
			session=SessionUtils.getSession();
			EmpDao dao=session.getMapper(EmpDao.class);
			dao.delete(empIds);
			session.commit();
		}catch(Exception e){
			if(session!=null) {
				session.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}

}
