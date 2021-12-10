package ExercicioQuadrado;

public class Quadrado {
    //quadrado 1
    int lado1, lado2, area1;

    //quadrado 2
    int ladoA1, ladoA2, area2;

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLadoA1(int ladoA1) {
        this.ladoA1 = ladoA1;
    }

    public void setLadoA2(int ladoA2) {
        this.ladoA2 = ladoA2;
    }

    public int getArea1() {
        return area1 = lado1 * lado2;
    }

    public int getArea2() {
        return area2 = ladoA1 * ladoA2;
    }

    public int getDiferencaArea() {
        int diferencaArea = getArea1() - getArea2();
        return diferencaArea;
    }
}
