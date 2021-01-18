/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B2_VongLap_Do_While {

    /*
     Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
    
    Cách gõ: do + tab
    Công thức: 
    do {
            //Thực hiện hành động ít nhất là 1 lần.
        } while (true);
     */
    public static void main(String[] args) {
        
        //Ví dụ: Yêu cầu người dùng nhập vào trong 2 khoảng 
        // 10 đến 20 và 90 đến 100
        Scanner sc = new Scanner(System.in);
        int input;     
        
        do {            
            System.out.print("Mời bạn nhập vào theo khoảng 10 -> 20 || 90 ->90: ");
            input = sc.nextInt();
        } while (!((input >= 10 && input <=20)||(input >= 90 && input <=100)));
       
        
        do {
            //Sẽ chạy ít nhất 1 lần kể cả khi while False
        } while (false);
        
        
      
    }
}
