package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
    private double cargamax;
    private double alturamax;
    private double comprimento;

    public Caminhao() {
    }

    public Caminhao(double cargamax, double alturamax, double comprimento) {
        this.cargamax = cargamax;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    public Caminhao(double cargamax, double alturamax, double comprimento, double peso, int velocmax, float preco) {
        super(peso, velocmax, preco);
        this.cargamax = cargamax;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    public double getCargamax() {
        return cargamax;
    }

    public void setCargamax(double cargamax) {
        this.cargamax = cargamax;
    }

    public double getAlturamax() {
        return alturamax;
    }

    public void setAlturamax(double alturamax) {
        this.alturamax = alturamax;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public void leitura() {
        super.leitura();
        setCargamax(Double.parseDouble(JOptionPane.showInputDialog("Digite as tonelas da carga max")));
        setAlturamax(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura máxima")));
        setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento")));
    }
    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog
        (null,"Carga máxima: " + getCargamax()+"\n"+"Altura máxima: " + getCargamax()
        +"\n"+"Comprimento"+getComprimento());
    }
    @Override
    public String paraString() {
        return (super.paraString() + "\n" +"Toneladas máxima : " + getCargamax()+"T" + "\n"
                +"Altura máxima :" + getAlturamax()+"m"
                +"\n" +"Comprimento :" + getComprimento()+"m");
    }     
}