
package HW1Clases;

public class Transito {
    
    private Multa multas [];
    private int contador;
    
    public Transito (int contador){
        multas = new Multa[100];
        this.contador = 0;
    }
        
    private Multa buscar(int code){
        for(Multa multa:multas){
            if(multa!=null && multa.getCodigo()==code){
                return multa;
            }
        }
        return null;
    }
    
    public boolean agregarMulta (int code, String name, String type){
        if (buscar(code)==null){
            for(int pos=0; pos < multas.length; pos++){
                if(multas[pos]==null){
                    multas[pos]= new Multa(code,name,type);
                    contador++;
                    return true;
                }
            }
        }
        return false;
    }
    
    public Multa getMulta (int index) {
        if (index >= 0 && index < multas.length) {
            return multas[index];
        }
        return null;
    }
    
    public double pagarMulta(int code){
       Multa multa = buscar(code);
       if (multa!=null){
           return multa.pay();
       }else {
        return -1;
       }
    }
    
    public void mostrarMultas(){
        for(int contar=0; contar<multas.length;contar++){
            if(multas[contar]!=null)
                System.out.println(multas[contar]);
        }
    } 
    
    public int[] printInfo() {
        int total = 0, pagado = 0, pendiente = 0;
        for (Multa multa : multas) {
            if (multa != null) {
                total++;
                if (multa.getPagado()) {
                    pagado++;
                } else {
                    pendiente++;
                }
            }
        }
        return new int[]{total, pagado, pendiente};
    }
}
