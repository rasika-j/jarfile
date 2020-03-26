import java.util.Scanner;

public class name {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String user=sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("user: "+user);
        System.out.println("age: "+age);
    }
}
