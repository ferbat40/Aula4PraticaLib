/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import javax.ejb.Remote;

/**
 *
 * @author Pessoal
 */

@Remote
public interface ICalculadora {
    
    public int soma (int A, int B);
    
    
}
