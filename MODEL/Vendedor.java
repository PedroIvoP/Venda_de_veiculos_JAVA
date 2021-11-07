package MODEL;

import java.time.LocalDate;

public class Vendedor {
    
    String nome, telefone, cpf;
    LocalDate nascimento;

    public Vendedor(String cpf, String nome, String telefone, String nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.setNascimento(nascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        
        String [] data = nascimento.split("/");
        
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);
        
        this.nascimento = LocalDate.of(ano, mes, dia);
    }
    
}
