package com.langtai.model;

import java.util.List;

import javax.persistence.*;

import com.alibaba.fastjson.JSON;

/**
 * 与色素有关的model类
 * @author wang
 *
 */
@Entity
public class Pigment {

	private int id;
	private int order;
	private String appearance;//外观
	private String content;//含量
	private String packing;//包装
	private String description;//描述
	private String picturesListJson;
	private List<String> pictures;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getAppearance() {
		return appearance;
	}
	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPacking() {
		return packing;
	}
	public void setPacking(String packing) {
		this.packing = packing;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicturesListJson() {
		return picturesListJson;
	}
	public void setPicturesListJson(String picturesListJson) {
		this.picturesListJson = picturesListJson;
	}
	
	@Transient
	public List<String> getPictures() {
		if(pictures != null)
			return pictures;
		pictures = JSON.parseArray(picturesListJson, String.class);
		return pictures;
	}
	
}
