/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopTriangel;

/**
 *
 * @author Admin
 */
public class Triangel {
    public float width;
    public float hegth;

    public Triangel (){
        this.width = 0;
        this.hegth = 0;
    }
    public Triangel(float width, float hegth){
        this.width = width;
        this.hegth = hegth ;
    }
    //setter
    public void  setwidth(float vwidth){
        this.width = vwidth;
    }
    public void sethegth(float vhegth){
        this.hegth = vhegth;
    }
    //getter
    public float getwigth(){
    return this.width;
    }
    public float getheght(){
        return this.hegth;
    }
    
    @Override
    public String toString (){
        return "\tcanh day la "+this.width +"\n\t\tchieu cao la "+ this.hegth;
    }
}
        
    
    
    

