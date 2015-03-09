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
	
	public CCImageTest() {
		ccimage = new CCImage();
	}
	//test 
	public void testCCImageHasLicense() {
	
		System.out.println("Test has licence");	
		try {
			uri = new URI("testImages/imageWithLicense.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}

		assertTrue("Failure - hasLicense should return true", ccimage.hasLicense(uri));
	}

	public void testCCImageHasNoLicense() {
		try {
			uri = new URI("testImages/imageWithNoLicense.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		assertFalse("Failure - hasLicense should return false", ccimage.hasLicense(uri));
	}
	
	public void testCCImageHasMetadata() {
		try {
			uri = new URI("testImages/imageWithMetadata.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		assertTrue("Failure - hasMetadata should return true", ccimage.hasMetadata(uri));
	}

	public void testCCImageHasNoMetadata() {
		try {
			uri = new URI("testImages/imageWithNoMetadata.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		
		assertFalse("Failure - hasMetadata should return false", ccimage.hasMetadata(uri));
	}	
	
	public void testCCImageGetImageTypePNG() {
		try {
		uri = new URI("testImages/imageWithNoMetadata.png");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		assertEquals("Failure - getImageType should return png", "png", ccimage.getImageType(uri));
	}

	public void testCCImageGetImageTypeJPEG() {
		try {
			uri = new URI("testImages/imageWithNoMetadata.jpeg");
		}
		catch (URISyntaxException e) {
			System.out.println("URI is a malformed URL");
		}
		assertEquals("Failure - getImageType should return jpeg", "jpeg", ccimage.getImageType(uri));
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

