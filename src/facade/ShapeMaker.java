package facade;

public class ShapeMaker {

	private Circule circule;
	private Square square;
	private Rectangle rectangle;
	
	public ShapeMaker() {
		circule=new Circule();
		square=new Square();
		rectangle=new Rectangle();
	}
	
	public void drawCircule() {
		circule.draw();
	}
	public void drawSquare() {
		square.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
}
 