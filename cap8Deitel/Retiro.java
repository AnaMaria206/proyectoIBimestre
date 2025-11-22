package cap8Deitel;

public class Retiro {
	// atributos
    private int numeroCuenta; // cuenta de la que se van a retirar los fondos
    private double monto; // monto a retirar

    // referencias a los objetos asociados (Composición)
    private Pantalla pantalla; // pantalla del ATM
    private Teclado teclado; // teclado del ATM
    private DispensadorEfectivo dispensadorEfectivo; // dispensador de efectivo del ATM
    private BaseDatosBanco baseDatosBanco; // base de datos de información de las cuentas

 
    public Retiro()
    {
    } 

    // operaciones
    // La operación ejecutar inicia y coordina los pasos de la transacción.
    public void ejecutar()
    {
        // NOTA: El cuerpo de este método se codifica completamente en el Apéndice M
        // cuando se implementa la lógica completa del sistema ATM.
    } // fin del método ejecutar
}
