package br.com.satc.objeto;


public class Disciplina {
    
    private String nome,departamento;
    private char status;

    public Disciplina(String nome, String departamento, char status){
        this.nome = nome;
        this.departamento = departamento;
        this.status = status;
    }

 
    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
        
}