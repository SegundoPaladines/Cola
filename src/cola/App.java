package cola;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {

    
    
     public static void main(String[] args) {
        Cola repartidores = new Cola();
        Repartidor[] rep = new Repartidor [20];
        int tamano = 0;
        int opcion=0;
        try{
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("***REPARTIDORES***\n"
                            +"INGRESE UNA OPCION:\n"
                            +"\n1. Ingresar Repartidores"
                            +"\n2. Actualizar Repartidores"
                            +"\n3. Imprimir Repartidores"
                            +"\n4. Salir \n\n"));
        }
        catch(Exception e) {
            System.out.println("ERROR AL ELEGIR LA OPCION");
        }

        while(opcion > 0 && opcion < 4){
            switch(opcion){
                case 1: 
                    int cod_seguridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese codigo: "));
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre: ");
                    String nom_empresa = JOptionPane.showInputDialog(null, "Ingrese Nombre de la Empresa: ");
                    boolean bandera = true;
                    
                    if(tamano == 0){
                        rep[tamano]=new Repartidor(nombre, cod_seguridad, nom_empresa);
                        tamano++;
                    }else{
                        for(int i = 0; i < tamano; i++){
                            if(rep[i].cod_seguridad==cod_seguridad){
                                rep[i].nom_empresa=nom_empresa;
                                rep[i].nombre = nombre;
    
                                bandera = false;
                            }
                        }
                        if(bandera == true){
                            Repartidor reptmp = new Repartidor(nombre, cod_seguridad, nom_empresa);
                           rep[tamano]= reptmp;
                           tamano++;
                        }else{
                            System.out.println("El repartidor ya existia, se actualizo nombre y nombre de la Empresa");
                        }
    
                        for(int i = 0; i < tamano; i++){
                            
                            int menor=rep[i].cod_seguridad;
                            int pos=0;
                             if(i+1 <= tamano){
                                 for(int j = i +1; j < tamano; j++){
                                     if(rep[j].cod_seguridad < menor){
                                         menor = rep[j].cod_seguridad;
                                         pos = j;
                                     }
    
                                 }
                             }
                             if(pos != 0){
                                 Repartidor aux = rep[pos];
                                 rep[pos]=rep[i];
                                 rep[i]= aux;
                             }
                        }
    
                }
                break;

                case 2:

                    repartidores.vaciarCola();
                    for(int i = 0; i < tamano; i++){
                        
                        Nodo nue = new Nodo();
                        nue.repartidor = rep[i];
                        repartidores.insertar(nue);
                    }

                    System.out.println("Cola actualizada");

                break;

                case 3:
                    repartidores.imprimir();
                break;
            }
            try{
                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog("***REPARTIDORES***\n"
                        +"INGRESE UNA OPCION:\n"
                        +"\n1. Ingresar Repartidores"
                        +"\n2. Actualizar Repartidores"
                        +"\n3. Imprimir Repartidores"
                        +"\n4. Salir \n\n"));
            }
            catch(Exception e) {
                System.out.println("ERROR AL ELEGIR LA OPCION");
                opcion =0;
            }
          

        }
        
    }
    
}
