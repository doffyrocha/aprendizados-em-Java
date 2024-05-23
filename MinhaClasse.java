package edu.douglas.segundasemana;
public class MinhaClasse {

public static void main(String [] args){
    //String meuNome = "Douglas";
    //int anoFrabicacao = 2024;
    //boolean verdadeira = false;
    //anoFrabicacao = 2021;

    String primeiroNome = "Marcio";
    String segundoNome = "Douglas";

    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
    System.out.println(nomeCompleto);

}

public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Resultado do Metodo " +primeiroNome.concat(" ").concat(segundoNome);


}
}
