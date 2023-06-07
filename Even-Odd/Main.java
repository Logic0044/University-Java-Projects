import java.util.Scanner;
public class Main {
    static void Yousef() {

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = enter.nextInt();


        //checking whether the number is even or odd
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is odd");
    }

    public static void main(String[] args) {
        Yousef();
    }
}
