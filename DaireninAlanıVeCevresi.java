import java.util.Scanner;
public class DaireninAlanıVeCevresi {
    public static void main(String[] args) {
        int r;

        double pi = 3.14;

        Scanner imp = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");

        r = imp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : "  + alan);
        System.out.println("Dairenin Cevresi : " + cevre);



    }
}
