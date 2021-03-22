import java.io.IOException;

public class ThreadY extends Thread {
    @Override
    public void run() {
        try {
            WriteInFile.Write("Y");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
