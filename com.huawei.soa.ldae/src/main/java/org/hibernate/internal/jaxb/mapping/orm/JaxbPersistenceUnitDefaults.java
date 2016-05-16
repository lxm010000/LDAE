//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.22 at 11:46:25 AM CST 
//


package org.hibernate.internal.jaxb.mapping.orm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 These defaults are applied to the persistence unit as a whole unless they are overridden by local
 *                 annotation or XML element settings.
 *                 schema - Used as the schema for all tables, secondary tables, join tables, collection tables, sequence
 *                 generators, and table generators that apply to the persistence unit
 *                 catalog - Used as the catalog for all tables, secondary tables, join tables, collection tables, sequence
 *                 generators, and table generators that apply to the persistence unit
 *                 delimited-identifiers - Used to treat database identifiers as delimited identifiers.
 *                 access - Used as the access type for all managed classes in the persistence unit
 *                 cascade-persist - Adds cascade-persist to the set of cascade options in all entity relationships of the
 *                 persistence unit
 *                 entity-listeners - List of default entity listeners to be invoked on each entity in the persistence
 *                 unit.
 *             
 * 
 * <p>Java class for persistence-unit-defaults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistence-unit-defaults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delimited-identifiers" type="{http://java.sun.com/xml/ns/persistence/orm}emptyType" minOccurs="0"/>
 *         &lt;element name="access" type="{http://java.sun.com/xml/ns/persistence/orm}access-type" minOccurs="0"/>
 *         &lt;element name="cascade-persist" type="{http://java.sun.com/xml/ns/persistence/orm}emptyType" minOccurs="0"/>
 *         &lt;element name="entity-listeners" type="{http://java.sun.com/xml/ns/persistence/orm}entity-listeners" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistence-unit-defaults", propOrder = {
    "description",
    "schema",
    "catalog",
    "delimitedIdentifiers",
    "access",
    "cascadePersist",
    "entityListeners"
})
public class JaxbPersistenceUnitDefaults {

    protected String description;
    protected String schema;
    protected String catalog;
    @XmlElement(name = "delimited-identifiers")
    protected JaxbEmptyType delimitedIdentifiers;
    protected JaxbAccessType access;
    @XmlElement(name = "cascade-persist")
    protected JaxbEmptyType cascadePersist;
    @XmlElement(name = "entity-listeners")
    protected JaxbEntityListeners entityListeners;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the delimitedIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEmptyType }
     *     
     */
    public JaxbEmptyType getDelimitedIdentifiers() {
        return delimitedIdentifiers;
    }

    /**
     * Sets the value of the delimitedIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEmptyType }
     *     
     */
    public void setDelimitedIdentifiers(JaxbEmptyType value) {
        this.delimitedIdentifiers = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbAccessType }
     *     
     */
    public JaxbAccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbAccessType }
     *     
     */
    public void setAccess(JaxbAccessType value) {
        this.access = value;
    }

    /**
     * Gets the value of the cascadePersist property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEmptyType }
     *     
     */
    public JaxbEmptyType getCascadePersist() {
        return cascadePersist;
    }

    /**
     * Sets the value of the cascadePersist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEmptyType }
     *     
     */
    public void setCascadePersist(JaxbEmptyType value) {
        this.cascadePersist = value;
    }

    /**
     * Gets the value of the entityListeners property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEntityListeners }
     *     
     */
    public JaxbEntityListeners getEntityListeners() {
        return entityListeners;
    }

    /**
     * Sets the value of the entityListeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEntityListeners }
     *     
     */
    public void setEntityListeners(JaxbEntityListeners value) {
        this.entityListeners = value;
    }

}
