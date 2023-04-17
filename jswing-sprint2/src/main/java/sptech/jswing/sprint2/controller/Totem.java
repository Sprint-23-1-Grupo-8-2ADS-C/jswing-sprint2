package sptech.jswing.sprint2.controller;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import sptech.jswing.sprint2.main.Models;


/**
 *
 * @author marcusgoncalves
 */
public class Totem {
    private Integer id;
    private String fabricante;
    private String arquitetura;
    private String sistemaOperacional;
    private String descricaoProcessador;
    private String numeroCPU;
    private Double valorTotalRam;
    private Double valorTotalDisco;
    private String modeloDisco;
    private String localizacaoTotem;
    private Integer fkCompanhia;
    private String tokem;

    public Totem(Integer id, String fabricante, String arquitetura, String sistemaOperacional, String descricaoProcessador, String numeroCPU, Double valorTotalRam, Double valorTotalDisco, String modeloDisco, String localizacaoTotem, Integer fkCompanhia, String tokem) {
        this.id = id;
        this.fabricante = fabricante;
        this.arquitetura = arquitetura;
        this.sistemaOperacional = sistemaOperacional;
        this.descricaoProcessador = descricaoProcessador;
        this.numeroCPU = numeroCPU;
        this.valorTotalRam = valorTotalRam;
        this.valorTotalDisco = valorTotalDisco;
        this.modeloDisco = modeloDisco;
        this.localizacaoTotem = localizacaoTotem;
        this.fkCompanhia = fkCompanhia;
        this.tokem = tokem;
    }
    
    public Totem() {
    }
    
    
    public List buscarTotemPeloToken(String tokenDigitado) {
        Models models = new Models();
        List<Totem> totens;
        
        String sql = String.format("SELECT tokem FROM totem WHERE tokem = '%s'", tokenDigitado);
        
        try {
            totens = models.getConnection().query(sql, new BeanPropertyRowMapper<>(Totem.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro ao tentar obter os dados: \n" + e.getMessage());
            return null;
        }
        
        return totens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNumeroCPU() {
        return numeroCPU;
    }

    public void setNumeroCPU(String numeroCPU) {
        this.numeroCPU = numeroCPU;
    }

    public Double getValorTotalRam() {
        return valorTotalRam;
    }

    public void setValorTotalRam(Double valorTotalRam) {
        this.valorTotalRam = valorTotalRam;
    }

    public Double getValorTotalDisco() {
        return valorTotalDisco;
    }

    public void setValorTotalDisco(Double valorTotalDisco) {
        this.valorTotalDisco = valorTotalDisco;
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

    public Integer getFkCompanhia() {
        return fkCompanhia;
    }

    public void setFkCompanhia(Integer fkCompanhia) {
        this.fkCompanhia = fkCompanhia;
    }

    public String getTokem() {
        return tokem;
    }

    public void setTokem(String tokem) {
        this.tokem = tokem;
    }

    @Override
    public String toString() {
        return "Totem{" + "id=" + id + ", fabricante=" + fabricante + ", arquitetura=" + arquitetura + ", sistemaOperacional=" + sistemaOperacional + ", descricaoProcessador=" + descricaoProcessador + ", numeroCPU=" + numeroCPU + ", valorTotalRam=" + valorTotalRam + ", valorTotalDisco=" + valorTotalDisco + ", modeloDisco=" + modeloDisco + ", localizacaoTotem=" + localizacaoTotem + ", fkCompanhia=" + fkCompanhia + ", tokem=" + tokem + '}';
    }
    
    
}
