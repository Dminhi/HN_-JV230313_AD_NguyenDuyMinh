package ra.run;

import ra.controller.SingerController;
import ra.controller.SongController;

import java.util.Scanner;

public class MusicManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*********************MUSIC-MANAGEMENT**********************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");
            System.out.println("Enter your choice");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1: // Quản lý ca sĩ
                    SingerController.main(args);
                    break;
                case 2: // Quản lý bài hát
                    SongController.main(args);
                    break;
                case 3: // Tìm kiếm bài hát
                    SearchManagement.main(args);
                    break;
                case 4: // Thoát
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter your choice");
            }
        }
    }
}
