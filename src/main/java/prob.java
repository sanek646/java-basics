import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class prob {
    public static void main(String[] args) throws IOException {


    BufferedReader reader = new BufferedReader
            (new InputStreamReader(System.in));
    boolean exist = false;
    HashSet<String> list = new HashSet<String>();
        list.add("Alex");
        list.add("Bob");
        list.add("Carry");
        list.add("Don");
        list.add("Elon");
        list.add("Fred");
        list.add("Greg;");
       // String str = reader.readLine()

        //System.out.println(list);

    exist = list.contains("Elon");
        System.out.println(exist);}
}
