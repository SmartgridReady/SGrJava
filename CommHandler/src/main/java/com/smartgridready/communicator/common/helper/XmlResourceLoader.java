package com.smartgridready.communicator.common.helper;

import java.io.IOException;
import java.io.StringReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;

public class XmlResourceLoader<T> {

    private Class<T> clazz;

    public XmlResourceLoader(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T load(String resourcePath, String xmlContent, boolean validate) throws IOException {

        T result = null;

		try {
			result = unmarshal(xmlContent);
		} catch (Exception e) {
			// ignore value errors unless validation enabled
            if (validate) {
                throw new IOException(e);
            }
		}

        if (result == null) {
			throw new IOException(String.format("Resource '%s' could not be loaded", resourcePath));
		}

		return result;
    }

    @SuppressWarnings("unchecked")
    private T unmarshal(String xmlContent) throws JAXBException, SAXException {
        // Get JAXBContext
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        
        // Create Unmarshaller
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        
        // Setup schema validator
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema tSchema = sf.newSchema(getClass().getClassLoader().getResource("SGrIncluder.xsd"));
        jaxbUnmarshaller.setSchema(tSchema);

        return (T) jaxbUnmarshaller.unmarshal(new StringReader(xmlContent));
    }
}
