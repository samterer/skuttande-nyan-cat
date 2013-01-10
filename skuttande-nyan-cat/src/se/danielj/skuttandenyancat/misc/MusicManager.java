package se.danielj.skuttandenyancat.misc;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class MusicManager {

	private static Music backgroundMusic;
	
	public static void init() {
		backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("music/nyan.ogg"));
		backgroundMusic.setVolume(0);
		backgroundMusic.setLooping(true);
	}
	
	public static void play(boolean play) {
		if (play) {
			backgroundMusic.play();
		} else {
			backgroundMusic.stop();
		}
	}
	
	public static void setVolume(float volume) {
		backgroundMusic.setVolume(volume);
	}
	
	public static void dispose() {
		backgroundMusic.dispose();
	}
}
