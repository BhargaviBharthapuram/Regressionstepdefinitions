package stepDefinitions;

import java.io.File;

import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;
import java.util.Locale;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import TestGroup.BaseClass;

import io.appium.java_client.AppiumBy;

import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.internal.ThreadLocalRandom;

public class stepDefinitions extends BaseClass 
{
	AppiumDriverLocalService service;

	AndroidDriver driver;

	@Given("open the My airports app from the mobile device")

	public void open_the_my_airports_app_from_the_mobile_device() throws InterruptedException, MalformedURLException {

		/*
		 * 
		 * service = new AppiumServiceBuilder() .withAppiumJS(new File(
		 * 
		 * "C:\\Users\\Mind-Graph\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
		 * 
		 * )) .withIPAddress("127.0.0.1").usingPort(4723).build();
		 * 
		 * 
		 * 
		 * service.start();
		 * 
		 */

		UiAutomator2Options options = new UiAutomator2Options();

		options.setDeviceName("MyAndriodPhone2");

		options.setApp(
				"C:\\Users\\Bhargavi B\\eclipse-workspace\\TestArtfact\\src\\test\\java\\resources\\prod 5.apk");

		 Thread.sleep(2000);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		Thread.sleep(20000);

		System.out.println("inside MobileApp");

	}

	
	// Login with google button functionality

	@Then("Verify the functionality of LOGIN WITH GOOGLE Button in the Login Page")
	public void verify_the_functionality_of_login_with_google_button_in_the_login_page() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN WITH GOOGLE\"]")).click();
	}

	// 5. Functionality of english language button
	
	@Given("Click on the Bhasamalaysia language button and see the changes in the app text language")
	public void click_on_the_bhasamalaysia_language_button_and_see_the_changes_in_the_app_text_language()
			throws InterruptedException {
 
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='| BAHASA MALAYSIA |']")).click();
 
		Thread.sleep(3000);
 
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"TUKAR BAHASA\"]")).isDisplayed()) {
			System.out.println("Text language changed to Bhasamalaysia");
		}
		else 
		{
			System.out.println("Text language not changed to Bhasamalaysia");
		}
	}
 
	@Given("Click on the Chinese language button and see the changes in the app text language")
	public void click_on_the_chinese_language_button_and_see_the_changes_in_the_app_text_language()
			throws InterruptedException 
	{
		System.out.println("inside Chinese");
 
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='  中文']")).click();
		Thread.sleep(3000);
 
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"选择语言\"]")).isDisplayed()) 
		{
			System.out.println("Text language changed to Chinese");
		}
		else
		{
			System.out.println("Text language not changed to Chinese");
		}
	}
 
	@Given("Click on the english language button and see the changes in the app text language")
	public void click_on_the_english_language_button_and_see_the_changes_in_the_app_text_language()
			throws InterruptedException {
 
		System.out.println("inside English");
 
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"英文 \"]")).click();
		Thread.sleep(3000);
 
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CHANGE LANGUAGE\"]")).isDisplayed()) {
			System.out.println("Text language changed to English");
		}
 
		else
		{
			System.out.println("Text language not changed to English");
		}
	}
	
	// 6. Login/Sign up button functionality

	@Given("Click on the Login button in splash screen")
	public void click_on_the_login_button_in_splash_screen() throws InterruptedException {
		System.out.println("Click on Login Button");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN / SIGN UP   | \"]")).click();
		Thread.sleep(2000);
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" LOGIN\"]")).isDisplayed()) {
			System.out.println("User navigated from Splash screen to login page");
		}
 
		else
		{
			System.out.println("User didn't navigate from Splash screen to login page");
		}

		// driver.findElement(AppiumBy.xpath("//android.view.ViewGroup/android.widget.TextView[5]")).click();
	}
	
	// 7. Guest button functionality

	@Given("Click on the Guest button in splash screen")
	public void click_on_the_guest_button_in_splash_screen() throws InterruptedException {
		System.out.println("Click on Guest Button");

		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"   GUEST\"]")).click();
//		Thread.sleep(5000);
//		driver.findElement(AppiumBy.xpath(" //android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
//		Thread.sleep(3000);
//		// Survey popup
//		driver.findElement(AppiumBy.xpath(" //android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
//		Thread.sleep(3000);
//		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]")).isDisplayed()) {
//			System.out.println("User navigated from Splash screen to Home page");
//		}
// 
//		else
//		{
//			System.out.println("User didn't navigate from Splash screen to Home page");
//		}
//

	}

	// 9. back arrow functionality on login page

	@Then("the user should verify the functionality of the Back arrow")
	public void the_user_should_verify_the_functionality_of_the_back_arrow() throws InterruptedException {
		driver.findElement(AppiumBy.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"))
				.click();
		Thread.sleep(2000);
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN / SIGN UP   | \"]")).isDisplayed()) {
			System.out.println("User navigated from login page to Splash screen");
		}
 
		else
		{
			System.out.println("User didn't navigate from login page to Splash screen");
		}

	}

	// 10. Submit button functionality post entering the login credentials

	@Then("Give the login credentials and click on the Submit button")
	public void give_the_login_credentials_and_click_on_the_submit_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).sendKeys("iotuatproject@gmail.com");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).sendKeys("IOTuat@123");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
	}
