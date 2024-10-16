// Nueva interfaz para voladores
public interface Volador {
    void volar(); // Método que deben implementar las clases que puedan volar
}

// Clase Ave sin el método volar
public class Ave {
    private String nombre; // Atributo que almacena el nombre del ave

    // Constructor que inicializa el nombre del ave
    public Ave(String nombre) {
        this.nombre = nombre; // Asigna el nombre al atributo
    }

    // Método que devuelve el nombre del ave
    public String getNombre() {
        return nombre; // Retorna el nombre del ave
    }
}

// Clase Avestruz, que no implementa Volador porque no vuela
public class Avestruz extends Ave {
    // Constructor que inicializa el nombre de la avestruz llamando al constructor de la clase base
    public Avestruz(String nombre) {
        super(nombre); // Llama al constructor de Ave para establecer el nombre
    }
}

// Clase Gorrion, que sí puede volar
public class Gorrion extends Ave implements Volador {
    // Constructor que inicializa el nombre del gorrión llamando al constructor de la clase base
    public Gorrion(String nombre) {
        super(nombre); // Llama al constructor de Ave para establecer el nombre
    }

    // Implementación del método volar de la interfaz Volador
    @Override
    public void volar() {
        System.out.println("El gorrión está volando"); // Mensaje que indica que el gorrión vuela
    }
}