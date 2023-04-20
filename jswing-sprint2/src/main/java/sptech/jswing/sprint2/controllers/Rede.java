package sptech.jswing.sprint2.controllers;

/**
 *
 * @author marcusgoncalves
 */
public class Rede {
    private String nome;
    private String nomeExibicao;
    private String IPv4;
    private String IPv6;
    private String macAddress;
    private Integer bytesRecebidos;
    private Integer bytesEnviados;
    private Integer pacotesRecebidos;
    private Integer pacotesEnviados;

    public Rede(String nome, String nomeExibicao, String IPv4, String IPv6, String macAddress, Integer bytesRecebidos, Integer bytesEnviados, Integer pacotesRecebidos, Integer pacotesEnviados) {
        this.nome = nome;
        this.nomeExibicao = nomeExibicao;
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
        this.macAddress = macAddress;
        this.bytesRecebidos = bytesRecebidos;
        this.bytesEnviados = bytesEnviados;
        this.pacotesRecebidos = pacotesRecebidos;
        this.pacotesEnviados = pacotesEnviados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }

    public void setNomeExibicao(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    public String getIPv4() {
        return IPv4;
    }

    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    public String getIPv6() {
        return IPv6;
    }

    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Integer getBytesRecebidos() {
        return bytesRecebidos;
    }

    public void setBytesRecebidos(Integer bytesRecebidos) {
        this.bytesRecebidos = bytesRecebidos;
    }

    public Integer getBytesEnviados() {
        return bytesEnviados;
    }

    public void setBytesEnviados(Integer bytesEnviados) {
        this.bytesEnviados = bytesEnviados;
    }

    public Integer getPacotesRecebidos() {
        return pacotesRecebidos;
    }

    public void setPacotesRecebidos(Integer pacotesRecebidos) {
        this.pacotesRecebidos = pacotesRecebidos;
    }

    public Integer getPacotesEnviados() {
        return pacotesEnviados;
    }

    public void setPacotesEnviados(Integer pacotesEnviados) {
        this.pacotesEnviados = pacotesEnviados;
    }

    @Override
    public String toString() {
        return "Rede{" + "nome=" + nome + ", nomeExibicao=" + nomeExibicao + ", IPv4=" + IPv4 + ", IPv6=" + IPv6 + ", macAddress=" + macAddress + ", bytesRecebidos=" + bytesRecebidos + ", bytesEnviados=" + bytesEnviados + ", pacotesRecebidos=" + pacotesRecebidos + ", pacotesEnviados=" + pacotesEnviados + '}';
    }
    
    
    
}
