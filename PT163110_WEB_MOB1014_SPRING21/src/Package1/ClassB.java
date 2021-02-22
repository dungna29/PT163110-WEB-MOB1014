/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/**
 *
 * @author DungNAPC
 */
public class ClassB {
   ClassA classA = new ClassA();
   //Trong cùng 1 Package BAI_DAC_TA_TRUY_XUAT không thể gọi đến thuộc tính hoặc phương thức bị private
   void method(){
       classA.a = "1";
       classA.b ="2";
       classA.c = "3";
       //classA.d = "4";//Không gọi được vì  thuộc tính d bị private
   }
}
