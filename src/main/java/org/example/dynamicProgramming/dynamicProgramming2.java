package org.example.dynamicProgramming;

/**
 爬楼梯问题
 * 有n级楼梯，有2种爬法，1次1级，或1次2级，求n级楼梯有多少种爬法
 * 自底向上的解法 动态规划的解法
 * @author matao
 * @date 2020-12-07 16:38
 * @description
 */
public class dynamicProgramming2 {

    public static void main(String[] args) {
        int NUMS = 5;
        Long steps = footStep(NUMS);
        System.out.println(steps);
    }


    public static Long footStep(int n){
        Long [] memo = new Long[n+1];
        memo [1] = Long.parseLong("1");
        memo [2] = Long.parseLong("2");
        if(n == 1) {
            return Long.parseLong("1");
        }
        if(n == 2 ){
            return Long.parseLong("2");
        }
        for (int i = 3; i <= n; i++) {
            memo [i] = memo [i-1] + memo [i-2];
        }
        return memo [n];
    }
}
