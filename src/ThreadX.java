import java.io.IOException;

public class ThreadX extends Thread{
    @Override
    public void run() {
        try {
            WriteInFile.Write("X");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
