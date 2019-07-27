
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
 *         &lt;element name="GetListOftheProjectsResult" type="{http://tempuri.org/}ArrayOfProject" minOccurs="0"/>
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
    "getListOftheProjectsResult"
})
@XmlRootElement(name = "GetListOftheProjectsResponse")
public class GetListOftheProjectsResponse {

    @XmlElement(name = "GetListOftheProjectsResult")
    protected ArrayOfProject getListOftheProjectsResult;

    /**
     * Gets the value of the getListOftheProjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProject }
     *     
     */
    public ArrayOfProject getGetListOftheProjectsResult() {
        return getListOftheProjectsResult;
    }

    /**
     * Sets the value of the getListOftheProjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProject }
     *     
     */
    public void setGetListOftheProjectsResult(ArrayOfProject value) {
        this.getListOftheProjectsResult = value;
    }

}
