
public class Estudiante {
    private String Nombre, CI;
    private double p1, p2, p3;

    public Estudiante(String Nombre, String CI, double p1, double p2, double p3) {
        this.Nombre = Nombre;
        this.CI = CI;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }
}
