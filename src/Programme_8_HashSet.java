import java.util.HashSet;

public class Programme_8_HashSet {
    public static void main(String[] args) {
        //create  a hashset object called numbers
        HashSet<Integer>numbers = new HashSet<Integer>();
        //add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        //show which number between 1 to 10 are in the set
         for (int i = 1; i <=10; i++){
             if (numbers.contains(i)){
                 System.out.println(i + " is found in the set.");
             }else{
                 System.out.println(i + " is not found in the set .");
             }
         }
    }
}
