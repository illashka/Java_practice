import  java.util.Scanner;

public class AuthorTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name, email;
        char gender;

        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter email: ");
        email = sc.nextLine();

        System.out.println("Enter gender: ");
        gender = sc.next().charAt(0);//только первая буква гендера

        Author dude = new Author(name, email, gender);

        System.out.println(dude.toString());
    }
}
