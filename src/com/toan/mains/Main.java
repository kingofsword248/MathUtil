/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toan.mains;

import static com.toan.utils.MathUtil.computeFactorial;

/**
 *
 * @author SE130205
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));
        //đoạn code trên chính là test hàm bằng tay, manual test
        //tức là :
        System.out.println("6! = " + computeFactorial(6));
        System.out.println("0! = " + computeFactorial(0));
    }

}
