 import java.util.Scanner;

public class dairealan {
    public static void main(String[] args) {

        int r ;
        double pi=3.14;
        Scanner inp = new Scanner(System.in);

        System.out.print("dairenin yarıçapını giriniz:");
        r= inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("dairenin alanı:"+ alan);

        System.out.print("dairenin çevresi:"+ cevre);






    }
}
