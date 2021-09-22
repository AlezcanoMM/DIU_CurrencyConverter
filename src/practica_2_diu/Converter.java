/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2_diu;

/**
 *
 * @author Exulonk
 */
public class Converter {
    static final double EUR_USD = 1.17;
    static final double EUR_GBP = 0.85;
    static final double GBP_USD = 1.37;
    
    public Double convert(String from, String to,Double amount){
        return amount * exchange(from, to);
    }

    private Double exchange(String from, String to){
        Double res = 1.0;
        if("EUR".equals(from) && "USD".equals(to))res = EUR_USD;
        if("EUR".equals(from) && "GBP".equals(to))res = EUR_GBP;
        
        if("USD".equals(from) && "EUR".equals(to))res = 1/EUR_USD;
        if("USD".equals(from) && "GBP".equals(to))res = 1/GBP_USD;
        
        if("GBP".equals(from) && "EUR".equals(to))res = 1/EUR_GBP;
        if("GBP".equals(from) && "USD".equals(to))res = GBP_USD;
        return res;
    }
}
