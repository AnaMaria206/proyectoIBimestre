package cap10Deitel;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(3),
            new Cuadrado(4),
            new Triangulo(5, 2),
            new Esfera(3),
            new Cubo(2),
            new Tetraedro(3)
        };

        for (Figura f : figuras) {
            System.out.println(f.descripcion());
            if (f instanceof FiguraBidimensional) {
                System.out.println("Área: " + ((FiguraBidimensional) f).obtenerArea());
            } else if (f instanceof FiguraTridimensional) {
                System.out.println("Área superficial: " + ((FiguraTridimensional) f).obtenerArea());
                System.out.println("Volumen: " + ((FiguraTridimensional) f).obtenerVolumen());
            }
          
        }
    }
}
