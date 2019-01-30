package com.company;

public class Main {

    public static void main(String[] args) {
/*
*
*
*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
*Allowances may be made for adjustments to capital letters, punctuation, and word dividers.
*Famous examples in English include "A man, a plan, a canal, Panama!", "Amor, Roma", "race car", "stack cats",
*"step on no pets", "taco cat", "put it up", "Was it a car or a cat I saw?" and "No 'x' in Nixon".
*Build a program that will take a word or phrase and check if it is a palindrome.
*The result should be a boolean value (true or false).
*Bonus: Your program should disregard uppercase or lowercase letters
*(e.g., “Cat” and “Tac” should be a palindrome).
*Double Secret Bonus: Your program should disregard punctuation
* (e.g., “Cat!” and “taC” should be a palindrome).
*
* */

String word = "TacoCat";

boolean palindrome = isPalindrome(word);

        if (palindrome == true){
            

        }

    }



    public static boolean isPalindrome(String userWord){

        boolean palindrome;

        String reverse = getPalindrome(userWord);

        if(reverse.equalsIgnoreCase(userWord)){

             palindrome = true;

        } else{

             palindrome = false;
        }

        return palindrome;


    }



    public static String getPalindrome(String userWord){



        String reverse = "";

        for(int i = userWord.length() - 1; i >= 0; i--)
        {
            reverse = reverse + userWord.charAt(i);

        }

        return reverse;


    }


}
