package org.example.algorithm.leecode;

import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

/**
 * @author matao
 * @date 2021-02-14 16:15
 * @description
 * 已知一个搜索二叉树后序遍历的数组posArr,请根据posArr，重建出整棵树
 * 返回新建树的头节点
 */
public class searchBinaryTree {


    public static void main(String[] args) {
        int posArr [] = new int [] {2,4,3,6,7,8,5};

        Node node = posArrayToBST1(posArr);
        System.out.println(node);
    }

    /**
     * 二叉树节点描述
     */
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int v){
            value = v ;
        }
    }

    //使用数组 posArr [L.....R]这些数字，来构建树
    //建出每一个节点都连好，然后把整棵树头节点返回
    public static Node posArrayToBST1(int [] posArr){
        return process1(posArr,0,posArr.length - 1);
    }

    //递归方法体 时间复杂度: n平方
    public static  Node process1(int [] posArr,int L,int R){
        if(L > R){
            return null ;
        }
        //头节点一定是数组最后一个元素
        Node head = new Node(posArr[R]);
        if(L == R){
            return head;
        }
        //初始化
        int M = L -1 ;
        for (int i = R-1 ; i < R; i--) {
            if(posArr[i] < posArr[R]){
                M = i ;
                break;
            }
        }

        head.left = process1(posArr,L,M);
        head.right = process1(posArr,M + 1,R - 1);
        return head;
    }


    //使用数组 posArr [L.....R]这些数字，来构建树
    //建出每一个节点都连好，然后把整棵树头节点返回
    public static Node posArrayToBST2(int [] posArr){
        return process1(posArr,0,posArr.length - 1);
    }

    //二分 时间复杂度: n*log2N
    public static  Node process2(int [] posArr,int L,int R){
        if(L > R){
            return null ;
        }
        //头节点一定是数组最后一个元素
        Node head = new Node(posArr[R]);
        if(L == R){
            return head;
        }
        //初始化
        int M = L -1 ;
        int left = L;
        int right = R-1;
        while (left <= right) {
            int mid = left + ( (right - left) >>1 );
            if(posArr[mid] < posArr[R]){
                M = mid ;
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        head.left = process1(posArr,L,M);
        head.right = process1(posArr,M + 1,R - 1);
        return head;
    }






}
