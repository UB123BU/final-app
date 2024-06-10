import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("Podaj wzrost w cm:");
    int wzrost = Integer.parseInt(new Scanner(System.in).nextLine());
    System.out.println("Podaj wage w kg:");
    int waga = Integer.parseInt(new Scanner(System.in).nextLine());

    double BMI = (waga / ((wzrost / 100) * (wzrost / 100)));
    System.out.println("Twój wskaźnik BMI to: " + BMI);
  }
}
