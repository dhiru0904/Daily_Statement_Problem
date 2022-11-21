package DailyStatementProblem;

//import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter s1 String: ");
        String s1=sc.nextLine;
        System.out.println("Enter s2 String: ");
        String s2=sc.nextLine;*/
        String s1="input";
        String s2="putin";
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        if (c1.length !=c2. length)
        {
            System.out.println("");
            System.exit(0);
        }
        Arrays. sort(c1);
        Arrays. sort(c2);
        for(int i=0;i<c1.length;i++)
        {
            if (c1[i]!=c2[i]){
                System.out.println("Not Anagram");
                System.exit(0);
            }}
        System.out.println("It Is Anagram");
    }
}