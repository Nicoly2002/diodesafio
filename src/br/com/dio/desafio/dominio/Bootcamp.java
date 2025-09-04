package br.com.dio.desafio.dominio;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new linkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }


    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Bootcamp bootcamp = (Bootcamp) object;
        return java.util.Objects.equals(nome, bootcamp.nome) && java.util.Objects.equals(descricao, bootcamp.descricao) && java.util.Objects.equals(dataInicial, bootcamp.dataInicial) && java.util.Objects.equals(dataFinal, bootcamp.dataFinal) && java.util.Objects.equals(devsInscritos, bootcamp.devsInscritos) && java.util.Objects.equals(conteudos, bootcamp.conteudos);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
