public class OperadoresDeComparacao {
    public static void main(String[] args) {
        //boolean dezMairoQueVinte = 10 > 20;
        //System.out.println("Dez maior que vinte: " + (dezMairoQueVinte));
        //false
        boolean dezMairoQueVinte = 10 >= 20;
        System.out.println("Dez maior ou igual a vinte: " + (dezMairoQueVinte));
        //false
        boolean dezMenorQueVinte = 10 <= 20;
        System.out.println("Dez menor ou igual a vinte: " + (dezMenorQueVinte));
        //true
        System.out.println("Cinco igual a cinco: " + (5==5));
        //true
        System.out.println("Cinco diferente a cinco: " + (5!=5));
        //false
    }

}
