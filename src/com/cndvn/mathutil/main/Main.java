/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cndvn.mathutil.main;

import com.cndvn.mathutil.MathUtility;

/**
 *
 * @author CND
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test xem 5! có bằng 120 hem?
        long expected = 120; //tui hy vọng 120 là giá trị trả về
        int n = 5; //nếu tui tính 5!
        long actual = MathUtility.getFactorial(n);
                    //actual: cái value hàm thực sự trả về
        //ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay ko
        System.out.println("5! Expected: " + expected 
                                            + "; Actual: " + actual);
        //tính huống test số 2, 0! xem sao?
        //TÌNH HUỐNG TEST, TÌNH HUỐNG XÀI, GỌI LÀ TEST CASE
        n = 0; //tui muốn tính 0! 
        expected = 1; //hy vọng nhận về 1
        actual = MathUtility.getFactorial(n); //còn thực tế là
        //dùng mắt luận kết quả again
        System.out.println("0!: Expected: " + expected 
                                            + "; Actual: " + actual);
                
                
        
        // TODO code application logic here
//        System.out.println("Hello GitHub");
//        System.out.println("This is 1st upload connects to remote GitHub sserver");
    }
    
}


//Trong quy trình lập trình chuyên nghiệp/ ở các cty, đặc biệt làm cho JP
//mọi hàm/class bạn viết ra đều phải được test kĩ càng trước khi ghép 
//nó vào trong các cụm tính năng, và ghép vói UI, Back-End.
//Làm sao để test các hàm, các class
//Dân dev có nhiều cách
//1. Cách 1: sout(kết quả xử lý của hàm)
//2. cách 2: JOptionPane(pop-up lên kết quả xử lí hàm) bên Java Desktop
//3. cách 3: Ghi vào LOG file trong môn Java Web, hay in kết quả xử lí ra một trang web tạm nào đó
//VỚI 3 CÁCH NÀY, ta gọi hàm, nhìn kết quả trả về của hàm - ACTUAL VALUE
// và chưa gọi hàm - ta gọi là GIÁ TRỊ KÌ VỌNG - EXPECTED VALUE
// nếu EXPECTED VALUE == ACTUAL VALUE (thực tế và kì vọng khớp nhau)
// Á ĐÙ, HÀM CHẠY ĐÚNG
// nếu ko bằng, ĐÙ, HÀM XỬ LÍ SAI
//3 CÁCH TRÊN ĐÒI HỎI DEV PHẢI DÙNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
//nhiều test case cần phải test, ta rất dễ bỏ sót, nhìn sai kết quả
//KĨ THUẬT TEST NHƯ TRÊN GỌI LÀ MANUAL TEST
// TEST KHI CODE VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST

//CÒN CÁCH XỊN XÒ THỨ 4
// TA KHÔNG CẦN NHÌN BẰNG MẮT TỪNG TRƯỜNG HỢP SỬ DỤNG HÀM
// TA NHỜ MÁY SO SÁNH GIÙM ACTUAL VỚI EXPECTED LUÔN
//VÀ NẾU TẤT CẢ CÁC TÌNH HUỐNG ĐỀU KHỚP, BẰNG NHAU, NÉM RA 1 MÀU XANH
//NẾU NẾU HẦU HẾT ĐỀU KHỚP, CHỈ ÍT NHẤT 1 CÁI KHÔNG KHỚP, HÀM KHÔNG ỔN ĐỊNH
//NÉM RA MÀU ĐỎ --> CẢNH BÁO DÂN DEV CODE CÓ TRỤC TRẶC
//VẬY LÚC NÀY TA CHỈ NHÌN MÀU LÀ ĐỦ, KO CẦN LUẬN TỪNG KẾT QUẢ
//KĨ THUẬT NÀY GỌI LÀ TEST DRIVEN DEVELOPMENT + TEST AUTOMATION
//vừa viết code vừa viết test                   tự động hóa việc test

//MÚN LÀM ĐƯỢC ĐIỀU NÀY, TA CẦN THÊM THƯ VIỆN PHỤ TRỢ ĐỂ TUNG RA MÀU 
//THƯ VIỆN NÀY ĐỀU CÓ TƯƠNG ỨNG Ở CÁC NGÔN NGỮ LẬP TRÌNH
//JAVA  : JUnit, TestNG,...
//C#    : NUnit, xUnit, MSTest
//PHP   : PHPUnit
//...
