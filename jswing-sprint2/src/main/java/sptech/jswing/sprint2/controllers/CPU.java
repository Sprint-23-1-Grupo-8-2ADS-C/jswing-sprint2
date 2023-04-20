package sptech.jswing.sprint2.controllers;

/**
 *
 * @author marcusgoncalves
 */
public class CPU {
    private String fabricante;
    private String nome;
    private String idCpu;
    private String identificador;
    private String microarquitetura;
    private Integer frequencia;
    private Integer qtdSockets;
    private Integer qtdCores;
    private Integer qtdThreads;
    private Double usoDaCpu;

    public CPU(String fabricante, String nome, String idCpu, String identificador, String microarquitetura, Integer frequencia, Integer qtdSockets, Integer qtdCores, Integer qtdThreads, Double usoDaCpu) {
        this.fabricante = fabricante;
        this.nome = nome;
        this.idCpu = idCpu;
        this.identificador = identificador;
        this.microarquitetura = microarquitetura;
        this.frequencia = frequencia;
        this.qtdSockets = qtdSockets;
        this.qtdCores = qtdCores;
        this.qtdThreads = qtdThreads;
        this.usoDaCpu = usoDaCpu;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdCpu() {
        return idCpu;
    }

    public void setIdCpu(String idCpu) {
        this.idCpu = idCpu;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getMicroarquitetura() {
        return microarquitetura;
    }

    public void setMicroarquitetura(String microarquitetura) {
        this.microarquitetura = microarquitetura;
    }

    public Integer getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Integer frequencia) {
        this.frequencia = frequencia;
    }

    public Integer getQtdSockets() {
        return qtdSockets;
    }

    public void setQtdSockets(Integer qtdSockets) {
        this.qtdSockets = qtdSockets;
    }

    public Integer getQtdCores() {
        return qtdCores;
    }

    public void setQtdCores(Integer qtdCores) {
        this.qtdCores = qtdCores;
    }

    public Integer getQtdThreads() {
        return qtdThreads;
    }

    public void setQtdThreads(Integer qtdThreads) {
        this.qtdThreads = qtdThreads;
    }

    public Double getUsoDaCpu() {
        return usoDaCpu;
    }

    public void setUsoDaCpu(Double usoDaCpu) {
        this.usoDaCpu = usoDaCpu;
    }

    @Override
    public String toString() {
        return "CPU{" + "fabricante=" + fabricante + ", nome=" + nome + ", idCpu=" + idCpu + ", identificador=" + identificador + ", microarquitetura=" + microarquitetura + ", frequencia=" + frequencia + ", qtdSockets=" + qtdSockets + ", qtdCores=" + qtdCores + ", qtdThreads=" + qtdThreads + ", usoDaCpu=" + usoDaCpu + '}';
    }

    
    
}
