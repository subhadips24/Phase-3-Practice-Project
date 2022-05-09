package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.spring.Bean.StudentBean;

public class StudentDAO implements StudentCRUD {
		JdbcTemplate temp;
		
	public void setTemp(JdbcTemplate temp) {
		
			this.temp = temp;
		}

	public int insert(StudentBean sb) {
		
		String query="insert into spring_student values("+sb.getS_Roll_No()+""+sb.getS_FullName()+""+sb.getS_PhNo()+")";
		
		return temp.update(query);
	}

			public List<StudentBean> getStudents() 
			{
				String sql="select * from spring_student";
				
				return temp.query(sql,new ResultSetExtractor<List<StudentBean>>() {
		
					public List<StudentBean> extractData(ResultSet rs) throws SQLException, DataAccessException 
					{
						
						List<StudentBean> list=new ArrayList<StudentBean>();
						while(rs.next()) {
							StudentBean sb=new StudentBean();
							sb.setS_Roll_No(rs.getInt(1));
							sb.setS_FullName(rs.getString(2));
							sb.setS_PhNo(rs.getString(3));
							list.add(sb);
						}
						return list;
					}
					
					
				});
			
			
		
			}
					
			
}
