import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 import java.util.Scanner;
import java.awt.*;
import java.util.*;
 public class multiplicationTable {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
        
                int[][] multiplicationTable = new int[10][2];
                
                for (int i = 1; i <= 10; i++) {
                    multiplicationTable[i - 1][0] = i;
                    multiplicationTable[i - 1][1] = n * i;
                }
        
                // Print the 2D array representing the multiplication table
                for (int i = 0; i < 10; i++) {
                    System.out.println(n + " X " + multiplicationTable[i][0] + " = " + multiplicationTable[i][1]);
                }
            }
        }
        
    
    
