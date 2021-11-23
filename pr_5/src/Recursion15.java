import java.util.Scanner;
//задание №15
public class Recursion15
{
    public static String recursion(int n)
    {
        if (n < 10)
        {
            return Integer.toString(n);
        }
        else
        {
            System.out.print(n % 10);//Выводим последнюю цифру числа
            return recursion(n / 10);//Проделываем то же самое с "оставшейся" после отсечения младшего разряда частью
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println(recursion(n));
    }
}