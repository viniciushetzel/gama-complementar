package Veiculos;

public class AppVeiculo {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Chevrolet", "Cruze", 10);
		Veiculo v2 = new Veiculo("Fiat", "Palio", 14);
		Veiculo v3 = new Veiculo("Hyundai", "Creta", 13);

		v1.mostrar();
		System.out.println("Consumo = " + v1.getConsumo());

		v2.mostrar();
		System.out.println("Consumo = " + v2.getConsumo());

		v3.mostrar();
		System.out.println("Consumo = " + v3.getConsumo());
	}
}
