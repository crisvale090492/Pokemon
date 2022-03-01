package com.example.pokemon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class HelloController2 {

    Pokemon PokemonSeleccionado;

    Pokemon rival;

    FondoBatalla fondoBatalla = new FondoBatalla(new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Campo_de_batalla_DPPt_2.png"));

    ArrayList<Pokemon> PokemonesRivales = new ArrayList<>();

    Pokemon Pokemon5 = new Pokemon("mewtwo", "100", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Mewtwo_NB.gif"), "500/500", "fuego", 500, 500, new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Arcanine_espalda_G5.gif"), 0);
    Pokemon Pokemon6 = new Pokemon("nidoking", "50", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Nidoking_NB.gif"), "350/350", "electrico", 350, 350, new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Zapdos_espalda_G5.gif"), 0);
    Pokemon Pokemon7 = new Pokemon("pikachu", "60", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Pikachu_NB.gif"), "400/400", "hielo", 400, 400, new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Frosslass_espalda_G5.gif"), 0);
    Pokemon Pokemon8 = new Pokemon("steelix", "70", new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Steelix_NB.gif"), "380/380", "lucha", 380, 380, new File("src\\main\\java\\com\\example\\Pokemon\\ImagenesPokemon\\Machamp_espalda_G5.gif"), 0);



    @FXML
    Label NombrePokemonSeleccionado;

    @FXML
    Label NivelPokemonSeleccionado;

    @FXML
    Label NombreOponente;

    @FXML
    Label NivelOponente;

    @FXML
    Text PuntosVidaPokemonSeleccionado;

    @FXML
    Text PuntosVidaOponente;

    @FXML
    AnchorPane CampoDeBatalla;

    @FXML
    AnchorPane CuraryAtacar;

    @FXML
    BorderPane Batalla;

    @FXML
    BorderPane AtributosOponente;

    @FXML
    BorderPane AtributosPokemonSeleccionado;

    @FXML
    ProgressBar VidaOponente;

    @FXML
    ProgressBar VidaPokemonSeleccionado;

    @FXML
    ImageView ImagenEspaldaPokemonSeleccionado;

    @FXML
    ImageView ImagenPokemonOponente;

    @FXML
    ImageView ImagenCampoDeBatalla;

    @FXML
    Button BotonCurar;

    @FXML
    Button BotonAtaque;

    @FXML
    Button BotonCancelar;

    @FXML
    Button BotonAtaqueSeguro;

    @FXML
    Button BotonAtaqueArriesgado;

    @FXML
    Button BotonAtaqueMuyArriesgado;

    private HelloController HelloController;

    public void initialize2(Pokemon PokemonSeleccionado) {

        Image fondobatalla = new Image(fondoBatalla.fondodebatalla.toURI().toString());
        ImagenCampoDeBatalla.setImage(fondobatalla);

        this.PokemonSeleccionado = PokemonSeleccionado;

        Image pokemonmio = new Image(PokemonSeleccionado.fotoataque.toURI().toString());
        ImagenEspaldaPokemonSeleccionado.setImage(pokemonmio);

        NombrePokemonSeleccionado.setText(PokemonSeleccionado.nombrepokemon);

        NivelPokemonSeleccionado.setText(PokemonSeleccionado.nivelpokemon);

        VidaPokemonSeleccionado.setProgress(PokemonSeleccionado.vidarestante / PokemonSeleccionado.vidapokemon);

        PokemonesRivales.add(Pokemon5);

        PokemonesRivales.add(Pokemon6);

        PokemonesRivales.add(Pokemon7);

        PokemonesRivales.add(Pokemon8);

        rival = PokemonesRivales.get((int) (Math.random() * PokemonesRivales.size()));

        Image ImagenRival = new Image(rival.fotopokemon.toURI().toString());
        ImagenPokemonOponente.setImage(ImagenRival);

        NombreOponente.setText(rival.nombrepokemon);

        NivelOponente.setText(rival.nivelpokemon);

        VidaOponente.setProgress(rival.vidarestante / rival.vidapokemon);

        BotonAtaqueSeguro.setVisible(false);
        BotonAtaqueArriesgado.setVisible(false);
        BotonAtaqueMuyArriesgado.setVisible(false);
        BotonCancelar.setVisible(false);


}

    @FXML
    protected void PresionaAtacar() {

        System.out.println("Boton de Ataque Seleccionado");

        BotonAtaque.setVisible(false);
        BotonCurar.setVisible(false);
        BotonAtaqueSeguro.setVisible(true);
        BotonAtaqueArriesgado.setVisible(true);
        BotonAtaqueMuyArriesgado.setVisible(true);
        BotonCancelar.setVisible(true);

    }

    @FXML
    protected void PresionaCurar() {

        System.out.println("Boton Curar Seleccionado");

        Random r = new Random();

        int curar = r.nextInt(50) + 25;

        PokemonSeleccionado.vidarestante += curar;

        curar = r.nextInt(50) + 25;

        rival.vidarestante += curar;

        if (PokemonSeleccionado.vidarestante > PokemonSeleccionado.vidapokemon)
            PokemonSeleccionado.vidarestante = PokemonSeleccionado.vidapokemon;

        VidaPokemonSeleccionado.setProgress(PokemonSeleccionado.vidarestante / PokemonSeleccionado.vidapokemon);
        System.out.println("Curacion de mi pokemon " + curar);

        if (rival.vidarestante > rival.vidapokemon)
            rival.vidarestante = rival.vidapokemon;

        VidaOponente.setProgress(rival.vidarestante / rival.vidapokemon);
        System.out.println("Curacion de pokemon rival" + curar);

    }

    @FXML
    protected void PresionaAtaqueSeguro() {

        int dano = 20;

        System.out.println("Boton Seguro Seleccionado");

        PokemonSeleccionado.vidarestante -= dano;


        if (PokemonSeleccionado.vidarestante < 0)
            PokemonSeleccionado.vidarestante = 0;

        VidaPokemonSeleccionado.setProgress(PokemonSeleccionado.vidarestante / PokemonSeleccionado.vidapokemon);

        System.out.println("Dano seguro de " + dano);

        ControladorVidaPokemonSeleccionado();

        int danorival = 20;

        rival.vidarestante -= danorival;

        if (rival.vidarestante < 0)
            rival.vidarestante = 0;

        VidaOponente.setProgress(rival.vidarestante / rival.vidapokemon);

        System.out.println("Daño seguro de " + danorival);

        HelloController.actualizarAtaqueTotalPokemonSeleccionado(dano);

        HelloController.actualizarAtaqueTotalRival(danorival);

        ControladorVidaRival();


        HelloController.actualizarVida();

    }

    @FXML
    protected void PresionaAtaqueArriesgado() {

        System.out.println("Boton Arriesgado Seleccionado");

        Random r = new Random();

        int dano1 = r.nextInt(15) + 10;

        PokemonSeleccionado.vidarestante -= dano1;

        if (PokemonSeleccionado.vidarestante < 0)
            PokemonSeleccionado.vidarestante = 0;

        VidaPokemonSeleccionado.setProgress(PokemonSeleccionado.vidarestante / PokemonSeleccionado.vidapokemon);

        System.out.println("Dano arriesgado1 de " + dano1);

        ControladorVidaPokemonSeleccionado();

        int dano1rival = r.nextInt(50);

        rival.vidarestante -= dano1rival;

        if (rival.vidarestante < 0)
            rival.vidarestante = 0;

        VidaOponente.setProgress(rival.vidarestante / rival.vidapokemon);

        System.out.println("Dano arriesgado2 de " + dano1rival);

        HelloController.actualizarAtaqueTotalPokemonSeleccionado(dano1);

        HelloController.actualizarAtaqueTotalRival(dano1rival);

        ControladorVidaRival();

        HelloController.actualizarVida();
    }

    @FXML
    protected void PresionaAtaqueMuyarriesgado() {

        System.out.println("Boton Muy Arriesgado Seleccionado");

        Random r = new Random();

        int dano2 = r.nextInt(50);

        PokemonSeleccionado.vidarestante -= dano2;

        if (PokemonSeleccionado.vidarestante < 0)
            PokemonSeleccionado.vidarestante = 0;

        VidaPokemonSeleccionado.setProgress(PokemonSeleccionado.vidarestante / PokemonSeleccionado.vidapokemon);

        System.out.println("Dano muy arriesgado de " + dano2);

        ControladorVidaPokemonSeleccionado();

        int dano2rival = r.nextInt(50);

        rival.vidarestante -= dano2rival;

        if (rival.vidarestante < 0)
            rival.vidarestante = 0;

        VidaOponente.setProgress(rival.vidarestante / rival.vidapokemon);

        System.out.println("Dano muy arriesgado de " + dano2rival);

        HelloController.actualizarAtaqueTotalPokemonSeleccionado(dano2);

        HelloController.actualizarAtaqueTotalRival(dano2rival);

        ControladorVidaRival();

        HelloController.actualizarVida();
    }


    @FXML
    protected void PresionaCancelar() {

        System.out.println("Boton Cancelar Seleccionado");

        BotonAtaque.setVisible(true);
        BotonCurar.setVisible(true);
        BotonAtaqueSeguro.setVisible(false);
        BotonAtaqueArriesgado.setVisible(false);
        BotonAtaqueMuyArriesgado.setVisible(false);
        BotonCancelar.setVisible(false);

    }

    @FXML
    protected void cambiotextoPokemonSeleccionado() {
        PuntosVidaPokemonSeleccionado.setText(String.valueOf(PokemonSeleccionado.vidarestante));
    }

    @FXML
    protected void cambiotextoPokemonSeleccionado1() {

        PuntosVidaPokemonSeleccionado.setText("PS");
    }

    @FXML
    protected void cambiotextoRival() {

        PuntosVidaOponente.setText(String.valueOf(rival.vidarestante));
    }

    @FXML
    protected void cambiotextoRival1() {

        PuntosVidaOponente.setText("PS");
    }

    private void ControladorVidaPokemonSeleccionado() {

        if (PokemonSeleccionado.vidarestante == 0) {
            showAlert1(AlertaPokemonseleccionado(PokemonSeleccionado));
        }
    }

    private void ControladorVidaRival() {

        if (rival.vidarestante == 0) {
            showAlert1(AlertaRival(rival));
        }

    }


    private void showAlert1(Alert alert) {

        Optional<ButtonType> resultado = alert.showAndWait();

        if (resultado.get() == ButtonType.CLOSE) {
            System.exit(0);
        } else {

            HelloController.stage2.close();

        }
    }

    public Alert AlertaRival(Pokemon rival) {

        Alert customAlert = new Alert(Alert.AlertType.NONE);

        customAlert.setTitle("Pokemon Ganador");
        customAlert.setContentText("El pokemon perdedor es " + rival.nombrepokemon);
        customAlert.setGraphic(new ImageView(new Image(rival.fotopokemon.toURI().toString())));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.NEXT, ButtonType.CLOSE);

        return customAlert;

    }

    public Alert AlertaPokemonseleccionado(Pokemon PokemonSeleccionado) {

        Alert customAlert = new Alert(Alert.AlertType.NONE);

        customAlert.setTitle("Pokemon Ganador");
        customAlert.setContentText("El pokemon perdedor es " + PokemonSeleccionado.nombrepokemon);
        customAlert.setGraphic(new ImageView(new Image(PokemonSeleccionado.fotopokemon.toURI().toString())));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.NEXT, ButtonType.CLOSE);

        return customAlert;

    }

    void enviarDatos(HelloController HelloController) {
        this.HelloController = HelloController;
    }

}

class FondoBatalla {

    File fondodebatalla;

    public FondoBatalla(File fondodebatalla) {

        this.fondodebatalla = fondodebatalla;
    }
}







