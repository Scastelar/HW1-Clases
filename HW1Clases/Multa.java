
package HW1Clases;


public class Multa {
    
    private int codigo;
    private String nombre;
    private String tipo;
    private double monto;
    private boolean pagado;
    
    public static double TIPO_LEVE = 0.1;
    public static double TIPO_MEDIO = 0.2;
    public static double TIPO_GRAVE = 0.3;
    
    public Multa(int codigo, String nombre, String tipo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo.toUpperCase();
        this.pagado = false;
        
        if (tipo.equals("LEVE")){
            this.monto = TIPO_LEVE;
        } else if (tipo.equals("MEDIO")){
            this.monto = TIPO_MEDIO;
        } else if (tipo.equals("GRAVE")){
            this.monto = TIPO_GRAVE; 
        } 
            this.monto = TIPO_LEVE;
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
        String estado;
        if (pagado == false){
            estado = "Multa Pendiente"; 
        } else {
            estado = "Pagada por un monto de Lps #" + monto*100;
        }
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Tipo: " + tipo + ", " + estado;
    }
    
    public double pay(){
        this.pagado = true;
        return monto * 100; 
    }
    
}
