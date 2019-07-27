
package ptsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetListOfProjectsResult" type="{http://tempuri.org/}ArrayOfProject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getListOfProjectsResult"
})
@XmlRootElement(name = "GetListOfProjectsResponse")
public class GetListOfProjectsResponse {

    @XmlElement(name = "GetListOfProjectsResult")
    protected ArrayOfProject getListOfProjectsResult;

    /**
     * Gets the value of the getListOfProjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProject }
     *     
     */
    public ArrayOfProject getGetListOfProjectsResult() {
        return getListOfProjectsResult;
    }

    /**
     * Sets the value of the getListOfProjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProject }
     *     
     */
    public void setGetListOfProjectsResult(ArrayOfProject value) {
        this.getListOfProjectsResult = value;
    }

}
