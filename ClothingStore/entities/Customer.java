package entities;

/**
 *
 * @author dennis
 */
public class Customer {
    public String   name, id, address;
    public int      age, contactNumber;

    /* Constructors */
    public Customer() {
        // Default Constructor
    }
    public Customer(String cname, String cid) {
        name = cname;
        id   = cid;
    }
    
    /* Getter Functions */
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getContatctNumber() {
        return contactNumber;
    }
    
    /* Setter Functions */
    public void setName(String n) {
        name = n;
        return;
    }
    
    public void setId(String i) {
        id = i;
        return;
    }
    
    public void setAddress(String addr) {
        address = addr;
        return;
    }
    
    public void setAge(int a) {
        age = a;
        return;
    } 
    
    public void setContactNumber(int c) {
        contactNumber = c;
        return;
    } 
}
