package vn.hoanggiang.mobileshop.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import vn.hoanggiang.mobileshop.domain.Product;
import vn.hoanggiang.mobileshop.domain.Role;
import vn.hoanggiang.mobileshop.domain.User;
import vn.hoanggiang.mobileshop.repository.ProductRepository;
import vn.hoanggiang.mobileshop.repository.RoleRepository;
import vn.hoanggiang.mobileshop.repository.UserRepository;
import vn.hoanggiang.mobileshop.service.UploadService;
import vn.hoanggiang.mobileshop.service.UserService;

import java.util.List;

@Component
public class DataInitializer {

    private final UserRepository userRepository;

    private final ProductRepository productRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    public DataInitializer(
            UserRepository userRepository,
            ProductRepository productRepository,
            RoleRepository roleRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void initData() {
        if (userRepository.count() == 0) {
            Role roleAdmin = new Role(1L, "ADMIN", "ADMIN");
            Role roleUser = new Role(2L, "USER", "USER");
            roleRepository.saveAll(List.of(roleAdmin, roleUser));

            String hashPassword = this.passwordEncoder.encode("123456");

            User user1 = new User(1L, "admin@gmail.com", hashPassword,
                    "Hoàng Giang", null, null, null, roleAdmin);

            User user2 = new User(2L, "user@gmail.com", hashPassword,
                    "Hoàng Minh", null, null, null, roleUser);


            userRepository.saveAll(List.of(user1, user2));

            System.out.println("Data is already initialized");
        }

        if (productRepository.count() == 0) {
            Product product1 = new Product(1L, "Samsung Galaxy S25 5G", 20990000, "product1.png", "Samsung Galaxy S25 là biểu tượng của sự sang trọng và tinh tế, thể hiện đẳng cấp của dòng flagship cao cấp. Với bốn tùy chọn màu sắc thời thượng gồm Xanh Navy, Xanh Icy, Xanh Mint và Bạc Shadow, Galaxy S25 mang đến vẻ đẹp hiện đại, đón đầu xu hướng thiết kế công nghệ. Những gam màu này được lựa chọn kỹ lưỡng, giúp người dùng sở hữu thiết bị công nghệ thời trang. Kết hợp với chất liệu cao cấp và các đường nét tinh xảo, Galaxy S25 cho cảm giác sang trọng khi cầm trên tay.", "Samsung Galaxy S25 là siêu phẩm cao cấp với thiết kế nhỏ gọn và hiệu năng vượt trội bởi Snapdragon 8 Elite for Galaxy tiến trình 3nm đầu tiên", 10, 2, "SAMSUNG", "12GB");
            Product product2 = new Product(2L, "Samsung Galaxy A16", 5090000, "product2.png", "Galaxy A16 4G có nâng cấp màn hình siêu lớn đến 6.7 inch. Đây là kích thước màn hình lớn nhất trong dòng Galaxy A series. Màn hình lớn sử dụng tấm nền AMOLED cao cấp, độ phân giải FHD+ cho phép người dùng thao tác thoải mái, thỏa thích đắm chìm trong từng chi tiết sắc nét và chân thực của những bộ phim bom tấn. Chưa hết, tốc độ chuyển cảnh của Galaxy A16 5G nhanh hơn với tần số quét 90Hz mượt mà.", "Galaxy A16 4G là lựa chọn lý tưởng cho Gen Z năng động với thiết kế trẻ trung, sắc màu cá tính, hiện đại.", 10, 1, "SAMSUNG", "4GB");
            Product product3 = new Product(3L, "Samsung Galaxy S24 FE", 14890000, "product3.png", "Thiết kế của Samsung Galaxy S24 FE thừa hưởng nhiều đặc điểm từ thế hệ tiền nhiệm, mang ngôn ngữ vuông vức từ mặt lưng đến các cạnh xung quanh. Cụm camera sau vẫn xếp dọc thẳng hàng và không có module, thiết kế vốn được coi là biểu tượng của S Series. Ở phiên bản này, Samsung mang đến tới bốn lựa chọn màu sắc gồm Xám Opal, Xanh Jade, Xanh Topaz và Đen Graphire. Tone màu đã được điều chỉnh nhẹ nhàng theo gu thẩm mỹ của giới trẻ, hứa hẹn làm nên cơn sốt và phù hợp với cá tính của tất cả mọi người.", "Samsung Galaxy S24 FE là một kiệt tác công nghệ với sự hoàn hảo từ diện mạo đến cấu hình. Màn hình 6.7 inch Dynamic AMOLED 2X, pin 4.700mAh và chip Exynos 2400e mang tới trải nghiệm mượt mà và thú vị cho mọi tác vụ", 20, 5, "SAMSUNG", "8GB");
            Product product4 = new Product(4L, "Xiaomi Redmi Note 14 ", 4790000, "product4.png", "Redmi Note 14 sở hữu cụm camera chính độ phân giải 108MP ấn tượng, cho phép người dùng ghi lại mọi khoảnh khắc với chi tiết sắc nét và sống động. Khi kết hợp với zoom trong cảm biến 3x, thiết bị giúp ghi lại hình ảnh sắc nét, chi tiết từ khoảng cách xa lẫn những khung hình cận cảnh phức tạp. Công nghệ siêu phân giải cải tiến đảm bảo độ rõ ràng và chất lượng ổn định trên nhiều mức thu phóng.", "Redmi Note 14 sở hữu những nâng cấp ấn tượng so với thế hệ trước đó với dung lượng pin lớn, hệ thống camera 108MP chất lượng, nhiều tính năng AI và thiết kế tinh tế, cứng cáp", 15, 2, "XIAOMI", "6GB");
            Product product5 = new Product(5L, "Xiaomi 14T Pro", 16490000, "product5.png", "Với việc sử dụng cảm biến Light Fusion 900 - cảm biến hình ảnh được tùy chỉnh dành riêng cho Xiaomi với kích thước 1/1,31\", Xiaomi 14T Pro sẽ thay bạn ghi lại những chi tiết rõ nét đến không ngờ dù chụp ở điều kiện sáng hay những buổi đêm mờ ảo. Cảm biến này có dải động cao 13,5EV ở mức điện ảnh và độ sâu màu 14 bit, từ đó đảm bảo khả năng tái tạo hình ảnh xuất sắc.", "Xiaomi 14T Pro không chỉ nổi bật với sự hợp tác giữa thương hiệu và Leica tạo nên một chiếc smartphone hàng đầu về nhiếp ảnh mà còn có hiệu suất mạnh mẽ bậc nhất trong phân khúc.", 30, 3, "XIAOMI", "12GB");
            Product product6 = new Product(6L, "iPhone 14 Pro", 15990000, "product6.jpg", "iPhone 14 đem đến những tùy chọn màu sắc đầy sức sống gồm: Xanh dương, Đen, Trắng, Đỏ và Tím. Tất cả đều được căn chỉnh theo hơi hướng trẻ trung, trang nhã. Trong lần trở lại này trên iPhone 14, sắc Tím đã được tối ưu nhẹ nhàng hơn, thanh lịch hơn, cao cấp hơn, còn biến thể Xanh dương cũng trở nên nền nã và mang lại cảm nhận tinh tế trong kết cấu thẩm mỹ.", "Khoác lên kiểu dáng đặc trưng của dòng điện thoại iPhone, phiên bản iPhone 14 được cải tiến mạnh ở thời lượng pin và tập trung nâng cấp mạnh về camera nhằm đem đến những thước phim, khuôn hình đầy chất nghệ thuật và đạt chuẩn điện ảnh.", 40, 5, "APPLE", "12GB");
            Product product7 = new Product(7L, "iPhone 16 Plus", 24790000, "product7.png", "Được trang bị camera Fusion 48MP hai trong một, iPhone 16 Plus có thể giúp bạn bắt được những khoảnh khắc đắt giá với độ phân giải siêu cao, hoặc thu phóng linh hoạt nhờ camera Telephoto chất lượng quang học 2x. Cấu trúc camera trên mặt lưng cũng được thiết kế tinh tế và gọn gàng hơn, đem lại điểm nhấn về thẩm mỹ cho chiếc điện thoại.", "Apple cho biết hãng đã tái thiết kế cấu trúc bên trong thân máy iPhone 16 Plus để tạo nên không gian lớn hơn cho viên pin. Khi kết hợp với năng lực vận hành tiết kiệm điện của chip A18, sản phẩm cung cấp thời gian sử dụng hết sức lâu dài, bất chấp sự xuất hiện của nhiều tính năng mới.", 10, 4, "APPLE", "16GB");
            Product product8 = new Product(8L, "OPPO A3 Pro", 6090000, "product8.jpg", "Chú trọng vào độ bền, OPPO A3 được trang bị khả năng kháng bụi và kháng nước đạt chuẩn IP54, một tính năng quan trọng giúp thiết bị hoạt động ổn định trong nhiều điều kiện môi trường khác nhau. Chuẩn IP54 là một tiêu chuẩn quốc tế, đảm bảo rằng OPPO A3 có thể chống lại hầu hết các loại bụi xâm nhập vào bên trong, giữ cho các linh kiện luôn được bảo vệ và hoạt động trơn tru. Không chỉ kháng bụi, OPPO A3 còn có khả năng chống phun nước từ mọi hướng. Tính năng này giúp bảo vệ điện thoại khỏi những tình huống như bị bắn nước, mưa nhẹ, hoặc vô tình đổ nước lên thiết bị. Đây là một trong những yếu tố quan trọng khiến OPPO A3 trở thành một lựa chọn lý tưởng cho những ai tìm kiếm một chiếc smartphone bền bỉ, sử dụng dài lâu.", "OPPO A3 sở hữu giá bán hợp lý với thiết kế hiện đại cùng hiệu suất vượt trội bởi chipset mượt mà Snapdragon 6s 4G Gen 1, pin 5.100mAh, hỗ trợ sạc nhanh 45W và bộ nhớ 256GB, rất phù hợp dành cho người dùng trẻ năng động.", 18, 3, "OPPO", "6GB");

            productRepository.saveAll(List.of(product1, product2, product3, product4, product5,product6, product7, product8));

            System.out.println("Data is already initialized");
        }
    }
}
