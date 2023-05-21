import java.util.Scanner;

public class ecuacionsegundogrado {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Resolver una ecuación de segundo grado (ax^2 + bx + c = 0)\n"
        + "Introduce los datos, cuanto vale \"a\": ");
    double a = Double.parseDouble(scan.next());
    
    System.out.print("Ahora introduce el valor de \"b\": ");
    double b = Double.parseDouble(scan.next());
    
    System.out.print("Por último, cuanto vale \"c\": ");
    double c = Double.parseDouble(scan.next());
    
    double raiz = (b * b) - 4 * a * c;
    
    if (raiz > 0) {
      double primerResultado = (-b + Math.sqrt(raiz)) / (2 * a);
      double segundoResultado = (-b - Math.sqrt(raiz)) / (2 * a);
      System.out.println("x1 = " + primerResultado + "\nx2 = " + segundoResultado);
    }
    
    if (raiz == 0) {
      double resultado = -b / (2 * a);
      System.out.println("x = " + resultado);
    }
    
    if (raiz < 0) {
      System.out.println("No existe solución.");
    }
    
  }

}
