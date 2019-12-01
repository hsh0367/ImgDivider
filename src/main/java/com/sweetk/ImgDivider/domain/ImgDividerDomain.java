package com.sweetk.ImgDivider.domain;

import java.util.Date;

public class ImgDividerDomain {
    private int image_no;
    private String person_nm;
    private String link;
    private String hash;
    private Date reg_dt;
    private String face_box;
    private String img_path;
    private int folder_no;
    private boolean img_use;

    public boolean isImg_use() {
        return img_use;
    }

    public void setImg_use(boolean img_use) {
        this.img_use = img_use;
    }

    public int getFolder_no() {
        return folder_no;
    }

    public void setFolder_no(int folder_no) {
        this.folder_no = folder_no;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public String getFace_box() {
        return face_box;
    }

    public void setFace_box(String face_box) {
        this.face_box = face_box;
    }

    public Date getReg_dt() {
        return reg_dt;
    }

    public void setReg_dt(Date reg_dt) {
        this.reg_dt = reg_dt;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPerson_nm() {
        return person_nm;
    }

    public void setPerson_nm(String person_nm) {
        this.person_nm = person_nm;
    }

    public int getImage_no() {
        return image_no;
    }

    public void setImage_no(int image_no) {
        this.image_no = image_no;
    }
}
