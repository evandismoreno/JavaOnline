public class controledefluxo1 {
    public static void main(String[] args) {

        if (true) {
            System.out.println("entrou no if");
        }

        if (false) {
            // com false nao vai dar display porque não entrou no if
            System.out.println("entrou no if true");
        }

        //int idade = 15;
        int idade = 18;
        String categoria;
        float salario = 2000;

        //if (idade > 10) {
        if (idade < 10) {
            System.out.println("entrou no clube");
        }
        if (idade == 20) {
            System.out.println("idade correta");
        }

        if (idade >= 18) {
            System.out.println("pode entrar no clube");
        } else {
            System.out.println("não pode entrar no clube");
        }

        // se idade < 15 a categoria é infantil
        // se idade >= 15 && < 18 a categoria é juvenil
        // se idade >= 18 a categoria é adulto

        if (idade < 15) {
            System.out.println("categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        } else {
            System.out.println("categoria adulto");
        }

        if (idade < 15) {
            categoria = "categ infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "categ juvenil";
        } else {
            categoria = "categ adulto";
        }
        System.out.println(categoria);

    }
}
