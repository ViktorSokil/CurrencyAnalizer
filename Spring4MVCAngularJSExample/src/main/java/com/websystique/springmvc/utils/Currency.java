package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "c")
public class Currency {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "title")
    private String title;
    @XmlElement(name = "br")
    private Double buyRate;
    @XmlElement(name = "ar")
    private Double askRate;

    public Currency(){}

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
    public Double getBuyRate(){
        return buyRate;
    }
    public void setBuyRate(Double buyRate){
        this.buyRate=buyRate;
    }
    public Double getAskRate(){
        return askRate;
    }
    public void setAskRate(Double askRate){
        this.askRate=askRate;
    }
}
