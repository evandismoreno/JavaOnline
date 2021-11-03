public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // operadores de atribuição são: =, -=, +=, *=, /=, %=
        int salario = 1800;
        System.out.println(salario);
        // para somar 1000 ao slario:
        //salario = salario + 1000;
        //ou
        salario += 1000;
        System.out.println(salario);
        // diminuir 1000
        salario -= 1000;
        System.out.println(salario);
        // multiplicar 1000
        salario *= 1000;
        System.out.println(salario);
        // dividir 1000
        salario /= 1000;
        System.out.println(salario);
        salario /= 3;
        System.out.println(salario);
        // somar 10% ao ultimo resultado
        salario = salario += (salario * 0.1);
        System.out.println(salario);


    }
}
