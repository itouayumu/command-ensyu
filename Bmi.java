import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
            
        
      Scanner scanner= new Scanner(System.in);
      System.out.print("��l�ڂ̐L��");
       double height1 = scanner.nextDouble();
         System.out.print("��l�ڂ̑̏d");

       double weight1 = scanner.nextDouble();
         System.out.print("��l�ڂ̐L��");

       double height2 = scanner.nextDouble();
         System.out.print("��l�ڂ̑̏d");

       double weight2 = scanner.nextDouble();
       System.out.println("��l�ڂ�"+Math.floor((weight1/(height1*height1)*100))/100);
       System.out.println("��l�ڂ�"+Math.floor((weight2/(height2*height2)*100))/100);
    }
}
