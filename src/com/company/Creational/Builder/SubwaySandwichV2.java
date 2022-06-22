package com.company.Creational.Builder;

public class SubwaySandwichV2 {
    private String bread;
    private String condiments;
    private String veggies;
    private String fillings;


    public SubwaySandwichV2(String bread) {
        this.bread = bread;
    }

    public SubwaySandwichV2(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }
    public SubwaySandwichV2(String bread, String condiments, String veggies) {
        this(bread,condiments);
        this.veggies = veggies;
    }
    public SubwaySandwichV2(String bread, String condiments, String veggies, String fillings) {
        this(bread,condiments,veggies);
        this.fillings = fillings;
    }


    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getVeggies() {
        return veggies;
    }

    public String getFillings() {
        return fillings;
    }
    }


// This is an Anti Pattern
//AntiPatterns : Blueprints in your code which must be avoided.!
//Wat if some parameters become optional;
//what if user doesn't want to remember order as well.!
// This will make our code not scalable and extremely hard to test.!


