package HibernateDDL2.model;

public class ClienteEntregador extends Cliente{

    private int idCliente;
    private date dataAtendimento;
    private String horaAtendimento;

    public int getIdCliente() {
        return idCliente;
    }

    public void setId(int idCliente) {
        this.idCliente = idCliente;
    }

    public date getdataAtendimento() {
        return dataAtendimento;
    }

    public void setdataAtendimento(date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String gethoraAtendimento() {
        return horaAtendimento;
    }

    public void sethoraAtendimento(String horaAtendimento) {
        this.horaAtendimento = horaAtendimento;
    }

    

} 