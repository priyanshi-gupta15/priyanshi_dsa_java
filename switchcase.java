import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the fruit name");
        String fruit = input.next();

        switch (fruit) {
            case "grapes": {
                System.out.println("it is small fruit");
            }
            break;
            case "orange": {
                System.out.println("it is big fruit");
            }
            break;
            case "apple": {
                System.out.println("it is red fruit");
            }
            break;
            case "cherry": {
                System.out.println("it is juicy fruit");
            }
            break;
            default:
            System.out.println("please enter a valid fruit");

        }
        input.close();
    }

}
