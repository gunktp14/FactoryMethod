
public class FactoryMethodDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ConcreteShapeFactory();

		Shape shape1 = shapeFactory.getShape("circle");
		//Shape shape1 = new Cicle();
		shape1.draw();
	} 

}
