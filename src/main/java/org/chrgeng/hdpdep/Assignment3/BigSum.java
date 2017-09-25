/**
 * 
 */
package org.chrgeng.hdpdep.Assignment3;

/**
 * @author christian
 *
 */
public class BigSum extends Sum {
    public int doCalc() {
        int x = super.doCalc();
        System.out.println("x after calling docalc from superclass: "+x);
        return x + doAnotherCalc(); 
    }

    public int doAnotherCalc() {
        return 100;
    }
}

