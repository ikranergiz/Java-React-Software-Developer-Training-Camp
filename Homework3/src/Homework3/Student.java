package Homework3;

public class Student extends User{

    private int oran;

    public Student(){
        super();//User default constructorını çağırdım
        this.oran = 0; //tamamlama oranı 0 olsun
        System.out.println("Student default constructor");

    }

    public int getOran() {
        return oran;
    }

    public void setOran(int oran) {
        this.oran = oran;
    }
}
