import java.io.IOException;

public class ThreadZ extends Thread{
    @Override
    public void run() {
        try {
            WriteInFile.Write("Z");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
