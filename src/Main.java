import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
       task1();
       task2();
        task3();
    }

    public static void task1() {
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
            System.out.println("ERROR :(");
        } catch (IOException e) {
            System.out.println("TOO much errors !");
        }
    }

    public static void task2() {
        String name1 = "a2.txt";
        String name2 = "OUTPUT2.txt";
        try {
            Scanner sc = new Scanner(new File(name1));
            int n = sc.nextInt();
            int[] massive = new int[n];
            double sum = 0;

            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                massive[k]++;
                sum = sum + massive[k];
            }
            double average = sum / n;

            FileWriter output = new FileWriter(name2);
            output.write("srednee Arifmeticheskoe is " + average);

            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR :((");
        } catch (IOException e) {
            System.out.println("TOO much errors !!");
        }
    }

    public static void task3() {
        String name1 = "b1.txt";

        try {
            Scanner sc = new Scanner(new File(name1));
            ArrayList<String> list = new ArrayList<String>();
            while (sc.hasNext()) {
                list.add(sc.next());
            }
         Collections.reverse(list);
        System.out.println(String.join(" ", list));

        } catch (FileNotFoundException e) {
            System.out.println("ERROR :(((");
        }
    }
}
