package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mkj on 2018/8/29.
 */
public class Menu implements Serializable {
    private Integer id;
    private String title;
    private String href;
    private String iconCls;
    private Integer parntId;
    private List<Menu> content;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", href='" + href + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", parntId=" + parntId +
                ", content=" + content +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Integer getParntId() {
        return parntId;
    }

    public void setParntId(Integer parntId) {
        this.parntId = parntId;
    }

    public List<Menu> getContent() {
        return content;
    }

    public void setContent(List<Menu> content) {
        this.content = content;
    }

    public Menu(Integer id, String title, String href, String iconCls, Integer parntId, List<Menu> content) {

        this.id = id;
        this.title = title;
        this.href = href;
        this.iconCls = iconCls;
        this.parntId = parntId;
        this.content = content;
    }

    public Menu() {

    }
}
