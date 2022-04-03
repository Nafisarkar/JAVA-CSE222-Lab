
public class DVDPlayer implements Player {

private String name="video";
	
	public void video() {
		System.out.println("Playing ! "+this.name);
	}
	
	@Override
	public void play() {
		System.out.println("Plays song!");
		
	}

	@Override
	public void stop() {
		System.out.println("Stops song!");
		
	}

	@Override
	public void pause() {
		System.out.println("pause song!");
		
	}

	@Override
	public void reverse() {
		System.out.println("Replay!");
		
	}

}
