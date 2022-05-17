public class Cliente extends Entregador{

    private int id;
    private String telefone;
    private String contato;
    private String email;
    private String CPF;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getcontato() {
        return contato;
    }

    public void setcontato(String contato) {
        this.contato = contato;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

} 