//		Thread.sleep(20000)
//		driver.findElement(AppiumBy.xpath(" //android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
		@Then("Verify the Flow from login page to home page")
		public void verify_the_flow_from_login_page_to_home_page() throws InterruptedException {
			Thread.sleep(3000);
		
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]")).isDisplayed()) {
			System.out.println("User navigated from Login page to Home page");
		}
		else
		{
			System.out.println("User didn't navigate from Login page to Home page");
		}
	}

	// 11. sign up button functionality

		@Then("click on the Signup button in the login page and Verify the functionality")
		public void click_on_the_signup_button_in_the_login_page_and_verify_the_functionality() throws InterruptedException {
			System.out.println("Click on Signup Button");

			boolean isSignUpButtonVisible = isElementPresent(By.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]"));

			if (!isSignUpButtonVisible) {
				// Scroll down to make the Sign Up button visible
				scrollDown();
			}

			// Click the Sign Up button after scrolling (or if it's already visible)
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]")).click();
		}

		public boolean isElementPresent(By by) {
			try {
				driver.findElement(by);
				return true;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}

		public void scrollDown() {
			// Perform a scroll action to scroll down
			int startX = driver.manage().window().getSize().getWidth() / 2;
			int startY = driver.manage().window().getSize().getHeight() * 3 / 4;
			int endY = driver.manage().window().getSize().getHeight() / 4;

			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release()
					.perform();
		}


	// 12. Back arrow functionality in sign up page

	@Then("click the back arrow in the signup page and verify the functionality")
	public void then_click_the_back_arrow_in_the_signup_page_and_verify_the_functionality()	throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(2000);
	}

	// 14

	@When("we enter a valid First name {string} the First name is accepted and remove the text")
	public void we_enter_a_valid_first_name_the_first_name_is_accepted(String strFirstNameaPos) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement firstNaEelement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"));
		firstNaEelement.click();
		firstNaEelement.sendKeys(strFirstNameaPos);
		String input = firstNaEelement.getText();
		if (input.matches("^[a-zA-Z]+$")) {
		    // Input contains only alphabets (letters)
		    System.out.println("Input contains only alphabets.");
		} else {
		    // Input contains special characters or numbers
		    System.out.println("Input contains special characters or numbers.");
		}
		firstNaEelement.clear();
		
		Thread.sleep(2000);
		
	//	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]")).click();
		
		//android.widget.EditText[@text="Enter Last Name"]
		
	//	MobileElement element = (MobileElement) driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"));)
		
	}

	@Then("enter a First name with special characters {string} the special characters should not be allowed")
	public void enter_a_first_name_with_special_characters_the_special_characters_should_not_be_allowed(String strFirstNameNeg) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement firstNaEelement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"));
		firstNaEelement.clear();
		firstNaEelement.sendKeys(strFirstNameNeg);
		String str = firstNaEelement.getText();
		firstNaEelement.clear();
		Thread.sleep(2000);
		if (str.equalsIgnoreCase(strFirstNameNeg)) {
			System.out.println("First name is accepting special characters");
		} else

		{
			System.out.println("First name is not accepting special characters");
		}

	}
	
	@Then("enter a first name with {string} less than two characters should not be allowed")
	public void enter_a_first_name_with_less_than_two_characters_should_not_be_allowed(String strMinChar) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement firstNaEelement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"));
	//	WebElement lastNameElement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]"));
		firstNaEelement.sendKeys(strMinChar);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]")).click();
	//	lastNameElement.click();
		
		String text = firstNaEelement.getText();
			if(text.length() < 2) {    
				System.out.println("The text is less than 2 characters long: "+ text); 
			
//				WebElement errorMessage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"The length of first name must be between 2 to 50 characters\"]"));
//				errorMessage.isDisplayed();
			//	captureScreenshot("min_chars_error");
			}
			       
			else{
				System.out.println(	"The text is more than 2 characters long: "+ text); 
				}
			firstNaEelement.clear();
			firstNaEelement.click();
		
		Thread.sleep(2000);
	   
	}

	@Then("enter a first name with {string} more than fifty characters should not be allowed")
	public void enter_a_first_name_with_more_than_fifty_characters_should_not_be_allowed(String strMaxChar) throws InterruptedException	{
		Thread.sleep(2000);
		WebElement firstNaEelement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"));
		firstNaEelement.sendKeys(strMaxChar);
		String str = firstNaEelement.getText();
		firstNaEelement.clear();
		Thread.sleep(2000);
		if (str.equalsIgnoreCase(strMaxChar)) {
			System.out.println("First name is accepting more than 50 characters");
		} else

		{
			System.out.println("First name is not accepting more than 50 characters");
		}
		firstNaEelement.clear();
		
		Thread.sleep(2000);
	}
	
	// 15. 
	
	@When("we enter a valid Last name {string} the Last name is accepted and remove the text")
    public void enter_valid_last_name_and_remove_text(String strLastNamePos) throws InterruptedException {
        Thread.sleep(2000);
        WebElement lastNameElement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]"));
        lastNameElement.click();
        lastNameElement.sendKeys(strLastNamePos);
        
        String input = lastNameElement.getText();
        if (input.matches("^[a-zA-Z]+$")) {
            // Input contains only alphabets (letters)
            System.out.println("Input contains only alphabets.");
        } else {
            // Input contains special characters or numbers
            System.out.println("Input contains special characters or numbers.");
        }
        lastNameElement.clear();
        
        Thread.sleep(2000);
    }

    @Then("enter a Last name with special characters {string} the special characters should not be allowed")
    public void enter_last_name_with_special_characters(String strLastNameNeg) throws InterruptedException {
        Thread.sleep(2000);
        WebElement lastNameElement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]"));
        lastNameElement.clear();
        lastNameElement.sendKeys(strLastNameNeg);
        
        String str = lastNameElement.getText();
        lastNameElement.clear();
        
        Thread.sleep(2000);
        if (str.equalsIgnoreCase(strLastNameNeg)) {
            System.out.println("Last name is accepting special characters");
        } 
        else {
            System.out.println("Last name is not accepting special characters");
        }
    }

    @Then("enter a Last name with {string} less than two characters should not be allowed")
    public void enter_last_name_with_less_than_two_characters(String strMinChar) throws InterruptedException {
        Thread.sleep(2000);
        WebElement lastNameElement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]"));
      //  WebElement firstNaEelement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter First Name\"]"));
        lastNameElement.sendKeys(strMinChar);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]")).click();
      //  firstNaEelement.click();
        
        String text = lastNameElement.getText();
        if (text.length() < 2) {
            System.out.println("The text is less than 2 characters long: " + text);
            
            // Capture a screenshot when the condition is met
          //  captureScreenshot("min_chars_error");
        } else {
            System.out.println("The text is more than 2 characters long: " + text);
        }
        
        lastNameElement.clear();
        lastNameElement.click();
        
        Thread.sleep(2000);
    }
    
    @Then("enter a Last name with {string} more than fifty characters should not be allowed")
    public void enter_a_last_name_with_more_than_fifty_characters_should_not_be_allowed(String strMaxChar) throws InterruptedException {
    	Thread.sleep(2000);
    	WebElement lastNameElement = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]")); // Updated XPath
    	lastNameElement.sendKeys(strMaxChar);
    	String str = lastNameElement.getText(); // Updated variable name

    	lastNameElement.clear();
    	Thread.sleep(2000);

    	if (str.equalsIgnoreCase(strMaxChar)) {
    	    System.out.println("Last name is accepting more than 50 characters"); // Updated message
    	} else {
    	    System.out.println("Last name is not accepting more than 50 characters"); // Updated message
    	}
    	lastNameElement.clear();
    	Thread.sleep(2000);

    }
    
    //16
    
   @Then("Click on the Email Id text box and verify the functionality")
	public void click_on_the_email_id_text_box_and_verify_the_functionality() throws InterruptedException {
       Thread.sleep(2000);
       WebElement emailId = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]"));
       emailId.click();
       emailId.sendKeys("iotprojectgmail.com");
       
       String input = emailId.getText();
       if (input.matches("r'^[a-z0-9_.+-]+@[a-z0-9-]+\\.[a-z0-9-.]+$'")) {
           // Input contains only alphabets (letters)
           System.out.println("Valid email address.");
       } else {
           // Input contains special characters or numbers
           System.out.println("InValid email address.");
       }
     //  lastNameElement.clear();
       driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Email ID']")).clear();
       Thread.sleep(2000);
   }
	
   //17
   
	@Then("Click on the password text box and verify the functionality")
	public void click_on_the_password_text_box_and_verify_the_functionality() throws InterruptedException {
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]")).click();
	       Thread.sleep(2000);
	       WebElement password = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Password\"]"));
	       password.click();
	       password.sendKeys("iotpro");
	       
	       String input = password.getText();
	       if (input.matches("r'^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[a-zA-Z0-9!@#$%^&*()_+-]{8,}$'")) {
	           // Input contains only alphabets (letters)
	           System.out.println("Valid Password.");
	       } else {
	           // Input contains special characters or numbers
	           System.out.println("InValid Password.");
	       }
	     //  lastNameElement.clear();
	       driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Enter Password']")).clear();
	     //  Thread.sleep(2000);
	   }
    
    // 18. Country drop down functionality
    
    @Then("Now the Click on the country selection drop down and verify the functionality")
    public void now_the_click_on_the_country_selection_drop_down_and_verify_the_functionality() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
 	    Thread.sleep(1000);
    	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Albania\"]")).click();
    	Thread.sleep(1000);
    	if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Albania\"]")).isDisplayed()) {
	           // Input contains only alphabets (letters)
	           System.out.println("Country Selected from dropdown list");
	       } else {
	           // Input contains special characters or numbers
	           System.out.println("Given country is not selected");
	       }
    }
    
 // 19. Functionality of create account button
	
 	@Then("enter the required details in the sigup form and then click create account button and verify the functionality")
 	public void enter_the_required_details_in_the_sigup_form_and_then_click_create_account_button_and_verify_the_functionality() throws InterruptedException {
 	    // Assuming 'driver' is initialized properly before this point

 	   Thread.sleep(2000);
 	   driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter First Name\"]")).sendKeys("Bhargavi");
 	   driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Last Name\"]")).sendKeys("BH");
 	   driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Email ID']")).click();
 	   Thread.sleep(2000);
 	   int randomNum = ThreadLocalRandom.current().nextInt(1, 100000);
	     
 	   String str = String.valueOf(randomNum);

 //  	System.out.println(randomNum);
      	StringBuffer str1 = new StringBuffer("bhargavi");
      	str1.append(str);
 
      	System.out.println(str1);
   
      	str1.append("@gmail.com");
      	System.out.println(str1);
   
	   	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Email ID']")).sendKeys(str1);
