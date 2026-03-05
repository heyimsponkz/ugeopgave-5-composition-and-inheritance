package Del1;

public class Window {
    int widthCm;
    int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    public int getAreaCm2() {
        return widthCm * heightCm;
    }

    public String toString() {
        return "Window " + widthCm + "×" + heightCm + " cm (area: " + getAreaCm2() + " cm²)";
    }
}
