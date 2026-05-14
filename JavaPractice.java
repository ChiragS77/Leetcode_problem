
import java.util.ArrayList;





public class JavaPractice {
    
    public static void main(String[] args) {
        
        //______________ For Each ______________
        // ArrayList<String> li = new  ArrayList<>();
        // li.add("Chirag Deshmukh");
        // li.add("Rahul Deshmukh");
        // li.add("SALONI DUBEY..");
        // li.add("SAGAR DUBEY..");

        // li.forEach(names ->{
        //     {
        //         System.out.println(names);
        //     }
        // });

        //____________ filter _________
        // ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(12);
        // nums.add(13);
        // nums.add(14);
        // nums.add(15);
        // nums.add(16);
        // nums.add(17);
        // nums.add(18);

        // nums.stream().filter(num -> num%2==0).forEach(x -> System.out.println(x));

         ArrayList<String> li = new  ArrayList<>();
        li.add("Chirag Deshmukh");
        li.add("Rahul Deshmukh");
        li.add("SALONI DUBEY..");
        li.add("SAGAR DUBEY..");

        // li.stream().map(x->x.toUpperCase()).forEach(System.out::println);

        System.out.println(li);
        


    }
}
