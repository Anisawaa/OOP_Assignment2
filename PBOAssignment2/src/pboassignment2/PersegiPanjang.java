/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboassignment2;

/**
 *
 * @author Nisa
 */
public class PersegiPanjang implements MenghitungBidang {
    private float l, w;
    
    public PersegiPanjang(float L, float W) {
        l = L;
        w = W;
    }
    
    public float getL() {
        return l;
    }
    
    public void setL(float l) {
        this.l = l;
    }
    
    public float getW() {
        return w;
    }
    
    public void setW(float w) {
        this.w = w;
    }
    
    @Override
    public float area() {
        return l * w;
    }
    
    @Override
    public float perimeter() {
        return 2 * (l + w);
    }
}
