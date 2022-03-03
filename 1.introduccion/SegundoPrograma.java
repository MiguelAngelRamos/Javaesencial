public class SegundoPrograma {
    public static void main(String[] args) {
        int variable1 = 5;
        int variable2 = 10;
        int main = 20;
        // main no es una palabra reservada
        System.out.println(main);
        // para comprobar si un caracter es válido para la primera letra del nombre de una variable
        System.out.println(Character.isJavaIdentifierStart('@'));
        // para comprobar si el caracter es válido para el nombre de la variable
        System.out.println(Character.isJavaIdentifierPart('_'));
        if(variable1 > variable2) {
            System.out.println("variable 1 es mayor que variable 2");
        } else {
            System.out.println("variable2 es mayor que variable 1");
        }
    }
}
