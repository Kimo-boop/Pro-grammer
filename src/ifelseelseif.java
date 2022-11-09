import java.util.Scanner;
public class ifelseelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("tim")||s.equals("dim")) {
            System.out.println("you typed tim");
        }
        else if (s.equals("hello")) {
            System.out.println("Hi");

        }
        else{System.out.println("Print");

        }

    }
}
