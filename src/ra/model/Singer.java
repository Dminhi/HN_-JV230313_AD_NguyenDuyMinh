package ra.model;

import java.util.Scanner;

public class Singer {
    private static int startId=1;
    private int singerId;
    private String singerName;

    private int age;

    private String nationality;

    private boolean gender;


    private String genre;

    public Singer() {
        this.singerId = startId++;
    }

    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this();
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
//        if (singerId==0){
//        System.out.println("Hãy nhập mã ca sĩ");
//        this.singerId = Integer.parseInt(sc.nextLine());}
        System.out.println("Hãy nhập tên ca sĩ");
        this.singerName = sc.nextLine();
        System.out.println("Hãy nhập tuổi ca sĩ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập quốc tịch ca sĩ");
        this.nationality = sc.nextLine();
        System.out.println("Hãy nhập giới tính ca sĩ");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Hãy nhập thể loại ca sĩ");
        this.genre = sc.nextLine();
    }


    public String Display() {
        return "Singer{" +
                "singerId=" + singerId +
                ", singerName='" + singerName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singerId=" + singerId +
                ", singerName='" + singerName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                ", genre='" + genre + '\'' +
                '}';
    }
}
