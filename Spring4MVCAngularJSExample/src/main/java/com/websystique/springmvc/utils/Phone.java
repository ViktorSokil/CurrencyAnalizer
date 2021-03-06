package com.websystique.springmvc.utils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "phone")
public class Phone {

    @XmlAttribute(name="value")
    private String value;

    public Phone(){}

    public String getValue(){
        return value;
    }
    public void setValue(){
        this.value=value;
    }
}