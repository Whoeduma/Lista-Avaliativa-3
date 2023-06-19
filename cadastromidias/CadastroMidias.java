/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastromidias;

import java.util.Scanner;

public class CadastroMidias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos de CDs e DVDs
        Midia midia1 = new Midia(1, 19.99, "Midia 1");
        DVD dvd1 = new DVD(2, 29.99, "DVD 1", 10);
        CD cd1 = new CD(3, 14.99, "CD 1", 12);

        // Imprimindo os dados das mídias
        midia1.printDados();
        System.out.println();
        dvd1.printDados();
        System.out.println();
        cd1.printDados();
        System.out.println();

        // Alterando os dados das mídias
        System.out.print("Digite o novo codigo da midia 1: ");
        int novoCodigo = scanner.nextInt();
        midia1.setCodigo(novoCodigo);

        System.out.print("Digite o novo preco do DVD 1: ");
        double novoPreco = scanner.nextDouble();
        dvd1.setPreco(novoPreco);

        System.out.print("Digite o novo nome do CD 1: ");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String novoNome = scanner.nextLine();
        cd1.setNome(novoNome);

        // Imprimindo os dados atualizados das mídias
        midia1.printDados();
        System.out.println();
        dvd1.printDados();
        System.out.println();
        cd1.printDados();

        scanner.close();
    }
    
}
