import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        WriteInFile.CreateFile();
        ThreadX threadX =new ThreadX();
        ThreadY threadY=new ThreadY();
        ThreadZ threadZ=new ThreadZ();
        threadX.start();
        threadY.start();
        threadZ.start();
    }
}
