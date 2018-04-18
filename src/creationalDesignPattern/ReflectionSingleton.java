package creationalDesignPattern;
import java.lang.reflect.Constructor;
public class ReflectionSingleton {

	@SuppressWarnings("rawtypes")
	public static void main(String arg[]) {
		EagerSingleton instanceOne=EagerSingleton.getInstance();
		EagerSingleton instanceTwo=null;
		try {
			Constructor[] constructors=EagerSingleton.class.getDeclaredConstructors();
			for(Constructor constructor:constructors) {
				constructor.setAccessible(true);
				instanceTwo=(EagerSingleton)constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("instanceOne "+instanceOne.toString());
		System.out.println("instanceTwo "+instanceTwo.toString());
	}
}
