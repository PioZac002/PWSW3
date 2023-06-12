public class Main {
    public static void main(String[] args) {
        System.out.println("Tak prezetuja sie nasze dwa kolory:");
        RGB rgb1 = new RGB(255, 0, 0); // Red
        RGB rgb2 = new RGB(0, 255, 0); // Green

        RGBController controller = new RGBController();
        controller.displayColor(rgb1);
        controller.displayColor(rgb2);

        System.out.println("Tak prezentuje sie zmieszany kolor:");
        RGB mixedColor = controller.mixColors(rgb1, rgb2);
        controller.displayColor(mixedColor);


    }
}