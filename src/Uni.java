import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Uni {
    private List<Double> ListaDopuszczalnychOcen = Arrays.asList(2.0, 3.0, 3.5, 4.0, 4.5, 5.0);
    private List<Student> ListaStudentow = new ArrayList<>();
    public void dodajStudenta(Student student, List<Double> grades) {
        for (double grade : grades) {
            if (!ListaDopuszczalnychOcen.contains(grade)) {
                throw new IllegalArgumentException("Niepoprawna ocena: " + grade);
            }
            student.addGrade(grade);
        }
        ListaStudentow.add(student);
    }
    public void usunStudenta(String nr_indeksu) {
        ListaStudentow.removeIf(student -> student.getNr_indeksu().equals(nr_indeksu));
    }
    public double obliczSrednia(String nr_indeksu) {
        for (Student student : ListaStudentow) {
            if (student.getNr_indeksu().equals(nr_indeksu)) {
                double sum = 0.0;
                for (double grade : student.getOceny()) {
                    sum += grade;
                }
                return sum / student.getOceny().size();
            }
        }
        throw new IllegalArgumentException("Nie ma studenta z numerem indeksu: " + nr_indeksu);
    }
    public double obliczSredniaAll() {
        double sum = 0.0;
        int count = 0;
        for (Student student : ListaStudentow) {
            for (double grade : student.getOceny()) {
                sum += grade;
                count++;
            }
        }
        return sum / count;
    }
}