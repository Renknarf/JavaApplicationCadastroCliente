/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaAplicationCadastroCliente;

import apresentação.JFrameCadastroCliente;
import controle.Cliente;
import controle.Compra;
import java.sql.Date;
import javax.swing.JOptionPane;


public class JavaAplicationCadastroCliente {
    public static void main(String[] args) {
         JFrameCadastroCliente jFrameCadastroCliente = new JFrameCadastroCliente(); // Cria o Frame principal
         jFrameCadastroCliente.setLocationRelativeTo(null); // Frame no centro 
         jFrameCadastroCliente.setVisible(true); // Mostra o Frame
    }
}
