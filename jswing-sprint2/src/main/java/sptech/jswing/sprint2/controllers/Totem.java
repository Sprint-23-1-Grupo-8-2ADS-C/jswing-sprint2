package sptech.jswing.sprint2.controllers;

/**
 *
 * @author marcusgoncalves
 */
public class Totem {
    private Integer id;
    private Integer idCompanhia;
    private String fabricante;
    private String arquitetura;
    private String sistemaOperacional;
    private String descricaoProcessador;
    private String idCPU;
    private String totalMemoriaRam;
    private String totalEspacoDisco;
    private String modeloDisco;
    private String localizacaoTotem;
    private String token;

    public Totem(Integer id, Integer idCompanhia, String fabricante, String arquitetura, String sistemaOperacional, String descricaoProcessador, String idCPU, String totalMemoriaRam, String totalEspacoDisco, String modeloDisco, String localizacaoTotem, String token) {
        this.id = id;
        this.idCompanhia = idCompanhia;
        this.fabricante = fabricante;
        this.arquitetura = arquitetura;
        this.sistemaOperacional = sistemaOperacional;
        this.descricaoProcessador = descricaoProcessador;
        this.idCPU = idCPU;
        this.totalMemoriaRam = totalMemoriaRam;
        this.totalEspacoDisco = totalEspacoDisco;
        this.modeloDisco = modeloDisco;
        this.localizacaoTotem = localizacaoTotem;
        this.token = token;
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

    public String getDescricaoProcessador() {
        return descricaoProcessador;
    }

    public void setDescricaoProcessador(String descricaoProcessador) {
        this.descricaoProcessador = descricaoProcessador;
    }

    public String getIdCPU() {
        return idCPU;
    }

    public void setIdCPU(String idCPU) {
        this.idCPU = idCPU;
    }

    public String getTotalMemoriaRam() {
        return totalMemoriaRam;
    }

    public void setTotalMemoriaRam(String totalMemoriaRam) {
        this.totalMemoriaRam = totalMemoriaRam;
    }

    public String getTotalEspacoDisco() {
        return totalEspacoDisco;
    }

    public void setTotalEspacoDisco(String totalEspacoDisco) {
        this.totalEspacoDisco = totalEspacoDisco;
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
                ", descricaoProcessador=" + descricaoProcessador + ", idCPU=" + idCPU +
                ", totalMemoriaRam=" + totalMemoriaRam + ", totalEspacoDisco=" + totalEspacoDisco 
                + ", modeloDisco=" + modeloDisco + ", localizacaoTotem=" + localizacaoTotem + ", token=" + token + '}';
    }
    
    
}
