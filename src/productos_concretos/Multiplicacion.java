/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos;

import productos_abstractos.Operacion;


/**
 *
 * @author User
 */
public class Multiplicacion implements Operacion {
    @Override
    public void OperarA(int num1, int num2) {
        System.out.println("Multiplicacion: "+(num1*num2));
    }

    @Override
    public void OperarC(int num1) {
        
    }
    
}
