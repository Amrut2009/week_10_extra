import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorlist = new ArrayList<>();
        colorlist.add("RED");
        colorlist.add("BLUE");
        colorlist.add("GREEN");
        colorlist.add("YELLOW");
        colorlist.add("BLACK");
        colorlist.add("WHITE");
        colorlist.add("ORANGE");
        colorlist.add("PERPLE");
        for (String colourelist : colorlist){
            System.out.println(colourelist+",");
        }

    }
}
