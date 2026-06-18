/*Question: One day a highly important task was commissioned to Vasya — writing a program in a night. The program consists of n lines of code. Vasya is already exhausted, so he works like that: first he writes v lines of code, drinks a cup of tea, then he writes as much as  lines, drinks another cup of tea, then he writes  lines and so on: , , , ...

The expression  is regarded as the integral part from dividing number a by number b.

The moment the current value  equals 0, Vasya immediately falls asleep and he wakes up only in the morning, when the program should already be finished.

Vasya is wondering, what minimum allowable value v can take to let him write not less than n lines of code before he falls asleep.

Input
The input consists of two integers n and k, separated by spaces — the size of the program in lines and the productivity reduction coefficient, 1 ≤ n ≤ 109, 2 ≤ k ≤ 10.

Output
Print the only integer — the minimum value of v that lets Vasya write the program in one night. */


import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l=1;
        int r=n;
        while(l<r){
            int mid=(l+r)/2;
            if(helper(n,k,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(l);
        sc.close();
    }
    public static boolean helper(int n,int k,int mid){
        int sum=0;
        while(mid>0){
            sum+= mid;
            mid/=k;
        }
        if(sum>=n){
            return true;
        }
        else{
            return false;
        }
    }
    
}
