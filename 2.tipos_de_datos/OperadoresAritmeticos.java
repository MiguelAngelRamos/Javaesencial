public class OperadoresAritmeticos {
  public static void main(String[] args) {

    int numeroDos = 2;
    int numeroTres = 3;

    int resultadoSuma = numeroDos + numeroTres;
    System.out.println("El Resultado de sumar " + numeroDos + " y " + numeroTres + " es: " + resultadoSuma);

    System.out.println("Esto es un String " + "y lo concateno con este otro");

    int resultadoResta = numeroTres - numeroDos;

    int numeroDosConCambioDeSigno = -numeroDos;
    System.out.println("Si aplicamos el operador resta a numeroDos obtenemos " + numeroDosConCambioDeSigno);

    double resultadoMultiplicacion = numeroTres * 3.5;

    // int resultadoDivision = numeroDos / numeroTres;
    /* para realizar esta operación se debe convertir cualquiera de los dos valores "numeroDos" o "numeroTres" en double
    *  y ademas almacenarla en una variable de tipo double como lo es "double resultadoDivision"
    * */
    double resultadoDivision = (double) numeroDos/  numeroTres;
    System.out.println("resultadoDivision contiene " + resultadoDivision);

    // modulo
    int resultadoModulo = numeroTres % numeroDos;
    System.out.println("El resto de divivir 3 entre 2 es " + resultadoModulo);
  }
}
