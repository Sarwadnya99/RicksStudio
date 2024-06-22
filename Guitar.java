
public class Guitar {
    private String serialNumber, topWood, backWood, builder, model, type;
    private double price;
    public Guitar(String serialNumber, String topWood, String backWood, String builder, String model, String type, double price){
        this.serialNumber = serialNumber;
        this.topWood = topWood;
        this.backWood = backWood;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.price = price;
    }
    public String getSerialNumber(){
        return this.serialNumber;
    }
    public String getTopWood(){
        return this.topWood;
    }
    public String getBackWood(){
        return this.backWood;
    }
    public String getbuilder(){
        return this.builder;
    }
    public String getModel(){
        return this.model;
    }
    public String getType(){
        return this.type;
    }
    public double getPrice(){
        return this.price;
    }
    public void setSerialNumber(String srnoString){
        this.serialNumber = srnoString;
    }
    public void setTopWood(String topWood){
        this.topWood = topWood;
    }
    public void setBackWood(String backWood){
        this.backWood = backWood;
    }
    public void setbuilder(String builder){
        this.builder = builder;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
}
