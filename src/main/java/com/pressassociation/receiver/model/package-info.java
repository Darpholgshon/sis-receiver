@XmlSchema(
        namespace = "http://www.satelliteinfo.co.uk/feed/master/hrdg",
        xmlns = { @XmlNs( prefix = "hrdg", namespaceURI = "http://www.satelliteinfo.co.uk/feed/master/hrdg" ),
                  @XmlNs( prefix = "xu", namespaceURI = "http://www.satelliteinfo.co.uk/feed/update" )},
        elementFormDefault = XmlNsForm.UNQUALIFIED)
package com.pressassociation.receiver.model;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

