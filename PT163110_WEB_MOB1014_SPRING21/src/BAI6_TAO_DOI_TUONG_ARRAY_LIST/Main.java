/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_TAO_DOI_TUONG_ARRAY_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungNAPC
 */
public class Main {

    Scanner _sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        //main.tao1DoiTuong();
        //main.taoMangDoiTuongSV();
        //main.taoListDoiTuong();
        main.tao2DoiTuong();
    }

    //Tạo ra 1 đối tượng do người dùng nhập vào
    void tao1DoiTuong() {
        SinhVien sv1 = new SinhVien();//Khởi tạo ra 1 đối tượng

        //Cách 1:
        System.out.print("Mời bạn nhập tên: ");
        sv1.setTenSV(_sc.nextLine());//Gán giá trị cho thuộc tính đối tượng thông qua phương thức set
        System.out.print("Mời bạn nhập mã: ");
        sv1.setMaSV(_sc.nextLine());
        System.out.print("Mời bạn nhập tuổi: ");
        sv1.setTuoiSV(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập điểm JAVA1: ");
        double diemJava = Double.parseDouble(_sc.nextLine());
        sv1.setDiemJava(diemJava);

        //Cách 2
        //Trong trường hợp muốn giải theo kiểu gán giá trị cho contructor có tham số
        System.out.print("Mời bạn nhập tên: ");
        String ten = _sc.nextLine();
        System.out.print("Mời bạn nhập mã: ");
        String masv = _sc.nextLine();
        System.out.print("Mời bạn nhập tuổi: ");
        int tuoi = Integer.parseInt(_sc.nextLine());
        System.out.print("Mời bạn nhập điểm JAVA1: ");
        double diem = Double.parseDouble(_sc.nextLine());
        SinhVien sv2 = new SinhVien(ten, masv, tuoi, diemJava);

        //IN thông tin đối tượng ra màn hình
        System.out.println("Đối tượng bạn vừa nhạp vào là: ");
        System.out.print(sv1.toString());
    }

    //2. Tạo mảng đối tượng - tạo được nhiều đối tượng
    void taoMangDoiTuongSV() {
        //Bước 1: Khai báo
        SinhVien[] arrSinhVien;

        int sizeArr;

        //Bước 2: Triển khai
        System.out.println("Mời bạn nhập số lượng sinh viên: ");
        sizeArr = Integer.parseInt(_sc.nextLine());
        //Khởi tạo kích thước mảng
        arrSinhVien = new SinhVien[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.print("Mời bạn nhập tên: ");
            arrSinhVien[i] = new SinhVien();//Khởi tạo đối tượng tại vị trí thứ i
            arrSinhVien[i].setTenSV(_sc.nextLine());//Gán giá trị cho thuộc tính đối tượng thông qua phương thức set
            System.out.print("Mời bạn nhập mã: ");
            arrSinhVien[i].setMaSV(_sc.nextLine());
            System.out.print("Mời bạn nhập tuổi: ");
            arrSinhVien[i].setTuoiSV(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập điểm JAVA1: ");
            double diemJava = Double.parseDouble(_sc.nextLine());
            arrSinhVien[i].setDiemJava(diemJava);
        }

        //Bước 3: In ra màn hình
        for (SinhVien x : arrSinhVien) {
            System.out.println(x.toString());
        }
    }

    //3. Tạo List đối tượng - tạo được nhiều đối tượng
    void taoListDoiTuong() {
        //Bước 1: Khai báo
        List<SinhVien> lstSinhVien = new ArrayList<>();//Tạo ra 1 danh sách để chứa đối tượng sinh viên
        SinhVien sv1;
        int soluong;

        //Bước 2: Triển khai
        System.out.println("Mời bạn nhập số lượng sinh viên: ");
        soluong = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < soluong; i++) {
            sv1 = new SinhVien();
            System.out.print("Mời bạn nhập tên: ");
            sv1.setTenSV(_sc.nextLine());//Gán giá trị cho thuộc tính đối tượng thông qua phương thức set
            System.out.print("Mời bạn nhập mã: ");
            sv1.setMaSV(_sc.nextLine());
            System.out.print("Mời bạn nhập tuổi: ");
            sv1.setTuoiSV(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập điểm JAVA1: ");
            double diemJava = Double.parseDouble(_sc.nextLine());
            sv1.setDiemJava(diemJava);
            lstSinhVien.add(sv1);//Sau khi nhập giá cho thuộc tính đối tượng xong thì tiến hành thêm đối tượng vào trong List Danh Sách
        }
        
        //Bước 3: In ra màn hình
        for (SinhVien x : lstSinhVien) {
            System.out.println(x.toString());
        }
    }
    
    //4. Tạo đối tượng bằng 2 cách contructor tham số và không tham số
    void tao2DoiTuong(){
        //1. Tạo 1 đối tượng bằng contructor có tham số
        SinhVien sv1 = new SinhVien("Dũng", "Dungna", 32, 4);
        System.out.println(sv1.toString());
        
        //2. Tạo 1 đối tượng bằng contructor không tham số
        SinhVien sv2 = new SinhVien();
        sv2.setTenSV("Minh");
        sv2.setMaSV("Minh");
        sv2.setTuoiSV(32);
        sv2.setDiemJava(8);
        sv2 = new SinhVien();//Khi đặt contructor ở đây sẽ khởi tạo lại đối tượng làm đối tượng bị mất hết giá trị
        System.out.println(sv2.toString());
    }
}
