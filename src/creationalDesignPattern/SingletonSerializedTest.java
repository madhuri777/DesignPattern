package creationalDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

	public static void main(String arg[]) throws Exception {
		SerializationinSingleton instanceOne=SerializationinSingleton.getInstance();
		//SerializationinSingleton instanceOne1=SerializationinSingleton.getInstance();
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("singleton.txt"));
		//ObjectOutput out1=new ObjectOutputStream(new FileOutputStream("singleton.txt"));
		out.writeObject(instanceOne);
        out.close();
        
        //deserailize file to object
        ObjectInput in=new ObjectInputStream(new FileInputStream("singleton.txt"));
        SerializationinSingleton instanceTwo=(SerializationinSingleton)in.readObject();
	
        in.close();
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        //System.out.println("instanceOne1 hashCode="+instanceOne.hashCode());
	}
}
