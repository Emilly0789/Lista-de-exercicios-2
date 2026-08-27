package Questao3;

public class main {
    public static void main(String[] args) {
        Produto produto = new Produto(101, "Camiseta", 29.90, 50);
        produto.exibirInfo();

        System.out.println("\n Alterando preço");
        produto.SetPreco(49.90);

        System.out.println("Informações atualizadas");
        produto.exibirInfo();
    }
}
