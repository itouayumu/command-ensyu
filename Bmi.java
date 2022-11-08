import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
            
        
      Scanner scanner= new Scanner(System.in);
      System.out.print("一人目の伸長");
       double height1 = scanner.nextDouble();
         System.out.print("一人目の体重");

       double weight1 = scanner.nextDouble();
         System.out.print("二人目の伸長");

       double height2 = scanner.nextDouble();
         System.out.print("二人目の体重");

       double weight2 = scanner.nextDouble();
       System.out.println("一人目は"+Math.floor((weight1/(height1*height1)*100))/100);
       System.out.println("二人目は"+Math.floor((weight2/(height2*height2)*100))/100);
    }
}
