import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
            
        
      Scanner scanner= new Scanner(System.in);
       double height = scanner.nextDouble();
       double weight = scanner.nextDouble();
       System.out.print(Math.floor((weight/(height*height)*100))/100);

    }
}
