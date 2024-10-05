package NívelIntermediário;

public class Uchiha extends Ninja{
    public void SharinganAtivado(){
        String NivelSharingan = (idade < 12) ? "Meu nome é " + nome + " e eu ativei o Sharingan Nvl. 1" :
            (idade < 15) ? "Meu nome é " + nome + " e eu ativei o Sharingan Nvl. 2": "Meu nome é " + nome + " e eu ativei o Sharingan Nvl. 3";
        System.out.println(NivelSharingan);
    }
}