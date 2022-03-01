package com.example.pokemon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.chart.*;


public class EstadisticasController {


    @FXML
    AnchorPane estadisticas;

    @FXML
     BarChart graficaBarras;

    @FXML
     PieChart graficaQueso;

    private HelloController helloController;


    public void setGraficaQueso(){
        ObservableList<PieChart.Data> piechartData = FXCollections.observableArrayList(
                new PieChart.Data("Totalseleccionado "+helloController.ataqueTotalRival, helloController.ataqueTotalRival),
                new PieChart.Data("Totalrival "+helloController.ataqueTotalPokemonSeleccionado, helloController.ataqueTotalPokemonSeleccionado)
                );
        graficaQueso.setData(piechartData);

    }

    public void pasarInfo(HelloController helloController) {
        this.helloController = helloController;
       System.out.println(helloController.ataqueTotalRival);
       System.out.println(helloController.ataqueTotalPokemonSeleccionado);
    }







}
