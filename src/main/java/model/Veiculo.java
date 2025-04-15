package model;

import javax.swing.JOptionPane;

public class Veiculo {
    private double peso;
    private int velocmax;
    private float preco;

    public Veiculo() {
    }

    public Veiculo(double peso, int velocmax, float preco) {
        this.peso = peso;
        this.velocmax = velocmax;
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
     public void leitura() {
        setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso")));
        setVelocmax(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade máxima")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço")));
    }
    public void imprimir() {
        JOptionPane.showMessageDialog
        (null,"Peso: " + getPeso()+"\n"+"Velocidade máxima: " + getVelocmax()
        +"\n"+"Preço: " + getPreco());
    }
    public String paraString() {
        return ("Peso: " + getPeso()+" Kg" + "\nVelocidade máxima: " + getVelocmax() 
                +" Km/h"+"\nPreço: " + getPreco()+"R$");
    }

}

