/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboassignment2;

/**
 *
 * @author Nisa
 */
public class Lingkaran implements MenghitungBidang {
    private float r;
    
    public Lingkaran(float R){
        r = R;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    
    @Override
    public float area() {
        return phi * (r * r);
    }

    @Override
    public float perimeter() {
        return 2 * phi * r;
    }
}
