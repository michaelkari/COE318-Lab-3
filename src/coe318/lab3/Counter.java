/**
 *
 * @author Michael Karimizadeh
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int modulus1, digit1;
    Counter left1;
    public Counter(int modulus, Counter left) {
        this.modulus1 = modulus;
        this.left1=left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.modulus1;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.left1;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.digit1;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit1=digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        setDigit(this.digit1+1);
        if(getDigit() == getModulus()){
            this.digit1=0;
            if(this.getLeft() != null){
                this.left1.increment();
            }
        }
    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(this.getLeft() != null){
            return getDigit()+(getModulus())*(this.left1.getCount());
        }
        else{
            return getDigit();
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
