
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

@XmlRootElement(name = "searchEntitiesResponse", namespace = "http://pds.nasa.gov/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchEntitiesResponse", namespace = "http://pds.nasa.gov/")

public class SearchEntitiesResponse {

    @XmlElement(name = "return")
    private gov.nasa.pds.entities.SearchResults _return;

    public gov.nasa.pds.entities.SearchResults getReturn() {
        return this._return;
    }

    public void setReturn(gov.nasa.pds.entities.SearchResults new_return)  {
        this._return = new_return;
    }

}

