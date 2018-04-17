package CreationalDesignPattern;

public class EnumProgram {

	public enum days {mon ,tue, wed, thu,fri,sat};
	
	public static void main(String[] args) {
		
		System.out.println("list od days: ");
		for(days day:days.values()) {
			System.out.println(day);
		}

	}

}
