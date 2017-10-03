package NET.webserviceX.www;

import java.rmi.RemoteException;

public class Cliente {

	public static void main(String[] args) {
		ConvertTemperatureSoapProxy proxy = new ConvertTemperatureSoapProxy();
		try {
			double value = proxy.convertTemp(35, TemperatureUnit.degreeCelsius, TemperatureUnit.degreeFahrenheit);
			System.out.println(value);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
