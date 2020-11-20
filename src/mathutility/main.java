/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutility;

/**
 *
 * @author PC
 */
public class main{
    public static void main(String[] args){
    long expected = 120;
    long actual = MathUtility.getFactorial(5);
    System.out.println("5!? expected: "+ expected +"; actual:" + actual);

    //case2
    expected = 720;
    actual = MathUtility.getFactorial(6);
    System.out.println("6!? expected: "+ expected +"; actual:" + actual);
    
    //case3
    System.out.println("0!? expected: 1;actual: " + MathUtility.getFactorial(0)); 

    //case4
    // kì vọng nhận về ngoại lệ IllegalArgumentException
    // nếu gọi -5!
    MathUtility.getFactorial(-5);
    //thấy ngoại lệ lại mừng vì hàm chạy như thiết kế
}
}