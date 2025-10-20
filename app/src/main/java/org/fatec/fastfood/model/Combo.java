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
        // TODO: Calcule e retorne a soma dos preços dos três itens
        return 0.0; // SUBSTITUIR
    }
}