## MOBILESHOP - GIẢI PHÁP QUẢN LÝ BÁN HÀNG ĐIỆN THOẠI ĐƠN GIẢN VÀ HIỆU QUẢ
### Mục Lục
- [1. Giới thiệu dự án](#1-giới-thiệu-dự-án)
- [2. Các chức năng chính](#2-các-chức-năng-chính)
- [3. Công nghệ sử dụng](#3-công-nghệ-sử-dụng)
- [4. Demo ứng dụng](#4-demo-ứng-dụng)
- [5. Cài đặt và chạy dự án](#5-cài-đặt-và-chạy-dự-án)
- [6. Tác giả](#6-tác-giả)
- [7. Demo tính năng nổi bật của ứng dụng](#7-demo-tính-năng-nổi-bật-của-ứng-dụng)
- [8. Hạn chế của ứng dụng](#8-hạn-chế-của-ứng-dụng)
- [9. Mục tiêu phát triển tiếp theo](#9-mục-tiêu-phát-triển-tiếp-theo)

## 1. Giới thiệu dự án
Trong thời đại công nghệ phát triển vượt bậc, thị trường điện thoại di động ngày càng trở nên sôi động và cạnh tranh khốc liệt. Để đứng vững và phát triển, các cửa hàng không chỉ cần những sản phẩm chất lượng mà còn phải sở hữu một hệ thống quản lý bán hàng chuyên nghiệp, giúp tối ưu hóa mọi quy trình từ quản lý sản phẩm, đơn hàng đến thống kê một cách hiệu quả và chính xác.

**MobileShop** ra đời như một giải pháp toàn diện, mang đến cho bạn một ứng dụng web bán hàng điện thoại hiện đại, được xây dựng trên nền tảng công nghệ tiên tiến. Với Spring MVC làm backend, JSP làm view engine và MySQL làm cơ sở dữ liệu, MobileShop không chỉ đảm bảo tính ổn định, bảo mật mà còn mang lại trải nghiệm mượt mà cho cả người dùng và quản trị viên.

## 2. Các chức năng chính

- **Đăng ký / Đăng nhập / Quên mật khẩu / Đổi mật khẩu**: Đăng nhập nhanh chóng, hỗ trợ **đăng nhập bằng Google** và khôi phục mật khẩu dễ dàng.
- **Quản lý sản phẩm**: Thêm, sửa, xóa, sắp xếp, lọc sản phẩm theo nhiều tiêu chí như giá, hãng, dung lượng.
- **Giỏ hàng và đặt hàng**: Thêm sản phẩm vào giỏ, đặt hàng và **thanh toán qua VNPAY** tiện lợi.
- **Quản lý đơn hàng**: Người quản trị có thể xác nhận, xử lý và cập nhật trạng thái đơn hàng nhanh chóng.
- **Quản lý tài khoản**: Người dùng có thể cập nhật thông tin cá nhân, xem lịch sử mua hàng.
- **Thống kê**: Hiển thị tổng số đơn hàng, sản phẩm và người dùng một cách trực quan.

## 3. Công nghệ sử dụng

Build tool: **Maven** 
Database: **MySQL** 

📌 **Backend:**

- **Spring MVC & Spring Boot**: Xây dựng ứng dụng web theo mô hình MVC, giúp cấu hình và triển khai dự án nhanh chóng.

- **Spring Security**: Đảm bảo an toàn với cơ chế xác thực và phân quyền người dùng (ADMIN, USER).

- **Spring Session**: Quản lý phiên đăng nhập của người dùng.

- **Spring Data JPA**: Giúp thao tác với cơ sở dữ liệu nhanh chóng, dễ dàng.

- **Spring AOP**: Đo thời thực thi của phương thức, giúp theo dõi hiệu suất.

📌 **Frontend:**

- View Engine: **JSP**

- **HTML, CSS, Javascript, Bootstrap**

- **jQuery & AJAX**: Xử lý các tác vụ phía client nhanh chóng, mang lại trải nghiệm mượt mà, gọi APIs mà không cần reload trang.

📌 **Triển khai: Docker, VPS**

## 4. Demo ứng dụng 
Truy cập: https://hoanggiang.xyz

**ADMIN:**
- Email: admin@gmail.com
- Password: 123456

**USER:**
- Email: user@gmail.com
- Password: 123456

## 5. Cài đặt và chạy dự án

### 📌 Cài Đặt Backend
- Cài đặt JDK 17.
- Clone mã nguồn và chạy trên IDE như IntelliJ IDEA, VSCode,...

### 📌 Cài Đặt Cơ Sở Dữ Liệu (MySQL)
- Cài đặt **MySQL**.
- Tạo database mới: `CREATE DATABASE mobileshop;`
- Chỉnh sửa cấu hình trong `application.properties` để kết nối với MySQL.

## 6. Tác giả
- **La Hoàng Giang** - [GitHub](https://github.com/lhggiang)

## 7. Demo tính năng nổi bật của ứng dụng

### Chức năng của Admin:

#### ✅ Thống kê
Thống kê tổng số lượng người dùng, sản phẩm, đơn hàng của ứng dụng.

![image](https://github.com/user-attachments/assets/9a6590fa-b216-4c28-9f1c-efb277a9d570)

#### ✅ Quản lý người dùng
Người quản trị có thể tạo, sửa, xóa và xem chi tiết người dùng.

![image](https://github.com/user-attachments/assets/c5d63f83-b30d-47ac-a031-d49f03ba2e65)

#### ✅ Quản lý sản phẩm
Người quản trị có thể tạo, sửa, xóa và xem chi tiết sản phẩm.

![image](https://github.com/user-attachments/assets/49046c5a-5fe3-4b6e-8ae7-661287dd6dde)

#### ✅ Quản lý đơn hàng
Người quản trị có thể sửa trạng thái đơn hàng, xóa và xem chi tiết đơn hàng.

![image](https://github.com/user-attachments/assets/ad0a6b33-220d-4366-847c-d9cee686d6ae)

### Chức năng của User:

#### ✅ Đăng nhập bằng Google

![image](https://github.com/user-attachments/assets/3e10e31a-f1a5-407a-bc81-313accaab689)

#### ✅ Lọc, sắp xếp sản phẩm 
Người dùng có thể sắp xếp, lọc sản phẩm theo nhiều tiêu chí như hãng sản xuất, RAM, mức giá và xem chi tiết sản phẩm.

![image](https://github.com/user-attachments/assets/46388b91-2ca4-4cb7-93b9-6a99a1383b8b)

![image](https://github.com/user-attachments/assets/050fddac-e492-45ea-a984-418784ec46ab)

#### ✅ Thanh toán qua VNPAY
Người dùng có thể chọn hình thức thanh toán khi nhận hàng hoặc thanh toán qua ví VNPAY.

![image](https://github.com/user-attachments/assets/c14b863a-24ca-4b36-b35d-2c84e93162a7)

Nếu thanh toán qua VNPAY, người dùng sẽ được chuyển tiếp qua trang thanh toán của VNPAY.

![image](https://github.com/user-attachments/assets/7f3c08a4-1723-4e6f-aa6a-2822f89b23b8)

#### ✅ Lịch sử đặt hàng
Người dùng có thể xem đơn hàng và trạng thái đơn hàng (PENDING, SHIPPING, COMPLETE, CANCEL).

![image](https://github.com/user-attachments/assets/b837e597-9b58-4d4e-aa5c-cabd7a98dddf)

## 8. Hạn chế của ứng dụng
- Lỗi 404 hiển thị hình ảnh khi triển khai production.

## 9. Mục tiêu phát triển tiếp theo
- Cải thiện giao diện UI/UX.
- Tích hợp AI để đề xuất sản phẩm theo sở thích người dùng.
- Tích hợp chatbot.
