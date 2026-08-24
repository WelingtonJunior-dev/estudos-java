public class GeradorDeIncidentes {
    public static void main(String[] args) {
        String[] listaDeIncidentes1 = {"O microsserviço", "A API REST", "O container Docker", "O banco de dados", "O cache do Redis", "O cluster Kubernetes", "O pipeline de CI/CD", "O gateway de API", "O serviço de autenticação", "O worker de background"};
        String[] listaDeIncidentes2 = {"sofreu um timeout", "vazou memória", "retornou status 500", "entrou em loop infinito", "excedeu o limite de CPU", "perdeu a conexão com o banco", "lançou uma NullPointerException", "falhou no health check", "bloqueou a thread principal", "derrubou o servidor"};
        String[] listaDeIncidentes3 = {"durante o pico de acessos", "após o último commit", "na sexta-feira às 18h", "por falta de índice", "após o deploy em produção", "por erro de permissão", "por falta de variável de ambiente", "durante a rotina de backup", "sem registrar nenhum log", "porque faltou rodar a migration"};

        int primeiroTamanho = listaDeIncidentes1.length;
        int segundoTamanho = listaDeIncidentes2.length;
        int terceiroTamanho = listaDeIncidentes3.length;

        System.out.println("=== SISTEMA DE MONITORAMENTO DE BUGS ===");

        java.util.Random randomGenerator = new java.util.Random();

        for (int i = 0; i < 5; i++) {
            int rand1 = randomGenerator.nextInt(primeiroTamanho);
            int rand2 = randomGenerator.nextInt(segundoTamanho);
            int rand3 = randomGenerator.nextInt(terceiroTamanho);

            int severidade = randomGenerator.nextInt(3) + 1;

            String tag;
            if (severidade == 3){
                tag = "[CRÍTICO]";
            } else if (severidade == 2) {
                tag = "[ALERTA]";
            }
            else{
                tag = "[INFO]";
            }

            String incidente = tag + " " + listaDeIncidentes1[rand1] + " " + listaDeIncidentes2[rand2] + " " + listaDeIncidentes3[rand3];

            System.out.println(incidente);
        }
    }
}

