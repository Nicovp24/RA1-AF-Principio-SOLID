// Interfaz que define la operación de trabajar
public interface Workable {
    void work(); // Método que debe implementar cualquier clase que desee ser trabajadora
}

// Interfaz que define la operación de comer
public interface Eatable {
    void eat(); // Método que debe implementar cualquier clase que desee ser comedora
}

// Clase que implementa tanto Workable como Eatable para los trabajadores humanos
public class HumanWorker implements Workable, Eatable {
    @Override
    // Implementación del método work para los trabajadores humanos
    public void work() {
        System.out.println("Working..."); // Mensaje que indica que el trabajador humano está trabajando
    }

    @Override
    // Implementación del método eat para los trabajadores humanos
    public void eat() {
        System.out.println("Eating..."); // Mensaje que indica que el trabajador humano está comiendo
    }
}

// Clase que implementa solo Workable para los trabajadores robots
public class RobotWorker implements Workable {
    @Override
    // Implementación del método work para los trabajadores robots
    public void work() {
        System.out.println("Working..."); // Mensaje que indica que el robot está trabajando
    }
}