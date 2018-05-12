
package pullbaseddevelopment;


import java.util.Random;
import java.awt.Color;
public final class Dadu {
    
 public static final int DEFAULT_SISI = 6;
private static Random randGenerator = new Random();
private final int jumSisi;
private int hasil;
private int temp = 0;
public Dadu() {
this(DEFAULT_SISI);
} 

public Dadu(int numSides) {
this.jumSisi = numSides;
} 


public int lempar() {

  
   
   do{
        hasil = randGenerator.nextInt(jumSisi) + 1;
    } while(hasil == temp);
   temp = hasil;
return hasil;
} 


public int getJumSisi() {
return jumSisi;
} 

public int getHasil() {
return hasil;
}


@Override
public String toString() {
lempar();
return "Jumlah sisi dadu: " + getJumSisi() +  " hasil: " + getHasil();
}
    
}
