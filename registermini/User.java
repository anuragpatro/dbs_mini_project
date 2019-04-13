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
public class User {
    public int prod_id;
    public String prod_name;
    public float price;
    public String sup_name;
    
    public User(int prod_id,String prod_name, float price,String sup_name){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.sup_name = sup_name;
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
    
     public String getsup_name(){
        return sup_name;
    }
}

