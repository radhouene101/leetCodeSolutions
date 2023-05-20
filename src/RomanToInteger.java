public class RomanToInteger {//leetcode dificulty easy but it was tricky https://leetcode.com/problems/roman-to-integer/

    public int romanToInt(String s) {
        int sum=0;
        int curr=0;
        int prev=0;
        for(int i = s.length()-1; i >=0;i--){
            curr=0;
            switch (s.charAt(i)){
                case 'I': curr=1;
                    break;
                case 'V': curr=5;
                    break;
                case 'X': curr=10;
                    break;
                case 'L': curr=50;
                    break;
                case 'C': curr=100;
                    break;
                case 'D':curr=500;
                    break;
                case 'M':curr=1000;
                    break;
            }
            if(curr<prev){
                sum-=curr;
            }else{
                sum+=curr;
            }
            prev=curr;
        }
        return sum;
    }
}
