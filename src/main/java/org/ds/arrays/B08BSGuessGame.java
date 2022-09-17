package org.ds.arrays;

public class B08BSGuessGame {
    public static void main(String[] args) {
       int ans= guessNumber(10);
       System.out.print(ans);
    }

    public static int guessNumber(int n) {

        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(guess(mid)==0){
                return mid;
            }

            if(guess(mid)==-1){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return n;
    }

    static int pn = 6; //picked number
    public static int guess(int num) {
        if (num == pn) {
            return 0;
        }
        else if (num < pn) {
            return 1;
        }
        else {
            return -1;
        }
    }

}
