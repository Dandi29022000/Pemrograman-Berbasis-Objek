/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapdemo;

/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int newAge) {
        if(newAge > 30) {
            age = 30;
        } else if(newAge < 18) {
            age = 18;
        } else {
            age = newAge;
        }
    }
    
    
}
