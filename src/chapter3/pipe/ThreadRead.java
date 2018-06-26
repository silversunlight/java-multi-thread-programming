package chapter3.pipe;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream in;

    public ThreadRead(ReadData readData, PipedInputStream in) {
        super();
        this.readData = readData;
        this.in = in;
    }

    @Override
    public void run() {
        readData.readData(in);
    }
}
