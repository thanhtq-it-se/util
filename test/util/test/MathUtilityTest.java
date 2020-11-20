/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.test;

import mathutility.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {
    
  @Test // biến hàm ở trong class thành public static void main
  // nhờ bộ thư viên junit, vì mặc định napp chạy từ main chuẩn, trong đó mình cần test thử hàm, ko cần main can thiệp
  // nên cần main khác, nhưng vì có nhiều main nên cpu bị bối rối khi f6
  // f6 dành cho main mặc định còn shift f6 dành cho bên này (dùng cho test hàm)
  public void getFactorial_RunsWell_IfValidArgument(){
      assertEquals(120, MathUtility.getFactorial(5));
      assertEquals(720, MathUtility.getFactorial(6));
      
  }   
}
