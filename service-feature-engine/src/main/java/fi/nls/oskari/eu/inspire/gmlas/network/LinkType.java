package fi.nls.oskari.eu.inspire.gmlas.network;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import fi.nls.oskari.eu.inspire.util.Reference;
import fi.nls.oskari.fe.input.jackson.GeometryProperty;


@JacksonXmlRootElement(namespace="urn:x-inspire:specification:gmlas:Network:3.2")
public class LinkType extends GeneralisedLinkType {


    public GeometryProperty centrelineGeometry ;
    
    public boolean fictitious ;
    
    public Reference endNode ;
    public Reference startNode ;
}
