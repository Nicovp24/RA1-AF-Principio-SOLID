// Interfaz que define las operaciones que deben implementar los trabajadores
public interface Worker {
    void work(); // Método que define la acción de trabajar
    void eat();  // Método que define la acción de comer
}

// Clase que implementa la interfaz Worker para los trabajadores humanos
public class HumanWorker implements Worker {
    @Override
    // Implementación del método work para los trabajadores humanos
    public void work() {
        System.out.println("Working..."); // Mensaje que indica que el humano está trabajando
    }

    @Override
    // Implementación del método eat para los trabajadores humanos
    public void eat() {
        System.out.println("Eating..."); // Mensaje que indica que el humano está comiendo
    }
}

// Clase que implementa la interfaz Worker para los trabajadores robots
public class RobotWorker implements Worker {
    @Override
    // Implementación del método work para los trabajadores robots
    public void work() {
        System.out.println("Working..."); // Mensaje que indica que el robot está trabajando
    }

    @Override
    // Implementación del método eat para los trabajadores robots
    public void eat() {
        // Lanza una excepción indicando que los robots no comen
        throw new UnsupportedOperationException("Robots don't eat");
    }
}