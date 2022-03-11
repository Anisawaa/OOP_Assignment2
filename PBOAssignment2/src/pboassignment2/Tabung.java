/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboassignment2;

/**
 *
 * @author Nisa
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    private float h;
    
    public Tabung(float R, float H) {
        super(R);
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
        return 2 * phi * super.getR()*super.getR() + h;
    }
    
    @Override
    public float volume() {
        return super.area() * h;
    }
}
