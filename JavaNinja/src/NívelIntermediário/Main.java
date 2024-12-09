package NívelIntermediário;

public class Main {
    public static void main(String[] args) {
        //Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konohagakure";
        Naruto.idade = 17;
        Naruto.ModeSennin();
        Naruto.habilidadeEspecial();

        //Objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Konohagakure";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();
        Sasuke.habilidadeEspecial();

        //Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konohagakure";
        Sakura.idade = 19;
        Sakura.ativarCura();

        //Objeto 4
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Konohagakure";
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();

        //Objeto 5
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Konohagakure";
        Boruto.idade = 9;
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();

        //Objeto 6
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;

        Missoes missao1 = new Missoes("Resgatar os cidadãos", RankDeMissoes.B);
        missao1.exibirDetalhes();
        Hashirama.sabedoriaHokage();

        //Objeto 7

    }
}
