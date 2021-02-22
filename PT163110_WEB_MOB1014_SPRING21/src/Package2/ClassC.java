/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

import Package1.ClassA;

/**
 *
 * @author DungNAPC
 */
public class ClassC {

    ClassA classA = new ClassA();
    //Trong cùng 1 Package BAI_DAC_TA_TRUY_XUAT không thể gọi đến thuộc tính hoặc phương thức bị private

    void method() {
        classA.a = "1";
        //classA.b = "2";//b không sử dụng được vì là protected phải là lớp con mới có thể kế thừa thì mới sử dụng đc
        //classA.c = "3";//c là Default không thể gọi sang package khác
        //classA.d = "4";//Không gọi được vì  thuộc tính d bị private
    }
}
