package BasicThings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class TreeHeight{
    int feet;
    int inches;
}
public class Solution {

    public static int TallestTree( TreeHeight tress[], int n){
        if(tress.length == 0){
            return -1;
        }
        int maxHeight = 0, currentHeight = 0;
        for(int i=0; i<tress.length; i++){
            currentHeight = (tress[i].feet * 12) + tress[i].inches;
            if(currentHeight > maxHeight){
                maxHeight = currentHeight;
            }
        }
        return maxHeight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeHeight trees[] = new TreeHeight[n];
        for(int i=0;i<n;i++){
            TreeHeight t = new TreeHeight();
            t.feet = sc.nextInt();
            t.inches = sc.nextInt();
            trees[i] = t;
        }
        int ans = TallestTree(trees,n);
        System.out.print(ans);
}
}
