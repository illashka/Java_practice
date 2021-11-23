import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PingPong extends Thread {
    static Lock lock = new ReentrantLock();
    private String word;

    private void setWord(String word)
    {
        this.word = word;
    }

    PingPong(String word)
    {
        this.setWord(word);
    }

    @Override
    public void run()
    {
        for (;;)
        {
            System.out.println(this.word);
            try {
                PingPong.sleep(1000);
            }catch (InterruptedException ex)
            {
                //
            }
            lock.lock();//a b s o l u t e l y
            lock.unlock();//u s e l e s s ?
        }
    }
}
public class MyClassThread {
    public static void main(String[] args) {
        PingPong ping = new PingPong("ping");
        PingPong pong = new PingPong("pong");

        ping.start();
        pong.start();
    }
}