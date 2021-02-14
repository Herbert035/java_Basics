package org.example.dynamicProgramming;

/**
 * 爬楼梯问题
 * 有n级楼梯，有2种爬法，1次1级，或1次2级，求n级楼梯有多少种爬法
 * 自顶向下的解法  记忆化搜索
 * @author matao
 * @date 2020-12-07 15:39
 * @description
 */
public class dynamicProgramming {

    static final int NUMS = 100;
    private static Long memo [] ;

    public static void main(String[] args) {
        memo = new Long[NUMS+1];
        Long steps =  footStep(NUMS);
        System.out.println(steps);
    }


    public static Long footStep(int n){
        if(n == 1) {
            return Long.parseLong("1");
        }
        if(n ==2 ){
            return Long.parseLong("2");
        }
        if(memo[n] == null){
            memo[n] = footStep(n-1) + footStep(n-2); //爬到第n阶，只要 n-1 和 n-2的路径相加
        }
        return memo[n];
    }
}
