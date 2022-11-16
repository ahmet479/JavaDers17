package JavaDers18;

public class MainClass {

	public static void main(String[] args) {
		//String diller = " arapca, farsca, ingilizce, turkce ";
		//System.out.println(diller.contains("turkce"));
		//contains:iceriyor mu yoksa icermiyor mu icermiyor mu?
		
		//System.out.println(diller.trim());
		//trim:Basta ve sondaki bosluklari kaldirir.
		
		//System.out.println(diller.charAt(13));
		//chatAt:Indexteki karakteri alir, gosterir.
		
		//System.out.println(diller.replace("turkce","fransizca"));
		//String icerisinde degisiklik yapar.
		String data = "Ben Java'yi Sevmiyorum.";
		System.out.println(data.replace("Sevmiyorum" , "seviyorum"));
		
		
		/*String isim3 = "ahmet";
		String isim4 = "hamza";
		
		System.out.println(isim3.compareTo("isim4"));*/
		//compareTo:Iki stringi ksrsilastirir.
		
	}

}
