package creationalDesignPattern;

import java.io.Serializable;

public class SerializationinSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private SerializationinSingleton() {}

	private static class SingletonHelper{
		private static final SerializationinSingleton instance = new SerializationinSingleton();
	}

	public static SerializationinSingleton getInstance() {
		return SingletonHelper.instance;
	}
	private Object readResolve() {
		return SingletonHelper.instance;
	}
}

