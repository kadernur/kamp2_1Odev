package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu="�nternet �ubesi";
		
		double dolarDun=8.15;
		double dolarBugun=8.18;
		
		int vade=36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);

		if(dolarBugun<dolarDun)
		{
			System.out.println("Dolar d��t� resmi");
		}
		else
		{
			System.out.println("Dolar y�kseldi");
		}
		
	}

}
