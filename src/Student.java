import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nr_indeksu;
    private String imie;
    private String nazwisko;
    private int rok_st;
    private List<Double> oceny = new ArrayList<>();

    public Student(String nr_indeksu, String imie, String nazwisko, int rok_st) {
        this.nr_indeksu = nr_indeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok_st = rok_st;
    }

    public String getNr_indeksu() {
        return nr_indeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRok_st() {
        return rok_st;
    }

    public List<Double> getOceny() {
        return oceny;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setRok_st(int rok_st) {
        this.rok_st = rok_st;
    }

    public void addGrade(double grade) {
        oceny.add(grade);
    }

    public void printStudentInfo() {
        System.out.println("Nr indeksu: " + nr_indeksu);
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Rok studiów: " + rok_st);
        System.out.println("Oceny: " + oceny);
    }
}