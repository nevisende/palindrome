public class InteractToUser {
    static Console console = new Console();
    static Palindrome palindromes = new Palindrome();

    public void runMainFunc(){
        int number = console.askAndGetIntValue("Enter any number to check is it a palindrome number: ");
        boolean result  = palindromes.isPalindrome(number);
        if(result) console.printlnXisY(String.valueOf(number),"a palindrome number");
        else console.printlnXisY(String.valueOf(number),"not a palindrome number");
        console.breakLine();
    }

    public void mainFuncLoop(){
        int terminalStationCode = 1;
        while (terminalStationCode == 1) {
            runMainFunc();

            int answer = console.askAndGetIntValue("To quit enter 0 (zero) otherwise you can enter any number : ");
            if(answer == 0){
                terminalStationCode =0;
                console.println("Thank you for using my program.");
            }
            console.breakLine();
        }
    }


}
