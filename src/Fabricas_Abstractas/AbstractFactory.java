/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas_Abstractas;
import productos_abstractos.Operacion;


/**
 *
 * @author User
 */
public interface AbstractFactory {
    Operacion getConvertor(String type);
    Operacion getAritmetica(String type);
    
}
