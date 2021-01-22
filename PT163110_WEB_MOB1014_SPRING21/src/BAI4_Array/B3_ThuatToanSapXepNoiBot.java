/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array;

/**
 *
 * @author Dungna29
 */
public class B3_ThuatToanSapXepNoiBot {

    public static void main(String[] args) {
        int[] arrNumer = {8, 9, 7, 1, 3, 0};
        System.out.println("Mảng chưa sort");
        for (int x : arrNumer) {
            System.out.print(x + " ");
        }
        System.out.println("");

//        for (int i = 0; i < arrNumer.length; i++) {
//            for (int j = i + 1; j < arrNumer.length; j++) {
//                if (arrNumer[i]> arrNumer[j]) {
//                    int temp = arrNumer[i];
//                    arrNumer[i] = arrNumer[j];
//                    arrNumer[j] = temp;
//                }
//            }
//        }
        for (int i = 0; i < arrNumer.length; i++) {
            System.out.println("Lần chạy thứ: " + i);
            for (int x : arrNumer) {
                System.out.print(x + " ");
            }
            System.out.println("");
            for (int j = i + 1; j < arrNumer.length; j++) {
                System.out.printf("Nếu %d > %d \n", arrNumer[i], arrNumer[j]);
                if (arrNumer[i] > arrNumer[j]) {
                    int temp = arrNumer[i];
                    arrNumer[i] = arrNumer[j];
                    arrNumer[j] = temp;
                    System.out.println("Sau khi hoán đổi vị trí ");
                    for (int x : arrNumer) {
                        System.out.print(x + " ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Đã sort");
        for (int x : arrNumer) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
