
package ptsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tasks" type="{http://tempuri.org/}ArrayOfTask" minOccurs="0"/>
 *         &lt;element name="TheCustomer" type="{http://tempuri.org/}Customer" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExpectedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Project", propOrder = {
    "tasks",
    "theCustomer",
    "name",
    "expectedStartDate",
    "expectedEndDate"
})
public class Project {

    @XmlElement(name = "Tasks")
    protected ArrayOfTask tasks;
    @XmlElement(name = "TheCustomer")
    protected Customer theCustomer;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ExpectedStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedStartDate;
    @XmlElement(name = "ExpectedEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedEndDate;

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTask }
     *     
     */
    public ArrayOfTask getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTask }
     *     
     */
    public void setTasks(ArrayOfTask value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the theCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getTheCustomer() {
        return theCustomer;
    }

    /**
     * Sets the value of the theCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setTheCustomer(Customer value) {
        this.theCustomer = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the expectedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedStartDate() {
        return expectedStartDate;
    }

    /**
     * Sets the value of the expectedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedStartDate(XMLGregorianCalendar value) {
        this.expectedStartDate = value;
    }

    /**
     * Gets the value of the expectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedEndDate() {
        return expectedEndDate;
    }

    /**
     * Sets the value of the expectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedEndDate(XMLGregorianCalendar value) {
        this.expectedEndDate = value;
    }

}
