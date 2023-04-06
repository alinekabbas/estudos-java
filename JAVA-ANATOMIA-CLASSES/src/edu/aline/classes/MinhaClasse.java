package edu.aline.classes;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Aline";
        String ultimoNome = "Kabbas";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(ultimoNome);
    }
}
