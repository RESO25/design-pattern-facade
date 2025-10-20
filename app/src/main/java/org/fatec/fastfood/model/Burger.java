/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.fatec.fastfood.model;

/**
 *
 * @author lab53
 */
public class Burger implements ItemCombo {
    private final String nome;
    private final double preco;
    
    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public String toString() {
        return String.format("Burger: %s (R$ %.2f)", nome, preco);
    }
}