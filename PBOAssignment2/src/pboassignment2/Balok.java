/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboassignment2;

/**
 *
 * @author Nisa
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private float h;
    
    public Balok(float L, float W, float H) {
        super(W, L);
        h = H;
    }
    
    public float getH() {
        return h;
    }
    
    public void setH(int H) {
        h = H;
    }
    
    @Override
    public float surface() {
        return 2 * ((super.getL() * h) + (super.getW() * h) + super.area());
    }
    
    @Override
    public float volume() {
        return super.area() * h;
    }
}
