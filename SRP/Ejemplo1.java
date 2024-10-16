public class Report {
    private String title;
    private String body;

    //El constructor inicializa los datos del reporte
    public Report(String title, String body) {
        this.title = title;
        this.body = body;
    }

    //Estw mwtoso genera el reporte en un formato escepecifico (Violacion SRP)
    public void generateReport() {
        System.out.println("Generating report...");
    }

    //Este metodo imprime el reporte (Violacion SRP)
    public void printReport() {
        System.out.println("Printing report: " + title);
    }
}