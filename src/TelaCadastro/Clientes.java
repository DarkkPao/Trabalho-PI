package TelaCadastro;

class Clientes {

    private String id;
    private String Cliente;
    private String Endereco;
    private String CPF;
    private String Telefone;

    public Clientes() {
    }

    public Clientes(String id, String Cliente, String Endereco, String CPF, String Telefone) {
        this.id = id;
        this.Cliente = Cliente;
        this.Endereco = Endereco;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String toString() {
        return "Clientes{" + "id=" + id + ", Cliente=" + Cliente + ", Endereco=" + Endereco + ", CPF=" + CPF + ", Telefone=" + Telefone + "}";
    }

    Object getIdf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
