import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Indique altura de la persona 1 en metros: ");
        double persona1 = scan.nextDouble();
        System.out.println("Indique altura de la persona 2 en metros: ");
        double persona2 = scan.nextDouble();

        double mayorValor = (Math.max(persona1,persona2));

        System.out.println("La persona más alta mide: "+ mayorValor);
        }
    }
