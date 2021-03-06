package chapter02;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(){
		
	}
	
	public Song(String artist, String title){
//		this.artist=artist;
//		this.title=title;
		this(artist, title, null, null,0,0);
	}
	public Song(String artist, String title, String album, String composer, int track, int year){
		this.artist=artist;
		this.title=title;
		this.album=album;
		this.composer=composer;
		this.track=track;
		this.year=year;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void showi() {
		System.out.println( artist +" " + title + " ( " + album + ", " + year + ", " + 
				track + "번 track, " + composer + " 작곡)");
	}

	


}
