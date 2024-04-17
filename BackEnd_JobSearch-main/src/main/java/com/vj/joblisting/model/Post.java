package com.vj.joblisting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobCollection")
public class Post {
	@Id
	private String id;
    private String profile;
    private String desc;
    private int exp;
    private String location;
    private String techs[];

    public Post() {
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getTechs() {
		return techs;
	}

	public void setTechs(String[] techs) {
		this.techs = techs;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", profile=" + profile + ", desc=" + desc + ", exp=" + exp + ", location=" + location
				+ ", techs=" + Arrays.toString(techs) + "]";
	}

}
