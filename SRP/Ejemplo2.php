<?php

class Report {
    private $title; //Atributo que almacena el titulo del reporte
    private $body; //Atributo que almacena el cuerpo del reporte

    //Constructor que inicializa los atributos del reporte
    public function __construct($title, $body) {
        $this->title = $title;
        $this->body = $body;
    }

    //Este metodo genera el reporte (Violacion del SRP)
    public function generateReport() {
        echo("Generating report...");
    }

    //Este metodo imprime el reporte (Violacion del SRP)
    public function printReport() {
        echo("Printing report: " . $this->title);
        }
}

//Se crea una instancia de la clase Report con un titulo y cuerpo
$oReport= new Report("Titulo del informe", "cuerpor del inform");

//Se llama al metodo para generar el reporte (Violacion del SRP)
$oReport->generateReport();

//Se llama al metodo para imprimir el reporte (Violacion del SRP)
$oReport->printReport();

?>