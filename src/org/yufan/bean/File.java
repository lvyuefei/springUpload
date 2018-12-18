package org.yufan.bean;

import java.util.Date;

/**
 * 
 * @author Administrator
 *
 */
public class File {

	private Integer id;
	private String name;
	private String path;
	private String ext;
	private String description;
	private Date created;
	private Date updated;

	private Integer userId;
	
	

	

	public File() {
		super();
	}

	public File(Integer id, String name, String path, String ext,
			String description, Date created, Date updated, Integer userId) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
		this.ext = ext;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "File [id=" + id + ", name=" + name + ", path=" + path
				+ ", ext=" + ext + ", description=" + description
				+ ", created=" + created + ", updated=" + updated + ", userId="
				+ userId + "]";
	}
	
}
