/* Aim:-PracticalNo4
   Author:-Muskan Choudhary
   Version:-4.0
   Date:-20/02/24
*/
public class NameFormatter {
    public static void printName(String name) {

        name = name.trim();

        String[] names = name.split("\\s+");

        String firstName = names[0];
        String lastName = names[names.length - 1];

        System.out.println(lastName + ", " + firstName);
    }

    public static void main(String[] args) {

        printName("Bill Joy");
    }
}
