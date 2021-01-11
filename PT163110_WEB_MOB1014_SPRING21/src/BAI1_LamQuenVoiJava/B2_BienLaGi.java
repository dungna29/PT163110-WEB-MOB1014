/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_LamQuenVoiJava;

/**
 *
 * @author Dungna29
 */
public class B2_BienLaGi {
    /*
        Bài 2: Khái niệm về biến và khai báo biến
    1. Khái niệm: Lưu trữ giá trị hoặc tập giá trị và biến được khởi tạo trong bộ
    nhớ ảo của máy (RAM) khi mà chương trình chạy.
    
    2. Công thứ khai báo biến: 
            <Kiểu dữ liệu> <Tên biến> = <Giá trị>;
            <Kiểu dữ liệu> <Tên biến 1> = <Giá trị>, <Tên biến 1> = <Giá trị>,<Tên biến n> = <Giá trị>;
            Có thể khai báo nhiều biến có kiểu dữ liệu giống nhau trên cùng 1 dòng
        2.1: <Kiểu dữ liệu>
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, double
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean
            + Kiểu var: tự định nghĩa theo giá trị
        2.2: <Tên biến>
            + Tên biến phải có nghĩa
            + Tên biến nên là tiếng anh 
            + Tên biến có phân biết chữ hoa chữ thường: tuoi & Tuoi
            + Tên biến không bắt đầu bởi số và từ khóa: 1Tuoi + Từ khóa là tất cả  các Ctrl + space
            + Đối với tên biến có 2 từ trở lên:
                - Cách 1: normal = firstname
                - Cách 2: CamelCase = FirstName, firstName
                - Cách 3: Under_Score = first_name, first_Name
            + Biến toàn cục: Khai báo ngoài hàm
                - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
                Ví dụ: _first_Name, _firstname
            + Biến cục bộ: Khai báo bên trong hàm
        2.2: <Giá trị>: Phải đúng với quy tắc của kiểu dữ liệu.
     */
    
    //Biến toàn cục
    float diem = 8.6f;// Sử dụng thêm f, F
    long year = 2021;//Sử dụng thêm l, L
    public static void main(String[] args) {
        String monhoc1;
        String monhoc = "Môn JAVA1";
        //Khai báo 1 biến có tên là monhoc có kiểu dữ liệu
        //là chuỗi và có khởi tạo giá trị ban đầu.
        
        boolean temp1 = true;
        boolean temp2 = false;
        
        //Kiểu var: có thể là tất cả các kiểu dữ liệu khác
        var temp3 = 5;
        var temp4 = true;
        var temp5 = "FPT";
    }
}
