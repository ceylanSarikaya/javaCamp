package interitanceTwo;

public class DatabaseLogger extends Logger{
	//logger icinde log olmasýna ragmen burda ayrý bir log tutmasýna override(üzerine yazýlma) denir
	//@Override bunun anlamý logger bu metot var ama ben bunu burda ezdým demek
	@Override
	public void log() {
		System.out.println("database loglandý");
	}
}
