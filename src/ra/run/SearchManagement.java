package ra.run;

import ra.service.SongService;

import java.util.Scanner;


public class SearchManagement {
    public static  SongService songService = new SongService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*********************SEARCH-MANAGEMENT**********************");
            System.out.println("1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại");
            System.out.println("2.Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần ");
            System.out.println("4.Hiển thị 10 bài hát được đăng mới nhất ");
            System.out.println("5. Thoát");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:// Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại
                    songService.findSongbySongName();
                    break;
                case 2: // Tìm kiếm ca sĩ theo tên hoặc thể loại
                    break;
                case 3: // Hiển thị danh sách bài hát theo thứ tự tên tăng dần
                    break;
                case 4: // Hiển thị 10 bài hát được đăng mới nhất
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

