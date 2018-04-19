package facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker maker=new ShapeMaker();
		maker.drawCircule();
		maker.drawRectangle();
		maker.drawSquare();
	}

}
