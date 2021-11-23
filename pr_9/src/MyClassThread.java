class Ping extends Thread
{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Ping");
        }
    }
}

class Pong extends Thread
{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Pong");
        }
    }
}

public class MyClassThread
{
    static Ping pingword;
    public static void main(String[] args)
    {

        Ping ping = new Ping();
        Pong pong = new Pong();

    }
}