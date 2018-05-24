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
public class Binario implements Operacion {
    private String binario;

    @Override
    
    public void OperarA(int num1, int num2) {
    }

    @Override
    public void OperarC(int num1) {
          

        binario="";
        int residuo;
        
        while(num1>0){
            residuo=num1%2;
            binario = residuo+binario;
            num1=num1/2;
            
        }
        this.binario = binario;
    }
    
    public String resultado(){
        return this.binario;
    }                  
    
}
