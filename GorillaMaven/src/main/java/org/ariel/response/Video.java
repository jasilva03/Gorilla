package org.ariel.response;


public class Video {
	
	private String id;
	private String thumbnail;
	private String video_url;
	
	public Video(){
		
	}
	
	public Video(String id, String thumbnail, String video_url) {
		super();
		this.id = id;
		this.thumbnail = thumbnail;
		this.video_url = video_url;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", thumbnail=" + thumbnail + ", video_url=" + video_url + "]";
	}
	
}
