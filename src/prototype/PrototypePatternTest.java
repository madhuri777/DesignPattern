package prototype;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String arg[]) {
	Employees emps=new Employees();
	emps.loadData();
	
	Employees empNew=(Employees)emps.clone();
	Employees empNewOne=(Employees)emps.clone();
	
	List<String> list=empNew.getEmpList();
	list.add("Satkar");
	
	List<String> list1=empNewOne.getEmpList();
	list1.remove("Madhuri");
	
	System.out.println("emps List: "+emps.getEmpList());
	System.out.println("empsNew List: "+list);
	System.out.println("empsNew1 List1: "+list1);
	
	System.out.println("hashcode code list "+emps.hashCode());
	System.out.println("hashcode of listNew "+empNew.hashCode());
	System.out.println("hashcode of List "+empNewOne.hashCode());
	
}
}