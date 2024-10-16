public class Shape {
    //Constantes que definen los tipos de forma
    public static final int CIRCLE = 1;
    public static final int SQUARE = 2;

    private int shapeType; //Variable que almacena el tipo de forma

    //Constructor que inicializa el tipo de forma
    public Shape(int shapeType) {
        this.shapeType = shapeType;
    }

    //Metodo draw que dibuja la forma en base al tipo
    public void draw() {
        //Si es un circulo, llama a drawCircle
        if (shapeType == CIRCLE) {
            drawCircle();
        //Si es un cuadrado, llama a drawSquare
        } else if (shapeType == SQUARE) {
            drawSquare();
        }
    }

    //Metodo privado que dibuja un circulo
    private void drawCircle() {
        System.out.println("Drawing a circle");
    }

    //Metodo privado que dibuja un circulo
    private void drawSquare() {
        System.out.println("Drawing a square");
    }
}