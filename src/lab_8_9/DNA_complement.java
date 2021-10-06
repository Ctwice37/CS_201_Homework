package lab_8_9;

import java.util.Scanner;

public class DNA_complement {



     public static void DNAcomplement(){

               System.out.println("Give DNA sequence: ");
               Scanner input = new Scanner(System.in);
               String sequence = input.next();
               sequence = sequence.toUpperCase();
               char a = 'A';
               char c = 'C';
               char g = 'G';
               char t = 'T';

               StringBuffer complement = new StringBuffer(sequence);
               for (int i = 0; i < sequence.length(); i++){
                    if (sequence.charAt(i) == 'A')
                         complement.setCharAt(i, t);
                    else if (sequence.charAt(i) == 'T')
                         complement.setCharAt(i, a);
                    else if (sequence.charAt(i) == 'G')
                         complement.setCharAt(i, c);
                    else
                         complement.setCharAt(i,g);
               }}
          System.out.println("complement: " + complement);

     }

     public static void main(String[] args) {
          DNAcomplement();
     }}