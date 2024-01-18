package ra.service;

import ra.model.Singer;

import java.util.Scanner;

public class SingerService {
    public static Singer[] singers = new Singer[0];

    public void addNewSinger(Scanner sc) {
        System.out.println("Nhập số lượng sách cần thêm");
        int n = Integer.parseInt(sc.nextLine());
        // Taọ ra một mảng mới
        Singer[] newSingers = new Singer[singers.length + n];
        // Dùng vòng lặp để copy giá trị cũ
        for (int i = 0; i < singers.length; i++) {
            newSingers[i] = singers[i];
        }
        for (int i = 0; i < n; i++) {
            Singer newSinger = new Singer();
            newSinger.inputData();
            newSingers[singers.length + i] = newSinger;
        }
        singers = newSingers;
    }

    public void showAllSinger() {
        if (singers.length == 0) {
            System.err.println("Danh sách sách rỗng");
        } else {
            System.out.println("Danh sách ca sĩ");
            for (int i = 0; i < singers.length; i++) {
                System.out.println(singers[i].Display());
            }
        }
    }

    public void updateSinger(Scanner sc) {
        System.out.println("Hãy nhập id ca sĩ cần sửa");
        int id = sc.nextInt();
        int indexById = findIndexById(id);
        if (indexById != -1) {
            // Cho nhập thông tin mới
            System.out.println("Thông tin ca sĩ cũ");
            System.out.println(singers[indexById]);
            singers[indexById].inputData();
            System.out.println("Cập nhật thành công");
            sc.nextLine();
        } else {
            System.err.println("không tìm thấy id ca sĩ");
        }
    }

    public void deleteSinger(Scanner sc) {
        System.out.println("Hãy nhập id sách cần xoá");
        int id = sc.nextInt();
        int indexById = findIndexById(id);
        if (indexById != -1) {
            Singer[] newSinger = new Singer[singers.length - 1];
            for (int i = 0; i < singers.length; i++) {
                if (i < indexById) {
                    newSinger[i] = singers[i];
                } else if (i > indexById) {
                    newSinger[i - 1] = singers[i];
                }
            }
            singers = newSinger;
            System.out.println("Xoá thành công");
            sc.nextLine();
        } else {
            System.err.println("không tìm thấy id sách");
        }
    }


    public int findIndexById(int id) {
        for (int i = 0; i < singers.length; i++) {
            if (singers[i].getSingerId() == id) {
                return i;
            }
        }
        return -1;
    }
}
