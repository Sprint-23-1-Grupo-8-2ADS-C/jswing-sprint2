package sptech.jswing.sprint2.controllers;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import java.util.ArrayList;
import java.util.List;


public class ShowRede {
  private Looca looca = new Looca();
  private Rede rede = looca.getRede();
  
  public Long bytesRecebidos(){
    List ipv4 = new ArrayList(); 

    List<RedeInterface> rede = looca.getRede().getGrupoDeInterfaces().getInterfaces();

    Long bytes = null;
    for(RedeInterface redeInterface : rede){
        if(redeInterface.getEnderecoIpv4().size() > 0){
            return bytes = redeInterface.getBytesRecebidos();
        }
    }      
    return null;
  }
  
  public Long bytesEnviados(){
    List ipv4 = new ArrayList(); 

    List<RedeInterface> rede = looca.getRede().getGrupoDeInterfaces().getInterfaces();

    Long bytes = null;
    for(RedeInterface redeInterface : rede){
        if(redeInterface.getEnderecoIpv4().size() > 0){
            return bytes = redeInterface.getBytesEnviados();
        }
    }      
    return null;
  }

    
}
