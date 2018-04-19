package proxy;

public class RealImage implements Image {

	private String filename;
	
	public RealImage(String filename) {
		this.filename=filename;
		loadFromDisk();

	}
	
	@Override
	public void display() {
		System.out.println("FileNAme is :"+filename);
	}
	
	private void loadFromDisk() {
		System.out.println("FileName is : "+filename);
	}

}
