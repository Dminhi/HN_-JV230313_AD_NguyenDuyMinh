package ra.controller;

import ra.model.Singer;
import ra.service.SingerService;

import java.util.Scanner;

public class SingerController {
    public static SingerService singer = new SingerService();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*********************SINGER-MANAGEMENT**********************");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3.Thay đổi thông tin ca sĩ theo mã id ");
            System.out.println("4.Xóa ca sĩ theo mã id ");
            System.out.println("5. Thoát");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:// Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới
                    singer.addNewSinger(sc);
                    break;
                case 2: // Hiển thị danh sách tất cả ca sĩ đã lưu trữ
                    singer.showAllSinger();
                    break;
                case 3: // Thay đổi thông tin ca sĩ theo mã id
                    singer.updateSinger(sc);
                    break;
                case 4: // Xóa ca sĩ theo mã id
                    singer.deleteSinger(sc);
                    break;
                case 5: // Thoát
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter your choice");
            }
        }
    }
}
