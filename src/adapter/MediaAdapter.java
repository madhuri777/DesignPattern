package adapter;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMusicPlayer;
	
	 public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer=new VLCpalyer();
		}else {
			advancedMusicPlayer=new MP4Player();
		}
	}
	
	@Override
	public void play(String audioType, String filename) {

	      if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playVLC(filename);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playMP4(filename);
	      }
		
	}

	
}
