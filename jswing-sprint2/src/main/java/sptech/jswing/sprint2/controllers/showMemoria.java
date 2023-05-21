package sptech.jswing.sprint2.controllers;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.memoria.Memoria;

public class ShowMemoria {
    private Looca looca = new Looca();
    private Memoria memoria = looca.getMemoria();
    
    public Memoria showMemoria(){
        return memoria;
    }
    
    public Long usoRam(){
        return memoria.getEmUso();
    }
    
    public Long disponivelRam(){
        return memoria.getDisponivel();
    }
    
    public Long totalRam(){
        return memoria.getTotal();
    }
}
