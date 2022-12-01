import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int[] lista = { 50, 1, 30, 40, 9, 8, 10 };
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número que deseja procurar: ");
        int num = s.nextInt();
        System.out.println(encontrar(num, lista));

    }

    public static boolean encontrar(int num, int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (num == lista[i]) {
                return true;
            }
        }
        return false;
    }
}