// 	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Email ID']")).sendKeys("bharthapurambhargavi88@gmail.com");
	   	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]")).click();
	   	Thread.sleep(2000);
	   	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Enter Password']")).click();
	   	Thread.sleep(2000);
 	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Enter Password']")).sendKeys("Password@123");
 	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SIGN UP  \"]")).click();
 	    Thread.sleep(2000);
 	    driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
 	    Thread.sleep(1000);

 	    // Scroll until the desired element is visible
 	    boolean isElementFound = scrollUntilElementVisible(By.xpath("//android.widget.TextView[@text=\"Albania\"]"));
 	    
 	    if (isElementFound) {
 	        // Click the Sign Up button after scrolling (or if it's already visible)
 	    	Thread.sleep(1000);
 	        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Albania\"]")).click();
// 	        Thread.sleep(1000);
// 			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CREATE ACCOUNT\"]")).click();
 	    }
 	    Thread.sleep(1000);
 		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CREATE ACCOUNT\"]")).click();
 		Thread.sleep(3000);
 		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"VERIFY EMAIL\"]")).isDisplayed() )
		{
			System.out.println("User navigated from Signup page to Verify Email page");
		}
		else
		{
			System.out.println("User didn't  navigate from Signup page to Verify Email page");
		}

 	}

 	public boolean scrollUntilElementVisible(By by) {
 	    int maxScrolls = 12; // Set a maximum number of scrolls to avoid infinite loops

 	    for (int i = 0; i < maxScrolls; i++) {
 	        if (isElementPresentOrNot(by)) {
 	            return true;
 	        }

 	        // Perform a scroll action to scroll down
 	        scrollToDown();
 	    }

 	    return false; // Element not found after maximum scrolls
 	}

 	public boolean isElementPresentOrNot(By by) {
 	    try {
 	        driver.findElement(by);
 	        return true;
 	    } catch (org.openqa.selenium.NoSuchElementException e) {
 	        return false;
 	    }
 	}

 	public void scrollToDown() {
 	    // Perform a scroll action to scroll down
 	    int startX = driver.manage().window().getSize().getWidth() / 2;
 	    int startY = driver.manage().window().getSize().getHeight() * 3 / 4;
 	    int endY = driver.manage().window().getSize().getHeight() / 4;

 	    TouchAction touchAction = new TouchAction(driver);
 	    touchAction.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release().perform();
 	}
 	

	
	// 28. Login with facebook button functionality

		@Then("Verify the functionality of LOGIN WITH FACEBOOK button in the Login Page")
		public void verify_the_functionality_of_login_with_facebook_button_in_the_login_page() 
		{
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN WITH FACEBOOK\"]")).click();
		}
	
	// 38. forget password button functionality
	
	@Then("Click on the forget password button in login page")
	public void click_on_the_forget_password_button_in_login_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"FORGOT PASSWORD?\"]")).click();
		System.out.println("Reset password page is opened");
	}
	
	// 41. Back arrow functionality in reset password page
	
	@Then("Click on the back arrow on reset password page and verify the functionality of the Back arrow")
	public void click_on_the_back_arrow_on_reset_password_page_and_verify_the_functionality_of_the_back_arrow() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
	}
	
	// 43. functionality of Email ID field on reset password page
	
	@Then("Now click the Email text and verify the functionality")
	public void now_click_the_email_text_and_verify_the_functionality() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).sendKeys("bharthapurambhargavi88@gmail.com");
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		//driver.findElement(AppiumBy.xpath("//android.widget.ScrollView")).click();
//		Thread.sleep(3000);
//		if(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"PLEASE CHECK YOUR EMAIL AND ENTER THE VERIFICATION CODE BELOW.\"]")).isDisplayed())
//		{
//			System.out.println("Valid Email Id");
//		}
//		else
//		{
//			System.out.println("Invalid Email id");
//		}
		
	}

    // 45. 
	
	@Then("Click on the submit button post giving the email id")
	public void click_on_the_submit_button_post_giving_the_email_id() throws InterruptedException {
        Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		Thread.sleep(3000);
		if(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"PLEASE CHECK YOUR EMAIL AND ENTER THE VERIFICATION CODE BELOW.\"]")).isDisplayed())
		{
			System.out.println("User navigated to reset password popup screen");
		}
		else
		{
			System.out.println("User did not Navigate to reset password popup screen");
		}
	}
	
	// 46
	
	@Then("Now click the Email text box and Enter the wrong Email id")
	public void now_click_the_email_text_box_and_enter_the_wrong_email_id() throws InterruptedException {
		Thread.sleep(2000);
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).sendKeys("abcd@gmail.com");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"RESET PASSWORD\"]")).click();
		Thread.sleep(1000);
	}

	@Then("Click on the submit button post giving the invalid email id")
	public void click_on_the_submit_button_post_giving_the_invalid_email_id() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
		Thread.sleep(3000);
		if(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"UserId or Email Address must be valid\"]")).isDisplayed())
		{
			System.out.println("Error message is displayed");
		}
		else
		{
			System.out.println("Error message is not displayed");
		}

		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(1000);
		
	}
	
	// 48
	
	@Then("Click on the back arrow on reset popup screen and verify the functionality")
	public void click_on_the_back_arrow_on_reset_popup_screen_and_verify_the_functionality() throws InterruptedException {
        Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		if(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"RESET PASSWORD\"]")).isDisplayed())
		{
			System.out.println("User navigated from reset password popup screen to reset password page");
		}
		else
		{
			System.out.println("User did not Navigate from reset password popup screen to reset password page");
		}
	}
	
	// 55. Presence of Permission alert for location
	
	@Then("Verify the Location popup alert when user entered into the application for the first time")
	public void verify_the_location_popup_alert_when_user_entered_into_the_application_for_the_first_time() throws InterruptedException {
		Thread.sleep(20000);
	      WebElement locationPopup = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message\"]"));
	      if (locationPopup.isDisplayed())
	      {
	      	System.out.println("Loaction popup alert is displayed");
	      }
	      else 
	      {
	      	System.out.println("Loaction popup alert is not displayed");
	      }
	}
	
	// 56. Functionality of while using app button
	
	@Then("click on while using this app button")
	public void click_on_while_using_this_app_button() throws InterruptedException {
        Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
//		Thread.sleep(3000); 
//		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(3000);
		WebElement e = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]"));
		if (e.isDisplayed())
	      {
	      	System.out.println("The location is accessed while using the app");
	      }
	      else 
	      {
	      	System.out.println("The location is not accessed");
	      }
	}
	
	// 57. Functionality only this time button
	
	@Then("click on only this time button")
	public void click_on_only_this_time_button() throws InterruptedException {
        Thread.sleep(20000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_one_time_button\"]")).click();
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]")).isDisplayed())
	      {
	      	System.out.println("The location is accessed only this time");
	      }
	      else 
	      {
	      	System.out.println("The location is not accessed");
	      }
	}

	// 63 Survey popup X close button
	
	
	@Then("click on while using this app button and cross button")
	public void click_on_while_using_this_app_button_and_cross_button() throws InterruptedException {
        Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
		Thread.sleep(3000); 
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(3000);
		WebElement e = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]"));
		if (e.isDisplayed())
	      {
	      	System.out.println("The location is accessed while using the app");
	      }
	      else 
	      {
	      	System.out.println("The location is not accessed");
	      }
	}
	
