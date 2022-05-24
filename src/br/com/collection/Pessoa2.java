package br.com.collection;

/**
 * @author Allan borges
 * classe pessoa
 * criada para armazenar o nome e sexo das pessoas
 * em variavel String
 */
public class Pessoa2 implements Comparable<Pessoa2>{
    /**
     * propriedades da classe
     */
    private String nome;
    private String sexo;

    public Pessoa2(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa2() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     *
     * retorna a lista de strings
     * das propriedades
     */
    @Override
    public String toString() {
        return "{" + nome  + "-" + sexo + '}';
    }


    @Override
    public int compareTo(Pessoa2 pessoa2) {
        return this.nome.compareTo(pessoa2.getNome());
    }
}
