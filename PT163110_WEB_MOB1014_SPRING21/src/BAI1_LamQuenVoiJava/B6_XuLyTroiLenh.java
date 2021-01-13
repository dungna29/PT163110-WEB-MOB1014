/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LamQuenVoiJava;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B6_XuLyTroiLenh {
    /*
    Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
    */
    public static void main(String[] args) {
        //Bước 1: Xác định số lượng biến và khởi tạo thư viện
        Scanner sc = new Scanner(System.in);
        String ten,msv;
        int ns;
        //Bước 2: Gán giá trị
        System.out.println("Mời ban nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh: ");
        //Khi nào next<Số> mà phía sau là nextLine() thì sẽ bị trôi lệnh
        //ns = sc.nextInt();//Đây là điểm bị trôi lệnh
        
        //2 Cách xử lý trôi lệnh:
        //Cách số 1: thêm 1 cái sc.nextLine() phía sau của next<so>();
        //sc.nextLine();
        
        //Cách số 2:
        ns = Integer.parseInt(sc.nextLine());//Ép kiểu String về số 
        System.out.println("Mời bạn nhập mã sinh viên: ");
        msv = sc.nextLine();
        //Bước 3: Xử lý nghiệp vụ
        System.out.printf("Tên: %s | Năm Sinh: %d | Msv %s",ten,ns,msv);
    }
}
