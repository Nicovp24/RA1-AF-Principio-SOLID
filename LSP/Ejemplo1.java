// Clase base que representa un ave
public class Ave {
    // Método que permite a las aves volar
    public void volar() {
        System.out.println("El ave está volando"); // Mensaje que indica que el ave vuela
    }
}

// Clase Avestruz que hereda de Ave
public class Avestruz extends Ave {
    @Override
    // Sobrescribe el método volar de la clase base
    public void volar() {
        // Lanza una excepción indicando que las avestruces no pueden volar
        throw new UnsupportedOperationException("Las avestruces no pueden volar");
    }
}