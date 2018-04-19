package proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		
		Image image=new ProxyImage("test_10mb.jpg");
		
		System.out.println("it will load from localDisk: "+"\n");
		image.display();
		System.out.println();
		System.out.println("It will  take proxy :");
		image.display();

	}

}
