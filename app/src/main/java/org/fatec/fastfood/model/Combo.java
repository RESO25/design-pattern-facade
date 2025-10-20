/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.fatec.fastfood.model;

/**
 *
 * @author lab53
 */
public class Combo {
    private ItemCombo burger;
    private ItemCombo bebida;
    private ItemCombo sobremesa;
    
    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }
    
    public ItemCombo getBurger() {
        return burger;
    }
    
    public ItemCombo getBebida() {
        return bebida;
    }
    
    public ItemCombo getSobremesa() {
        return sobremesa;
    }
    
    public double getPrecoTotal() {
        double total = 0;

        total += this.burger.getPreco();
        total += this.bebida.getPreco();
        total += this.sobremesa.getPreco();

        // return this.burger.getPreco() + this.bebida.getPreco() + this.sobremesa.getPreco();
        return total;
    }
}