package chapter3.pipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Test {
    public static void main(String[] args) {
        try {
            WriteData writeData=new WriteData();
            ReadData readData=new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            outputStream.connect(inputStream);

            ThreadRead read = new ThreadRead(readData, inputStream);
            read.start();

            Thread.sleep(2000);
            ThreadWrite write = new ThreadWrite(writeData, outputStream);
            write.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
