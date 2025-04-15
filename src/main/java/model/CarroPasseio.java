package model;

import javax.swing.JOptionPane;

public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public CarroPasseio(String cor, String modelo, double peso, int velocmax, float preco) {
        super(peso, velocmax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog("Digite a cor"));
        setModelo(JOptionPane.showInputDialog("Digite o modelo"));
    }
    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog
        (null,"Cor: " + getCor()+"\n"+"Modelo: " + getModelo());
    }
    @Override
    public String paraString() {
        return (super.paraString() + "\n"+ "Cor: " + getCor() + "\n"+ "Modelo: " + getModelo());
    }
    
}
