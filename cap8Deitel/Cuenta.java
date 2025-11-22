package cap8Deitel;

public class Cuenta extends BaseDatosBanco{

	private Integer numeroCuenta;
	private Integer nip;
	private double saldoDisponible;
	private double saldoTotal;
	
	
	public boolean validarNIP () {
		return false;
	}


	@Override
	public boolean autenticarUsuario() {
		// TODO Auto-generated method stub
		return super.autenticarUsuario();
	}


	@Override
	public double obtenerSaldoDisponible() {
		// TODO Auto-generated method stub
		return super.obtenerSaldoDisponible();
	}


	@Override
	public double obtenerSaldoTotal() {
		// TODO Auto-generated method stub
		return super.obtenerSaldoTotal();
	}


	@Override
	public void abonar() {
		// TODO Auto-generated method stub
		super.abonar();
	}


	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		super.cargar();
	}

	
	
	
}
