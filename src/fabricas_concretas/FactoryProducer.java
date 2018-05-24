/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import Fabricas_Abstractas.AbstractFactory;

/**
 *
 * @author User
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Aritmetica":
                return (AbstractFactory) new FactoryAritmetica();
            case "Convertor":
                return new FactoryConvertor();
        }
        return null;
    }
    
}
