/*You are given a sequence of n
 non-negative integers a1,a2,…,an
. Initially, all the elements of the sequence are unpainted. You can paint each number Red–––––
 or Blue¯¯¯¯¯¯¯¯¯¯¯
 (but not both), or leave it unpainted.

For a color c
, Count(c)
 is the number of elements in the sequence painted with that color and Sum(c)
 is the sum of the elements in the sequence painted with that color.

For example, if the given sequence is [2,8,6,3,1]
 and it is painted this way: [2¯¯¯,8,6––,3¯¯¯,1]
 (where 6
 is painted red, 2
 and 3
 are painted blue, 1
 and 8
 are unpainted) then Sum(Red–––––)=6
, Sum(Blue¯¯¯¯¯¯¯¯¯¯¯)=2+3=5
, Count(Red–––––)=1
, and Count(Blue¯¯¯¯¯¯¯¯¯¯¯)=2
.

Determine if it is possible to paint the sequence so that Sum(Red–––––)>Sum(Blue¯¯¯¯¯¯¯¯¯¯¯)
 and Count(Red–––––)<Count(Blue¯¯¯¯¯¯¯¯¯¯¯)
.

Input
Each test contains multiple test cases. The first line contains the number of test cases t
 (1≤t≤1000
). Description of the test cases follows.

The first line of each test case contains an integer n
 (3≤n≤2⋅105
) — the length of the given sequence.

The second line of each test case contains n
 integers a1,a2,…,an
 (0≤ai≤109
) — the given sequence.

It is guaranteed that the sum of n
 over all test cases does not exceed 2⋅105
.

Output
For each test case, print YES if it is possible to paint the given sequence satisfying the above requirements, and NO otherwise.

You can output YES and NO in any case (for example, strings yEs, yes, Yes and YES will be recognized as a positive response).*/
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }

        }sc.close();}}