import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tak prezetuja sie nasze dwa kolory:");
        RGB rgb1 = new RGB(255, 0, 0);
        RGB rgb2 = new RGB(0, 255, 0);

        RGBController controller = new RGBController();
        controller.displayColor(rgb1);
        controller.displayColor(rgb2);

        System.out.println("Tak prezentuje sie zmieszany kolor:");
        RGB mixedColor = controller.mixColors(rgb1, rgb2);
        controller.displayColor(mixedColor);

        Uni uni = new Uni();
        Student student1 = new Student("12345", "Jan", "Kowalski", 1);
        uni.dodajStudenta(student1, Arrays.asList(3.0, 4.0, 5.0));
        student1.printStudentInfo();
        System.out.println("Średnia ocen studenta: " + uni.obliczSrednia("12345"));
        Student student2 = new Student("54321", "Piotr", "Piotrowski", 2);
        uni.dodajStudenta(student2, Arrays.asList(5.0, 5.0, 5.0));
        student2.printStudentInfo();


        System.out.println("Średnia ocen studenta: " + uni.obliczSrednia("54321"));
        System.out.println("Średnia ocen wszystkich studentów: " + uni.obliczSredniaAll());

    }
}