package SearchStudent;

import java.util.ArrayList;

public class Student {
	private String name;  //이름
	private String no;	  //학번
	
	public Student(String name, String no) {    //생성자를 통한 초기화
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	
	
}
