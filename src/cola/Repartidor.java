package cola;
public class Repartidor {

    public String nombre;
    public int cod_seguridad;
    public String nom_empresa;

    public Repartidor(String nombre, int cod_seguridad, String nom_empresa){

       this.nombre= nombre;
       this.cod_seguridad = cod_seguridad;
       this.nom_empresa = nom_empresa;



    }

    public String toString(){
        return "Nombre: "+this.nombre + "Codigo de seguridad: "+this.cod_seguridad + "Nombre  Empresa: " + this.nom_empresa;
    }

    
}
