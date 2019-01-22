package org.tact.base.mybatis.domain;

import java.io.Serializable;

public class Timezone implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String alias;

	private String offsettime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getOffsettime() {
		return offsettime;
	}

	public void setOffsettime(String offsettime) {
		this.offsettime = offsettime;
	}

	@Override
	public String toString() {
		return "Timezone [id=" + id + ", name=" + name + ", alias=" + alias
				+ ", offsettime=" + offsettime + "]";
	}	
}