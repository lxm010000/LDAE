//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.22 at 11:46:25 AM CST 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nested-composite-element-element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nested-composite-element-element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parent" type="{http://www.hibernate.org/xsd/hibernate-mapping}parent-element" minOccurs="0"/>
 *         &lt;element name="tuplizer" type="{http://www.hibernate.org/xsd/hibernate-mapping}tuplizer-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="property" type="{http://www.hibernate.org/xsd/hibernate-mapping}property-element"/>
 *           &lt;element name="many-to-one" type="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-one-element"/>
 *           &lt;element name="any" type="{http://www.hibernate.org/xsd/hibernate-mapping}any-element"/>
 *           &lt;element name="nested-composite-element" type="{http://www.hibernate.org/xsd/hibernate-mapping}nested-composite-element-element"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nested-composite-element-element", propOrder = {
    "parent",
    "tuplizer",
    "propertyOrManyToOneOrAny"
})
public class JaxbNestedCompositeElementElement {

    protected JaxbParentElement parent;
    protected List<JaxbTuplizerElement> tuplizer;
    @XmlElements({
        @XmlElement(name = "nested-composite-element", type = JaxbNestedCompositeElementElement.class),
        @XmlElement(name = "any", type = JaxbAnyElement.class),
        @XmlElement(name = "many-to-one", type = JaxbManyToOneElement.class),
        @XmlElement(name = "property", type = JaxbPropertyElement.class)
    })
    protected List<Object> propertyOrManyToOneOrAny;
    @XmlAttribute
    protected String access;
    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String node;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbParentElement }
     *     
     */
    public JaxbParentElement getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbParentElement }
     *     
     */
    public void setParent(JaxbParentElement value) {
        this.parent = value;
    }

    /**
     * Gets the value of the tuplizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbTuplizerElement }
     * 
     * 
     */
    public List<JaxbTuplizerElement> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<JaxbTuplizerElement>();
        }
        return this.tuplizer;
    }

    /**
     * Gets the value of the propertyOrManyToOneOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbNestedCompositeElementElement }
     * {@link JaxbAnyElement }
     * {@link JaxbManyToOneElement }
     * {@link JaxbPropertyElement }
     * 
     * 
     */
    public List<Object> getPropertyOrManyToOneOrAny() {
        if (propertyOrManyToOneOrAny == null) {
            propertyOrManyToOneOrAny = new ArrayList<Object>();
        }
        return this.propertyOrManyToOneOrAny;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(String value) {
        this.access = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

}
