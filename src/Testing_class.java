class Product {
    private String name;
    private double weight;
    private double price;

    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    
    public void print() {
    	System.out.println(name + weight + price);
    }
    
    public String getName() {
    	return name;
    }
    
    public double getWeight() {
    	return weight;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setWeight(double weight) {
    	this.weight = weight;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
}