package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_PhuongThucTraVe {

    /*
         * Method trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: Hàm trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, 
           đối tượng.... tương ứng với kiểu dữ liệu của hàm.
     */
    public static void main(String[] args) {

        //Coi hàm trả về như là 1 giá trị hoặc đối tượng hoặc tập đối tượng...
        //Đã là giá trị thì phải in nó ra màn hình
        int year = 2021;
        getYear();
        System.out.println(getYear() + 1);

        //Sử dụng ham trả về dạng tập giá trị
        getListYears();
        for (int i = 0; i < getListYears().length; i++) {
            System.out.println(getListYears()[i]);
        }

        //getSinhVien() là 1 đối tượng sinh viên
        System.out.println(getSinhVien().ten);
        getSinhVien().inRaManHinh();//inRaManHinh() là phương thức bên trong đối tượng

    }

    //Hàm trả về không tham số - Hàm trả về kiểu dữ liệu nguyên thủy string,int,double....
    static int getYear() {
        int a = 2021;
        return a;
    }

    //Hàm trả về không tham số - Hàm trả về 1 tập giá trị: Array,List....
    static int[] getListYears() {
        //Tạo 1 danh sách các năm từ 1900 đến 2021
        //int[] arrYears = {1900,1901,1902};
        int[] arrYears = new int[2022 - 1900];
        int temp = 0;
        for (int i = 1900; i <= 2021; i++) {
            arrYears[temp] = i;
            temp++;
        }
        return arrYears;
    }

    //Hàm trả về 1 đối tượng
    static SinhVien getSinhVien() {
        //Để trả về 1 đối tượng thì phải khai báo 1 đối tượng
        SinhVien sv1 = new SinhVien();
        sv1.ten = "FPT";
        return sv1;
    }

    static List<String> inRaManHinh1(int year, String name) {
        return null;
    }

    static List inMangSoNguyen(int[] arrTemp) {
        return null;
    }

    //1 số ví dụ về hàm khai báo nhiều tham số 
    static ArrayList<Double> methodTemp(int[] arrTemp, int a, SinhVien sv, List<String> lstTemp) {
        return null;
    }

}
