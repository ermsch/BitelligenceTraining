package aufgabe6;
import java.util.Random;
import java.util.Scanner;

public class aufgabe6 {


    public static void main(String[] args) {
        Random random = new Random();

        int randomNr = random.nextInt(100);
        System.out.println(randomNr);

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl an: ");
        int zahl = input.nextInt();

        while(zahl != randomNr){
            if(zahl > randomNr){
                System.out.println("die gesuchte Zahl ist kleiner");
                zahl = input.nextInt();
            }
            else if(zahl < randomNr){
                System.out.println("die gesuchte Zahl ist größer");
                zahl = input.nextInt();
            }
        }
        System.out.println("Gewonnen");
    }


}
