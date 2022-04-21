package gameJavaProjectt;

public abstract class BaseActorService implements ActorService {
	public void add(Actor actor) {
		System.out.println("Kullanýcý eklendi" +actor.getFirstName());
	}
}
