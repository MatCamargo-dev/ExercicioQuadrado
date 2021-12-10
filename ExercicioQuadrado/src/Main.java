import ExercicioQuadrado.Quadrado;

public class Main {
    public static void main(String[] args) {
        ExercicioQuadrado.Quadrado quadrado = new Quadrado();
        quadrado.setLado1(5);
        quadrado.setLado2(8);

        quadrado.setLadoA1(4);
        quadrado.setLadoA2(5);

        System.out.println("Area quadro 1: " + quadrado.getArea1());

        System.out.println("Area quadro 2: " + quadrado.getArea2());

        System.out.println("A diferenca de area e: " + quadrado.getDiferencaArea());
    }
}
