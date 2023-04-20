package sptech.jswing.sprint2.controllers;

import java.util.List;

/**
 *
 * @author marcusgoncalves
 */
public class Disco {
    private List<Disco> discos;
    private Integer qtdDiscos;
    private Integer qtdVolumes;
    private Long getTamanhoTotal;
    private List<Disco> volumes;

    public Disco(List<Disco> discos, Integer qtdDiscos, Integer qtdVolumes, Long getTamanhoTotal, List<Disco> volumes) {
        this.discos = discos;
        this.qtdDiscos = qtdDiscos;
        this.qtdVolumes = qtdVolumes;
        this.getTamanhoTotal = getTamanhoTotal;
        this.volumes = volumes;
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(List<Disco> discos) {
        this.discos = discos;
    }

    public Integer getQtdDiscos() {
        return qtdDiscos;
    }

    public void setQtdDiscos(Integer qtdDiscos) {
        this.qtdDiscos = qtdDiscos;
    }

    public Integer getQtdVolumes() {
        return qtdVolumes;
    }

    public void setQtdVolumes(Integer qtdVolumes) {
        this.qtdVolumes = qtdVolumes;
    }

    public Long getGetTamanhoTotal() {
        return getTamanhoTotal;
    }

    public void setGetTamanhoTotal(Long getTamanhoTotal) {
        this.getTamanhoTotal = getTamanhoTotal;
    }

    public List<Disco> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Disco> volumes) {
        this.volumes = volumes;
    }

    @Override
    public String toString() {
        return "Disco{" + "discos=" + discos + ", qtdDiscos=" + qtdDiscos + ", qtdVolumes=" + qtdVolumes + ", getTamanhoTotal=" + getTamanhoTotal + ", volumes=" + volumes + '}';
    }

    
    
}
