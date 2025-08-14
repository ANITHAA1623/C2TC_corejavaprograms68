package day3;

public class Student {
	private int sid;
	private String sname;

	public Student() {
		this(11,"data");
		System.out.println("constructor called..");
	}
	public Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	public String toString() {
		return "Student [sid=" + sid + ",sname=" + sname +"]";
	}

}
