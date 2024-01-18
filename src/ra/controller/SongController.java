package ra.controller;

import ra.service.SongService;

import java.util.Scanner;

public class SongController {
    public static SongService song = new SongService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*********************SONG-MANAGEMENT**********************");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3.Thay đổi thông tin bài hát theo mã id ");
            System.out.println("4.Xóa bài hát theo mã id ");
            System.out.println("5. Thoát");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:// Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới
                    song.addNewSong(sc);
                    break;
                case 2: // Hiển thị danh sách tất cả bài đã lưu trữ
                    song.showAllSong();
                    break;
                case 3: // Thay đổi thông tin bài hát theo mã id
                    song.updateSong(sc);
                    break;
                case 4: // Xóa bài hát theo mã id
                    song.deleteSong(sc);
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
