package service;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
	public boolean checkInfor(String username, String password) {
        // Gọi Model để kiểm tra thông tin đăng nhập, ví dụ: truy vấn cơ sở dữ liệu
        // Trả về true nếu thông tin đúng, ngược lại trả về false
        // Ví dụ đơn giản: kiểm tra username và password cứng-coded
        return "admin".equals(username) && "123".equals(password);
    } 
}
