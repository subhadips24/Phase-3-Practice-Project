package com.spring.Bean;

public class StudentBean {
		private int s_Roll_No;
		private String  s_FullName;
		private String s_PhNo;
		
		public int getS_Roll_No() {
			return s_Roll_No;
		}
		public void setS_Roll_No(int s_Roll_No) {
			this.s_Roll_No = s_Roll_No;
		}
		public String getS_FullName() {
			return s_FullName;
		}
		public void setS_FullName(String s_FullName) {
			this.s_FullName = s_FullName;
		}
		public String getS_PhNo() {
			return s_PhNo;
		}
		public void setS_PhNo(String s_PhNo) {
			this.s_PhNo = s_PhNo;
		}
		@Override
		public String toString() {
			return "StudentBean [s_Roll_No=" + s_Roll_No + ", s_FullName=" + s_FullName + ", s_PhNo=" + s_PhNo + "]";
		}
		
		
		
		
		

}
