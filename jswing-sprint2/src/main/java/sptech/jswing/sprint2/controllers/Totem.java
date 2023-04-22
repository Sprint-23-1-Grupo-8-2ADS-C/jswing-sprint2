package sptech.jswing.sprint2.controllers;


public class Totem {
    private Integer id;
    private Integer idCompanhia;
    private String fabricante;
    private String arquitetura;
    private String sistemaOperacional;
    private String processador;
    private String codProcessador;
    private String totalRam;
    private String capacidadeTotalDisco;
    private String modeloDisco;
    private String localizacaoTotem;
    private String token;

    public Totem(Integer id, Integer idCompanhia, String fabricante, String arquitetura, String sistemaOperacional, String processador, String codProcessador, String totalRam, String capacidadeTotalDisco, String modeloDisco, String localizacaoTotem, String token) {
        this.id = id;
        this.idCompanhia = idCompanhia;
        this.fabricante = fabricante;
        this.arquitetura = arquitetura;
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.codProcessador = codProcessador;
        this.totalRam = totalRam;
        this.capacidadeTotalDisco = capacidadeTotalDisco;
        this.modeloDisco = modeloDisco;
        this.localizacaoTotem = localizacaoTotem;
        this.token = token;
    }

    public Totem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCompanhia() {
        return idCompanhia;
    }

    public void setIdCompanhia(Integer idCompanhia) {
        this.idCompanhia = idCompanhia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(String arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getCodProcessador() {
        return codProcessador;
    }

    public void setCodProcessador(String codProcessador) {
        this.codProcessador = codProcessador;
    }

    public String getTotalRam() {
        return totalRam;
    }

    public void setTotalRam(String totalRam) {
        this.totalRam = totalRam;
    }

    public String getCapacidadeTotalDisco() {
        return capacidadeTotalDisco;
    }

    public void setCapacidadeTotalDisco(String capacidadeTotalDisco) {
        this.capacidadeTotalDisco = capacidadeTotalDisco;
    }

    public String getModeloDisco() {
        return modeloDisco;
    }

    public void setModeloDisco(String modeloDisco) {
        this.modeloDisco = modeloDisco;
    }

    public String getLocalizacaoTotem() {
        return localizacaoTotem;
    }

    public void setLocalizacaoTotem(String localizacaoTotem) {
        this.localizacaoTotem = localizacaoTotem;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    
    @Override
    public String toString() {
        return "Totem{" + "id=" + id + ", idCompanhia=" + idCompanhia + 
                ", fabricante=" + fabricante + ", arquitetura=" + arquitetura + 
                ", sistemaOperacional=" + sistemaOperacional + 
                ", processador=" + processador + ", codProcessador=" + codProcessador +
                ", totalRam=" + totalRam + ", capacidadeTotalDisco=" + capacidadeTotalDisco 
                + ", modeloDisco=" + modeloDisco + ", localizacaoTotem=" + localizacaoTotem + ", token=" + token + '}';
    }
    
    
}
