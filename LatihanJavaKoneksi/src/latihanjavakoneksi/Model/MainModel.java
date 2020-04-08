/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.Model;

import java.util.Date;

/**
 *
 * @author Edgar Hadhyra J
 */
public class MainModel {
    private String name;
    private String type;
    private String stock;
    private String price;
    private Date expired;
    
    public void setExpired(Date expired){
        this.expired = expired;
    }
    
    public Date getExpired(){
        return expired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
