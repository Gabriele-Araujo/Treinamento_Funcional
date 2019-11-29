package Teste;

import javax.swing.Icon;

public class Funcionario {

    public String nome;
    public String cpf;
    public String cargo;
    public Double salario;
    public String telefone;
    public String email;
    public String dataNasc;
    public Icon foto;

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", cargo=" + cargo + ", salario=" + salario + ", telefone=" + telefone + ", email=" + email + ", dataNasc=" + dataNasc + ", foto=" + foto + '}';
    }

}
