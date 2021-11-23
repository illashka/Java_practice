import java.util.Scanner;

public class Recursion17
{
    public static int recursion()//мы должны будем возвращать max значение от некст элементов
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        if (n == 0)//конец вводимой последовательности
        {
            return 0;
        }
        else
        {
            int max =  Math.max(n, recursion());//Ищем максимум между текущим элементом и каждым следующим
            return max;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(recursion());
    }
}
