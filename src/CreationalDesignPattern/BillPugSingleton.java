package CreationalDesignPattern;

public class BillPugSingleton {

	private void BillPugSingleton() {}
	
	private static class Helper{
		private static final BillPugSingleton instance=new BillPugSingleton();
	}
	public static BillPugSingleton getInstance() {
		return Helper.instance;
	}
}
