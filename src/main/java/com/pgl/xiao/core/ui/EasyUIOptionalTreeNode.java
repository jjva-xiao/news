package com.pgl.xiao.core.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EasyUIOptionalTreeNode implements Serializable {
    private String id;// 菜单id
    private String text;// 菜单名称
    private boolean checked;// 是否为选中
    private List<EasyUIOptionalTreeNode> children = new ArrayList<EasyUIOptionalTreeNode>();// 下级菜单

    public EasyUIOptionalTreeNode() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List<EasyUIOptionalTreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<EasyUIOptionalTreeNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "EasyUIOptionalTreeNode [id=" + id + ", text=" + text + ", checked=" + checked + ", children=" + children
                + "]";
    }

}
