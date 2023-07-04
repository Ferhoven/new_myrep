//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.List;
//import java.io.IOException;
//
//public class test{
//    public static String calc(String input) throws  IOException{
//        String[] roman = {"I", "II","III","IV","V","VI","VII","VIII","IX","X"};
//        String[] arabic = {"1","2","3","4","5","6","7","8","9","10"};
//        List l_roman = Arrays.asList(roman);
//        List l_arabic = Arrays.asList(arabic);
//        String tr = "a"; // арифметический знак
//        String[] spaces = input.split(" ");
//        short count = 0;
//        if (spaces.length != 3) {
//            throw new IOException();
//        }
//        boolean a1 = false, a2 = false, r1 = false, r2 = false;
//        if (l_roman.contains()
//        switch(spaces[1]){
//                case '+' -> {
//                    tr = " \\+ ";
//                    count++;
//                }
//                case '-' -> {
//                    tr = " - ";
//                    count++;
//                }
//                case '/' -> {
//                    tr = " / ";
//                    count++;
//                }
//                case '*' -> {
//                    tr = " \\* ";
//                    count++;
//                }
//        }
//        if (count != 1){
//            return "Too much actions";
//        }
//        String[] words = n_line.split(tr);
//        if (words.length != 2){
//            return "Expression must contain to variables";
//        }
//
//        return words[0];
//    }
//
//    public static void main(String[] agrs){
//        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
//        try{
//            System.out.print(calc(line));
//        } catch (IOException e) {
//            System.out.println("Input error");
//        }
//    }
//
//}