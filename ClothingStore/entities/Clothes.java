package entities;

/**
 *
 * @author dennis
 */
public class Clothes {
    public String   Cloth_id, Cloth_type, Cloth_color, Cloth_size;
    public float    Cloth_price;
    
    /* Constrcutors */
    public Clothes() {
        // Default Constructor
    }
    public Clothes(String id) {
        Cloth_id = id;
    }
    
    /* Getter Functions */
    public String getClothId() {
        return Cloth_id;
    }
    
    public String getClothType() {
        return Cloth_type;
    }
    
    public String getClothColor() {
        return Cloth_color;
    }
    
    public String getClothSize() {
        return Cloth_size;
    }
    
    public float getClothPrice() {
        return Cloth_price;
    }
    
    /* Setter Functions */
    public void setClothId(String id) {
        Cloth_id = id;
        return;
    }
    
    public void setClothType(String ctype) {
        Cloth_type = ctype;
        return;
    }
    
    public void setClothColor(String ccolor) {
        Cloth_color = ccolor;
        return;
    }
    
    public void setClothSize(String csize) {
        Cloth_size = csize;
        return;
    } 
    
    public void setClothPrice(float price) {
        Cloth_price = price;
        return;
    }
}
