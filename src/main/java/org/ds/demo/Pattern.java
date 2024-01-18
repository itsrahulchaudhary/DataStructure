package org.ds.demo;

public class Pattern {

    public static void main(String[] args) {
         int n=5;
         int space = 2*(n-1);
          for(int i=1; i<n; i++){
              for(int j=1; j<=i; j++){
                  System.out.print(j);
              }
              space = space-2;
              for(int k =1; k<=space; k++){
                  System.out.print("A");
              }
              for(int j=i; j>=1; j--){
                  System.out.print(j);
              }
              System.out.println();

          }
    }
}
