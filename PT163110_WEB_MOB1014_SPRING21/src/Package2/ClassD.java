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
public class ClassD extends ClassA{
    

    void method() {
        a = "1";
        b = "2";
        //c = "3";//c là Default không thể gọi sang package khác
        //d = "4";//Không gọi được vì  thuộc tính d bị private
    }
}
