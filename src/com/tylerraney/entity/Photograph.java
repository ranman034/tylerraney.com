package com.tylerraney.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="photograph")
public class Photograph implements Serializable {
	
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="photograph_id_seq",
                       sequenceName="photograph_id_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="photograph_id_seq")
    @Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="photo_loc")
	private String photoLocation;
	
	@Column(name="thumb_loc")
	private String thumbnailLocation;
	
	@Column(name="tags")
	private String tags;

	public Photograph() {
		
	}
	
	public Photograph(String title, String photoLocation, String thumbnailLocation, String tags) {
		this.title = title;
		this.photoLocation = photoLocation;
		this.thumbnailLocation = thumbnailLocation;
		this.tags = tags;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhotoLocation() {
		return photoLocation;
	}

	public void setPhotoLocation(String photoLocation) {
		this.photoLocation = photoLocation;
	}

	public String getThumbnailLocation() {
		return thumbnailLocation;
	}

	public void setThumbnailLocation(String thumbnailLocation) {
		this.thumbnailLocation = thumbnailLocation;
	}

	public String getTags() {
		//int length = this.tags != null ? this.tags.length : 0;
		//String[] tempTags = new String[length];
		//for (int i = 0; i < length; i++)
		//{
		//	tempTags[i] = this.tags[i].toLowerCase();
		//}
		
		return tags.toLowerCase();
	}

	public void setTags(String tags) {
		//String[] tempTags = new String[tags.length];
		//for (int i = 0; i < tags.length; i++)
		//{
		//	tempTags[i] = tags[i].toLowerCase();
		//}
		
		this.tags = tags.toLowerCase();
	}

	@Override
	public String toString() {
		return "Photograph [id=" + id + ", title=" + title + ", photoLocation=" + photoLocation + ", thumbnailLocation="
				+ thumbnailLocation + ", tags=" + tags + "]";
	}
}
