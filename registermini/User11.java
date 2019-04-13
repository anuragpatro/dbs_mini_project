/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registermini;

/**
 *
 * @author anurag
 */
public class User11 {
    public int prod_id;
    public String prod_name;
    public float price;
    public String sup_name;
    
    /**
     *
     * @param prod_id
     * @param prod_name
     * @param price
     */
    public User11(int prod_id,String prod_name, float price){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        
    }
    
    public int getprod_id(){
        return prod_id;
    }
    public String getname(){
        return prod_name;
    }
    public float getprice(){
        return price;
    }
    
    
}

