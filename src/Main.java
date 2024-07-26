import entities.Audio;
import entities.Immagine;
import entities.PlayerMultimediale;
import entities.Video;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BENVENUTI NEL MEDIA PLAYER");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        PlayerMultimediale[] playlistAray = new PlayerMultimediale[5];

        for (int i = 0; i < playlistAray.length; i++) {
            System.out.println("Selezionare un Elemento da aggiungere ai tuoi file:");
            System.out.println("1 - Immagine");
            System.out.println("2 - Audio");
            System.out.println("3 - Video");
            System.out.println("0 - Annulla la richiesta");
            int selezionaElemento = Integer.parseInt(scanner.nextLine());

            switch (selezionaElemento) {
                case 1:
                    String titoloImg = "Immagine" + (i + 1);
                    int luminositaImg = random.nextInt(1, 10);
                    playlistAray[i] = new Immagine(titoloImg, luminositaImg);
                    break;
                case 2:
                    String titoloAud = "Audio" + (i + 1);
                    int durataAud = random.nextInt(1, 10);
                    int volumeAud = random.nextInt(1, 10);
                    playlistAray[i] = new Audio(titoloAud, durataAud, volumeAud);
                    break;
                case 3:
                    String titoloVid = "Video" + (i + 1);
                    int durataVid = random.nextInt(1, 10);
                    int volumeVid = random.nextInt(1, 10);
                    int luminositaVid = random.nextInt(1, 10);
                    playlistAray[i] = new Video(titoloVid, durataVid, volumeVid, luminositaVid);
                    break;
                case 0:
                    System.out.println("Richiesta annullata.");
                    i--; // Non incrementiamo l'indice per ripetere il ciclo
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
                    i--; // Non incrementiamo l'indice per ripetere il ciclo
                    break;
            }
        }


        System.out.println(playlistAray);
        scanner.close();
    }
}
