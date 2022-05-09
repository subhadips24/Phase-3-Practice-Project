package com.spring.jdbc;

import java.util.List;

import com.spring.Bean.StudentBean;

public interface StudentCRUD {
		
	
			public int insert(StudentBean sb);
			public List<StudentBean> getStudents();
}
