package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Calendar;
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Colaborador {

    private int codigo;
    private String nome;
    private String email;
    private double salario;
    private Calendar dataContratacao;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDataContratacao(Calendar dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

}