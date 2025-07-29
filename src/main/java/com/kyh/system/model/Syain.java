package com.kyh.system.model;

import java.util.Date;

public class Syain {

    @Override
	public String toString() {
		return "Syain [syainId=" + syainId + ", firstNameKanji=" + firstNameKanji + ", lastNameKanji=" + lastNameKanji
				+ ", firstNameKana=" + firstNameKana + ", lastNameKana=" + lastNameKana + ", firstNameEigo="
				+ firstNameEigo + ", lastNameEigo=" + lastNameEigo + ", seibetu=" + seibetu + ", tanjyobi=" + tanjyobi
				+ ", kokuseki=" + kokuseki + ", syussinn=" + syussinn + ", haigusya=" + haigusya + ", passportNum="
				+ passportNum + ", passportEndDate=" + passportEndDate + ", visaKikan=" + visaKikan + ", visaEndDate="
				+ visaEndDate + ", zairyuSikaku=" + zairyuSikaku + ", kojinNum=" + kojinNum + ", zairyuNum=" + zairyuNum
				+ ", syouzokuKaisya=" + syozokuKaisya + ", nyuusyaDate=" + nyuusyaDate + ", taisyaDate=" + taisyaDate
				+ ", syokugyoKind=" + syokugyoKind + ", rainitiDate=" + rainitiDate + ", bikou=" + bikou + ", yuubin="
				+ yuubin + ", jyusyo1=" + jyusyo1 + ", jyusyo2=" + jyusyo2 + ", moyoriEki=" + moyoriEki + ", tel=" + tel
				+ ", email=" + email + ", wechat=" + wechat + ", line=" + line + ", bokokuJyuusyo=" + bokokuJyuusyo
				+ ", bokokuKinnkyuuRennraku=" + bokokuKinnkyuuRennraku + ", saisyuuGakureki=" + saisyuuGakureki
				+ ", gakkouName=" + gakkouName + ", sennmomName=" + sennmomName + ", sotugyoDate=" + sotugyoDate
				+ ", gyumuNensu=" + gyumuNensu + ", itOs=" + itOs + ", itGengo=" + itGengo + ", itDb=" + itDb
				+ ", itWebServer=" + itWebServer + ", itFw=" + itFw + ", itOther=" + itOther + ", itBikou=" + itBikou
				+ ", deleteFlag=" + deleteFlag + ", tourokubi=" + tourokubi + ", kousinnbi=" + kousinnbi + "]";
	}
	private Integer syainId;
    private String firstNameKanji;
    private String lastNameKanji;
    private String firstNameKana;
    private String lastNameKana;
    private String firstNameEigo;
    private String lastNameEigo;
    private Integer seibetu;
    private Date tanjyobi;
    private Integer kokuseki;
    private String syussinn;
    private Integer haigusya;
    private String passportNum;
    private Date passportEndDate;
    private Integer visaKikan;
    private Date visaEndDate;
    private Integer zairyuSikaku;
    private String kojinNum;
    private String zairyuNum;
    private Integer syozokuKaisya;
    private Date nyuusyaDate;
    private Date taisyaDate;
    private Integer syokugyoKind;
    private Date rainitiDate;
    private String bikou;
    private String yuubin;
    private String jyusyo1;
    private String jyusyo2;
    private String moyoriEki;
    private String tel;
    private String email;
    private String wechat;
    private String line;
    private String bokokuJyuusyo;
    private String bokokuKinnkyuuRennraku;
    private Integer saisyuuGakureki;
    private String gakkouName;
    private String sennmomName;
    private Date sotugyoDate;
    private Float gyumuNensu;
    private String itOs;
    private String itGengo;
    private String itDb;
    private String itWebServer;
    private String itFw;
    private String itOther;
    private String itBikou;
    private Integer deleteFlag;
    private Date tourokubi;
    private Date kousinnbi;
	

    public Integer getSyainId() { return syainId; }
    public void setSyainId(Integer syainId) { this.syainId = syainId; }

    public String getFirstNameKanji() { return firstNameKanji; }
    public void setFirstNameKanji(String firstNameKanji) { this.firstNameKanji = firstNameKanji; }

    public String getLastNameKanji() { return lastNameKanji; }
    public void setLastNameKanji(String lastNameKanji) { this.lastNameKanji = lastNameKanji; }

    public String getFirstNameKana() { return firstNameKana; }
    public void setFirstNameKana(String firstNameKana) { this.firstNameKana = firstNameKana; }

    public String getLastNameKana() { return lastNameKana; }
    public void setLastNameKana(String lastNameKana) { this.lastNameKana = lastNameKana; }

    public String getFirstNameEigo() { return firstNameEigo; }
    public void setFirstNameEigo(String firstNameEigo) { this.firstNameEigo = firstNameEigo; }

    public String getLastNameEigo() { return lastNameEigo; }
    public void setLastNameEigo(String lastNameEigo) { this.lastNameEigo = lastNameEigo; }

    public Integer getSeibetu() { return seibetu; }
    public void setSeibetu(Integer seibetu) { this.seibetu = seibetu; }

    public Date getTanjyobi() { return tanjyobi; }
    public void setTanjyobi(Date tanjyobi) { this.tanjyobi = tanjyobi; }

    public Integer getKokuseki() { return kokuseki; }
    public void setKokuseki(Integer kokuseki) { this.kokuseki = kokuseki; }

    public String getSyussinn() { return syussinn; }
    public void setSyussinn(String syussinn) { this.syussinn = syussinn; }

