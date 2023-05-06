class Solution {
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
}