import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        double numeroUsuario = 0;
        System.out.println(numeroSecreto);
        int contador = 0;
        int intentosUsuario = 0;

        while (numeroUsuario != numeroSecreto) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("dijita un numero entre uno y 100");
            intentosUsuario++;
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("Felicidades acertaste el numero secreto a la :" + intentosUsuario );
                } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero secreto es menor");
                }else {
                System.out.println("El numero secreto es mayor");

                contador ++;
                if (contador == 5 ){
                    System.out.println("llegaste al numero maximo de intentos");
                    break;
                }
            }
        }
    }
}
