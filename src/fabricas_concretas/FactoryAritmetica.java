/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fabricas_concretas;
import Fabricas_Abstractas.AbstractFactory;
import productos_abstractos.Operacion;
import productos_concretos.Binario;
import productos_concretos.Suma;
import productos_concretos.Resta;
import productos_concretos.Multiplicacion;
import productos_concretos.Division;
/**
 *
 * @author User
 */
public class FactoryAritmetica implements AbstractFactory{
    @Override
    public Operacion getConvertor(String type) {
        return null;
    }

    @Override
    public Operacion getAritmetica(String type) {
                switch(type){
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multiplicacion":
                return new Multiplicacion();
            case "Division":
                return new Division();
        }
        return null;
    }
    
}
