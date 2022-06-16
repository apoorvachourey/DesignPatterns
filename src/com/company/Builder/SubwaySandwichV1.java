package com.company.Builder;

public class SubwaySandwichV1 {
    private String bread;
    private String condiments;
    private String veggies;
    private String fillings;

    public String getBread() {
        return bread;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public String getCondiments() {
        return condiments;
    }
    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }
    public String getVeggies() {
        return veggies;
    }
    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }
    public String getFillings() {
        return fillings;
    }
    public void setFillings(String filling) {
        this.fillings = filling;
    }
}

//We want to create complex objects with different initialization
//with immutability of objects.!
