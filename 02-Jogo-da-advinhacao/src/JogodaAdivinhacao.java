public class JogodaAdivinhacao {
    public void iniciarjogo() {
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Jogador j3 = new Jogador();

        boolean j1EstaCerto = false;
        boolean j2EstaCerto = false;
        boolean j3EstaCerto = false;
        boolean vencedor = false;

        System.out.println("Estou pensando em um número de 0 até 9....Advinhem!!");

        int numeroAlvo = (int) (Math.random() * 10);

        while (!vencedor) {
            j1.adivinhar();
            j2.adivinhar();
            j3.adivinhar();

            System.out.println("Os palpites foram: ");
            System.out.println("Jogador 1: " + j1.palpite);
            System.out.println("Jogador 2: " + j2.palpite);
            System.out.println("Jogador 3: " + j3.palpite);


            if (j1.palpite == numeroAlvo){
                j1EstaCerto = true;
            }

            if (j2.palpite == numeroAlvo){
                j2EstaCerto = true;
            }

            if (j3.palpite == numeroAlvo){
                j3EstaCerto = true;
            }

            if (j1EstaCerto || j2EstaCerto || j3EstaCerto) {
                System.out.println("Temos um vencedor!! O número alvo era: " + numeroAlvo);
                vencedor = true;
            } else {
                System.out.println("Infelizmente não tivemos acertos...tentem de novo!!");
            }
        }
    }
}