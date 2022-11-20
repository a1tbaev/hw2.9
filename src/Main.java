import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        switch (input.nextInt()){
            case 1:
                System.out.println(Days.DUISHOMBU.name() + " " + Days.DUISHOMBU);
                break;
            case 2:
                System.out.println(Days.SHEISHEMBI.name() + " " + Days.SHEISHEMBI);
                break;
            case 3:
                System.out.println(Days.SHARSHEMBI.name() + " " + Days.SHARSHEMBI );
                break;
            case 4:
                System.out.println(Days.BEISHEMBI.name() + " " + Days.BEISHEMBI);
                break;
            case 5:
                System.out.println(Days.JUMA.name() + " " + Days.JUMA);
                break;
            case 6:
                System.out.println(Days.ISHEMBI.name() + " " + Days.ISHEMBI);
                break;
            case 7:
                System.out.println(Days.JEKSEMBI.name() + " " + Days.JEKSEMBI);
                break;
            default:
                System.out.println("404 error");
        }
    }
}