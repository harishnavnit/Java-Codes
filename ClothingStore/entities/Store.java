package entities;

/**
 *
 * @author dennis
 */
public class Store {
    public String   storeId, storeName, storeAddress, storeManager;
    public int      storeContactNumber;
    
    /* Constructors */
    public Store() {
        // Default Constructor
    }
    public Store(String id, String name) {
        storeId     = id;
        storeName   = name;
    } 
    
    /* Getter Functions */
    public String getStoreId() {
        return storeId;
    }
    
    public String getStoreName() {
        return storeName;
    }
    
    public String getStoreAddress() {
        return storeAddress;
    }
    
    public String getStoreManager() {
        return storeManager;
    }
    
    public int getStoreContactNumber() {
        return storeContactNumber;
    }
    
    /* Setter Functions */
    public void setStoreId(String id) {
        storeId = id;
        return;
    }
    
    public void setStoreName(String name) {
        storeName = name;
        return;
    }
    
    public void setStoreAddress(String addr) {
        storeAddress = addr;
        return;
    }
    
    public void setStoreManager(String man) {
        storeManager = man;
        return;
    }
    
    public void setStoreContactNumber(int cno) {
        storeContactNumber = cno;
        return;
    }
}
