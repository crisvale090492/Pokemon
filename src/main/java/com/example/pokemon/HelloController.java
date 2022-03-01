package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class HelloController {



    int ataqueTotalPokemonSeleccionado = 0;

    int ataqueTotalRival = 0;

    public void actualizarAtaqueTotalPokemonSeleccionado(int danio){
        ataqueTotalPokemonSeleccionado += danio;

        System.out.println(ataqueTotalPokemonSeleccionado);
    }

    public void actualizarAtaqueTotalRival(int danio){
        ataqueTotalRival += danio;

        System.out.println(ataqueTotalRival);
    }

    Pokemon PokemonSeleccionado;

    Pokemon Pokemon1 = new Pokemon("arcanine", "90", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Arcanine_NB.gif"), "500/500","fuego", 500, 500,new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Arcanine_espalda_G5.gif"),0);
    Pokemon Pokemon2 = new Pokemon("zapdos", "110", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Zapdos_NB.gif"), "650/650","electrico", 650, 650, new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Zapdos_espalda_G5.gif"),0);
    Pokemon Pokemon3 = new Pokemon("froslass", "45", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Froslass_NB.gif"), "250/250","hielo", 250, 250,new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Froslass_espalda_G5.gif"),0);
    Pokemon Pokemon4 = new Pokemon("machamp", "85", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Machamp_NB.gif"), "550/550","lucha",550, 550,new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Machamp_espalda_G5.gif"),0);
    Pokemon Pokemon5 = new Pokemon("charizard", "120", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Charizard_NB.gif"), "700/700","fuego",700, 700,new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Charizard_espalda_G5.gif"),0);
    Pokemon Pokemon6 = new Pokemon("porygon", "45", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Porygon-Z_NB.gif"), "240/240","normal", 240, 240,new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Porygon-Z_espalda_G5.gif"),0);

    @FXML
    Label nombrepokemon1;
    @FXML
    Label nivelpokemon1;
    @FXML
    Label ps1;
    @FXML
    Label clasepokemon1;
    @FXML
    Label nombrepokemon2;
    @FXML
    Label nivelpokemon2;
    @FXML
    Label ps2;
    @FXML
    Label clasepokemon2;
    @FXML
    Label nombrepokemon3;
    @FXML
    Label nivelpokemon3;
    @FXML
    Label ps3;
    @FXML
    Label clasepokemon3;
    @FXML
    Label nombrepokemon4;
    @FXML
    Label nivelpokemon4;
    @FXML
    Label ps4;
    @FXML
    Label clasepokemon4;
    @FXML
    Label nombrepokemon5;
    @FXML
    Label nivelpokemon5;
    @FXML
    Label ps5;
    @FXML
    Label clasepokemon5;
    @FXML
    Label nombrepokemon6;
    @FXML
    Label nivelpokemon6;
    @FXML
    Label ps6;
    @FXML
    Label clasepokemon6;
    @FXML
    ImageView imagenpokemon1;
    @FXML
    ImageView imagenpokemon2;
    @FXML
    ImageView imagenpokemon3;
    @FXML
    ImageView imagenpokemon4;
    @FXML
    ImageView imagenpokemon5;
    @FXML
    ImageView imagenpokemon6;
    @FXML
    ProgressBar vidapokemon1;
    @FXML
    ProgressBar vidapokemon2;
    @FXML
    ProgressBar vidapokemon3;
    @FXML
    ProgressBar vidapokemon4;
    @FXML
    ProgressBar vidapokemon5;
    @FXML
    ProgressBar vidapokemon6;
    @FXML
    AnchorPane pokemon1;
    @FXML
    AnchorPane pokemon2;
    @FXML
    AnchorPane pokemon3;
    @FXML
    AnchorPane pokemon4;
    @FXML
    AnchorPane pokemon5;
    @FXML
    AnchorPane pokemon6;
    @FXML
    Button Elegirpokemon;
    @FXML
    Button Siguiente;
    @FXML
    Button BotonEstadisticas;

    @FXML

    public void initialize() {

        nombrepokemon1.setText(Pokemon1.nombrepokemon);
        nivelpokemon1.setText(Pokemon1.nivelpokemon);
        ps1.setText(Pokemon1.PS);
        clasepokemon1.setText(Pokemon1.clasepokemon);
        nombrepokemon2.setText(Pokemon2.nombrepokemon);
        nivelpokemon2.setText(Pokemon2.nivelpokemon);
        ps2.setText(Pokemon2.PS);
        clasepokemon2.setText(Pokemon2.clasepokemon);
        nombrepokemon3.setText(Pokemon3.nombrepokemon);
        nivelpokemon3.setText(Pokemon3.nivelpokemon);
        ps3.setText(Pokemon3.PS);
        clasepokemon3.setText(Pokemon3.clasepokemon);
        nombrepokemon4.setText(Pokemon4.nombrepokemon);
        nivelpokemon4.setText(Pokemon4.nivelpokemon);
        ps4.setText(Pokemon4.PS);
        clasepokemon4.setText(Pokemon4.clasepokemon);
        nombrepokemon5.setText(Pokemon5.nombrepokemon);
        nivelpokemon5.setText(Pokemon5.nivelpokemon);
        ps5.setText(Pokemon5.PS);
        clasepokemon5.setText(Pokemon5.clasepokemon);
        nombrepokemon6.setText(Pokemon6.nombrepokemon);
        nivelpokemon6.setText(Pokemon6.nivelpokemon);
        ps6.setText(Pokemon6.PS);
        clasepokemon6.setText(Pokemon6.clasepokemon);

        Image imagen1 = new Image(Pokemon1.fotopokemon.toURI().toString());
        imagenpokemon1.setImage(imagen1);

        Image imagen2 = new Image(Pokemon2.fotopokemon.toURI().toString());
        imagenpokemon2.setImage(imagen2);

        Image imagen3 = new Image(Pokemon3.fotopokemon.toURI().toString());
        imagenpokemon3.setImage(imagen3);

        Image imagen4 = new Image(Pokemon4.fotopokemon.toURI().toString());
        imagenpokemon4.setImage(imagen4);

        Image imagen5 = new Image(Pokemon5.fotopokemon.toURI().toString());
        imagenpokemon5.setImage(imagen5);

        Image imagen6 = new Image(Pokemon6.fotopokemon.toURI().toString());
        imagenpokemon6.setImage(imagen6);

        vidapokemon1.setProgress(Pokemon1.vidarestante/Pokemon1.vidapokemon);
        vidapokemon2.setProgress(Pokemon2.vidarestante/Pokemon2.vidapokemon);
        vidapokemon3.setProgress(Pokemon3.vidarestante/Pokemon3.vidapokemon);
        vidapokemon4.setProgress(Pokemon4.vidarestante/Pokemon4.vidapokemon);
        vidapokemon5.setProgress(Pokemon5.vidarestante/Pokemon5.vidapokemon);
        vidapokemon6.setProgress(Pokemon6.vidarestante/Pokemon6.vidapokemon);

        BotonEstadisticas.setText("Estadisticas");


    }

    @FXML
    public void pokemon1elegido() {
        System.out.println("pokemon seleccionado");
        pokemon1.setStyle("-fx-background-color:purple");
        pokemon2.setStyle("-fx-background-color: #685175");
        pokemon3.setStyle("-fx-background-color: #685175");
        pokemon4.setStyle("-fx-background-color: #685175");
        pokemon5.setStyle("-fx-background-color: #685175");
        pokemon6.setStyle("-fx-background-color: #685175");
        Elegirpokemon.setText("Pokemon elegido");
        Siguiente.setText("Siguiente");
        PokemonSeleccionado = Pokemon1;
    }
    @FXML
    public void pokemon2elegido() {
        System.out.println("pokemon seleccionado");
        pokemon1.setStyle("-fx-background-color: #685175");
        pokemon2.setStyle("-fx-background-color: purple");
        pokemon3.setStyle("-fx-background-color: #685175");
        pokemon4.setStyle("-fx-background-color: #685175");
        pokemon5.setStyle("-fx-background-color: #685175");
        pokemon6.setStyle("-fx-background-color: #685175");
        Elegirpokemon.setText("Pokemon elegido");
        Siguiente.setText("Siguente");
        PokemonSeleccionado = Pokemon2;
    }
    @FXML
    public void pokemon3elegido() {
        System.out.println("pokemon seleccionado");
        pokemon1.setStyle("-fx-background-color: #685175");
        pokemon2.setStyle("-fx-background-color: #685175");
        pokemon3.setStyle("-fx-background-color: purple");
        pokemon4.setStyle("-fx-background-color: #685175");
        pokemon5.setStyle("-fx-background-color: #685175");
        pokemon6.setStyle("-fx-background-color: #685175");
        Elegirpokemon.setText("Pokemon elegido");
        Siguiente.setText("Siguiente");
        PokemonSeleccionado = Pokemon3;
    }
    @FXML
    public void pokemon4elegido() {
        System.out.println("pokemon seleccionado");
        pokemon1.setStyle("-fx-background-color: #685175");
        pokemon2.setStyle("-fx-background-color: #685175");
        pokemon3.setStyle("-fx-background-color: #685175");
        pokemon4.setStyle("-fx-background-color: purple");
        pokemon5.setStyle("-fx-background-color: #685175");
        pokemon6.setStyle("-fx-background-color: #685175");
        Elegirpokemon.setText("Pokemon elegido");
        Siguiente.setText("Siguiente");
        PokemonSeleccionado = Pokemon4;
    }
    @FXML
    public void pokemon5elegido() {
        System.out.println("pokemon seleccionado");
        pokemon1.setStyle("-fx-background-color: #685175");
        pokemon2.setStyle("-fx-background-color: #685175");
        pokemon3.setStyle("-fx-background-color: #685175");
        pokemon4.setStyle("-fx-background-color: #685175");
        pokemon5.setStyle("-fx-background-color: purple");
        pokemon6.setStyle("-fx-background-color: #685175");
        Elegirpokemon.setText("Pokemon elegido");
        Siguiente.setText("Siguiente");
        PokemonSeleccionado = Pokemon5;

    }
    @FXML
    public void pokemon6elegido() {
        System.out.println("pokemon seleccionado");
        pokemon1.setStyle("-fx-background-color: #685175");
        pokemon2.setStyle("-fx-background-color: #685175");
        pokemon3.setStyle("-fx-background-color: #685175");
        pokemon4.setStyle("-fx-background-color: #685175");
        pokemon5.setStyle("-fx-background-color: #685175");
        pokemon6.setStyle("-fx-background-color: purple");
        Elegirpokemon.setText("Pokemon elegido");
        Siguiente.setText("Siguiente");
        PokemonSeleccionado = Pokemon6;
    }

    public void actualizarVida(){

        vidapokemon1.setProgress(Pokemon1.vidarestante/Pokemon1.vidapokemon);
        vidapokemon2.setProgress(Pokemon2.vidarestante/Pokemon2.vidapokemon);
        vidapokemon3.setProgress(Pokemon3.vidarestante/Pokemon3.vidapokemon);
        vidapokemon4.setProgress(Pokemon4.vidarestante/Pokemon4.vidapokemon);
        vidapokemon5.setProgress(Pokemon5.vidarestante/Pokemon5.vidapokemon);
        vidapokemon6.setProgress(Pokemon6.vidarestante/Pokemon6.vidapokemon);

    }

    Stage stage2;

    @FXML
    protected void Batalla() {

        PokemonSeleccionado.cantidadSeleccion +=1;

        System.out.println(PokemonSeleccionado.cantidadSeleccion);

        System.out.println("Boton pulsado vamos al campo de Batalla");

        try {

            stage2 = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view2.fxml"));

            BorderPane root =  loader.load();
            Scene scene = new Scene(root, 600, 430);
            stage2.setTitle("Batalla");
            stage2.setScene(scene);
            stage2.show();

            HelloController2 v = loader.getController();
            v.initialize2(PokemonSeleccionado);
            v.enviarDatos(this);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    Stage stage3;



    @FXML
    protected void estadisticas() {

        System.out.println("Boton pulsado vamos a las estadisticas");

        try {

            stage3 = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Estadisticas.fxml"));

            AnchorPane root =  loader.load();
            Scene scene = new Scene(root, 600, 430);
            stage3.setTitle("Estadisticas");
            stage3.setScene(scene);
            stage3.show();

            EstadisticasController v = loader.getController();

            v.pasarInfo(this);
            v.setGraficaQueso();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Pokemon {

    String nombrepokemon;
    String nivelpokemon;
    File fotopokemon;
    String PS;
    String clasepokemon;
    float vidapokemon;
    float vidarestante;
    File fotoataque;
    int cantidadSeleccion;


    public Pokemon(String nombrepokemon,String nivelpokemon,File fotopokemon,String PS,String clasepokemon,float vidapokemon,float vidarestante,File fotoataque,int cantidadSeleccion){
        this.nombrepokemon = nombrepokemon;
        this.nivelpokemon = nivelpokemon;
        this.fotopokemon = fotopokemon;
        this.PS = PS;
        this.clasepokemon = clasepokemon;
        this.vidapokemon = vidapokemon;
        this.vidarestante = vidarestante;
        this.fotoataque = fotoataque;
        this.cantidadSeleccion = cantidadSeleccion;
    }

}