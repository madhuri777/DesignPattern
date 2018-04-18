package creationalDesignPattern;

public class LazySinglton {

	private static LazySinglton instance;
	private LazySinglton() {}
	
	public void eat() {
		System.out.println("hiiiii");
	}
	public static LazySinglton getInstance() {
		if(instance==null) {
			instance=new LazySinglton();
		}
		return instance;
	}
	public static void main(String arg[]) {
		System.out.println(getInstance().toString());
	}
}