//	@Then("Verify that when user click on X close button, popup should close")
//	public void verify_that_when_user_click_on_x_close_button_popup_should_close() throws InterruptedException {
//		Thread.sleep(3000);
//		// Survey popup
//		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
//		Thread.sleep(3000);
//		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]")).isDisplayed()) {
//			System.out.println("Survey Popup is closed");
//		}
// 
//		else
//		{
//			System.out.println("Survey Popup is not closed");
//		}
//	}
	
	// 64 
	
	@Then("Verify that survey popup should close after twenty sec automatically")
	public void verify_that_popup_should_close_after_twenty_sec_automatically() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();

		Thread.sleep(14000);
		
		if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]")).isDisplayed()) {
			System.out.println("Survey Popup is closed");
		}
 
		else
		{
			System.out.println("Survey Popup is not closed");
		}
		
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")).click();
		Thread.sleep(3000);
	}

	
	// 66. functionality of special assistance icon
	
	@Then("Click on the special assistance button in the home screen")
	public void click_on_the_special_assistance_button_in_the_home_screen() throws InterruptedException {
        Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]")).click();
		//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]
		Thread.sleep(2000);
	      WebElement homePage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SPECIAL ASSISTANCE \"]"));
	      if (homePage.isDisplayed())
	      {
	      	System.out.println("User Navigated from Home page to special assistance page");
	      }
	      else 
	      {
	      	System.out.println("User did not Navigate Home page to special assistance page");
	      }
	}
	
	// 70 Back arrow func on special assisstance page
	
	@Then("Click on the Back arrow on special assistance page and verify the Functionality of the Back arrow")
	public void click_on_the_back_arrow_on_special_assistance_page_and_verify_the_functionality_of_the_back_arrow() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2000);
	      WebElement homePage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HOME\"]"));
	      if (homePage.isDisplayed())
	      {
	      	System.out.println("User Navigated from special assistance page to Home page");
	      }
	      else 
	      {
	      	System.out.println("User did not Navigate special assistance page to Home page");
	      }
	}
	
	// 76. Presence of Travelling with childern service
	
	@Then("Verify the Presence of Travelling with childern service along with Icon in the SA landing page")
	public void verify_the_presence_of_travelling_with_childern_service_along_with_icon_in_the_sa_landing_page() throws InterruptedException {
        Thread.sleep(8000);
        WebElement travellingText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Travelling with children\"]"));
        WebElement travellingIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView[1]"));
        if (travellingText.isDisplayed() && travellingIcon.isDisplayed())
        {
        	System.out.println("User can see the Travelling with childern service along with Icon");
        }
        else {
        	System.out.println("User unable to see the Travelling with childern service along with icon");
        }
		
	}
	
	// 77. Presence Assistance for a person with redued mobility and hidden dsiabilities service

	@Then("Verify the Presence of Assistance for a person with redued mobility and hidden dsiabilities service along with Icon in the SA landing page")
	public void verify_the_presence_of_assistance_for_a_person_with_redued_mobility_and_hidden_dsiabilities_service_along_with_icon_in_the_sa_landing_page()throws InterruptedException {
        Thread.sleep(8000);
        WebElement assistanceText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Assistance for a person with reduced mobility and hidden disabilities\"]"));
        WebElement assistanceIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView[1]"));
        if (assistanceText.isDisplayed() && assistanceIcon.isDisplayed())
        {
        	System.out.println("User can see the Assistance for a person with redued mobility and hidden dsiabilities service along with Icon");
        }
        else {
        	System.out.println("User unable to see the Assistance for a person with redued mobility and hidden dsiabilities service along with icon");
        }
		
	}
	
	// 78. Presence of Others service icon
	
	@Then("Verify the Presence of Others service along with Icon in the SA landing page")
	public void verify_the_presence_of_others_service_along_with_icon_in_the_sa_landing_page() throws InterruptedException {
        Thread.sleep(8000);
        WebElement othersText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Others\"]"));
        WebElement othersIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView[1]"));
        if (othersText.isDisplayed() && othersIcon.isDisplayed())
        {
        	System.out.println("User can see the Others Service along with Icon");
        }
        else {
        	System.out.println("User unable to see the Other services along with icon");
        }
		
	}
	
	// 79. functionality of service pages
	
	@Then("Verify that user should be navigated to the services details page when clicked on any perticular service")
	public void verify_that_user_should_be_navigated_to_the_services_details_page_when_clicked_on_any_perticular_service() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Travelling with children\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Assistance for a person with reduced mobility and hidden disabilities\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Others\"]")).click();
		Thread.sleep(4000);
		WebElement othersService = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Others\"]"));
        if (othersService.isDisplayed())
        {
        	System.out.println("User navigated from SA page to Other services page");
        }
        else {
        	System.out.println("User didn't navigate from SA page to Other services page");
        }
