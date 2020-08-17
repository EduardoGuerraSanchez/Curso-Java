package mx.com.gm.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }    
    public String getTipoEntrada() {
        return this.tipoEntrada;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{tipoEntrada=").append(tipoEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
}
