package com.company;

public class Complex {

    public static void main(String[] args) {}
    private double real=0.0;
    private double imag=0.0;

    public Complex() {
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    public String toString(){
        return "Complex =("+getReal()+"+"+getImag()+"i)";
    }
    public boolean isReal(){
        if(imag==0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isImaginary(){
        if(real==0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(double real , double imag){
        if(real==imag) {
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(Complex another){
        if(real == another.real && imag== another.imag){
            return true;
        }else{
            return false;
        }
    }
    public double magnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }
    public double argument(){
        return Math.atan(imag/real);
    }
    public Complex add(Complex right){
        this.real+=right.real;
        this.imag+=right.imag;
        return this;
    }
    public Complex subtract(Complex right){
        this.real-=right.real;
        this.imag-=right.imag;
        return this;
    }
    public Complex multiply(Complex right){
        this.real*=right.real;
        this.imag*=right.imag;
        return this;
    }
    public Complex divide(Complex right){
        this.real/=right.real;
        this.imag/=right.imag;
        return this;
    }
    public Complex addNew(Complex right){
        Complex inst = new Complex(this.real+right.real,this.imag+right.imag);
        return inst;
    }
    public Complex addSubtract(Complex right){
        Complex inst = new Complex(this.real-right.real,this.imag-right.imag);
        return inst;
    }
    public Complex conjugate(){
        Complex conj= new Complex(this.real*this.real,this.imag*-this.imag);
        return conj;
    }
}
