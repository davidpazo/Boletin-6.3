package Boletin63;
//@author dpazolopez/
public class Boletin63 {

    public static void main(String[] args) {
        Cuenta cuenta1=new Cuenta(123456,25039);
        double totalcuenta=cuenta1.saldo;
        System.out.println("Total actual en la cuenta:"+ totalcuenta + "euros");
        
    }
    
}
