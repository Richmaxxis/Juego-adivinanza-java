ort java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        double numeroUsuario = 0;
        System.out.println(numeroSecreto);

        int intentosUsuario = 0;
        Scanner teclado = new Scanner(System.in);

        while (numeroUsuario != numeroSecreto) {
            System.out.println("dijita un numero entre uno y 100");
            intentosUsuario++;
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario == numeroSecreto) {
                 System.out.println("Felicidades acertaste el numero secreto a la :" + intentosUsuario );
                } else if (numeroUsuario > numeroSecreto) {
                     System.out.println("El numero secreto es menor");
                     }else {
                     System.out.println("El numero secreto es mayor");
                     
                    if (intentosUsuario == 5 ){
                    System.out.println("llegaste al numero maximo de intentos");
                    break;
                }
            }
        }
    }
}
