/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_Ke_Thua;

/**
 *
 * @author DungNAPC
 */
public class SinhVien extends Person{//Sử dụng từ khóa extends để kế thừa lớp cha
    
    private String maSv;   
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String maSv, double diemJava, String ho, String tenDem, String ten, String namSinh) {
        super(ho, tenDem, ten, namSinh);
        this.maSv = maSv;
        this.diemJava = diemJava;
    }

   
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    
   
    
    @Override
    public String toString() {        
        return "SinhVien{" + "maSv=" + maSv + ", diemJava=" + diemJava + '}';
    }
    
    //ALT + INSER -> OVERDIDE METHOD -> PHƯƠNG THỨC LỚP CHA

    @Override
    void inRaManHinh() {       
        System.out.printf("Mã SV: %s Điểm Java: %s ",maSv,diemJava < 0 ? "N/A": diemJava);
    }
    
    
    void inRaManHinhSinhVien(){
        
    }
    
    void inRaManHinhTest(){
        System.out.println("Đây làm phương thức 1");
    }   
    void inRaManHinhTest(int a){
        System.out.println("Đây làm phương thức 1" + a);
    }
    void inRaManHinhTest(int a,int b){
        System.out.println("Đây làm phương thức 1" + a + b);
    }
    void inRaManHinhTest(int a, int b,int c){
        System.out.println("Đây làm phương thức 1" + a + b + c);
    }
}
