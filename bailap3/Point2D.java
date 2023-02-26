package bailap3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Point2D {
    public float x;
    public float y;
    
    public Point2D(){
        this.x =0;
        this.y =0;
    }
    public Point2D(float x,float y){
        this.x =x;
        this.y =y;
    }
    public float getx(){
        return this.x;
    }
    public float gety(){
        return this.y;
    }
    
    public void InTT(){
        System.out.println("So x la:" +this.getx());
        System.out.println("So y la:"+ this.gety());
    }
}
