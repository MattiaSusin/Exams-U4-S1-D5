package entities;

import interfaces.LuminositaMetodo;
import interfaces.VolumeMetodo;

public class Video extends PlayerMultimediale implements LuminositaMetodo, VolumeMetodo {

    //LISTA ATTRIBUTI
    private double durata;
    private int volume;
    private int luminosita;

    //LISTA COSTRUTTORI

    public Video(String titolo, double durata, int volume, int luminosita) {
        super(titolo, durata);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public Video(String video1, double durata) {
        super(video1, durata);
    }

    //LISTA METODI


    @Override
    public void play() {
        String simboliVolume = "!".repeat(volume);
        String simboliLuminosità = "*".repeat(luminosita);

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + simboliVolume + simboliLuminosità);
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "durata=" + durata +
                ", titolo='" + titolo + '\'' +
                "} " + super.toString();
    }

    @Override
    public void aumentaLuminosita() {

    }

    @Override
    public void diminuisciLuminosita() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
