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
public class Main {

    public static void main(String[] args) {
        //Gọi đối tượng để sử dụng
        GiaoVien gv1 = new GiaoVien();//Khởi tạo 1 đối tượng giáo viên
        //Khởi tạo ra 1 đối tượng GV để có thể gán giá trị cho đối tượng đó.
//        gv1.tengv = "DũngNA";
//        gv1.tuoi = 31;
//        gv1.email = "dungna29@fe.edu";

        //Sử dụng contructor không tham số để gán giá trị
        //Sử dụng contrcutor không tham số tạo 1 đối tượng giáo viên
        GiaoVien gv3 = new GiaoVien();
        //Gán giá trị bằng cách gọi tên biến gv3 chấm thuộc tính và gán giá trị
//        gv3.tengv = "DũngNA";
//        gv3.tuoi = 31;
//        gv3.email = "dungna29@fe.edu";

        //Sử dụng contrcutor có tham số tạo 1 đối tượng giáo viên
        //Sử dụng contructor có tham số để gán giá trị cho đối tượng
        //Lưu ý: Vị trí của tham số phải đúng kiểu dữ liệu
        GiaoVien gv2 = new GiaoVien("Dũng", "Dungna29", 31, "dungna@gmail", "HN", 0123456);
        
        //Khi các thuộc tính bị private thì sử dụng Getter và Setter
        gv2.setTengv("Long");
        System.out.println(gv2.getTengv());
    }
}
