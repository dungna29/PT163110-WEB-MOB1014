/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author DungNAPC
 */
public class GiaoVien {

    //Phần 1 Khai báo các thuộc tính của đối tượng
    private String tengv;
    private String magv;
    private int tuoi;
    private String email;
    private String quequan;
    private int sdt;

    //Phần 2 Hàm tạo || Contructor
    //Hàm tạo giống với tên class + sử dụng phím Alt + Insert để tạo contructor
    //Contructor không tham số
    public GiaoVien() {
        quequan = "HN";
        System.out.println("Đây là text in ra từ contructor GiaoVien");
    }

    //Contructor có tham số Alt + Insert -> Select All
    //Sử dụng contructor có tham số để gán giá trị cho đối tượng
    public GiaoVien(String tengv, String magv, int tuoi, String email, String quequan, int sdt) {
        this.tengv = tengv;
        this.magv = magv;
        this.tuoi = tuoi;
        this.email = email;
        this.quequan = quequan;
        this.sdt = sdt;
    }
    //this dùng để tham chiếu để thuộc tính và phương thức của lớp hiện tại
    
    //Phần 2 Vì các thuộc tính bị private nên phải sử dụng GETTER VÀ SETTER để lấy và gán giá trị
    //Dựa vào tính chất đóng gói trong lập trình hướng đối tượng:
    /*
    - Che dấu các thuộc tính
    - Sử dụng phương thức Getter và Setter để lấy và gán giá trị
    - Mục đính che dấu:
    - Bảo vệ dữ liệu
    - Tăng cường khả năng mở rộng
    */
    //Sử dụng phím Alt + Insert chọn Getter và Setter

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    
}
