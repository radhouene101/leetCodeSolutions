public class PalindromeNumber {// easy https://leetcode.com/problems/palindrome-number/
    public boolean isPalindrome(int x) {
        int a=x;
        int w=x;
        if(x < 0) {// if input is negative automatically return false
            return false;
        }
        int k=1;
        while(a >9 ){ //check the input size

            k*=10;
            System.out.println("1st while    a = "+a+" k = "+ k );
            a=a/10;
        }
        a=0;
        while( w != 0 ){ //reversing the input
            System.out.println("2nd while    a = "+a+" k = "+ k );

            a=a+((w%10)*k);
            w=w/10;
            k=k/10;

        }
        System.out.println("a = "+a);
        if(a==x){// testing if the input is equal to the reversed
            return true;
        }else if(x>0 && x<10){
            return true;
        }
        return false;
    }
}
