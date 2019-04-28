package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        try {
            String str1 = "LIFE IS BEAUTIFUL";
            Assert.assertEquals(DetermineLargestWord.longestWord(str1),"BEAUTIFUL");
            System.out.println("Determine largest value unit test Passed.");
        }catch (AssertionError as){
            System.out.println("Determine largest value unit test Failed");
        }

        //Unit test for Anangram Problem
        try {
            Assert.assertEquals(Anagram.checkAnagram("CAMEL","MALEC"),true);
            System.out.println("Anagram unit test Passed.");
        }catch (AssertionError as){
            System.out.println("Anagram unit test is failed");
        }

        //unit testing for palindrome
        try {//Unit test for palindrome
            String str2 = "WOW";
            boolean expected = true;
            Assert.assertEquals(Palindrome.palindromeChecking(str2),expected);
            System.out.println("Palindrome unit test passed.");
        } catch (AssertionError as){
            System.out.println("Palindrome unit test failed.");
        }
    }
}