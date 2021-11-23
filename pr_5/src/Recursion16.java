import java.util.Scanner;
//задание №16
public class Recursion16 {
    public static void recursion(int max, int count)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        if (n > 0)//Числа НАТУРАЛЬНЫЕ
        {
            if (n > max)
            {
                recursion(n, 1);// Поскольку в таком случае максимальным числом будет только оно само
            }
            else if (n == max)
            {
                recursion(max, count++);// В таком случае увеличиваем кол-во макс чисел
            }
            else
            {
                recursion(max, count);//в противном случае передаем накопившиеся значения
            }
        }

        else
        {
            System.out.println(count);
        }
    }
    public static void main(String[] args)
    {
        recursion(0, 0);
    }

}
