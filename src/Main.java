import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // task1();
        // task2();
        //task3();
          task4();
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
            //Сollections.reverse(list);
            //System.out.println(String.join(" ", list));

            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(" " + list.get(i));
            }
            System.out.println();

            printReverse(list, 0);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR :(((");
        }
    }

    static void printReverse(List<String> list, int start_num)
    {
        if(start_num < list.size()-1)
            printReverse(list, start_num+1);
        System.out.print(list.get(start_num)+" ");
    }

    public static void task4() {
        String name1 = "b1.txt";
        String name2 = "b2.txt";
        try {
            ArrayList<String> list1 = readNameList(name1);
            ArrayList<String> list2 = readNameList(name2);

            /*for (String str : list1 ) {
                if (list2.contains(str)) {
                    list2.remove(str);
                }
            }
            System.out.println("Takih net: " + list2);*/
            Set<String> set1 = new HashSet<>();
            for (String s : list1) {    //для каждого s в списке list1
                set1.add(s);
            }
            for (String str: list2     ) {
                if(! set1.contains(str) )
                    System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR :((((");
        }
    }

    static ArrayList<String>  readNameList(String fname) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fname));
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNext() )
            list.add(sc.next());
        return list;
    }
}
