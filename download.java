import java.util.Scanner;

public class download {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /**
        Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps)
        calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). */

        double arquivoMB, velocidadeMbps, tempoDownload;

        System.out.print("Digite o tamanho de um arquivo para download em MB: ");
        arquivoMB = teclado.nextDouble();
        System.out.print("Digite a velocidade do link de internet em Mbps: ");
        velocidadeMbps = teclado.nextDouble();

        tempoDownload = (arquivoMB * 8) / (velocidadeMbps * 60);

        System.out.printf("O tempo apropriado de download do arquivo, usando este link, é de %.2f minutos", tempoDownload);

        teclado.close();

    }
}