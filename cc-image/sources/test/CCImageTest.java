//CCImageTest.java

package test;
import java.io.*;
import constants.*;
import ccimage.*;
import java.net.*;
import junit.framework.*;
import static org.junit.Assert.assertEquals;

public class CCImageTest extends TestCase{ 

	private CCImage ccimage;
	private URI uri;
	
	public CCImageTest() {}
	//test 
	public void testCCImageHasLicense() {
	
		System.out.println("Test has licence");	
		try {
			uri = new URI("testImages/imageWithLicense.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}

		ccimage = new CCImage(uri);
		assertTrue("Failure - hasLicense should return true", ccimage.hasLicense());
	}

	public void testCCImageHasNoLicense() {
		try {
			uri = new URI("testImages/imageWithNoLicense.jpeg");			
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		ccimage = new CCImage(uri);		
		assertFalse("Failure - hasLicense should return false", ccimage.hasLicense());
	}
	
	public void testCCImageHasMetadata() {
		try {
			uri = new URI("testImages/imageWithMetadata.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		ccimage = new CCImage(uri);
		assertTrue("Failure - hasMetadata should return true", ccimage.hasMetadata());
	}

	public void testCCImageHasNoMetadata() {
		try {
			uri = new URI("testImages/imageWithNoMetadata.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		ccimage = new CCImage(uri);
		assertFalse("Failure - hasMetadata should return false", ccimage.hasMetadata());
	}	
	
	public void testCCImageGetImageTypePNG() {
		try {
		uri = new URI("testImages/imageWithNoMetadata.png");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		ccimage = new CCImage(uri);
		assertEquals("Failure - getImageType should return png", "png", ccimage.getImageType());
	}

	public void testCCImageGetImageTypeJPEG() {
		try {
			uri = new URI("testImages/imageWithNoMetadata.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		ccimage = new CCImage(uri);
		assertEquals("Failure - getImageType should return jpeg", "jpeg", ccimage.getImageType());
	}
	
	public void runAllTests(){
		testCCImageHasLicense();
		//testCCImageHasNoLicense();
		testCCImageHasMetadata();
		//testCCImageHasNoMetadata();
		testCCImageGetImageTypePNG();
		//testCCImageGetImageTypeJPEG();
	}
}

