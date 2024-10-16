// Interfaz para el dibujo de formas
public interface Drawable {
    void draw(); // Método que deben implementar las clases que deseen ser dibujables
}

// Implementación de un círculo
public class Circle implements Drawable {
    @Override
    // Implementación del método draw para dibujar un círculo
    public void draw() {
        System.out.println("Drawing a circle"); // Mensaje que indica que se está dibujando un círculo
    }
}

// Implementación de un cuadrado
public class Square implements Drawable {
    @Override
    // Implementación del método draw para dibujar un cuadrado
    public void draw() {
        System.out.println("Drawing a square"); // Mensaje que indica que se está dibujando un cuadrado
    }
}

// Clase de cliente que usa Drawable
public class ShapeDrawer {
    private Drawable shape; // Atributo para almacenar la forma a dibujar

    // Constructor que recibe un objeto de tipo Drawable
    public ShapeDrawer(Drawable shape) {
        this.shape = shape; // Inicializa el atributo shape con el objeto recibido
    }

    // Método para dibujar la forma
    public void drawShape() {
        shape.draw(); // Llama al método draw del objeto shape para dibujar la forma
    }
}