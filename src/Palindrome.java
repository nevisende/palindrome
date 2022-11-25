public class Palindrome {
    public boolean isPalindrome(int number){
        int temp = number, reversedNumber = 0,lastDigit;
        while(temp != 0 ){
            lastDigit =  temp % 10;
            reversedNumber = (reversedNumber) * 10 + lastDigit;
            temp /= 10;
        }

        return reversedNumber == number;
    }

}
