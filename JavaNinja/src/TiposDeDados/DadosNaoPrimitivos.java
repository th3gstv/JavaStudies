package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         * 1) Dados Primitivos
                São tipos de dados que de maneira geral não recebem métodos de maneira padrão

         * 2) Dados Não Primitivos: string, array, class, enum
                São tipos de dados em que se pode colocar métodos
                para fazer alterações na variável sem que seja mudado seu escopo
         */
        String nome = "Sasuke Uchiha";
        String nomeA = nome.toUpperCase();
        System.out.println(nomeA);

        String aldeia = "Konohagakure no Sato";
        String aldeiaA = aldeia.toLowerCase();
        System.out.println(aldeiaA);
    }
}
