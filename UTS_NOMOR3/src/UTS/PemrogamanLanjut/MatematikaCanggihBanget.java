// Nama : Talitha Aurelia Shakira
// Nim  : 11200930000023
// Kelas : 2A

package UTS.PemrogamanLanjut;
public class MatematikaCanggihBanget {
     public static void main(String[] args){
        MatematikaCanggih getnilai = new MatematikaCanggih();
        
        getnilai.pertambahan(10, 20, 30, 40);
        System.out.println("Pertambahan: 10+20+30+40 = " );
        
        getnilai.perkalian(5, 3, 2, 10);
        System.out.println("Perkalian: 5*3*2*10 = " );
        
        getnilai.modulus(10, 30, 12, 20);
        System.out.println("modulus: 10%30%12%20 = " );
        
        getnilai.pertambahanempat(4, 8, 12, 16);
        System.out.println("Pertambahanemapat: 4/8/12/16 = " );
        
        
    }
}
