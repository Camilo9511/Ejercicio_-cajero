package Cajeros;

 public class Billete_50mil implements Icajero {
  
   private Icajero siguiente;
    @Override
    public void setSiguiente(Icajero siguiente) {
      this.siguiente=siguiente;
      
    }  
    @Override
    public void retirar(int monto) {
        int cantidadBilletes= monto / 50000;
        int cantidadRestante= monto % 50000;
        if (cantidadBilletes >0) {
          
            System.out.println("se entregan" + " " + cantidadBilletes+"  billetes de" + " " + 50000);
        }
        if(cantidadRestante >0&& siguiente !=null){
          siguiente.retirar(cantidadRestante);
        }     
        else if(cantidadRestante>0){
              System.out.println("no se puede retirar la cantidad restante de" + cantidadRestante );
                 
                 
            }        
                 
        
    }


}


 
