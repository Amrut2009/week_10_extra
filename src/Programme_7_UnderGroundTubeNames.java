import java.util.ArrayList;

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList<String>tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo_lines");
        tubeNames.add("Central_line");
        tubeNames.add("Circle_lines ");
        tubeNames.add("District_lines");
        tubeNames.add("Jublee_lines");
        tubeNames.add("Metropolitan_lines");
        tubeNames.add("Northern_line");
        tubeNames.add("Piccadilly_;line");
        tubeNames.add("Waterloo_and_city_line");
        System.out.println("Given Array List :" +tubeNames);
         if (tubeNames.isEmpty()){
             System.out.println("Given Array List is Empty !!");
         }else{
             System.out.println("Given Array List is not Empty!!");
         }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
    }

