package CreationalDesignPattern;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private void ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance==null) {
			instance=new ThreadSafeSingleton();
		}
		return instance;
	}
}
