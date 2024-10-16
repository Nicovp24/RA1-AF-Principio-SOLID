/ Clase que representa una bombilla
public class Bombilla {
    // Método que enciende la bombilla
    public void encender() {
        System.out.println("La bombilla está encendida"); // Mensaje que indica que la bombilla se ha encendido
    }

    // Método que apaga la bombilla
    public void apagar() {
        System.out.println("La bombilla está apagada"); // Mensaje que indica que la bombilla se ha apagado
    }
}

// Clase Interruptor que depende de Bombilla (violación del DIP)
public class Interruptor {
    private Bombilla bombilla; // Atributo que almacena una referencia a un objeto Bombilla

    // Constructor que inicializa el atributo bombilla
    public Interruptor(Bombilla bombilla) {
        this.bombilla = bombilla; // Asigna el objeto Bombilla al atributo
    }

    // Método que opera la bombilla (enciende o apaga)
    public void operar() {
        bombilla.encender(); // Llama al método encender de la bombilla
        // Más tarde: bombilla.apagar(); // (Comentado) podría apagarse más tarde
    }
}