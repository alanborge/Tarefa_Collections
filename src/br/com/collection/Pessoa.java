package br.com.collection;

/**
 * @author Allan borges
 * classe pesso para somente ler
 * os nomes e armazenar na variavel String
 */
public class Pessoa implements Comparable<Pessoa>{
    /**
     * propriedade da classe
     */
    private String nome;

    public Pessoa(){

    }

    public Pessoa(String nome) {
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome  ;
    }

    /**
     *
     * @param pessoa objeto de comparação dos nomes das pessoas
     * @return pesso.getnome
     *
     * Faz a comparação dos nomes em ordem alfabetica da lista
     */
    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }
}
