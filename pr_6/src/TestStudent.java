import java.util.Scanner;
import java.util.Random;

public class TestStudent
{
    public static void testStudent(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());

        System.out.println("Number of students: ");
        int n = sc.nextInt();
        Student[] idNumber = new Student[n];


        for (int i = 0; i < n; i++)
        {
            int id = rnd.nextInt(1000);
            int score = rnd.nextInt(10);
            idNumber[i] = new Student(id, score);
        }

        for (int i = 0; i < n; i++ )
        {
            System.out.println(idNumber[i].getIdStudent());
        }
    }
}
