package sptech.jswing.sprint2.controllers;

/**
 *
 * @author marcusgoncalves
 */
public class MemoriaRam {
    private Double total;
    private Double emUso;
    private Double disponivel;

    public MemoriaRam(Double total, Double emUso, Double disponivel) {
        this.total = total;
        this.emUso = emUso;
        this.disponivel = disponivel;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getEmUso() {
        return emUso;
    }

    public void setEmUso(Double emUso) {
        this.emUso = emUso;
    }

    public Double getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Double disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "MemoriaRam{" + "total=" + total + ", emUso=" + emUso + ", disponivel=" + disponivel + '}';
    }
    
    
}
