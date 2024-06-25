/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.GiaoVien;
import model.MonHoc;
import model.Student;

/**
 *
 * @author minhk
 */
public class Main {
    public static void main(String[] args) {
        GiaoVien A = new GiaoVien("HS123456", "Nguyen Van A", "0987654321", "Ha Noi");
        System.out.println(A.toString());

        Student B = new Student("HE987654", "Nguyen Van B", "0123456789", "Nghe An", "Nam");
        System.out.println(B.toString());

        MonHoc Mh = new MonHoc("PRO192", "Object-Oriented Programming");

        System.out.println(Mh.toString());

    }
}
