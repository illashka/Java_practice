public class Student
{
    private int idStudent;
    private int score;

    public Student(int idStudent, int score)
    {
        this.idStudent = idStudent;
        this.score = score;
    }

    public void setIdStudent(int idStudent)
    {
        this.idStudent = idStudent;
    }
    public void setScore(int score)
    {
        this.score = score;
    }

    public int getIdStudent()
    {
        return idStudent;
    }
    public int getScore()
    {
        return score;
    }
}
