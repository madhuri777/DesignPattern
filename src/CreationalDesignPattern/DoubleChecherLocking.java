package CreationalDesignPattern;

public class DoubleChecherLocking {

	private static DoubleChecherLocking instance;
	
	private DoubleChecherLocking() {}
   
	public static DoubleChecherLocking getInstance() {
		if(instance==null) {               //single Checked.
			synchronized (DoubleChecherLocking.class) {
				if(instance==null) {       //Double checked.
					instance=new DoubleChecherLocking();
				}
			}
		}
		return instance;
	}
}
