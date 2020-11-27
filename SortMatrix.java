/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;

/**
 *
 * @author Chaitanya Narkhede
 */
public class SortMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        int[] temp = new int[m*n];
        int k = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[k++] = arr[i][j];
            }
        }
        
        Arrays.sort(temp);
        k = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = temp[k++];
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        
    }
}
