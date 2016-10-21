import javax.swing.*;

public class Chapter4 {
    // Creating new method for making a blank line
    public static void newLine(){
        System.out.println();
    }
    //Creating new method for making three blank lines
    public static void threeLine(){
        System.out.println();
        System.out.println();
        System.out.println();
    }
    //Creating new method for printing argument twice
    public  static void printTwice(String s){
        System.out.println(s);
        System.out.println(s);
    }
    //Creating printTime method
    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
        public static void main(String[]Args){
        System.out.println("First line.");
        //Using created method
        newLine();
        System.out.println("Second line.");
        newLine();threeLine();

        printTwice("See tekst kirjutatakse kaks korda!");

        //Using printTime method
        int tunnid=11;
        int minutid=59;
        printTime(tunnid,minutid);

            JOptionPane.showMessageDialog(null, "Hello World!");










    }
}
