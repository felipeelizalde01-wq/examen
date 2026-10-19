public class Nodo {
    private int identificadorNumerico;
    private int capMaxConexiones;
    private int cantConexionesActivas;
    public static final int CONEXIONES_ACTIVAS = 0;
    private int contador = 0;

    public Nodo(int identificadorNumerico, int capMaxConexiones, int CONEXIONES_ACTIVAS) {
        setIdentificadorNumerico(identificadorNumerico);
        setCapMaxConexiones(capMaxConexiones);
        setCantConexionesActivas(CONEXIONES_ACTIVAS);
        contador++;
    }

    public void conectar(int cantidad){
        if (cantidad > 0){
            this.cantConexionesActivas += cantidad;
        }
    }

    public void desconectar(int cantidad){
        if (cantidad > 0){
            this.cantConexionesActivas -= cantidad;
        }
    }

    public boolean conectarNodos(int cantidad){
        if (cantidad <= this.capMaxConexiones){
            this.conectar(cantidad);
            return true;
        }
        return false;
    }

    public boolean desconectarNodo(int cantidad){
        if (cantidad <= this.getCantConexionesActivas()){
            this.desconectar(cantidad);
            return true;
        }
        return false;
    }

    public void mostrarDetalles() {
        System.out.println("Identificador: " + this.identificadorNumerico +
                " Capacidad Maxima Conexiones: " + this.capMaxConexiones +
                " Conexiones activas: " + this.getCantConexionesActivas());
    }


    //GETTERS
    public int getIdentificadorNumerico() {
        return identificadorNumerico;
    }

    public int getCapMaxConexiones() {
        return capMaxConexiones;
    }

    public int getCantConexionesActivas() {
        return cantConexionesActivas;
    }

    //SETTERS
    public void setIdentificadorNumerico(int identificadorNumerico) {
        if (identificadorNumerico >= 0){
            this.identificadorNumerico = identificadorNumerico;
        }
    }

    public void setCapMaxConexiones(int capMaxConexiones) {
        if (capMaxConexiones >= 0){
            this.capMaxConexiones = capMaxConexiones;
        }
    }

    public void setCantConexionesActivas(int cantConexionesActivas) {
        if (capMaxConexiones >= 0){
            this.cantConexionesActivas = cantConexionesActivas;
        }
    }

}
