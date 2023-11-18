import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci reqemi daxil edin :");
        double num_1 = scanner.nextDouble();
        System.out.print("Ikinci reqemi daxil edin :");
        double num_2 = scanner.nextDouble();
        System.out.println("Hesab novunu secin :");
        System.out.println("1. Toplama ");
        System.out.println("2. Cixma ");
        System.out.println("3. Vurma ");
        System.out.println("4. Bolme ");
        int hesab = scanner.nextInt();

        switch (hesab){
            case 1 :
                System.out.println("Siz toplama emelini secdiniz.");
                System.out.println( num_1 + " + " + num_2 + " = " + (num_1 + num_2) );
                break;
            case 2:
                System.out.println("Siz cixma emelini secdiniz.");
                System.out.println( num_1 + " - " + num_2 + " = " + (num_1 - num_2) );
                break;
            case 3:
                System.out.println("Siz vurma emelini secdiniz.");
                System.out.println( num_1 + " * " + num_2 + " = " + (num_1 * num_2) );
                break;
            case 4:
                System.out.println("Siz bolme emelini secdiniz.");
                System.out.println( num_1 + " / " + num_2 + " = " + (num_1 / num_2) );
                break;
            default:
                System.out.println("Sehv emeliyyat,yeniden cehd edin.");
        }

    }
        }
