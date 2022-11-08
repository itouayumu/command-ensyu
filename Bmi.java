import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
            
        
      Scanner scanner= new Scanner(System.in);
       double height1 = scanner.nextDouble();
       double weight1 = scanner.nextDouble();
       double height2 = scanner.nextDouble();
       double weight2 = scanner.nextDouble();
       System.out.print("ˆêl–Ú‚Í"+Math.floor((weight1/(height1*height1)*100))/100);
       System.out.print("“ñl–Ú‚Í"+Math.floor((weight2/(height2*height2)*100))/100);
    }
}
