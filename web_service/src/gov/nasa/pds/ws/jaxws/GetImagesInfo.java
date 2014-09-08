
package gov.nasa.pds.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.5.2
 * Thu Apr 26 23:51:09 EEST 2012
 * Generated source version: 2.5.2
 */

@XmlRootElement(name = "getImagesInfo", namespace = "http://pds.nasa.gov/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImagesInfo", namespace = "http://pds.nasa.gov/", propOrder = {"page", "restriction"})

public class GetImagesInfo {

    @XmlElement(name = "page")
    private gov.nasa.pds.entities.Page page;
    @XmlElement(name = "restriction")
    private gov.nasa.pds.entities.Restriction restriction;

    public gov.nasa.pds.entities.Page getPage() {
        return this.page;
    }

    public void setPage(gov.nasa.pds.entities.Page newPage)  {
        this.page = newPage;
    }

    public gov.nasa.pds.entities.Restriction getRestriction() {
        return this.restriction;
    }

    public void setRestriction(gov.nasa.pds.entities.Restriction newRestriction)  {
        this.restriction = newRestriction;
    }

}

