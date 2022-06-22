package com.company.Creational.Builder;

public class SubwaySandwichV3 {
    private String bread;
    private String condiments;
    private String veggies;
    private String fillings;
// Pass builder object in constructor
    public SubwaySandwichV3(Builder b) {
        this.bread = b.bread;
        this.condiments = b.condiments;
        this.veggies = b.veggies;
        this.fillings = b.fillings;
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
    //The public static inner Builder Class.!
    //Needs to have all the attributes as the outer class.!
    public static class Builder{
        private String bread;
        private String condiments;
        private String veggies;
        private String fillings;
//Need to enable public setters that return object of this class to enable chaining.!

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setVeggies(String veggies) {
            this.veggies = veggies;
            return this;
        }

        public Builder setFillings(String fillings) {
            this.fillings = fillings;
            return this;
        }


    // make a build() method which can create the object of outer class.!

    public SubwaySandwichV3 build() {
        return new SubwaySandwichV3(this);
    }
    }


}

// Now what to do -

/*
Instead of passing all those parameters pass hash.! but again constraint is on no of parameters.!

 */
