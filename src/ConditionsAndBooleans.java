import java.util.Scanner;
public class ConditionsAndBooleans {
    public static void main(String[]args){
        int x = 6;
        int y = 23;
        int z = 10;
        // >,<,==,>=,<=,!=

        boolean compare = !(x > y || z < y);
        System.out.println(compare);
    }
}
