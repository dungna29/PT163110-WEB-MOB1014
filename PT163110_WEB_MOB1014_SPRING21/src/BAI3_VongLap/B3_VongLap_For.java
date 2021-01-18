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
public class B3_VongLap_For {

    /*
        Cách gõ: for + tab
        Công thức:
         for (int i = 0; i < 10; i++) {

            }
    int i = 0: Điểm bắt đầu của vòng lặp có kiểu số nguyên
    i < 10: Điều kiện để ngắt vòng
    i++: Tăng bước nhẩy lên 1
     */
    public static void main(String[] args) {
        //In ra 5 lần
        for (int i = 0; i < 5; i++) {
            System.out.println("In ra số lần " + i);
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("In ra số lần " + i);
        }

        //Bảng cửu chương dùng vòng lặp for
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Bảng cửu chương bạn muốn: ");
        input = sc.nextInt();
        System.out.println("Bảng nhân " + input);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d \n", input, i, input * i);
        }

        //Bảng cửu chương theo kiểu while
        int i = 1;
        while (i < 10) {
            System.out.printf("%d x %d = %d \n", input, i, input * i);
            i++;
        }
        System.out.println("--------------------------------");
        //Viết bảng cửu chương full bằng do..While
        int k = 1, j = 1;
        do {
            do {
                System.out.printf("%d x %d = %d \n", k, j, k * j);
                j++;
            } while (j <= 9);
            k++;
            j = 1;//Reset về 1 để tiến hành in bảng cửu chương tiếp theo
        } while (k <= 10);

    }
}
