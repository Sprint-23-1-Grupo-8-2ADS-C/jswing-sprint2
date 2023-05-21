package sptech.jswing.sprint2.controllers;

import java.util.List;
import lombok.Getter;
import lombok.Setter;


public class showCPU {
    @Setter @Getter private Double usoCpu;
    @Setter @Getter private Double frequencia;
    @Setter @Getter private List<String> processos;
    @Setter @Getter private String dataHora;

    public showCPU(){}
    
    public showCPU(Double usoCpu, Double frequencia, List<String> processos, String dataHora) {
        this.usoCpu = usoCpu;
        this.frequencia = frequencia;
        this.processos = processos;
        this.dataHora = dataHora;
    }
}
