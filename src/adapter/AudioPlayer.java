package adapter;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("file name of mp3 is: "+filename);
		}else {
			if(audioType.equalsIgnoreCase("VLC")||audioType.equalsIgnoreCase("MP4")) {
			
				mediaAdapter=new MediaAdapter(audioType);
				mediaAdapter.play(audioType, filename);
			}else {
				System.out.println("Invalid "+audioType+" formate not supported");
			}
		}
		
	}

	
}
