package BAI8_XuLyChuoi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    public static void main(String[] args) {
        String name = "fpt polytechniC";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        String pass1 = "abc";
        String pass2 = "ABC";
        if (pass1.equals(pass2)) {
            System.out.println("equals Đăng nhập thành công");
        }
        if (pass1.equalsIgnoreCase(pass2)) {
            System.out.println("equalsIgnoreCase Đăng nhập thành công");
        }
        String pass3 = "dungnaph00532";
        String pass4 = "ph00532";
         if (pass3.contains(pass4)) {
            System.out.println("contains Đăng nhập thành công");
        }
    }
}
