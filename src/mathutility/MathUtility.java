/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutility;

/**
 *
 * @author PC
 */
public class MathUtility {
    //ta sẽ làm 1 class fake class math với các hàm static dễ xài chung cho mọi nơi
    public static final double PI = 3.14;
    // hàm tính n! = 1.2.3...n
    //trong đó ko giai thừa âm, > 20 tràn kiểu long
    // quy ước 0! = 1! = 1;
    //đưa vào n âm, hoặc n > 20, ta ko thèm tính gì cả
    public static long getFactorial(int n){
        if(n<0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        if(n == 0 || n == 1)
            return 1; // 1 lệnh trong if ko xài ngoặc
        // chỗ code này xài else trừ điểm 
        // chỗ này chính là n = 2..20
        long result = 1;
        for( int i = 2; i <= n; i++)
               result *= i;
        return result;
        
    }
    
    
}



//    





    // ta tự tin gáy hàm ta chạy ngon, chạy đúng
    // nhưng: team thì cần chứng minh điêu đó, đảm bảo chất lượng code, chất lượng hàm
    // muốn chứng minh hàm chạy đúng hay ko ta cần test thử
    // test nghĩa là đưa hàm ra xài, gọi với các tham số khác nhau
    // ví dụ gọi hàm getFactorial(với các số khác nhau đưa vào)
    // getF(-5),getF(-1),getF(0),getF(5),getF(20),getF(21),...
    // các giá trị đầu vào đại diện cho việc xài hàm
    // ta còn gọi là test case, các tình huống cần test, các tình huống xài hàm
    // khi ta test hàm, quan tâm 2 việc
    // dự kiến hàm trả về giá trị gì khi hàm chạy với một đầu vào nào đó
    // dự kiến hàm trả về giá trị, tui gọi là Expected Value
    // ví dụ: hàm sẽ trả về 120 khi gọi F(5!)
    // hàm khi chạy với 1 đầu vào nào đó, thì nó sẽ ói/ return về 1 value
    // cái value trả về của hàm khi chạy dc gọi là Actual Value

// NGHỀ TEST CHÍNH LÀ: SO SÁNH COI EXPECTED VALUE CO CỔNG BẰNG VỚI ACTUAL VALUE KO
// NẾU CÓ BẰNG, HÀM ĐÚNG CHO CASE/ TÌNH HUỐNG NÀY
// NẾU KO BẰNG, HÀM TÍNH TOÁN SAI, HOẶC KÌ VỌNG SAI

// HÀM MÀ TỐT THÌ PHẢI LÀ9 EXPECTED == ACTUAL MỌI TÌNH HUỐNG
// NẾU TỐT TA MỚI ĐEM RA XÀI, BÁN, PUBLIC CỘNG ĐỒNG XÀI

// LÀM SAO ĐỂ TEST HÀM COI CÓ TỐT KO, EXPECTED == ACTUAL
// HAI KĨ THUẬT DC ÁP DỤNG
// KĨ THUẬT 1:  nhìn bằng mắt và so sánh từng cặp expected vs actual
// chính là kĩ thuật sout(expected), sout(actual-hàm ói về gì khi chạy)
//kĩ thuật này đơn giản, dễ làm, nhưng mắc sai sót đó có quá nhiều cặp
// expected actual cần so sánh nhiều mặt

//  KĨ THUẬT 2: nhìn bằng mắt, ko cần so sánh từng cặp, để so sánh giùm luôn mắt chỉ nhìn 2 màu XANH-ĐỎ duy nhất
//

//tương đương câu: hàm tui chạy ngon lắm, đúng 99.99%, lâu lâu sai 1 tí
// nói câu đó: hàm éo tin cậy để xài
// KĨ THUẬT 2 NÀY DÙNG MÀU SẮC, MÚN LÀM THÌ PHẢI XÀI THƯ VIỆN BỔ SUNG THÊM
// CHÍNH LÀ FILE.JAR, .DLL DC CUNG CẤP THÊM NGOÀI JDL
// Các thư viện này tùy thuộc ngôn ngữ lập trình, dc gọi chung là
//Unit Test Framework
//C#: 

//cần file đặc biệt để nói vs git tools là ai lên server ai ở lại local
// file này dc gọi là .gitignore (thuần text)
// nó sẽ khác nhau content tùy vào IDE mình xài, ngôn ngữ lập trình mình xài
// có 1 gã dev cực kì dth, làm sẵn những file ứng vói các IDE, NNLT ròi
// xin anh ấy đem về xài https://gitignore.oi 
