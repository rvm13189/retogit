import java.util.Scanner;

public class MainReto {

    public static void main(String[] args) {
        MainReto mainReto1 = new MainReto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número quieres pasar a base 2");
        int numero = scanner.nextInt();
        mainReto1.binario(numero);
    }

    private void  binario(int n)
    {
        if(n<2) System.out.print(n);
        else
        {
            binario(n/2);
            int modulo = n%2;
            System.out.print(modulo);
        }
    }

}
