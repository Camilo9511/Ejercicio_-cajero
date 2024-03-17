package Cajeros;

 public class Billete_5mil implements Icajero {
  
   private Icajero siguiente;
    @Override
    public void setSiguiente(Icajero siguiente) {
      this.siguiente=siguiente;
      
    }  
    @Override
    public void retirar(int monto) {
       
        if (monto % 5000 != 0) {
          
            System.out.println("error");
            
        }
        
        int cantidadBilletes = monto/5000;
        
        System.out.println("se entregan" + " " + cantidadBilletes+"  billetes de" + " " + 5000);
                 
        
    }
  }



