// Interfaz que define el comportamiento de cualquier dispositivo que se pueda encender o apagar
public interface Encendible {
    void encender(); // Método para encender el dispositivo
    void apagar();   // Método para apagar el dispositivo
}

// Implementación de la interfaz Encendible para una bombilla
public class Bombilla implements Encendible {
    @Override
    // Implementación del método encender para la bombilla
    public void encender() {
        System.out.println("La bombilla está encendida"); // Mensaje que indica que la bombilla se ha encendido
    }

    @Override
    // Implementación del método apagar para la bombilla
    public void apagar() {
        System.out.println("La bombilla está apagada"); // Mensaje que indica que la bombilla se ha apagado
    }
}

// Implementación de la interfaz Encendible para un ventilador
public class Ventilador implements Encendible {
    @Override
    // Implementación del método encender para el ventilador
    public void encender() {
        System.out.println("El ventilador está encendido"); // Mensaje que indica que el ventilador se ha encendido
    }

    @Override
    // Implementación del método apagar para el ventilador
    public void apagar() {
        System.out.println("El ventilador está apagado"); // Mensaje que indica que el ventilador se ha apagado
    }
}

// Clase Interruptor que ahora depende de la abstracción (cumple con el DIP)
public class Interruptor {
    private Encendible dispositivo; // Atributo que almacena un objeto que implementa Encendible

    // Constructor que recibe un objeto de tipo Encendible
    public Interruptor(Encendible dispositivo) {
        this.dispositivo = dispositivo; // Asigna el objeto recibido al atributo
    }

    // Método que opera el dispositivo (enciende o apaga)
    public void operar() {
        dispositivo.encender(); // Llama al método encender del dispositivo
        // Más tarde: dispositivo.apagar(); // (Comentado) podría apagarse más tarde
    }
}