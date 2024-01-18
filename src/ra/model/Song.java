package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song {

    private String songId;
    private String songName;
    private String descriptions;
    private String singer;
    private String songWriter;
    private Date createdDate;
    private Boolean songStatus;

    public Song() {
    }

    public Song(String songId, String songName, String descriptions, String singer, String songWriter, Date createdDate, Boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getSongStatus() {
        return songStatus;
    }

    public void setSongStatus(Boolean songStatus) {
        this.songStatus = songStatus;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập mã bài hát");
        this.songId = sc.nextLine();
        System.out.println("Hãy nhập tên bài hát");
        this.songName = sc.nextLine();
        System.out.println("Hãy nhập mô tả bài hát");
        this.descriptions = sc.nextLine();
        System.out.println("Hãy nhập tên ca sĩ hát");
        this.singer = sc.nextLine();
        System.out.println("Hãy nhập tên người sáng tác bài hát");
        this.songWriter = sc.nextLine();
        System.out.println("Hãy nhập trạng thái");
        this.songStatus = Boolean.valueOf(sc.nextLine());
    }


    public String display() {
        return "Song{" +
                "songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", singer='" + singer + '\'' +
                ", songWriter='" + songWriter + '\'' +
                ", createdDate=" + createdDate +
                ", songStatus=" + songStatus +
                '}';
    }
}
