import pl.lublin.wsei.java.cwiczenia.MyDB;

public class MyDBTest {
    public static void main(String[] args) {
        MyDB myDB = new MyDB("localhost","mydb",3306);
        myDB.getConnection();
        myDB.closeConnetion();

    }
}
