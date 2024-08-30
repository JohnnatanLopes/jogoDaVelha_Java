package Application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static final Character[][] mat = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    static char escolha = 0;
    static char jogador = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // interface do game
        interfaceJogo();
        int cont = 0;

        try {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++)
                    if (cont % 2 == 0) {
                        if (vencedor()) {
                            i = 3;
                            break;
                        }
                        jogador = 'X';
                        System.out.println("Vez de X: ");
                        escolha = sc.next().charAt(0);
                        try {
                            escolhaNumero(jogador);
                        }catch (IllegalArgumentException e) {
                            interfaceJogo();
                            System.out.println(e.getMessage());
                            System.out.println("Tente novamente!");
                            break;
                        }
                        interfaceJogo();
                        cont++;
                    } else {
                        if (vencedor()) {
                            i = 3;
                            break;
                        }

                        jogador = 'O';
                        System.out.println("Vez de O: ");
                        escolha = sc.next().charAt(0);
                        try {
                            escolhaNumero(jogador);
                        }catch (IllegalArgumentException e) {
                            interfaceJogo();
                            System.out.println(e.getMessage());
                            System.out.println("Tente novamante!!");
                            break;
                        }
                        interfaceJogo();
                        cont++;
                    }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();

    }

    public static void interfaceJogo() {
        System.out.println();
        System.out.println(" JOGO DA VELHA");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("  %S  ", mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void escolhaNumero(char jogador) {

        if (escolha == '1') {
            if(mat[0][0] == 'X'  || mat[0][0] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[0][0] = jogador;
        }
        if (escolha == '2') {
            if(mat[0][1] == 'X'  || mat[0][1] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[0][1] = jogador;
        }
        if (escolha == '3') {
            if(mat[0][2] == 'X'  || mat[0][2] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[0][2] = jogador;
        }
        if (escolha == '4') {
            if(mat[1][0] == 'X'  || mat[1][0] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[1][0] = jogador;
        }
        if (escolha == '5') {
            if(mat[1][1] == 'X'  || mat[1][1] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[1][1] = jogador;
        }
        if (escolha == '6') {
            if(mat[1][2] == 'X'  || mat[1][2] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[1][2] = jogador;
        }
        if (escolha == '7') {
            if(mat[2][0] == 'X'  || mat[2][0] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[2][0] = jogador;
        }
        if (escolha == '8') {
            if(mat[2][1] == 'X'  || mat[2][1] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[2][1] = jogador;
        }
        if (escolha == '9') {
            if(mat[2][2] == 'X'  || mat[2][2] == 'O') {
                throw new IllegalArgumentException("Ja foi jogado!");
            }
            mat[2][2] = jogador;
        }
    }

    public static boolean vencedor() {

        if (mat[0][0] == jogador && mat[0][1] == jogador && mat[0][2] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[1][0] == jogador && mat[1][1] == jogador && mat[1][2] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[2][0] == jogador && mat[2][1] == jogador && mat[2][2] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[0][0] == jogador && mat[1][0] == jogador && mat[2][0] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[0][1] == jogador && mat[1][1] == jogador && mat[2][1] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[0][2] == jogador && mat[1][2] == jogador && mat[2][2] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[1][0] == jogador && mat[1][1] == jogador && mat[2][2] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[2][0] == jogador && mat[1][1] == jogador && mat[0][2] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }
        if (mat[0][0] == jogador && mat[1][1] == jogador && mat[2][2] == jogador) {
            System.out.println();
            System.out.println("Vencedor: "+jogador);
            return true;
        }

        return false;
    }

}