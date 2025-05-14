import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        double numeroUsuario = 0;
        System.out.println(numeroSecreto);
        int contador = 0;
        int intentosUsuario = 0;
        
        while (numeroUsuario != numeroSecreto){
            Scanner teclado = new Scanner(System.in);
            System.out.println("dijita un numero entre uno y 100");
            teclado.nextInt();

        }
    }
}
