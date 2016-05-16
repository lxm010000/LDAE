//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.22 at 11:46:25 AM CST 
//


package org.hibernate.internal.jaxb.mapping.orm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lock-mode-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lock-mode-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="READ"/>
 *     &lt;enumeration value="WRITE"/>
 *     &lt;enumeration value="OPTIMISTIC"/>
 *     &lt;enumeration value="OPTIMISTIC_FORCE_INCREMENT"/>
 *     &lt;enumeration value="PESSIMISTIC_READ"/>
 *     &lt;enumeration value="PESSIMISTIC_WRITE"/>
 *     &lt;enumeration value="PESSIMISTIC_FORCE_INCREMENT"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lock-mode-type")
@XmlEnum
public enum JaxbLockModeType {

    READ,
    WRITE,
    OPTIMISTIC,
    OPTIMISTIC_FORCE_INCREMENT,
    PESSIMISTIC_READ,
    PESSIMISTIC_WRITE,
    PESSIMISTIC_FORCE_INCREMENT,
    NONE;

    public String value() {
        return name();
    }

    public static JaxbLockModeType fromValue(String v) {
        return valueOf(v);
    }

}
