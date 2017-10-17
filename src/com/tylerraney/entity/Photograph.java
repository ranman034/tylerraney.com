package com.tylerraney.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

	@ManyToMany(
			fetch=FetchType.LAZY,
			cascade = {CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
    		name = "photograph_tag",
    		joinColumns = @JoinColumn(name = "photograph_id"),
    		inverseJoinColumns = @JoinColumn(name = "tag_id")
    		)
	private Set<Tag> phototags;

	public Photograph() {
		
	}
	
	public Photograph(String title, String photoLocation, String thumbnailLocation, String tags, Set<Tag> phototags) {
		this.title = title;
		this.photoLocation = photoLocation;
		this.thumbnailLocation = thumbnailLocation;
		this.tags = tags;
		this.phototags = phototags;
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
		return tags.toLowerCase();
	}

	public void setTags(String tags) {
		this.tags = tags.toLowerCase();
	}
	
    public Set<Tag> getPhotoTags() {
        return phototags;
    }
	
	public void setPhotoTags(Set<Tag> phototags) {
        this.phototags = phototags;
    }
	
	// add tag
	public void addTag(Tag theTag) {
		if (phototags == null){
			phototags = new HashSet<Tag>();
		}
		
		phototags.add(theTag);
	}

	@Override
	public String toString() {
		return "Photograph [id=" + id + ", title=" + title + ", photoLocation=" + photoLocation + ", thumbnailLocation="
				+ thumbnailLocation + ", tags=" + tags + "]";
	}
}
