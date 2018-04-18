package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	List<String> empList;
	
	public Employees() {
		empList=new ArrayList<String>();
	}
	
	public Employees(List<String> list) {
		this.empList=list;
	}
	public void loadData() {
		//load data from database and add into list
		
		empList.add("Madhuri");
		empList.add("Ankita");
		empList.add("poonam");
		empList.add("rohini");
	}
	public List<String> getEmpList() {
		
		return empList;
	}
	public Object clone() {
		List<String> temp=new ArrayList<String>();
		for(String s:this.empList) {
			temp.add(s);
		}
		return new Employees(temp);
	}
	
}
