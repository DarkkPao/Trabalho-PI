package TelaCadastro;

class Produtos {

    private String Codigo;
    private String Produto;
    private String Fornecedor;
    private String Preco;

    public Produtos() {
    }

    public Produtos(String Codigo, String Produto, String Fornecedor, String Preco) {
        this.Codigo = Codigo;
        this.Produto = Produto;
        this.Fornecedor = Fornecedor;
        this.Preco = Preco;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getPreco() {
        return Preco;
    }

    public void setPreco(String Preco) {
        this.Preco = Preco;
    }

    public String toString() {
        return "Clientes{" + "Codigo=" + Codigo + ", Produto=" + Produto + ", Fornecedor=" + Fornecedor + ", Preco=" + Preco + "}";
    }

}
