package creationalDesignPattern;

public class StaticSingleton {

	@SuppressWarnings("unused")
	private static StaticSingleton instance;
	
	private StaticSingleton() {}
	
	static {
		try {
			instance=new StaticSingleton();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");}
	}
	public static void main(String arg[]) {
		System.out.println();
	}
}
