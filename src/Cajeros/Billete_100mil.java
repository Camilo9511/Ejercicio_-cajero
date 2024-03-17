package Cajeros;

 public class Billete_100mil implements Icajero {
  
   private Icajero siguiente;
    @Override
    public void setSiguiente(Icajero siguiente) {
      this.siguiente=siguiente;
      
    }  
    @Override
    public void retirar(int monto) {
        int cantidadBilletes= monto / 100000;
        int cantidadRestante= monto % 100000;
        if (cantidadBilletes >0) {
          
          System.out.println("se entregan" + " " + cantidadBilletes+"  billetes de" + " " + 100000);
        }
        if(cantidadRestante >0 && siguiente !=null){
          siguiente.retirar(cantidadRestante);
            
        }
        else if(cantidadRestante>0){
          System.out.println("no se puede retirar la cantidad restante de" + cantidadRestante );
                 
            }        
                 
        
    }
  }



