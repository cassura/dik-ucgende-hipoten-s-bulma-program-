import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b;
        double c;

        System.out.println("birinci kenar uzunlugu:");
        a = input.nextInt();

        System.out.println("ikinci kenar uzunlugu:");
        b = input.nextInt();

        c= Math.sqrt ((a*a + b*b));

        System.out.println("hipotenus uzunlugu:"+c);





    }

}