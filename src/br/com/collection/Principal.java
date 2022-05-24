package br.com.collection;

import javax.print.DocFlavor;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        lerRegistroDePessoas();
        LerRegistroPorGrupo();
    }

    /**
     * nomes de 
     */
    private static void lerRegistroDePessoas() {
        Pessoa pessoas = new Pessoa();
        Scanner input = new Scanner(System.in);
        Set<Pessoa> lista = new TreeSet<Pessoa>();
        int[] vet = new int[4];
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("Informe o seu nome: " + "\n");
                 pessoas.setNome(input.next() + "\n");
                 pessoas.getNome();
                Pessoa pessoa1 = new Pessoa(pessoas.getNome());
                Pessoa pessoa2 = new Pessoa(pessoas.getNome());
                Pessoa pessoa3 = new Pessoa(pessoas.getNome());
                Pessoa pessoa4 = new Pessoa(pessoas.getNome());
                lista.add(pessoa1);
                lista.add(pessoa2);
                lista.add(pessoa3);
                lista.add(pessoa4);
        }
             String nomesPessoa = ",";
                String[] nomes = nomesPessoa.split(";");
        System.out.println(" Nomes separados por virgulas em ordem alfabetica");
        System.out.printf("{" + lista + nomes[0] + "}" + "\n");
    }

    private static void LerRegistroPorGrupo() {
        System.out.println("Continuação Tarefa 2");
        Pessoa2 ps = new Pessoa2();
        Scanner input = new Scanner(System.in);
        Set<Pessoa2> lista = new TreeSet<Pessoa2>();
        int[] vet = new int[4];
        for (int i = 0; i < vet.length ; i++) {
            System.out.printf("informe seu nome" + "\n");
            ps.setNome(input.next());
            ps.getNome();
            System.out.printf("Qual o seu sexo: (F) / (M) " + "\n");
            ps.setSexo(input.next());
            ps.getSexo();

            Pessoa2 a = new Pessoa2(ps.getNome(), ps.getSexo());
            Pessoa2 b = new Pessoa2(ps.getNome(), ps.getSexo());
            Pessoa2 c = new Pessoa2(ps.getNome(), ps.getSexo());
            Pessoa2 d = new Pessoa2(ps.getNome(), ps.getSexo());
            lista.add(a);
            lista.add(b);
            lista.add(c);
            lista.add(d);
            }
          String nomePessoaSexo = ",";
          String[] nomes = nomePessoaSexo.split(" ; ");
        System.out.println("Lista de Pessoas e Sexo");
        System.out.printf(" " + lista + nomes[0] + "\n");

          String sexo = " m ; f ";
          String[] sexos = sexo.split(" ; ");
            System.out.println("******************* Gupo Masculino ********************");
            for (Pessoa2 people: lista) {
                if (people.getSexo().equalsIgnoreCase("m")){
                    System.out.println(people.getNome() + " - " + sexos[0]);
                }
            }
            System.out.println("**************** Grupo Feminino **********************");
            for (Pessoa2 people: lista) {
                if (people.getSexo().equalsIgnoreCase("f")){
                    System.out.println(people.getNome() + " - " + sexos[1]);
                }
            }

    }

}
