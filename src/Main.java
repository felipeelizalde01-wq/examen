public static void main(String[] args){
    Nodo n1 = new Nodo(1,2,Nodo.CONEXIONES_ACTIVAS);

    System.out.println("Mostrar detalles\n");
    n1.mostrarDetalles();

    System.out.println("");
    System.out.println("Conectar");
    System.out.printf("Conectar n1\n");
    n1.conectar(1);
    n1.mostrarDetalles();

    n1.desconectar(1);
    n1.mostrarDetalles();


}

