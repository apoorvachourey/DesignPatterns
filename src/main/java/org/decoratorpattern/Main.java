package org.decoratorpattern;

public class Main {
    // TODO: 01/05/24 Add a good example code pending  
}

/*
1 real world example is -
Pizza shop.! -
        1. Add Base
            2. Add Veggies
                   3. Add Extra cheese
                            4. etc

 */
/*
2. Coffee !
        1.Base Cofee - Decafe ,capaccino , expresso
                2. Cream, milk , double cream etc


 */

/*
3. Base Car
        1. seat cover
            2. AC
                3. Power Steering
                    4. FogLight
                        5. etc
 */


// Why you need Decorator Pattern
 //-- Issue is Class Exposion

// Vehicle
//Base car - ac = true
//BC+AC+PS
/*
This results in many classes because there will be permutation and combination as well.
 */

//Design Cofee Machine
//get the cost of pizza based on toppings.
//