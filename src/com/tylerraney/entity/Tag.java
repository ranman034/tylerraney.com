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
@Table(name="tag")
public class Tag implements Serializable {
	
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="tag_id_seq",
                       sequenceName="tag_id_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="tag_id_seq")
    @Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	

	@ManyToMany(
			fetch=FetchType.LAZY,
			cascade = {CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
    		name = "photograph_tag",
    		joinColumns = @JoinColumn(name = "tag_id"),
    		inverseJoinColumns = @JoinColumn(name = "photograph_id")
    		)
	private Set<Photograph> photographs;
	
	public Tag(){
		
	}

	public Tag(int id, String name, Set<Photograph> photos) {
		this.id = id;
		this.name = name;
		this.photographs = photos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public Set<Photograph> getPhotographs() {
        return photographs;
    }

    public void setPhotographs(Set<Photograph> photos) {
        this.photographs = photos;
    }
    
    // add photograph
    public void addPhotograph(Photograph thePhoto) {
		if (photographs == null){
			photographs = new HashSet<Photograph>();
		}
		
		photographs.add(thePhoto);
    }

	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + "]";
	}
	
}
