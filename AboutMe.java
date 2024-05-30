import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
   /**
    * @param args
    */
   public static void main(String[] args) {
      try{

          try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
              System.out.println("Digite seu Nome: ");
              String nome = scanner.next();
              
              System.out.println("Digite seu Sobrenome: ");
              String sobrenome = scanner.next();
              
              System.out.println("Digite sua Idade: ");
              int idade = scanner.nextInt();
              
              System.out.println("Digite sua Altura: ");
              double altura = scanner.nextDouble();
              
              
              
              System.out.println("Olá, eu me chamo "+ nome.toUpperCase() + " " + sobrenome.toUpperCase());
              System.out.println("Tenho " + idade + " anos ");
              System.out.println("Minha altura é " + altura + "cm ");
          }
      }
      catch (InputMismatchException e){
         System.out.println("Os campos idade e altura precisam ser numéricos");
      }
   }
}
