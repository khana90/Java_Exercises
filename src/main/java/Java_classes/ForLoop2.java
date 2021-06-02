package Java_classes;

/**
 *
 * @author A
 */
public class ForLoop2 {

    public static void main(String args[]) {

        int x = 40;
        int y = 90;
        if (x < y) {
            System.out.println("hello");
        }
        //change the text format to uppercase.
        String txt = "world";
        System.out.println(txt.toUpperCase());
//if a and b equals print yes else print no
        int a = 50;
        int b = 5;
        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //time is 20:00 print goodday if not print good evening

        double time = 03;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
//Return the index (position) of the first occurrence of "e" in the following string:
        String text = "Hello Everybody";
        System.out.println(text.indexOf('l'));


    }
}
