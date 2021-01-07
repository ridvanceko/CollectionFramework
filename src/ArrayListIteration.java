import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {


        ArrayList<String> studentList = new ArrayList<String>();

        studentList.add("Ceko");
        studentList.add("Miley");
        studentList.add("Jenna");
        studentList.add("Ridvan");


        //regular loop
        for (int i = 0; i <studentList.size(); i++) {
            System.out.println(studentList.get(i));

        }
        System.out.println("..........");
        //for each loop

        for(String s : studentList) {
            System.out.println(s);
        }

        System.out.println("..........");

        //lambda

        studentList.stream().forEach(element -> System.out.println(element));
        
        System.out.println("..........");
        //iterator

        Iterator<String> it = studentList.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
