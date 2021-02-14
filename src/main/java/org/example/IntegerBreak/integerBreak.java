package org.example.IntegerBreak;

import static java.lang.Integer.max;

/**
 * @author matao
 * @date 2020-12-09 21:42
 * @description
 */
public class integerBreak {

    public static void main(String[] args) {
        System.out.println(new integerBreak().integerBreak(4));
        System.out.println(new integerBreak().breakIntegerDynamic(4));
    }

    int memo [] ;

    public int integerBreak(int n){

        memo = new int [n+1];
        return breakInteger(n);
    }

    public int breakInteger(int n){
        if( n ==1 ){
            return 1;
        }

        if(memo [n] != 0){
            return memo[n];
        }

        int res = -1 ;
        for (int i = 2; i < n; i++) {
            res = this.myMax(res,i*(n-i),i * breakInteger(n-i ));
            memo [n] = res;
        }
        return res;
    }

    public int myMax( int a,int b,int c){
        return max(a,Math.max(b,c));
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public int breakIntegerDynamic(int n){
        int [] memo2 = new int [n+1];
        memo2 [1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                memo2 [i] = this.myMax(memo2 [i],j*(i-j),j * memo2[i-j]);
            }
        }
        return memo2[n];
    }

}
