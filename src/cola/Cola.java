package cola;


public class Cola {	
     
    public Nodo pri,ult;    
    
    public Cola () {
        pri  =null;
        ult = null;
    }
    
    
    public void insertar(Nodo nue) {
    	
        nue.sig = null;

        if (pri==null)
        {            
            pri = nue;
            ult = pri;
        }
        else
        {
            nue.sig = pri;
            pri = nue;
            
        }
    }

    public String extraer ()
    {
        if (pri!=null)
        {
            String informacion = "Extrayendo: "+pri.repartidor.toString();
            pri = pri.sig;
            return informacion;            
        }
        else
        {
            return "Cola Vacia";
        }
    }
    
    public void imprimir() {
        if (pri!=null)
       	{        
	        Nodo aux=pri;	        
	        System.out.println("Datos de la Cola:\n");
	        while (aux!=null) {
	            System.out.print(aux.repartidor.cod_seguridad+" -> ");
	            aux=aux.sig;
	        }
	        System.out.println();
	        }
        else
        	System.out.println("Cola vacia.");
    }
    
    
    public void vaciarCola() {
        if (pri!=null)
       	{        
	        pri = null;
            ult = null;         
	    }    
        
    }   
}
