public class Atendente extends Funcionario{

    private String horarioEntrada;
    private String hroarioSaida;
    private String emailInstitucional;

    Funcionario fun = Funcionario();

    public String gethorarioEntrada() {
        return horarioEntrada;
    }

    public void sethorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String gethroarioSaida() {
        return hroarioSaida;
    }

    public void sethroarioSaida(String hroarioSaida) {
        this.hroarioSaida = hroarioSaida;
    }

    public String getemailInstitucional() {
        return emailInstitucional;
    }

    public void setemailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

} 