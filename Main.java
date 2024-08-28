import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double d, ap, ex;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os dados:");
        System.out.println("valor d: ");
        d = scan.nextDouble();
        System.out.println("valor ap: ");
        ap = scan.nextDouble();
        System.out.println("valor ex: ");
        ex = scan.nextDouble();

        double tangente = d/(ex * Math.sqrt(3)/3 - 0.3 * ap);

        double thetaRadianos = Math.atan(tangente);

        double thetaGraus = Math.toDegrees(thetaRadianos);

        int thetaArredondado = (int) Math.round(thetaGraus);

        System.out.println("angulo de theta = " + thetaArredondado + "º");
    }
}