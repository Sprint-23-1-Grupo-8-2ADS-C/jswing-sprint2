package sptech.jswing.sprint2.controllers;

import com.github.britooo.looca.api.group.janelas.Janela;
import java.util.List;

/**
 *
 * @author marcusgoncalves
 */
public class Janelas {
    private List<Janela> janelas;
    private List<Janela> janelasVisiveis;
    private Integer qtdDeJanelas;
    private Integer qtdDeJanelasVisiveis;

    public Janelas(List<Janela> janelas, List<Janela> janelasVisiveis, Integer qtdDeJanelas, Integer qtdDeJanelasVisiveis) {
        this.janelas = janelas;
        this.janelasVisiveis = janelasVisiveis;
        this.qtdDeJanelas = qtdDeJanelas;
        this.qtdDeJanelasVisiveis = qtdDeJanelasVisiveis;
    }

    public List<Janela> getJanelas() {
        return janelas;
    }

    public void setJanelas(List<Janela> janelas) {
        this.janelas = janelas;
    }

    public List<Janela> getJanelasVisiveis() {
        return janelasVisiveis;
    }

    public void setJanelasVisiveis(List<Janela> janelasVisiveis) {
        this.janelasVisiveis = janelasVisiveis;
    }

    public Integer getQtdDeJanelas() {
        return qtdDeJanelas;
    }

    public void setQtdDeJanelas(Integer qtdDeJanelas) {
        this.qtdDeJanelas = qtdDeJanelas;
    }

    public Integer getQtdDeJanelasVisiveis() {
        return qtdDeJanelasVisiveis;
    }

    public void setQtdDeJanelasVisiveis(Integer qtdDeJanelasVisiveis) {
        this.qtdDeJanelasVisiveis = qtdDeJanelasVisiveis;
    }

    @Override
    public String toString() {
        return "Janelas{" + "janelas=" + janelas + ", janelasVisiveis=" + janelasVisiveis + ", qtdDeJanelas=" + qtdDeJanelas + ", qtdDeJanelasVisiveis=" + qtdDeJanelasVisiveis + '}';
    }
    
    
    
    
}
