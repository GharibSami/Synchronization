import java.io.*;

public class WriteInFile {
   static FileWriter fileWriter;
    static File file;
    public static void CreateFile() throws IOException {
       file =new File("sharable.txt");
       fileWriter =new FileWriter(file);
    }

    public static synchronized  void Write(String thread) throws IOException {
        fileWriter.write("name is: "+thread+"\n");
        fileWriter.write("Thread "+thread+" started writing\n");
        fileWriter.write("Thread "+thread+" is currently writing\n");
        fileWriter.write("Thread "+thread+" finished writing – "+thread+"\n");
        fileWriter.flush();
    }
}
