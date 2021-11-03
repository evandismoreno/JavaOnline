public class Operadores {
    public static void main(String[] args){
        //int numero1 = 3;
        //int numero2 = 2;
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        //System.out.println(numero1+numero2);
        //System.out.println("A soma é " + soma);
        System.out.println("A soma é igual a: " + (numero1+numero2));
        System.out.println("A multiplicacao é igual a: " + (numero1*numero2));
        System.out.println("A divisao de 20 por 10 é igual a: " + (numero2/numero1));
        System.out.println("A divisao de 10 por 20 é igual a: " + (numero1/numero2));
        //essa ultima divisao da zero porque o tipo int é inteiro e não guarda
        //o valor apos a virgula ==> 10 / 20 = 0,5 ==> resiltado 0.
        System.out.println("A subtração de 10 por 20 é igual a: " + (numero1-numero2));
        //operador % para saber o resto de uma divisão.
        int resto = 20%2;
        System.out.println("O resto da divisão é: " + (resto));
        //ou
        System.out.println("O resto da divisão é: " + (20%2));

    }

}
