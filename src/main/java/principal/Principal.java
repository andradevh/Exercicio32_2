package principal;
import javax.swing.JOptionPane;
import model.CarroPasseio;
import model.Caminhao;

public class Principal {
     public static void main(String[] args) {
       CarroPasseio passeio = new CarroPasseio();
       passeio.leitura();
       Caminhao caminhao = new Caminhao();
       caminhao.leitura();
       JOptionPane.showMessageDialog(null,"""
                                          INFO Carro de Passeio
                                          """+passeio.paraString()+
               "\n"+"=============="+"\n"+"INFO Caminh\u00e3o"+"\n"+caminhao.paraString());
    }
}