//		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	   
	}
	
	// 81. 
	
	@Then("Verify that Services should be changed accordingly when terminal name is changed in the drop down in the services details page")
	public void verify_that_services_should_be_changed_accordingly_when_terminal_name_is_changed_in_the_drop_down_in_the_services_details_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 2\"]")).click();
		Thread.sleep(2000);
		WebElement terminalChange = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 2\"]"));
		if(terminalChange.isDisplayed())
		{
			System.out.println("Services has been changed");
        }
        else {
        	System.out.println("Services has not been changed");
        }
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
	}

	
	// 82. Back Arrow functionality of SA page through menu button
	
	@Then("click on menu button in the Home screen")
	public void click_on_menu_button_in_the_home_screen() {
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[3]/android.view.ViewGroup/android.widget.ImageView[1]")).click();
		
	}

	@Then("Click on the special assistance button in the menu")
	public void click_on_the_special_assistance_button_in_the_menu() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
		Thread.sleep(2000);
	}
	
	// 83. Functionality of my profile Icon
	
	@Then("Click on the User profile Icon in the home screen")
	public void click_on_the_user_profile_icon_in_the_home_screen() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")).click();
		Thread.sleep(3000);
	      WebElement userProfilePage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
	      if (userProfilePage.isDisplayed())
	      {
	      	System.out.println("User Navigated from Home page to User Profile Page");
	      }
	      else 
	      {
	      	System.out.println("User did not Navigate Home page to User Profile page");
	      }
	}

	// 85. Back arrow functionality in my profile page
	
	@Then("Click on the Back arrow in the My profile page and verify the Back flow")
	public void click_on_the_back_arrow_in_the_my_profile_page_and_verify_the_back_flow() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	}
	
	// 86. Functionality of logout button
	
	@Then("Click on the logout button in the My profile page")
	public void click_on_the_logout_button_in_the_my_profile_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Logout\"]")).click();
		Thread.sleep(2000);
	      WebElement logoutPopup = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup"));
	      if (logoutPopup.isDisplayed())
	      {
	      	System.out.println("The Pop up Displayed containing the Yes and I don't want to logout Buttons");
	      }
	      else 
	      {
	      	System.out.println("The popup didn't displayed");
	      }
	}
	
	// 88. Functionality of back arrow button on logout popup page
	
	@Then("Click on back arrow button in the pop up page")
	public void click_on_back_arrow_button_in_the_pop_up_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
	}
	
	@Then("Verify the Navigation from logout pop up page to My profile page")
	public void verify_the_navigation_from_logout_pop_up_page_to_my_profile_page() throws InterruptedException {
        Thread.sleep(8000);
        WebElement myProfilePage = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        if (myProfilePage.isDisplayed())
        {
        	System.out.println("User Navigated from logout pop up page to My profile page");
        }
        else {
        	System.out.println("The user did not navigate from the logout popup page to the My Profile page");
        }
		
	}
	
	// 89. Functionality of YES button on logout popup 
	
	@When("Click on Yes button in the pop up")
	public void click_on_yes_button_in_the_pop_up() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Yes\"]")).click();
	}
	
	@Then("Verify the Navigation from logout pop up page to home screen")
	public void verify_the_navigation_from_logout_pop_up_page_to_home_screen() throws InterruptedException {
        Thread.sleep(8000);
        WebElement homePage = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        if (homePage.isDisplayed())
        {
        	System.out.println("User Navigated from logout pop up page to Home page");
        }
        else {
        	System.out.println("The user did not navigate from the logout popup page to the Home page");
        }
		
	}

	// 90. Functionality of I don't want to logout button on logout popup
	
	@When("Click on I do not want to logout button in the pop up")
	public void click_on_i_do_not_want_to_logout_button_in_the_pop_up() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"I DO NOT WANT TO LOGOUT\"]")).click();
	}
	
	// 91. Camera icon functioinality on my profile page
	
	@When("Click on the Camera Icon beside the profile picture")
	public void click_on_the_camera_icon_beside_the_profile_picture()  throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	}

	@Then("Verify the Functionality of the Camera button")
	public void verify_the_functionality_of_the_camera_button() throws InterruptedException {
        Thread.sleep(8000);
        WebElement popup = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        if (popup.isDisplayed())
        {
        	System.out.println("edit photo pop up is dispalyed");
        }
        else {
        	System.out.println("edit photo pop up is not displayed");
        }
	}
	
	// 101. X button functionality on edot photo popup
	
	@When("Click on X button on the edit photo pop up button is clicked")
	public void click_on_x_button_on_the_edit_photo_pop_up_button_is_clicked() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	}

	@Then("Verify that edit photo pop up should be closed when X button is clicked")
	public void verify_that_edit_photo_pop_up_should_be_closed_when_x_button_is_clicked() throws InterruptedException {
        Thread.sleep(10000);
        WebElement popup = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
        if (popup.isDisplayed())
        {
        	System.out.println("edit photo pop up is  closed");
        }
        else {
        	System.out.println("edit photo pop up is not closed");
        }
	}
	
	// 102. Validation of "Use Camera", "from album" and "Clear" button functionality
	
	@Then("click on the Use Camera button and verify the Functionality of the button")
	public void click_on_the_use_camera_button_and_verify_the_functionality_of_the_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		WebElement cameraPage = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.android.camera2:id/mode_options_overlay\"]"));
	      if (cameraPage.isDisplayed())
	      {
	      	System.out.println("User Navigated to camera page");
	      }
	      else 
	      {
	      	System.out.println("User did not Navigate to camera page");
	      }
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Shutter\"]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Done\"]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
		Thread.sleep(3000);
	}
	
	@Then("click on the Use albums button and Verify the Functionality of the button")
	public void click_on_the_use_albums_button_and_verify_the_functionality_of_the_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"FROM ALBUM\"]")).click();
		Thread.sleep(3000);
		WebElement albumsPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Albums\"]"));
	      if (albumsPage.isDisplayed())
	      {
	      	System.out.println("User Navigated to albums page");
	      }
	      else 
	      {
	      	System.out.println("User did not Navigate to albums page");
	      }
	    driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Cancel\"]")).click();
		Thread.sleep(3000);
	}

	@Then("Finally click on the Clear button and Verify the Functionality of the Button")
	public void finally_click_on_the_clear_button_and_verify_the_functionality_of_the_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CLEAR\"]")).click();
		Thread.sleep(3000);
		WebElement userProfile = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView"));
	      if (userProfile.isDisplayed())
	      {
	      	System.out.println("User profile is removed");
	      }
	      else 
	      {
	      	System.out.println("User profile is not cleared");
	      }
	}

	// 107. Edit button functionality on user profile page
	
	@Then("Click on the Edit button beside the profile picture")
	public void click_on_the_edit_button_beside_the_profile_picture() throws InterruptedException {
      Thread.sleep(2000);
      WebElement editButton = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView"));
      editButton.click();
      Thread.sleep(2000);
      WebElement editProfile = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"EDIT  PROFILE\"]"));
      if (editProfile.isDisplayed())
      {
      	System.out.println("User Navigated from User profile page to Edit profile page");
      }
      else {
      	System.out.println("User did not Navigate from User profile page to Edit profile page");
      }
	}
	
	// 109. Functionality of the back arrow in the Edit profile page
	
	@Then("Verify the Functionality of the back arrow in the Edit profile page")
	public void verify_the_functionality_of_the_back_arrow_in_the_edit_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
	      backArrow.click();
	      Thread.sleep(6000);
	      WebElement userProfile = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
	      if (userProfile.isDisplayed())
	      {
	      	System.out.println("User Navigated from Edit profile page to User profile page");
	      }
	      else {
	      	System.out.println("User did not Navigate Edit profile page to User profile page");
	      }
	}
	
	//110
	
	@Then("Edit the Required fields of the user in the edit profile page and Click on the Save button and verify the Functionality of the save button")
	public void edit_the_required_fields_of_the_user_in_the_edit_profile_page_and_click_on_the_save_button_and_verify_the_functionality_of_the_save_button() throws InterruptedException {
		  Thread.sleep(2000);
		  String searchText = "Automation sample test";
	//	  String submitbutton = "submit";
	//	  WebElement before = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=str]"));  
		  
    //		  WebElement before = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='+searchText+']"));
		  
	//	  WebElement before = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+searchText+"']"));
		  
		  
		  WebElement before = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup/android.widget.TextView[3]"));
		  
		  
		  
	//	  By signinButton = By.xpath  ("//button[@type='"+submitbutton+"']");
		  
	//	  WebElement before = driver.findElement(AppiumBy.xpath("//*[contains(text(),"+searchText+"')]")); 
		  
		  
	//	  WebElement textField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='project ']"));
		  
		
		  
		  
		  
		//  driver.findElement(By.xpath("//*[contains(text(),'"+searchText+"')]"));
	      String beforeText = before.getText();
	      System.out.println(beforeText);
	      Thread.sleep(2000);
	      WebElement editProfile = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView"));
	      editProfile.click();
	      Thread.sleep(2000);
	      WebElement textField = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@hint='Enter Last Name']"));
	      textField.clear();
	      
	      String searchText1 = "sample test";
	      
	      textField.sendKeys(searchText1);
	      driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"EDIT  PROFILE\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SAVE\"]")).click();
	      Thread.sleep(20000);
	      driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	      Thread.sleep(2000);
	//      WebElement after = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='"+searchText1+"']"));  
	      WebElement after = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup/android.widget.TextView[3]")); 
	      
	      String afterText = after.getText();
	      Thread.sleep(2000);
			if (beforeText.equalsIgnoreCase(afterText)) {
				System.out.println("The edited details are not saved");
			} else

			{
				System.out.println("The edited details are saved");
			}
	}
	
	// 112. Functionality of Promotion icon on user profile page
	
	@When("Click on the promtions Icon in the my profile page")
	public void click_on_the_promtions_icon_in_the_my_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement promotionIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView"));
	      promotionIcon.click();
	}

	@Then("Verify the Flow between My profile page and promotions page when promotions icon is clicked")
	public void verify_the_flow_between_my_profile_page_and_promotions_page_when_promotions_icon_is_clicked() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement promotions = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"PROMOTIONS\"]"));
	      if (promotions.isDisplayed())
	      {
	      	System.out.println("User Navigated from User profile page to Promotiions page");
	      }
	      else {
	      	System.out.println("User did not Navigate User profile page to Promotiions page");
	      }
	}
	
	// 114. Functionality of Inbox icon
	@Then("Click on the Back arrow in promotions page")
	public void click_on_the_back_arrow_in_promotions_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(2000);
	}

	
	@When("Click on the Inbox Icon in the my profile page")
	public void click_on_the_inbox_icon_in_the_my_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement inboxIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView"));
	      inboxIcon.click();
	}

	@Then("Verify the Flow between My profile page and Inbox and Notices page when Inbox icon is clicked")
	public void verify_the_flow_between_my_profile_page_and_inbox_and_notices_page_when_inbox_icon_is_clicked() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement Inbox = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"INBOX\"]"));
	      if (Inbox.isDisplayed())
	      {
	      	System.out.println("User Navigated from User profile page to Inbox page");
	      }
	      else {
	      	System.out.println("User did not Navigate User profile page to Inbox page");
	      }
	}
	
	// 116. Back Arrow functionality of Inbox page
	
	@Then("Click on the Back arrow in Inbox & Notices page and verify the Navigation between inbox and profile page")
	public void click_on_the_back_arrow_in_inbox_notices_page_and_verify_the_navigation_between_inbox_and_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.ImageView"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement userProfile = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
	      if (userProfile.isDisplayed())
	      {
	      	System.out.println("User Navigated from Inbox page to User profile page");
	      }
	      else {
	      	System.out.println("User did not Navigate Inbox profile page to User profile page");
	      }
	}
	
	// 117. Functionality of Favorites Icon on user profile page 
	
	@When("Click on the Favourites Icon in the my profile page")
	public void click_on_the_favourites_icon_in_the_my_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement inboxIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView"));
	      inboxIcon.click();
	}

	@Then("Verify the flow between profile page and favourites page")
	public void verify_the_flow_between_profile_page_and_favourites_page() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement Inbox = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"FAVOURITES\"]"));
	      if (Inbox.isDisplayed())
	      {
	      	System.out.println("User Navigated from User profile page to Favorites page");
	      }
	      else 
	      {
	      	System.out.println("User did not Navigate User profile page to Favorites page");
	      }
	}
	
	// 119. Functionality of the back arrow in the fav page
	
	@Then("Click on back arrow on ATM page")
	public void click_on_back_arrow_on_atm_page() throws InterruptedException {
		Thread.sleep(2000);
	     driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	}

	
	@Then("Click on the Back arrow in Favourites page and verify the Navigation between Profile page and Favourites page")
	public void click_on_the_back_arrow_in_favourites_page_and_verify_the_navigation_between_profile_page_and_favourites_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement userProfile = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
	      if (userProfile.isDisplayed())
	      {
	      	System.out.println("User Navigated from Favorite page to User profile page");
	      }
	      else {
	      	System.out.println("User did not Navigate Favorite page to User profile page");
	      }
	}
	
	// 120
	
	@Then("Click on any favourite items and verify the Functionality of the tiles")
	public void click_on_any_favourite_items_and_verify_the_functionality_of_the_tiles() throws InterruptedException {
		Thread.sleep(2000);
		boolean atmMachineVisible = isElementPresent(By.xpath("//android.widget.TextView[@text=\"Celcom\"]"));

		if (!atmMachineVisible) {
			// Scroll down to make the Sign Up button visible
			scrollDown();
		}

		// Click the Sign Up button after scrolling (or if it's already visible)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Celcom\"]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//android.widget.TextView[@text=\"CELCOM\"]")).isDisplayed())
		{
			System.out.println("User navigated to the respective details page");
		}
		else
		{
			System.out.println("User didn't navigate to the respective details page");
		}
			
	}

	
	// 121
	
	@Then("Click on the Settings Icon in the my profile page")
	public void click_on_the_settings_icon_in_the_my_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement settingsIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView"));
	      settingsIcon.click();
	      Thread.sleep(2000);
	 //     WebElement changePwdButton = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Change&#10;Password\"]"))
	      WebElement settings = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SETTINGS\"]"));
	      if (settings.isDisplayed())
	      {
	      	System.out.println("User Navigated from User profile page to settings page");
	      }
	      else {
	      	System.out.println("User did not Navigate from User profile page to settings page");
	      }
	}
	
	// 123

	@Then("Click on the Back arrow in settings page and verify the Navigation between Profile page and settings page")
	public void click_on_the_back_arrow_in_settings_page_and_verify_the_navigation_between_profile_page_and_settings_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement settingsIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
	      settingsIcon.click();
	      Thread.sleep(2000);
	      WebElement hello = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
	      if (hello.isDisplayed())
	      {
	      	System.out.println("User Navigated from settings page to User profile page");
	      }
	      else {
	      	System.out.println("User did not Navigate from settings page to User profile page");
	      }
	}
	
	// 124 functionality of change password button in the settings page
	
	@Then("click on the change password button in the settings page")
	public void click_on_the_change_password_button_in_the_settings_page() throws InterruptedException {
	      Thread.sleep(3000);
	      WebElement changePwdButton = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Password')]"));
	      changePwdButton.click();
	      Thread.sleep(2000);
	      WebElement changePwdPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CHANGE  PASSWORD \"]"));
	      if (changePwdPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from settings page to Change Password Page");
	      }
	      else {
	      	System.out.println("User did not Navigate from settings page to Change Password Page");
	      }
	}
	
	//143
	
	@Then("Verify that Location Alert Pop up should be Displayed when User Entered into the App first Time")
	public void verify_that_location_alert_pop_up_should_be_displayed_when_user_entered_into_the_app_first_time() throws InterruptedException {
		 Thread.sleep(10000);
	      WebElement changePwdPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message\"]"));
	      if (changePwdPage.isDisplayed())
	      {
	      	System.out.println("The Location alert popup is displayed");
	      }
	      else {
	      	System.out.println("The Location alert popup didn't displayed");
	      }
	}
	
	// 147
	
	@Then("Click on back arrow on change password page")
	public void click_on_back_arrow_on_change_password_page() throws InterruptedException {
	      Thread.sleep(2000);
	      driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
	}

	@Then("Click on the Feedback Icon in the my profile page")
	public void click_on_the_feedback_icon_in_the_my_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement feedbackIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ImageView"));
	      feedbackIcon.click();
	      Thread.sleep(2000);
	      WebElement feedbackPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"You would like to…….\"]"));
	      if (feedbackPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from User profile page to feedback page");
	      }
	      else {
	      	System.out.println("User did not Navigate from User profile page to feedback page");
	      }
	}
	
	// 148
	
	@Then("Click on the Back arrow in feddback page and verify the Navigation between Profile page and feedback page")
	public void click_on_the_back_arrow_in_feddback_page_and_verify_the_navigation_between_profile_page_and_feedback_page() throws InterruptedException {
	      Thread.sleep(2000);
	      driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
	}

	@Then("Click on the General Icon in the my profile page")
	public void click_on_the_general_icon_in_the_my_profile_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement feedbackIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView"));
	      feedbackIcon.click();
	      Thread.sleep(2000);
	      WebElement feedbackPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"GENERAL\"]"));
	      if (feedbackPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from User profile page to General page");
	      }
	      else {
	      	System.out.println("User did not Navigate from User profile page to General page");
	      }
	}
	
	// 150

	@Then("Click on the Back arrow in General page and verify the Navigation between Profile page and General page")
	public void click_on_the_back_arrow_in_general_page_and_verify_the_navigation_between_profile_page_and_general_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement settingsIcon = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
	      settingsIcon.click();
	      Thread.sleep(2000);
	      WebElement hello = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
	      if (hello.isDisplayed())
	      {
	      	System.out.println("User Navigated from General page to User profile page");
	      }
	      else {
	      	System.out.println("User did not Navigate from General page to User profile page");
	      }
	}
	
	// 151
	
			@Then("click on the any share option verify the functionality of the share buttons")
			public void click_on_the_any_share_option_verify_the_functionality_of_the_share_buttons() throws InterruptedException {
			      Thread.sleep(2000);
			      // Click on YouTube Button
			      WebElement youtubeButton = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView"));
			      youtubeButton.click();
			      Thread.sleep(3000);
//			      WebElement donotAllow = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]"));
//			      donotAllow.click();
			   //   Thread.sleep(5000);
//			      WebElement sharingSite = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Subscribe to Malaysia Airports.\"]"));
			      
		//	      boolean bl = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@resource-id,'permission_message')]")).isDisplayed();
		//	      System.out.println(bl);
			      try
			      {
			      if (driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@resource-id,'permission_message')]")).isDisplayed())
			      {
			    	  driver.switchTo().alert().accept();
			      	System.out.println("User Navigated to respective Sharing site");
			      }
			      }
			      catch(Exception e)
			      {
			      	System.out.println("User did not Navigate to respective Sharing site");
			      }
			}
			
	
	// 152
	
	@Then("Click on the About icon and verify the flow between the general page and about page")
	public void click_on_the_about_icon_and_verify_the_flow_between_the_general_page_and_about_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement aboutIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView"));
	      aboutIcon.click();
	      Thread.sleep(2000);
	      WebElement aboutPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ABOUT\"]"));
	      if (aboutPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from General page to About page");
	      }
	      else {
	      	System.out.println("User did not Navigate from General page to About page");
	      }
	}
	
	//153

	@Then("Click on the Back arrow in About page and verify the Navigation between General page and about page")
	public void click_on_the_back_arrow_in_about_page_and_verify_the_navigation_between_general_page_and_about_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.ImageView"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement generalPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"GENERAL\"]"));
	      if (generalPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from About page to General page");
	      }
	      else {
	      	System.out.println("User did not Navigate from About page to General page");
	      }
	}
	
	//155

	@Then("Click on the Privacy policy icon and verify the flow between the general page and Privacy policy page")
	public void click_on_the_privacy_policy_icon_and_verify_the_flow_between_the_general_page_and_privacy_policy_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement privacyPolicyIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView"));
	      privacyPolicyIcon.click();
	      Thread.sleep(2000);
	      WebElement privacyPolicyPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"PRIVACY POLICY.\"]"));
	      if (privacyPolicyPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from General page to Privacy policy page");
	      }
	      else {
	      	System.out.println("User did not Navigate from General page to Privacy policy page");
	      }
	}
	
	//156

	@Then("Click on the Back arrow in Privacy policy page and verify the Navigation between General page and Privacy policy page")
	public void click_on_the_back_arrow_in_privacy_policy_page_and_verify_the_navigation_between_general_page_and_privacy_policy_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.ImageView"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement generalPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"GENERAL\"]"));
	      if (generalPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from Privacy policy page to General page");
	      }
	      else {
	      	System.out.println("User did not Navigate from Privacy policy page to General page");
	      }
	}
	
	// 158
	
	@Then("Click on the Contact us icon and verify the flow between the general page and Contact us page")
	public void click_on_the_contact_us_icon_and_verify_the_flow_between_the_general_page_and_contact_us_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement contactUsIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView"));
	      contactUsIcon.click();
	      Thread.sleep(2000);
	      WebElement contactUsPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"CONTACT  US\"]"));
	      if (contactUsPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from General page to Contact us page");
	      }
	      else {
	      	System.out.println("User did not Navigate from General page to Contact us page");
	      }
	}

	//159
	
	@Then("Click on the Back arrow in Contact us page and verify the Navigation between General page and Contact us page")
	public void click_on_the_back_arrow_in_contact_us_page_and_verify_the_navigation_between_general_page_and_contact_us_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement generalPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"GENERAL\"]"));
	      if (generalPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from Contact us page to General page");
	      }
	      else {
	      	System.out.println("User did not Navigate from Contact us page to General page");
	      }
	}
	
	// 161 contact number

	@Then("Now click the contact number and verify the functionality")
	public void now_click_the_contact_number_and_verify_the_functionality() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement dialPad = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.dialer:id/digits\"]"));
	      if (dialPad.isDisplayed())
	      {
	      	System.out.println("User Navigated from Contact us page to dial pad");
	      }
	      else {
	      	System.out.println("User did not Navigate from Contact us page to dial pad");
	      }
	}
	
	// 161 Emial ID
	
	@Then("Now click the Email ID and verify the functionality")
	public void now_click_the_email_id_and_verify_the_functionality() throws InterruptedException {
		Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement gMail = driver.findElement(AppiumBy.xpath("//androidx.viewpager.widget.ViewPager[@resource-id=\"com.google.android.gm:id/welcome_tour_pager\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout"));
	      if (gMail.isDisplayed())
	      {
	      	System.out.println("User Navigated from Contact us page to Gmail");
	      }
	      else {
	      	System.out.println("User did not Navigate from Contact us page to Gmail");
	      }
	}
	
	// 162

	@Then("click on back arrow on contact us page")
	public void click_on_back_arrow_on_contact_us_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on the Terms of use icon and verify the flow between the general page and Terms of use page")
	public void click_on_the_terms_of_use_icon_and_verify_the_flow_between_the_general_page_and_terms_of_use_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement TermsOfUseIcon = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView"));
	      TermsOfUseIcon.click();
	      Thread.sleep(2000);
	      WebElement TermsOfUsePage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"TERMS OF USE\"]"));
	      if (TermsOfUsePage.isDisplayed())
	      {
	      	System.out.println("User Navigated from General page to Terms of use page");
	      }
	      else {
	      	System.out.println("User did not Navigate from General page to Terms of use page");
	      }
	}
	
	// 163

	@Then("Click on the Back arrow in Terms of use page and verify the Navigation between General page and Terms of use page")
	public void click_on_the_back_arrow_in_terms_of_use_page_and_verify_the_navigation_between_general_page_and_terms_of_use_page() throws InterruptedException {
	      Thread.sleep(2000);
	      WebElement backArrow = driver.findElement(AppiumBy.xpath("//android.widget.ImageView"));
	      backArrow.click();
	      Thread.sleep(2000);
	      WebElement generalPage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"GENERAL\"]"));
	      if (generalPage.isDisplayed())
	      {
	      	System.out.println("User Navigated from Terms of use page to General page");
	      }
	      else {
	      	System.out.println("User did not Navigate from Terms of use page to General page");
	      }
	}
	
	
	 // Utility method to capture a screenshot
    private void captureScreenshot(String screenshotName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destination = "path_to_save_screenshots/" + screenshotName + ".png"; // Specify the destination path

            File finalDestination = new File(destination);
            FileUtils.copyFile(screenshot, finalDestination);
            System.out.println("Screenshot saved to: " + finalDestination.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("Failed to capture a screenshot: " + e.getMessage());
        }
    }
    @Then("close the mobile app")
	public void close_the_mobile_app() throws InterruptedException {
	      Thread.sleep(2000);
		driver.quit();
//		service.stop();
 
	}
  
}

