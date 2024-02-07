/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import DAO.ConexaoDB;

/**
 *
 * @author Aluno(a) TDS Noite
 */
public class teste {
     public static void main(String[] args) {
        ConexaoDB conecta = new ConexaoDB();
        conecta.getConnection();
    }
}
