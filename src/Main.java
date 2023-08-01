import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       task1();

    }
    public static void task1 (){
        String name1 = "a1.txt";
        String name2 = "OUTPUT.txt";

        try {
            Scanner sc = new Scanner(new File(name1));
            int n = sc.nextInt();
            int m = sc.nextInt();

            FileWriter output = new FileWriter(name2);
            int result = n + m;
            output.write("result is " + result);
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR :((");
        } catch (IOException e) {
            System.out.println("TOO much errors !");
        }
    }
}
