public class AlcanceDelasVariables {
  public static void main(String[] args) {
    int dias = 0;
    while(dias <30) {
      dias = dias + 1;
      int semanas = dias / 7;
      System.out.println("Han pasado " +  dias  + " días lo que supone " +  semanas + " semanas");
      /* En java no podemos declarar una variable que existe un bloque superior en un bloque interior*/
      // int dias = 1;
    }
    // int años = semanas / 52; no podemos acceder a la variable semana que existe en while fuera de el
    int años = dias / 365;
  }
}
