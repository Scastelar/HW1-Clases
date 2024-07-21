
package HW1Clases;


public class Multa {
    
    private int codigo;
    private String nombre;
    private String tipo;
    private double monto;
    private boolean pagado;
    
    public Multa(int codigo, String nombre, String tipo){
        this.codigo = 0;
        this.nombre = "";
        this.tipo = "LEVE";
        this.monto = 0.1;
        this.pagado = false;
    }
    
    //FUNCIONES GET
    public int getCodigo (){
        return codigo;
    }
    public double getMonto (){
        return monto;
    }
    public boolean getPagado (){
        return pagado;
    }
    
    public String print() {
        String estado = "";
        if (pagado == false){
            estado = "Multa Pendiente"; 
        } else {
            estado = "Pagada por un monto de Lps #" + monto;
        }
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Tipo: " + tipo + ", " + estado;
    }
    
    public String pay(boolean getPagado){
        this.pagado = true;
        return "Multa con Codigo #" + codigo + " fue pagada por un monto de Lps. #" + monto; 
    }
    
}
