import java.util.Scanner;

public class NestedStatements {
    public static void main(String[]args) {
        System.out.print("Input your age:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);
        if (age >= 18) {
            System.out.println("Input your fav food");
            String food = sc.nextLine();
            if (food.equals("Pizza")) {
                System.out.println("mine too");
            } else {
                System.out.println("not mine");
            }
        }


        else if (age >= 13){
            System.out.println("You're a teenager");
        }
        else {
            System.out.println ("You're not a teenager or an adult");
        }

    }
}
