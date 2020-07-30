package vo;

import java.util.Calendar;

public class MovieVO {
	//영화 : 영화번호(PK), 영화명, 관람연령, 출연진, 감독, 줄거리, 러닝타임
	
	private int movieNum;  //영화번호
	private String movieName;  //영화명
	private String movieRating;  //관람연령
	private String movieCast;  //출연진
	private String movieDirector;  //감독
	private String movieStory;  //줄거리
	private Calendar runTime;   //러닝타임
	private boolean state;  //true:존재  false:삭제
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	public String getMovieCast() {
		return movieCast;
	}
	public void setMovieCast(String movieCast) {
		this.movieCast = movieCast;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieStory() {
		return movieStory;
	}
	public void setMovieStory(String movieStory) {
		this.movieStory = movieStory;
	}
	public Calendar getRunTime() {
		return runTime;
	}
	public void setRunTime(Calendar runTime) {
		this.runTime = runTime;
	}
	
	
}
