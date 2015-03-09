// CCImage.java
package ccimage;
import java.io.*;
import java.net.*;
import imagemetadata.*;
import constants.*;
import licenses.*;

public class CCImage
{

	private Constants constants;
	private CCImageMetadata metadata;
	private URI uri;
	
	//constructor	
	public CCImage(URI data) {
		uri = data;
	}

	public CCImage() {  	
	}
	
	//check if image already have metadata
	public boolean hasMetadata() {
		return true;
	}	
	
	//check if image already have license
	public boolean hasLicense() {
		return true;
	}

	public void addImageMetadata (CCImageMetadata metadata, URI uri, URI output) {}
	public void updateImageMetadata (CCImageMetadata metadata, URI uri, URI output) {}
	public void updateAuthorName(String name) {}
	public void updateLicense(License license) {}
		
	// extract metadata from image uri
	public CCImageMetadata extractmetadata() {
		return metadata;
	}

	public String getImageType() {
		return "png";
	}

}