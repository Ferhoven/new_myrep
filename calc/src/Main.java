import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.io.IOException;

public class Main{
    public static String calc(String input) throws  IOException{
        String[] roman = {"I", "II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] arabic = {"1","2","3","4","5","6","7","8","9","10"};
        List l_roman = Arrays.asList(roman);
        List l_arabic = Arrays.asList(arabic);
        String res = "";
        String tr = " "; // арифметический знак
        String[] spaces = input.split(" ");
        boolean a = false, r = false;
        if (spaces.length != 3) {
            throw new IOException();
        }
        String n_line = input.replace(" ","");
        char[] sym = n_line.toCharArray();
        short count = 0;
        for (char c : sym) {
            switch (c) {
                case '+' -> {
                    tr = "\\+";
                    count++;
                }
                case '-' -> {
                    tr = "-";
                    count++;
                }
                case '/' -> {
                    tr = "/";
                    count++;
                }
                case '*' -> {
                    tr = "\\*";
                    count++;
                }
            }
        }
        if (count != 1){
            throw new IOException();
        }
        String[] words = n_line.split(tr);
        if (words.length != 2){
            return "Expression must contain to variables";
        }
        if (l_arabic.contains(words[0]) && l_arabic.contains(words[1])){
            a = true;
        }
        if (l_roman.contains(words[0]) && l_roman.contains(words[1])){
            r = true;
        }
        if (a == false && r == false){
            throw new IOException();
        }
        if (a){
            int num1 = Integer.parseInt(words[0]);
            int num2 = Integer.parseInt(words[1]);
            switch(tr){
                case "\\+" -> res = String.valueOf(num1 + num2);
                case "\\*" -> res = String.valueOf(num1*num2);
                case "-" -> res = String.valueOf(num1 - num2);
                case "/" -> res = String.valueOf(num1 / num2);
            }
        }
        if (r) {
            int num1 = l_roman.indexOf(words[0]) + 1;
            int num2 = l_roman.indexOf(words[1]) + 1;
            int ires = 0;
            switch (tr) {
                case "\\+" -> ires = num1 + num2;
                case "\\*" -> ires = num1 * num2;
                case "-" -> ires = num1 - num2;
                case "/" -> ires = num1 / num2;
            }
            if (ires <= 0){
                throw new IOException();
            }
           if (ires == 100){
                res = "C";
            }
           else{
               while(ires > 0)
               {
                   if (ires>=90){
                       res = "XC";
                       ires = ires - 90;
                   }
                   if (ires >= 50 && ires < 90){
                       res = res + "L";
                       ires = ires - 50;
                   }
                   if (ires>= 40 && ires <50)
                   {
                       res = res + "XL";
                       ires = ires - 40;
                   }
                   if (ires >= 10 && ires < 40){
                       res = res + "X";
                       ires = ires - 10;
                   }
                   if (ires < 10 && ires > 0){
                       res = res + roman[ires - 1];
                       ires = 0;
                   }
               }
           }

        }
        return res;
    }

    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        try{
            System.out.print(calc(line));
        } catch (IOException e) {
            System.out.println("Input error");
        }
    }

}