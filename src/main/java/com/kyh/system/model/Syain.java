package com.kyh.system.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Syain {

	private Integer syainId;
    private String firstNameKanji;
    private String lastNameKanji;
    private Integer seibetu;
    private Integer syozokuKaisya;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date nyuusyaDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date taisyaDate;
    private Integer syokugyoKind;
    private String itOs;
    private String kinyukikanCode;
    private String kinyukikanName;
    private String sitenCode;
    private String sitenName;
    private Integer kouzaKind;
	private String kouzaNum;
    private String meigiName;
    private String employeeCode;

	@Override
	public String toString() {
		return "Syain [syainId=" + syainId + ", firstNameKanji=" + firstNameKanji + ", lastNameKanji=" + lastNameKanji
				+ ", seibetu=" + seibetu + ", syozokuKaisya=" + syozokuKaisya + ", nyuusyaDate=" + nyuusyaDate
				+ ", taisyaDate=" + taisyaDate + ", syokugyoKind=" + syokugyoKind + ", itOs=" + itOs
				+ ", kinyukikanCode=" + kinyukikanCode + ", kinyukikanName=" + kinyukikanName + ", sitenCode="
				+ sitenCode + ", sitenName=" + sitenName + ", kouzaKind=" + kouzaKind + ", kouzaNum=" + kouzaNum
				+ ", meigiName=" + meigiName + ", employeeCode=" + employeeCode + "]";
	}
    public Integer getSyainId() {
		return syainId;
	}
	public void setSyainId(Integer syainId) {
		this.syainId = syainId;
	}
	public String getFirstNameKanji() {
		return firstNameKanji;
	}
	public void setFirstNameKanji(String firstNameKanji) {
		this.firstNameKanji = firstNameKanji;
	}
	public String getLastNameKanji() {
		return lastNameKanji;
	}
	public void setLastNameKanji(String lastNameKanji) {
		this.lastNameKanji = lastNameKanji;
	}
	public Integer getSeibetu() {
		return seibetu;
	}
	public void setSeibetu(Integer seibetu) {
		this.seibetu = seibetu;
	}
	public Integer getSyozokuKaisya() {
		return syozokuKaisya;
	}
	public void setSyozokuKaisya(Integer syozokuKaisya) {
		this.syozokuKaisya = syozokuKaisya;
	}
	public Date getNyuusyaDate() {
		return nyuusyaDate;
	}
	public void setNyuusyaDate(Date nyuusyaDate) {
		this.nyuusyaDate = nyuusyaDate;
	}
	public Date getTaisyaDate() {
		return taisyaDate;
	}
	public void setTaisyaDate(Date taisyaDate) {
		this.taisyaDate = taisyaDate;
	}
	public Integer getSyokugyoKind() {
		return syokugyoKind;
	}
	public void setSyokugyoKind(Integer syokugyoKind) {
		this.syokugyoKind = syokugyoKind;
	}
	public String getItOs() {
		return itOs;
	}
	public void setItOs(String itOs) {
		this.itOs = itOs;
	}
	public String getKinyukikanCode() {
		return kinyukikanCode;
	}
	public void setKinyukikanCode(String kinyukikanCode) {
		this.kinyukikanCode = kinyukikanCode;
	}
	public String getKinyukikanName() {
		return kinyukikanName;
	}
	public void setKinyukikanName(String kinyukikanName) {
		this.kinyukikanName = kinyukikanName;
	}
	public String getSitenCode() {
		return sitenCode;
	}
	public void setSitenCode(String sitenCode) {
		this.sitenCode = sitenCode;
	}
	public String getSitenName() {
		return sitenName;
	}
	public void setSitenName(String sitenName) {
		this.sitenName = sitenName;
	}
	public Integer getKouzaKind() {
		return kouzaKind;
	}
	public void setKouzaKind(Integer kouzaKind) {
		this.kouzaKind = kouzaKind;
	}
	public String getKouzaNum() {
		return kouzaNum;
	}
	public void setKouzaNum(String kouzaNum) {
		this.kouzaNum = kouzaNum;
	}
	public String getMeigiName() {
		return meigiName;
	}
	public void setMeigiName(String meigiName) {
		this.meigiName = meigiName;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
    
	

}

