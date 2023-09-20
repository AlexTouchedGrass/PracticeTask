import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = 17;
        double gpa = 4;

        System.out.println("Enter your age then gpa: ");

        if (scan.hasNextInt ()) {
            age = scan.nextInt();
            gpa = scan.nextInt();
        }
        else{
            System.out.println("You have entered an invalid value for age or gpa.");
            System.exit(0);
        }

        System.out.println("Your age is " + age + " years old. You have a " + gpa + " GPA.");
    }
}