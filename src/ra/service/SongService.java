package ra.service;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class SongService {
    public static Song[] songs = new Song[0];

    public void addNewSong(Scanner sc) {
        System.out.println("Nhập số lượng bài hát cần thêm");
        int n = Integer.parseInt(sc.nextLine());
        // Taọ ra một mảng mới
        Song[] newSongs = new Song[songs.length + n];
        // Dùng vòng lặp để copy giá trị cũ
        for (int i = 0; i < songs.length; i++) {
            newSongs[i] = songs[i];
        }
        for (int i = 0; i < n; i++) {
            Song newSong = new Song();
            newSong.inputData();
            newSongs[songs.length + i] = newSong;
        }
        songs = newSongs;
    }

    public void showAllSong() {
        if (songs.length == 0) {
            System.err.println("Danh sách bài hát rỗng");
        } else {
            System.out.println("Danh sách bài hát");
            for (int i = 0; i < songs.length; i++) {
                System.out.println(songs[i].display());
            }
        }
    }

    public void updateSong(Scanner sc) {
        System.out.println("Hãy nhập id bài hát cần sửa");
        int id = sc.nextInt();
        int indexById = findIndexById(id);
        if (indexById != -1) {
            // Cho nhập thông tin mới
            System.out.println("Thông tin bài hát cũ");
            System.out.println(songs[indexById]);
            songs[indexById].inputData();
            System.out.println("Cập nhật thành công");
        } else {
            System.err.println("không tìm thấy id bài hát");
        }
    }

    public void findSongbySongName(){
        System.out.println("Hãy nhập tên bài hát cần tìm");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        for (int i = 0; i < songs.length; i++) {
            if(songs[i].getSongName().contains(bookName)){
                System.out.println("Bài hát được tìm thấy là : ");
                System.out.println(songs[i].getSongName());
            }
            else {
                System.out.println("Không tìm thấy bài hát");
            }
        }
    }
    public void deleteSong(Scanner sc) {
        System.out.println("Hãy nhập id baì hát cần xoá");
        int id = sc.nextInt();
        int indexById = findIndexById(id);
        if (indexById != -1) {
            Song[]newSong=new Song[songs.length-1];
            for (int i = 0; i < songs.length; i++) {
                if(i<indexById){
                    newSong[i]=songs[i];
                }
                else if(i>indexById){
                    newSong[i-1]=songs[i];
                }
            }
            songs=newSong;
            System.out.println("Xoá thành công");
        } else {
            System.err.println("không tìm thấy id bài hát");
        }
    }
    public int findIndexById(int id) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getSongId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
