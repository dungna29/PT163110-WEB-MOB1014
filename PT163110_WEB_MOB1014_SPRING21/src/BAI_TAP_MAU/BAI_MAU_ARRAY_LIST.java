/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BAI_MAU_ARRAY_LIST {

    static Scanner sc = new Scanner(System.in);
    static int[] arrNumber;
    static List<Double> lstDiem;

    public static void main(String[] args) {
        while (true) {
            chonChucNang();
        }

    }

    static void menu() {
        System.out.println("Chương trình BT1");
        System.out.println("1. Nhập mảng");
        System.out.println("2. Nhập List Điểm");
        System.out.println("3. Thoát");
    }

    static int layGiaTrinNguyen(String temp) {
        int a;
        System.out.println("Mời bạn nhập " + temp);
        a = sc.nextInt();
        return a;
    }

    static void chonChucNang() {
        menu();
        switch (layGiaTrinNguyen("chức năng")) {
            case 1:
                arrNumber = new int[layGiaTrinNguyen("số lượng phần từ:")];
                //Nhập phần tử vào mảng
                for (int i = 0; i < arrNumber.length; i++) {
                    arrNumber[i] = layGiaTrinNguyen(" vị trí " + String.valueOf(i));
                }
                //In phần tử trong mảng ra
                for (int x : arrNumber) {
                    System.out.print(x + " ");
                }
                System.out.println("");
                break;
            case 2:
                //Khởi tạo danh sách điểm 
                lstDiem = new ArrayList<>();
                for (int i = 0; i < layGiaTrinNguyen("số lượng phần từ:"); i++) {
                    System.out.println("Mời bạn nhập vào điểm thứ " + i);
                    lstDiem.add(sc.nextDouble());
                }
                //In tất cả các điểm nhỏ hơn 5
                System.out.println("Các điểm nhỏ hơn 5");
                for (Double x : lstDiem) {
                    if (x < 5) {
                        System.out.println(x);
                    }
                }
                //Lấy điểm max
                double max = lstDiem.get(0);
                for (Double x : lstDiem) {
                    if (max < x) {
                        max = x;
                    }
                }
                //In tất cả các phần tử có index lẻ ra màn hình
                for (int i = 0; i < lstDiem.size(); i++) {
//                    if (i %2 ==0) {
//                        continue;
//                    }
                    if (i % 2 != 0) {
                        System.out.println(lstDiem.get(i));
                    }

                }
                System.out.println(max);
                break;
            case 3:
                System.out.println("Hẹn gặp bạn lần sau");
                System.exit(0);
                break;
            default:
                System.out.println("Chức năng không tồn tại");
        }
    }
}
