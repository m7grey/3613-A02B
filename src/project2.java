public class project2 {
    public static void main(String[] args) {

        GeometricObject[] objectsShapes = new GeometricObject[5];
        objectsShapes[0] = new Square(4,"White");
        objectsShapes[1] = new Triangle(2.4, 2.4, 2.1);
        objectsShapes[2] = new Rectangle(3, 4);
        objectsShapes[3] = new Square(4,"Black");
        objectsShapes[4] = new Square(5,"Green");

        for (int i = 0; i < objectsShapes.length; i++) {
            objectsShapes[i].howToColor();
            }
        }

    }