    public Integer getHaigusya() { return haigusya; }
    public void setHaigusya(Integer haigusya) { this.haigusya = haigusya; }

    public String getPassportNum() { return passportNum; }
    public void setPassportNum(String passportNum) { this.passportNum = passportNum; }

    public Date getPassportEndDate() { return passportEndDate; }
    public void setPassportEndDate(Date passportEndDate) { this.passportEndDate = passportEndDate; }

    public Integer getVisaKikan() { return visaKikan; }
    public void setVisaKikan(Integer visaKikan) { this.visaKikan = visaKikan; }

    public Date getVisaEndDate() { return visaEndDate; }
    public void setVisaEndDate(Date visaEndDate) { this.visaEndDate = visaEndDate; }

    public Integer getZairyuSikaku() { return zairyuSikaku; }
    public void setZairyuSikaku(Integer zairyuSikaku) { this.zairyuSikaku = zairyuSikaku; }

    public String getKojinNum() { return kojinNum; }
    public void setKojinNum(String kojinNum) { this.kojinNum = kojinNum; }

    public String getZairyuNum() { return zairyuNum; }
    public void setZairyuNum(String zairyuNum) { this.zairyuNum = zairyuNum; }

    public Integer getSyozokuKaisya() { return syozokuKaisya; }
    public void setSyozokuKaisya(Integer syouzokuKaisya) { this.syozokuKaisya = syouzokuKaisya; }

    public Date getNyuusyaDate() { return nyuusyaDate; }
    public void setNyuusyaDate(Date nyuusyaDate) { this.nyuusyaDate = nyuusyaDate; }

    public Date getTaisyaDate() { return taisyaDate; }
    public void setTaisyaDate(Date taisyaDate) { this.taisyaDate = taisyaDate; }

    public Integer getSyokugyoKind() { return syokugyoKind; }
    public void setSyokugyoKind(Integer syokugyoKind) { this.syokugyoKind = syokugyoKind; }

    public Date getRainitiDate() { return rainitiDate; }
    public void setRainitiDate(Date rainitiDate) { this.rainitiDate = rainitiDate; }

    public String getBikou() { return bikou; }
    public void setBikou(String bikou) { this.bikou = bikou; }

    public String getYuubin() { return yuubin; }
    public void setYuubin(String yuubin) { this.yuubin = yuubin; }

    public String getJyusyo1() { return jyusyo1; }
    public void setJyusyo1(String jyusyo1) { this.jyusyo1 = jyusyo1; }

    public String getJyusyo2() { return jyusyo2; }
    public void setJyusyo2(String jyusyo2) { this.jyusyo2 = jyusyo2; }

    public String getMoyoriEki() { return moyoriEki; }
    public void setMoyoriEki(String moyoriEki) { this.moyoriEki = moyoriEki; }

    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getWechat() { return wechat; }
    public void setWechat(String wechat) { this.wechat = wechat; }

    public String getLine() { return line; }
    public void setLine(String line) { this.line = line; }

    public String getBokokuJyuusyo() { return bokokuJyuusyo; }
    public void setBokokuJyuusyo(String bokokuJyuusyo) { this.bokokuJyuusyo = bokokuJyuusyo; }

    public String getBokokuKinnkyuuRennraku() { return bokokuKinnkyuuRennraku; }
    public void setBokokuKinnkyuuRennraku(String bokokuKinnkyuuRennraku) { this.bokokuKinnkyuuRennraku = bokokuKinnkyuuRennraku; }

    public Integer getSaisyuuGakureki() { return saisyuuGakureki; }
    public void setSaisyuuGakureki(Integer saisyuuGakureki) { this.saisyuuGakureki = saisyuuGakureki; }

    public String getGakkouName() { return gakkouName; }
    public void setGakkouName(String gakkouName) { this.gakkouName = gakkouName; }

    public String getSennmomName() { return sennmomName; }
    public void setSennmomName(String sennmomName) { this.sennmomName = sennmomName; }

    public Date getSotugyoDate() { return sotugyoDate; }
    public void setSotugyoDate(Date sotugyoDate) { this.sotugyoDate = sotugyoDate; }

    public Float getGyumuNensu() { return gyumuNensu; }
    public void setGyumuNensu(Float gyumuNensu) { this.gyumuNensu = gyumuNensu; }

    public String getItOs() { return itOs; }
    public void setItOs(String itOs) { this.itOs = itOs; }

    public String getItGengo() { return itGengo; }
    public void setItGengo(String itGengo) { this.itGengo = itGengo; }

    public String getItDb() { return itDb; }
    public void setItDb(String itDb) { this.itDb = itDb; }

    public String getItWebServer() { return itWebServer; }
    public void setItWebServer(String itWebServer) { this.itWebServer = itWebServer; }

    public String getItFw() { return itFw; }
    public void setItFw(String itFw) { this.itFw = itFw; }

    public String getItOther() { return itOther; }
    public void setItOther(String itOther) { this.itOther = itOther; }

    public String getItBikou() { return itBikou; }
    public void setItBikou(String itBikou) { this.itBikou = itBikou; }

    public Integer getDeleteFlag() { return deleteFlag; }
    public void setDeleteFlag(Integer deleteFlag) { this.deleteFlag = deleteFlag; }

    public Date getTourokubi() { return tourokubi; }
    public void setTourokubi(Date tourokubi) { this.tourokubi = tourokubi; }

    public Date getKousinnbi() { return kousinnbi; }
    public void setKousinnbi(Date kousinnbi) { this.kousinnbi = kousinnbi; }
}

