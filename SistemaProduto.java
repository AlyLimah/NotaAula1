import java.util.Scanner;

public class SistemaProduto {
    private int estoque, codigo, quantidadeestoque;
    private String nome, cor, peso;
    private double valor;

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setquantidadeestoque(int quantidadeestoque) {
        this.quantidadeestoque = quantidadeestoque;
    }

    public int getquantidadeestoque(){
        return quantidadeestoque;
    }

    public void vender(int quantidade, String pagamento) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente.");
            return;
        }

        double total = valor * quantidade;

        if(pagamento.equalsIgnoreCase("Pix")||
                pagamento.equalsIgnoreCase("Espécie") ||
                pagamento.equalsIgnoreCase("Transferência") ||
                pagamento.equalsIgnoreCase("Débito")){
                total *= 0.95;
        } else if (pagamento.equalsIgnoreCase("Crédito")) {
            // Permitir parcelamento em 3x sem juros
            System.out.println("Você escolheu pagar no cartão de crédito.");
            System.out.println("O valor total é: R$ " + total);
            System.out.println("Este valor será parcelado em 3x sem juros.");
            System.out.println("Valor de cada parcela: R$ " + (total / 3));
            System.out.println("Venda realizada com sucesso!");
            quantidadeestoque -= quantidade;
            return;
        }
        if (pagamento.equalsIgnoreCase("Espécie")) {
            System.out.print("Informe o valor pago: R$ ");
            Scanner scanner = new Scanner(System.in);
            double valorPago = scanner.nextDouble();

            if (valorPago > total) {
                double troco = valorPago - total;
                System.out.println("Troco: R$ " + troco);
            } else if (valorPago < total) {
                System.out.println("Valor insuficiente para realizar a compra.");
                quantidadeestoque += quantidade;
                return;
            }
        }

        System.out.println("Venda realizada com sucesso!");
        System.out.println("Total a pagar: R$ " + total);
        System.out.println("Estoque restante: " + quantidadeestoque);

    }
}

