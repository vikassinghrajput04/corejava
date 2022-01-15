package com.model.student;

public class TestStudent {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testDelete();
		//testSearch("Vikas");
		//get("A-01");
		//Update();
	}

	public static void Update() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setFname("Rakesh");
		bean.setLname("Narwal");
		bean.setSession("2009-10");
		bean.setRollNo("A-01");
		
		StudentModel.Update(bean);
	}

	public static void get(String RollNo) throws Exception {
		String rn = RollNo;
	
		StudentBean bean = new StudentBean();
		bean.setRollNo(rn);
		
		StudentModel.Get(bean);
		
	}

	public static void testSearch(String Fname) throws Exception {
		String fn = Fname;
		
		StudentBean bean = new StudentBean();
		bean.setFname(fn);
		
		StudentModel.Search(bean);
		
		
	}

	public static void testDelete() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNo("A-02");
		
		StudentModel.Delete(bean);
		
	}

	public static void testAdd() throws Exception {
		StudentBean bean = new StudentBean();
		bean.setRollNo("A-03");
		bean.setFname("Vinay");
		bean.setLname("Sharma");
		bean.setSession("2008-09");
		
		StudentModel.add(bean);
		
	}

}
