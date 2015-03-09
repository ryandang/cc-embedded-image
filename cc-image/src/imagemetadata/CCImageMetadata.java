//CCImageMetadata.java

package imagemetadata;
import java.io.*;
import java.util.*;
import constants.*;
import licenses.*;

public class CCImageMetadata {

	private String author;
	private Date creationDate;
	private License license;
	
	//constructor
	public CCImageMetadata() {}
	public CCImageMetadata(String author, License license, Date creationDate) {}
	//Get methods
	public String getAuthor() {
		return author;
	}
	public License getLicense() {
		return license;
	}
	public Date getCreationDate() {
		return creationDate;
	}

	//Set methods
	public void setAuthor(String author) {}
	public void setLicense(License license) {}
	public void setDate(Date date) {}

}

