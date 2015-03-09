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
	
	//constructor
	public void CCImage() {}
	
	//check if image already have metadata
	public boolean hasMetadata(URI uri) {
		return true;
	}	
	
	//check if image already have license
	public boolean hasLicense(URI uri) {
		return true;
	}

	public void addImageMetadata (CCImageMetadata metadata, URI uri,  boolean overWrite, URI output) {}
	
	public void updateAuthorName(String name, URI uri) {}
	public void updateLicense(License license, URI uri) {}
		
	// extract metadata from image uri
	public CCImageMetadata extractmetadata(URI uri) {
		return metadata;
	}

	public String getImageType(URI uri) {
		return "png";
	}

}