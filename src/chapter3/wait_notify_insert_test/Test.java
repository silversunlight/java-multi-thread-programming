package chapter3.wait_notify_insert_test;

public class Test {
    public static void main(String[] args) {
        DBTools dbTools=new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
}
