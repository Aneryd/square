import java.util.Scanner;

public class square {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number: ");
        double number = scan.nextDouble();

        double form;
        double answer = 1;
        double xn = 1;

        while(xn*xn != number){
            form = 0.5*(xn + (number/xn));
            xn = form;

            if (form*form == number){
                answer = xn;
                break;
            }
        }
        System.out.println("Answer: " + answer);
        // test
    }
}
