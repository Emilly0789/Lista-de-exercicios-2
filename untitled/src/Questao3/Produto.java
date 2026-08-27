package Questao3;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void SetPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo");
        }
    }

    public void exibirInfo() {
        System.out.printf("Código: " + codigo);
        System.out.printf("Nome: " + nome);
        System.out.printf("Preço: R$ " + preco);
        System.out.printf("Estoque: " + estoque);
    }
}
