package TelaCadastro;

class Fornecedores {

    private String Idf;
    private String Fornecedor;
    private String Inscricao;
    private String CNPJ;
    private String Telefone;

    public Fornecedores() {
    }

    public Fornecedores(String Idf, String Cliente, String Endereco, String CPF, String Telefone) {
        this.Idf = Idf;
        this.Fornecedor = Cliente;
        this.Inscricao = Endereco;
        this.CNPJ = CPF;
        this.Telefone = Telefone;
    }

    public String getIdf() {
        return Idf;
    }

    public void setIdf(String idf) {
        this.Idf = Idf;
    }

    public String getCliente() {
        return Fornecedor;
    }

    public void setCliente(String Cliente) {
        this.Fornecedor = Fornecedor;
    }

    public String getEndereco() {
        return Inscricao;
    }

    public void setEndereco(String Endereco) {
        this.Inscricao = Inscricao;
    }

    public String getCPF() {
        return CNPJ;
    }

    public void setCPF(String CPF) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String toString() {
        return "Clientes{" + "Idf=" + Idf + ", Fornecedor=" + Fornecedor + ", Inscricao=" + Inscricao + ", CNPJ=" + CNPJ + ", Telefone=" + Telefone + "}";
    }

}
