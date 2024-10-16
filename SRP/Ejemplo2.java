//Clase Report: Almacena los datos del reporte, cumple con SRP
public class Report {
    private String title;
    private String body;

    //Constructor que inicializa el titulo y el cuerpo del reporte
    public Report(String title, String body) {
        this.title = title;
        this.body = body;
    }

    //Metodo que devuelve el titulo del reporte
    public String getTitle() {
        return title;
    }

    //Metodo que devuelve el cuerpo del reporte
    public String getBody() {
        return body;
    }
}

//Se encarga exclusivamente de la generacion del reporte
public class ReportGenerator {
    public void generateReport(Report report) {
        // Genera el reporte en un formato específico
        System.out.println("Generating report: " + report.getTitle());
    }       
}

//Se encarga exclusivamente de imprimir el reporte
public class ReportPrinter {
    public void printReport(Report report) {
        // Imprime el reporte
        System.out.println("Printing report: " + report.getTitle());
    }
}