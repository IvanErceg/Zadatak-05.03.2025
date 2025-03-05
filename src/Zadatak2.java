import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //Dva razlomka i četri matematičke operacije
        Scanner sc=new Scanner(System.in);
          System.out.println("Unesi prvi brojnik i nazivnik");
        int brojnik1 =sc.nextInt();   int nazivnik1 =sc.nextInt();
        System.out.println("Unesi drugi brojnik i nazivnik");
        int brojnik2 = sc.nextInt();   int nazivnik2 = sc.nextInt();
        // Zbrajanje
        int brojnikplus = (brojnik1 * nazivnik2) + (brojnik2 * nazivnik1);
        int nazivnikplus = nazivnik1 * nazivnik2;
        // Oduzimanje
        int brojnikminus = (brojnik1 * nazivnik2) - (brojnik2 * nazivnik1);
        int nazivnikminus = nazivnik1 * nazivnik2;
        // Množenje
        int brojnikmnozenje = brojnik1 * brojnik2;
        int nazivnikmnozenje = nazivnik1 * nazivnik2;
        // Dijeljenje
        int brojnikdjieljenje = brojnik1 * nazivnik2;
        int nazivnikdijeljenje = nazivnik1 * brojnik2;
        System.out.println("Zbrajanje: " + brojnikplus + "/" + nazivnikplus+"\nOduzimanje: " + brojnikminus + "/" + nazivnikminus+"\nMnoženje: " +
                 brojnikmnozenje + "/" + nazivnikmnozenje+"\nDijeljenje: " + brojnikdjieljenje + "/" + nazivnikdijeljenje);
    }
}
