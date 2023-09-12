package AppTriangle;

public class MedidasTriangulo {
    
    double lado;

    public MedidasTriangulo(double lado) {

        this.lado = lado;
    }
    double CalcularAltura(){
        return (lado*Math.sqrt(3))/2;

    }

    double CalcularArea(){
        return (lado*((lado*Math.sqrt(3))/2))/2;

    }
    double CalcularPerimetro(){
        return lado*3;

    }

}
