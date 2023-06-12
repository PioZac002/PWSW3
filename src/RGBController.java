public class RGBController {

    // Metoda inicjująca zestaw składowych barw dla danego obiektu
    public void initializeColor(RGB rgb, int R_value, int G_value, int B_value) {
        rgb.setR_value(R_value);
        rgb.setG_value(G_value);
        rgb.setB_value(B_value);
    }

    // Metoda wyświetlająca składowe barw w formacie [R_value, G_value, B_value]
    public void displayColor(RGB rgb) {
        System.out.printf("[%d, %d, %d]\n", rgb.getR_value(), rgb.getG_value(), rgb.getB_value());
    }

    // Metoda mieszającą kolory zgodnie z zasadami RGB przyjmującą jako argumenty dwa obiekty klasy RGB.
    // W przypadku mieszania kolorów, zwykle bierzemy średnią składowych R, G, B.
    public RGB mixColors(RGB rgb1, RGB rgb2) {
        int R_value = (rgb1.getR_value() + rgb2.getR_value()) / 2;
        int G_value = (rgb1.getG_value() + rgb2.getG_value()) / 2;
        int B_value = (rgb1.getB_value() + rgb2.getB_value()) / 2;

        return new RGB(R_value, G_value, B_value);
    }
}