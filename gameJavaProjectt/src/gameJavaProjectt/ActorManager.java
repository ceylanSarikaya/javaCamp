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
			System.out.println("Kullan�c� bilgileri eksik ya da hatal�d�r!");
		}
		
	}

	public void delete(Actor actor) {
		System.out.println("Kullan�c� silindi");
		
	}

	public void update(Actor actor) {
		System.out.println("Kullan�c� g�ncellendi");
		
	}

}
