// Napisz program, który zlicza liczbę słów w ciągu znaków:
 // - Program powinien wczytać łańcuch znaków wprowadzony przez użytkownika.
 // - Zliczyć liczbę słów w łańcuchu.
  //- Wyświetlić wynik.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ciąg znaków: ");
        String str = scanner.nextLine();

        int zlicz = zlicz(str);
        System.out.println("Liczba słów: " + zlicz);
    }

    public static int zlicz(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}