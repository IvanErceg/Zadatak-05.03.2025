import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatakfaktorijel {


    public static long factorial(int broj) {
        long result = 1;
        for (int i = 1; i <= broj; i++) {
            result *= i;
        }
        return result;
    }

    public static double negativanBroj(int broj) throws Exception {
        if (broj < 0) {
            throw new Exception("Broj ne smije biti negativan!");
        }else if(broj>20){
            throw new Exception("Prevelik je broj!");
        }
        return factorial(broj);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Unesi broj:");
            int broj = sc.nextInt();


            double rezultat = negativanBroj(broj);
            System.out.println("Faktorial od " + broj + " je: " + rezultat);

        } catch (InputMismatchException e) {
            System.out.println("Unijeli ste pogrešan unos .");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
