import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        SafeInput.getNonZeroLenString(in,"Please type anything in: ");

        SafeInput.getRegExString(in, "Please input a string: ","[a-z,A-Z]+@");

    }

}
