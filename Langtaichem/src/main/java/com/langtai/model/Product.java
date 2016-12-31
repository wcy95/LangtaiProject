package com.langtai.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;

@Entity
public class Product {

	private int id;
	private int isIndex = 0;
	private int sorce;
	private String productName;
	private String chineseName;
	private String traditionalCNName;
	private String synonyms;//别名
	private String synonymsCN;
	private String trasynonymsCN;
	private String cas;//化学品编码
	private String es;//欧洲已存在商业化学物品目录
	private String molecularFormula;//化学式
	private String molecularWeight;//分子量
	private String productPicture;
	private String chemicalFormulaPicture;
	private String others;
	private String othersCN;
	private List<VisitLog> visitLogs;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String synonyms) {
		this.synonyms = synonyms;
	}
	public String getCas() {
		return cas;
	}
	public void setCas(String cas) {
		this.cas = cas;
	}
	public String getEs() {
		return es;
	}
	public void setEs(String es) {
		this.es = es;
	}
	public String getMolecularFormula() {
		return molecularFormula;
	}
	public void setMolecularFormula(String molecularFormula) {
		this.molecularFormula = molecularFormula;
	}
	public String getMolecularWeight() {
		return molecularWeight;
	}
	public void setMolecularWeight(String molecularWeight) {
		this.molecularWeight = molecularWeight;
	}
	
	public String getProductPicture() {
		return productPicture;
	}
	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}
	public String getChemicalFormulaPicture() {
		return chemicalFormulaPicture;
	}
	public void setChemicalFormulaPicture(String chemicalFormulaPicture) {
		this.chemicalFormulaPicture = chemicalFormulaPicture;
	}
	
	public String getTraditionalCNName() {
		return traditionalCNName;
	}
	public void setTraditionalCNName(String traditionalCNName) {
		this.traditionalCNName = traditionalCNName;
	}
	
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	
	@Type(type="text")
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	
	@Type(type="text")
	public String getOthersCN() {
		return othersCN;
	}
	public void setOthersCN(String othersCN) {
		this.othersCN = othersCN;
	}
	
	public String getSynonymsCN() {
		return synonymsCN;
	}
	public void setSynonymsCN(String synonymsCN) {
		this.synonymsCN = synonymsCN;
	}
	
	public String getTrasynonymsCN() {
		return trasynonymsCN;
	}
	public void setTrasynonymsCN(String trasynonymsCN) {
		this.trasynonymsCN = trasynonymsCN;
	}
	public int getIsIndex() {
		return isIndex;
	}
	public void setIsIndex(int isIndex) {
		this.isIndex = isIndex;
	}
	public int getSorce() {
		return sorce;
	}
	public void setSorce(int sorce) {
		this.sorce = sorce;
	}
	
	@ManyToMany(mappedBy="produces")
	@LazyCollection(LazyCollectionOption.EXTRA)
	public List<VisitLog> getVisitLogs() {
		return visitLogs;
	}
	public void setVisitLogs(List<VisitLog> visitLogs) {
		this.visitLogs = visitLogs;
	}
	public boolean equals(Product product) {
		if(this.id == product.getId())
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", isIndex=" + isIndex + ", sorce=" + sorce + ", productName=" + productName
				+ ", chineseName=" + chineseName + ", traditionalCNName=" + traditionalCNName + ", synonyms=" + synonyms
				+ ", synonymsCN=" + synonymsCN + ", trasynonymsCN=" + trasynonymsCN + ", cas=" + cas + ", es=" + es
				+ ", molecularFormula=" + molecularFormula + ", molecularWeight=" + molecularWeight
				+ ", productPicture=" + productPicture + ", chemicalFormulaPicture=" + chemicalFormulaPicture
				+ ", others=" + others + ", othersCN=" + othersCN + "]";
	}
	
	
}
