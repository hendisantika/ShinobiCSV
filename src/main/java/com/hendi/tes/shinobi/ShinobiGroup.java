package com.hendi.tes.shinobi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShinobiGroup {

    @XmlElement(name = "shinobi")
    private List<Shinobi> shinobis = new ArrayList<Shinobi>();

    public List<Shinobi> getShinobis() {
        return shinobis;
    }

    public void setShinobis(List<Shinobi> shinobis) {
        this.shinobis = shinobis;
    }

}
