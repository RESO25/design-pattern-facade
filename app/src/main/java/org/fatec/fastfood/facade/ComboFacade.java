/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package org.fatec.fastfood.facade;
import org.fatec.fastfood.model.Bebida;
import org.fatec.fastfood.model.Burger;
import org.fatec.fastfood.model.Combo;
import org.fatec.fastfood.model.Sobremesa;

/**
 *
 * @author lab53
 */

public class ComboFacade {
    private Combo combo;
    
    /**
     * Cria um combo baseado no código fornecido
     * @param codigo número do combo (1, 2 ou 3)
     */
    public void criarCombo(int codigo) {
        Burger burger;
        Bebida bebida;
        Sobremesa sobremesa;

        switch (codigo) {
            case 1:
                // Big Cheddar (R$ 18.00) + Coca-Cola (R$ 8.00) + Sundae (R$ 9.90)
                burger = new Burger("Big Cheddar", 18);
                bebida = new Bebida("Coca-Cola", 8);
                sobremesa = new Sobremesa("Sundae", 9);

                break;
            case 2:
                // Mega Bacon (R$ 16.00) + Guaraná (R$ 7.50) + Torta de Maçã (R$ 9.00)
                burger = new Burger("Mega Bacon", 16);
                bebida = new Bebida("Coca-Cola", 8);
                sobremesa = new Sobremesa("Sundae", 9);
            
                break;
            case 3:
                // Mini Burger (R$ 12.00) + Suco Laranja (R$ 6.00) + Sorvete (R$ 4.90)
                burger = new Burger("Mini Burger", 12);
                bebida = new Bebida("Suco de Laranja", 6);
                sobremesa = new Sobremesa("Sorvete", 4.9);
                break;
            default:
                System.out.println("Código de combo inválido!");
                burger = null;
                bebida = null;
                sobremesa = null;
                break;
        }

        this.combo = new Combo(burger, bebida, sobremesa);
    }
    
    /**
     * Exibe todos os itens do combo
     */
    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }
        
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println(combo.getBurger().toString());
        System.out.println(combo.getBebida().toString());
        System.out.println(combo.getSobremesa().toString());
        System.out.println("==========================");
    }
    
    /**
     * Retorna o preço total do combo
     * @return preço total
     */
    public double getPrecoTotal() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return 0;
        }
        return combo.getPrecoTotal(); // SUBSTITUIR
    }
}
