package MODEL;

import java.util.ArrayList;

public class Veiculo {

    public static void set(int j, ArrayList<Veiculo> veiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void set(int i, Veiculo aux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String fabricante, modelo, chassi;
    private int ano;
    private double preco;

    public Veiculo(String chassi, String fabricante, String modelo, int ano, double preco) {
        
        this.chassi = chassi;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
    
}
