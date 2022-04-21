package gameJavaProjectt;

public class ActorManager implements ActorService{
	ActorCheckService actorCheckService;

	public ActorManager(ActorCheckService actorCheckService) {
		super();
		this.actorCheckService = actorCheckService;
	}

	public void add(Actor actor) {
		if (actorCheckService.CheckIfRealPerson(actor)) {
			add(actor);
		}
		else {
			System.out.println("Kullanýcý bilgileri eksik ya da hatalýdýr!");
		}
		
	}

	public void delete(Actor actor) {
		System.out.println("Kullanýcý silindi");
		
	}

	public void update(Actor actor) {
		System.out.println("Kullanýcý güncellendi");
		
	}

}
