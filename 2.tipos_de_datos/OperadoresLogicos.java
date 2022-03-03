public class OperadoresLogicos {
  public static void main(String[] args) {
    // concatenar sentencias cuyo resultado es un booleano

    // El "AND" los 2 emperados deben ser true para que sea true
    System.out.println("False & False es " + (false & false));
    System.out.println("True & False es " + (true & false ));
    System.out.println("False & True es " + (false & true));
    System.out.println("True & True es " + (true & true));

    // && evalua el primero es mas eficiente por que si el primero es falso no hay necesidad de evaluar el segundo
    // operador and de circuito corto
    System.out.println("False && False es " + (false && false));
    System.out.println("True && False es " + (true && false ));
    System.out.println("False && True es " + (false && true));
    System.out.println("True && True es " + (true && true));

    // El "OR" es suficiente uno de los 2 operandos sea true para que el resultado sea True

    System.out.println("False | False es " + (false | false));
    System.out.println("True | False es " + (true | false ));
    System.out.println("False | True es " + (false | true));
    System.out.println("True | True es " + (true | true));

    // operado de circuito corto evalua el primero y es verdadero no evalua el segundo
    System.out.println("False || False es " + (false || false));
    System.out.println("True || False es " + (true || false ));
    System.out.println("False || True es " + (false || true));
    System.out.println("True || True es " + (true || true));

    // x or (or exclusivo) el resultado es true solo si uno de los operandos es true
    System.out.println("False ^ False es " + (false  ^ false));
    System.out.println("True  ^ False es " + (true  ^ false ));
    System.out.println("False  ^ True es " + (false  ^ true));
    System.out.println("True  ^ True es " + (true  ^ true));

    // El operador NOT
    System.out.println("!False es " + !false);
    System.out.println("!True es " + !true);





  }
}
