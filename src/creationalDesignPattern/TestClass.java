package creationalDesignPattern;

 class Test {

	private static Test instance=new Test();
	private Test() {
	
	System.out.println("creating......");
     
	}
	public static Test getInstance() {
		return instance;
	}

}
public class TestClass{
	public static void main(String arg[]) {
		Test s1=Test.getInstance();
		Test s2=Test.getInstance();
		System.out.println("s1 "+s1.toString());
		System.out.println("s2 "+s2.toString());
		
	}
}
