/*
Goldman Sachs Problem-2
Solution by Aditya Kumar Jaiswal


Problem Statement: Overlapping rectangles
Given two rectangles, find if the given two rectangles overlap or not. 
A rectangle is denoted by providing the x and y coordinates of two points: the left top corner and the right bottom corner of the rectangle. 
Two rectangles sharing a side are considered overlapping. 
(L1 and R1 are the extreme points of the first rectangle and L2 and R2 are the extreme points of the second rectangle).

*/


class Problem2{
    public static void main(String[] args){
        int[][] points = new int[4][2];
        points[0][0] = 0; points[0][1] = 10;
        points[1][0] = 10;points[1][1] = 0;
        points[2][0] = 5; points[2][1] = 5;
        points[3][0] = 15;points[3][1] = 0;
        Solution os = new Solution();
        System.out.println(os.doOverlap(points[0], points[1], points[2], points[3])); // OP should be 1
    }
}

class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        if(L1[1] < R2[1] || R1[1] > L2[1]){
            return 0;
        }
        if(L1[0] > R2[0] || R1[0] < L2[0]){
            return 0;
        }
        return 1;
    }
};
