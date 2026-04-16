package NivelIntermediario;

public class Main {
    public static void main(String[] args) {


        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String nomeDaMissaoo1 = "Matar o Orochimaru";
        char rankingDaMissao1 = 'S';
        String statusDaMissao1 = "Em andamento";


        // Verificar nivel da missão e idade do ninja
        if (idadeNinja1 < 15 ){
            if (rankingDaMissao1 == 'C' || rankingDaMissao1 == 'D') {
                statusDaMissao1 = "Concluída";

            } else {
                statusDaMissao1 = "Não concluida";
            }
        }

        System.out.println("Ninja 1: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão: " + nomeDaMissaoo1);
        System.out.println("Ranking: " + rankingDaMissao1);
        System.out.println("Status da Missão: " + statusDaMissao1);

        System.out.println("-----------------------------");



        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 18;
        String nomeDaMissao2 = "Prender bandido";
        char rankingDaMissao2 = 'C';
        String statusDaMissao2 = "Não concluída";


        if (idadeNinja2 < 15 ){
            if (rankingDaMissao2 == 'C' || rankingDaMissao2 == 'D') {
                statusDaMissao2 = "Concluída";
            } else {
                statusDaMissao2 = "Não concluida";
            }
        } else {
            statusDaMissao2 = "Concluída";
        }

        System.out.println("Ninja 2: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão: " + nomeDaMissao2);
        System.out.println("Ranking: " + rankingDaMissao2);
        System.out.println("Status da Missão: " + statusDaMissao2);

        System.out.println("-----------------------------");


        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 17;
        String nomeDaMissao3 = "Aprender Medicina";
        char rankingDaMissao3 = 'B';
        String statusDaMissao3 = "Concluido";

        if (idadeNinja3 < 15 ){
            if (rankingDaMissao3 == 'C' || rankingDaMissao3 == 'D') {
                statusDaMissao3 = "Concluída";
            } else {
                statusDaMissao3 = "Não concluida";
            }
        } else {
            statusDaMissao3 = "Concluída";
        }


        System.out.println("Ninja 3: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão: " + nomeDaMissao3);
        System.out.println("Ranking: " + rankingDaMissao3);
        System.out.println("Status da Missão: " + statusDaMissao3);









    }

}
