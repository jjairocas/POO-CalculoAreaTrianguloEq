package AppTriangle;

import java.util.*;

public class LadoTrianguloEq {
    public static void main(String[] args) {

        AppTriangulo form=new AppTriangulo();
        form.setVisible(true);

    }
}

/*Calculo de las operaciones sin utilizar la Clase
Medidas de un Triangulo
public static void main(String[] args) {

        Scanner input=new Scanner((System.in));
        System.out.println("Ingrese el lado del triangulo: ");
        double a= input.nextDouble();
        double h=(a*Math.sqrt(3))/2;

        double Atriangulo=(a*h)/2;
        double PerimetroTriangulo=(a*3);

        System.out.println("El perimetro del triangulo es: "+PerimetroTriangulo);
        System.out.println("La altura del triangulo es: "+h);
        System.out.println("El area del triangulo es: "+Atriangulo);
    }*/