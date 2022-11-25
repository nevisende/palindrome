import java.util.Scanner;

public class Console {
    protected final Scanner input = new Scanner(System.in);
    public void preventSkipScannerIssue(){
        input.nextLine();
    }

    public int askAndGetIntValue(String question) {
        System.out.print(question);
        return input.nextInt();
    }

    public long askAndGetLongValue(String question) {
        System.out.print(question);
        return input.nextLong();
    }

    public double askAndGetDoubleValue(String question) {
        System.out.print(question);
        return input.nextDouble();
    }

    public String askAndGetStringValue(String question) {
        System.out.print(question);
        return input.nextLine();
    }

    public void println(String x){
        System.out.println(x);
    }
    public void printlnXisY(String X, String Y){
        System.out.println(X + " is " + Y);
    }

    public void breakLine(){
        System.out.println();
    }
}


