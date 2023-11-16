import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration  for reading inpput from console
        Scanner scanner = new Scanner(System.in );
        System.out.println("\nEnter student Name \t\t:\t");//input Wizard
        String name = scanner.next();
        System.out.println("Enter Student Roll Number \t\t:\t");//input wizard
        int rollNum =scanner.nextInt();
        System.out.println("Enter Marks of subject Maths \t:\t");//input wizard
        int mathsMarks = scanner.nextInt();
        while (mathsMarks<0|| mathsMarks>100){
            System.out.println("\nInvalid Input ,Mark should between 0 to 100");
            System.out.println("|nPlese Enter correct marks of maths \t\t:\t");
            mathsMarks= scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Science \t\t:");
         int scienceMarks = scanner.nextInt();
         while (scienceMarks<0 || scienceMarks>100){
             System.out.println("\nInvalid Input , Mark should between 0 to 100 ");
             System.out.println("|nPlease enter correct marks of science \t\t:\t");
             scienceMarks=scanner.nextInt();
             }
        System.out.println("Enter Marks of Subject English \t:\t");
         int englishMarks =scanner.nextInt();
         while (englishMarks <0 || englishMarks >100){
            System.out.println("\nInvalid Input ,Marks should between 0 to 100 ");
            System.out.println("\nPlease enter correct marks of english \t\t:\t");
            englishMarks =scanner.nextInt();
         }
         int total = sum(mathsMarks,scienceMarks,englishMarks);
         int percentage =(total*100)/300;
         String result =calculateResult(mathsMarks,scienceMarks,englishMarks);
         String grade =calculateGrade(percentage,result);
         printTheMarkSheet(name,rollNum,mathsMarks,scienceMarks,englishMarks,total,percentage,result,grade);
         //closing the scanner object
        scanner.close();
    }
    //calculating the sum
     public static int sum (int a, int b, int c){
        return a+b+c;
     }
     //calculating the result on subjects marks
    public static String calculateResult(int mathMarks, int scienceMarks , int enlishMarks){
        if (mathMarks <35 || scienceMarks <35 ||enlishMarks<35 ){
            return "FAil";
        }else
            return "Pass";
    }
    //calculating ths grade  on percentage and result
    public static String calculateGrade(int percentage , String result ){
        String grade = null;if (result.equalsIgnoreCase("Pass")){
            grade = "A+";
        } else if (percentage >=60){
            grade = "A" ;
        }else if (percentage >=50){
            grade ="B";
        } else if (percentage >=35) {
            grade="C";

        }else {
            grade="-";
        }
        return grade;
    }
    //Printing the mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks ,int englishMarks ,double total ,double percentage,String result,String grade ){
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("|                  MARKS SHEET                                |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("|  Name                : "  +  name  +  "                     |");
        System.out.println("|  Roll No             : "  + rollNum  + "                    |");
        System.out.println("|-----------------------------------------------------------  |");
        System.out.println("|  Subjects            :     Marks                            |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("|  Math                :  "+ mathsMarks + "                   |");
        System.out.println("|  Science             : " + scienceMarks + "                 |");
        System.out.println("|  English             :"  +englishMarks +"                   |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| Total                : " + total+"                          |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("|  percentage          : "+ percentage +"                     |");
        System.out.println("|  Result              : "+result + "                         |");
        System.out.println("|  Grade               : " +grade +"                          |");
        System.out.println("|-------------------------------------------------------------|");


    }
}


