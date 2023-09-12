package cola;
import javax.swing.JOptionPane;

public class Cola {	
     
    private Nodo pri,ult;    
    
    public Cola () {
        pri  =null;
        ult = null;
    }
    
    
    public void insertar() {
    	Nodo nue;
        nue = new Nodo();        
        int informacion;
        informacion = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL ITEM A AGREGAR"));        
        nue.info = informacion;
        nue.sig = null;

        if (pri==null)
        {            
            pri = nue;
            ult = pri;
            //ult.sig = null;
        }
        else
        {
            ult.sig = nue;
            ult = nue;
        }
    }
    
    public int extraer ()
    {
        if (pri!=null)
        {
            int informacion = pri.info;
            pri = pri.sig;
            return informacion;            
        }
        else
        {
            return -1;
        }
    }
    
    public void imprimir() {
        if (pri!=null)
       	{        
	        Nodo aux=pri;	        
	        System.out.println("Datos de la Cola:\n");
	        while (aux!=null) {
	            System.out.print(aux.info+" -> ");
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
	        Nodo aux=pri;	        	        
	        while (aux!=null) {
	            System.out.print("Liberado: " + aux.info+"\n");
				pri = pri.sig;	            
	            aux=null;
	            aux = pri;
	        }	        
	    }    
        System.out.println("Cola vacia.");
    }   
    
    
    public static void main(String[] ar) {
    	int Opcion,dato;        
    	Cola Cola1=new Cola();
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"+
                    "2. SACAR DATOS\n"+
                    "3. LISTAR Cola\n"+
                    "4. VACIAR Cola\n"+
                    "5. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 5]","MENU Cola",JOptionPane.QUESTION_MESSAGE));
            
            switch(Opcion)
            {
                case 1: Cola1.insertar();break;
                case 2: 
                dato = Cola1.extraer();
                if(dato !=-1)
                	System.out.println("Sale de Cola: "+dato);             
                else
                	System.out.println("Cola vacia.");
                break;
                case 3: Cola1.imprimir();break;
                case 4: Cola1.vaciarCola();break;
                case 5: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true); 
    }
}
    	    	