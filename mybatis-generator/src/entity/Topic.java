package entity;

import java.util.Date;

public class Topic {
    private Integer id;

    private Integer uid;

    private String username;

    private String name;

    private String images;

    private String vedio;

    private Integer type;

    private Integer gameid;

    private Date updatetime;

    private Date createtime;

    private Integer status;

    private Integer showflag;

    private Integer sourceType;

    private Integer sharenum;

    private Integer messagenum;

    private Integer likenum;

    private Float grade;

    private Date recommendtime;

    private Integer recommendflag;

    private Integer groupflag;

    private Date starttime;

    private Date endtime;

    private Date pushtime;

    private String tags;

    private Integer silenceflag;

    private String gametabname;

    private Boolean homeflag;

    private Boolean styletype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getVedio() {
        return vedio;
    }

    public void setVedio(String vedio) {
        this.vedio = vedio == null ? null : vedio.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShowflag() {
        return showflag;
    }

    public void setShowflag(Integer showflag) {
        this.showflag = showflag;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getSharenum() {
        return sharenum;
    }

    public void setSharenum(Integer sharenum) {
        this.sharenum = sharenum;
    }

    public Integer getMessagenum() {
        return messagenum;
    }

    public void setMessagenum(Integer messagenum) {
        this.messagenum = messagenum;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public Date getRecommendtime() {
        return recommendtime;
    }

    public void setRecommendtime(Date recommendtime) {
        this.recommendtime = recommendtime;
    }

    public Integer getRecommendflag() {
        return recommendflag;
    }

    public void setRecommendflag(Integer recommendflag) {
        this.recommendflag = recommendflag;
    }

    public Integer getGroupflag() {
        return groupflag;
    }

    public void setGroupflag(Integer groupflag) {
        this.groupflag = groupflag;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getPushtime() {
        return pushtime;
    }

    public void setPushtime(Date pushtime) {
        this.pushtime = pushtime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getSilenceflag() {
        return silenceflag;
    }

    public void setSilenceflag(Integer silenceflag) {
        this.silenceflag = silenceflag;
    }

    public String getGametabname() {
        return gametabname;
    }

    public void setGametabname(String gametabname) {
        this.gametabname = gametabname == null ? null : gametabname.trim();
    }

    public Boolean getHomeflag() {
        return homeflag;
    }

    public void setHomeflag(Boolean homeflag) {
        this.homeflag = homeflag;
    }

    public Boolean getStyletype() {
        return styletype;
    }

    public void setStyletype(Boolean styletype) {
        this.styletype = styletype;
    }
}