/*class Solution {
    //problem number  1456. Maximum Number of Vowels in a Substring of Given Length 
    //link https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
    public int maxVowels(String s, int k) {
        int precMax=0;
        int max=0;
        String word="";
        for(int i=0;i<=s.length();i++){
            if(i+k<=s.length()){
                word=s.substring(i,i+k);
            }else{
                word=s.substring(i,s.length());
            }
            if(numberOfVowels(word)>precMax){
                max=numberOfVowels(word);
                precMax=max;
                System.out.println(word);
            }

        }
        return max;
    }
    public int numberOfVowels(String ch){
        int nbr=0;
        for(int i=0;i<ch.length();i++){
            if(ch.charAt(i)=='a' || ch.charAt(i)=='e' || ch.charAt(i)=='i' || ch.charAt(i)=='o' || ch.charAt(i)=='u'){
                nbr++;
            }
        }
        return nbr;

    }
}*/
class Solution {

    public int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Add the character to the current window
            if (isVowel(s.charAt(i))) {
                System.out.println("count up = "+s.charAt(i));
                count++;
            }

            // Remove the leftmost character from the window if it's out of range
            if (i >= k && isVowel(s.charAt(i - k))) {
                System.out.println("count down = "+s.charAt(i-k));

                count--;
            }

            // Update the maximum count
            max = Math.max(max, count);
        }

        return max;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
