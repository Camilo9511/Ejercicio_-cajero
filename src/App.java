import Cajeros.Billete_100mil;
import Cajeros.Billete_20mil;
import Cajeros.Billete_50mil;
import Cajeros.Billete_10mil;
import Cajeros.Billete_5mil;
import Cajeros.Icajero;


public class App{

    public static void main(String[] args) {
        Icajero cajero1= new Billete_100mil();
        Icajero cajero2= new Billete_50mil();
        Icajero cajero3=new Billete_20mil();
        Icajero cajero4=new Billete_10mil();
        Icajero cajero5=new Billete_5mil();
        
        cajero1.setSiguiente(cajero2);
        cajero2.setSiguiente(cajero3);
        cajero3.setSiguiente(cajero4);
        cajero4.setSiguiente(cajero5);
        

       int monto=450000;

       if(monto %5000 != 0){
        System.out.println("error");
    
       }else{
        cajero1.retirar(monto);
        
      
       
        
    }

 }
}