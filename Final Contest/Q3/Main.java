/*Question: You are given array consisting of n integers. Your task is to find the maximum length of an increasing subarray of the given array.

A subarray is the sequence of consecutive elements of the array. Subarray is called increasing if each element of this subarray strictly greater than previous.

Input
The first line contains single positive integer n (1 ≤ n ≤ 105) — the number of integers.

The second line contains n positive integers a1, a2, ..., an (1 ≤ ai ≤ 109).

Output
Print the maximum length of an increasing subarray of the given array.*/

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=1;
        int count=1;
        for(int j=1;j<n;j++){
            if(a[j]>a[j-1]){
                count++;
            }
            else{
                count=1;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
        sc.close();

    }
    
}