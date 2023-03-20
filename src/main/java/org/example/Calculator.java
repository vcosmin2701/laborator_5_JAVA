package org.example;

public class Calculator {
    float nr;
    public Calculator(float nr){
        this.nr = nr;
    }
    public void multiply(float other){
        this.nr *= other;
    }

    public void division(float other){
        this.nr /= other;
    }

    public void addition(float other){
        this.nr += other;
    }

    public float getResult(){
        return nr;
    }
}
