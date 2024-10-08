package bsp3;

public class NumberTester {


    NumberTest oddTester = (number) -> (number % 2) !=0 ;
    NumberTest primeTester = (number) -> {
        if(number <= 1) return false;
        for (int i = 0; i <= Math.sqrt(number); i++){
            if (number % i == 0) return false;
        }
        return true;
    };

    NumberTest palindromeTester = (number) -> {
        String str = Integer.toString(number);
        return str.equals(new StringBuilder(str).reverse().toString());
    };


    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(int testType, int number){
        switch(testType){
            case 1:
                System.out.println(oddTester.testNumber(number) ? "Odd" : "Even");
                break;
            case 2:
                System.out.println(oddTester.testNumber(number) ? "Prime" : "AntiPrime");
                break;
            case 3:
                System.out.println(oddTester.testNumber(number) ? "Palindrom" : "AntiPalindrom");
                break;
        }
    }
}
