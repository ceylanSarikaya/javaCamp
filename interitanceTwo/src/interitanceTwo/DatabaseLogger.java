package interitanceTwo;

public class DatabaseLogger extends Logger{
	//logger icinde log olmas�na ragmen burda ayr� bir log tutmas�na override(�zerine yaz�lma) denir
	//@Override bunun anlam� logger bu metot var ama ben bunu burda ezd�m demek
	@Override
	public void log() {
		System.out.println("database logland�");
	}
}
