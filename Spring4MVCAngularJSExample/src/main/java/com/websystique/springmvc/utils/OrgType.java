package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "org_type")
public class OrgType {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "title")
    private String title;

    public OrgType(){}

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
}