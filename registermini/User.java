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
class User {
    private int prod_id;
    private String prod_name;
    private float price;
    
    public User(int prod_id,String prod_name, float price){
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

