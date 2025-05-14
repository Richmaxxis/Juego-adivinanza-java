import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al juego del numero secreto");
        int numeroSecreo =new Random().nextInt(100);;
        double intentosUsuario =0;


        while(numeroSecreo != intentosUsuario){
            System.out.println("Indica un numero del 1 al 100");
        }
    }
}
