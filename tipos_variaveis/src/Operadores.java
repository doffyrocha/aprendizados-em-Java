public class Operadores{
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);


        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        numero = -numero;

        System.out.println(-numero);
        System.out.println(++numero);
        numero++;
        System.out.println(numero);


        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;
        String resultado ="";
        if(a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);
        
        String result = a==b ? "Verdadeiro" : "Falso";
        System.out.println(result);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1<numero2){
            System.out.println(" A nossa condição é verdadeira");
        }
        System.out.println("NumeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior a numeroDois?" + simNao);

        simNao = numero1 < numero2;

        System.out.println("NumeroUm é menor a numeroDois?" + simNao);




        String nomeUm = "Marcio";
        String nomeDois = "Marcio";

        System.out.println(nomeUm == nomeDois);



        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("as duas condicoes sao verdadeiras");
        }

        System.out.println("Fim!");

            if(condicao1 || condicao2){
               System.out.println("uma das condicoes sao verdadeiras");
            }

        System.out.println("Fim!");







    }
}