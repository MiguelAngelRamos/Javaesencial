public class TiposDeDatosPrimitivos {
  public static void main(String[] args) {
    byte elMenorBute = Byte.MIN_VALUE;
    byte elMayorByte = Byte.MAX_VALUE;

    char letra = 'a' + 1;
    System.out.println(letra);
    System.out.println("El tipo byte es un número entero de 8 bits" + " bits con signo. Está comprendido entre: " + elMayorByte + " y" + elMayorByte);
    System.out.println("El tipo short es un número entero de 16 bits con signo. Está comprendido entre " + Short.MIN_VALUE + " y " + Short.MAX_VALUE);

    }
}
