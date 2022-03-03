public class Casteo {
  public static void main(String[] args) {
    int variableDeTipoInt = 10;
    // conversion automatica por ser 2 tipos compatibles
    float variableDetipoFloat = variableDeTipoInt;
    // short variableDeTipoShort = variableDeTipoInt; tipos incompatibles y es posible que perdamos información en esta conversión
    double variableDeTipoDouble = variableDetipoFloat;

    // forzar la conversión cuando no se realiza de forma automatica

    double otraVariableDeTipoDouble = 2.76;
    // tipos no compatibles por lo que vamos a castear el valor de la derecha
    int otraVariableDeTipoInt = (int) otraVariableDeTipoDouble;
    System.out.println("El resultado del casteo es " + otraVariableDeTipoInt);

    // byte y short se promocionan a tipo int
    byte variable1 = 5; // probar con valores como 100
    byte variable2 = 10; // probar con valores como 50

    // la suma de 100 y 50 lo que hace es que se desborda no lo soporta un short

    /*
    * Con esto debemos tener cuidado cuando el casteo se hace con tipos incompatibles. debemos fijarnos en realizar bien
    * la conversion y darnos cuenta si el la variable que reciba el valor soporta el valor realizado en el casteo
    * */
    // cuando se suman estas dos se produce un int

    byte suma = (byte)(variable1 + variable2);
    System.out.println("El resultado de casteo a byte es: " + suma);

  }
}
