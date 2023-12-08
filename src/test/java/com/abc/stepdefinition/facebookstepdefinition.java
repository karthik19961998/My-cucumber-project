package com.abc.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebookstepdefinition {
/*ChromeDriver driver;
	
	@Given("open the browser")
	public void Openbrowser()
	{
	 driver=new ChromeDriver();
	}
	@Given("navigate to {string} ")
	public void NavigateToUrl()
	{
		driver.get("https://www.facebook.com/login.php.com");
	}
	@When("enter a  valid email")
   public void EnterValidEmailId()
   {
	   driver.findElement(By.id("email")).sendKeys("karthicksuman45@gmail.com");
   }
	@When("enter a valid password")
   public void EnterValidPassword()
   {
	   driver.findElement(By.id("pass")).sendKeys("8951095943");
   }
	@When(" click on Log In Button")
   public void ClickOnLoginbutton()
   {
	   driver.findElement(By.xpath("//button[@class='login'])")).click();
   }
	@Then("verify home page")
   public void VerifyHomePage()
   {
	String expectedOutput="Friend requests";   
	String actualOutput=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/span/div/div[1]/h3/span/span")).getText(); 
	if (expectedOutput.equals(actualOutput))
	{
		System.out.println("Home page is opened after entering" +"valid credentials");
	}
	else
	{
		System.out.println("Home page is not displayed");
	}
	
	
  }*/

	/*ChromeDriver driver;
	@Given("open the browser")
	public void Openbrowser()

	{

		ChromeOptions options = new ChromeOptions(); 

		options.addArguments("disable-notifications");

		driver=new ChromeDriver(options);

	driver.manage().window().maximize();

	}

	@Given("navigate to {string} website")

	public void NavigateToUrl(String s)

	{

		driver.get(s);

	}

	@When("enter a valid email")

   public void EnteraValidEmail() throws InterruptedException

   {

	   driver.findElement(By.name("email")).sendKeys("karthicksuman45@gmail.com");

	   Thread.sleep(2000);

   }

	@When("enter a valid password")

   public void EnterValidPassword()

   {

	   driver.findElement(By.name("pass")).sendKeys("8951095943");

   }

	@When("click on Log in button")

   public void ClickOnLoginbutton()

   {

	   driver.findElement(By.name("login")).click();   	   

   }

	@When ("click on ok")

	public void ClickOk() throws InterruptedException

	{

		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();

		Thread.sleep(2000);

	}

	@When ("click on logout")

	public void ClickOnLogout()

	{

		driver.findElement(By.id("mbasic_logout_button")).click();

	}
	



////////////CHANGE NAME IN PROFILE///////////
@Given("open the browser")
public void Openbrowser()
{
ChromeOptions options = new ChromeOptions(); 
options.addArguments("disable-notifications");
driver=new ChromeDriver(options);
driver.manage().window().maximize();
}
@Given("navigate to {string} website")
public void NavigateToUrl(String s)
{
driver.get(s);
}
@When("enter a valid email")
public void EnteraValidEmail()
{
driver.findElement(By.name("email")).sendKeys("karthikmoni19961998@gmail.com");
}
@When("enter a valid password")
public void EnteraValidPassword()
{
driver.findElement(By.name("pass")).sendKeys("9632171491");
}
@When("click on Log in button")
public void ClickOnLoginbutton()
{
driver.findElement(By.name("login")).click();   	   
}
@When ("click on ok")
public void ClickOk() throws InterruptedException
{
driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
Thread.sleep(2000);
}
@When("click on settings and privacy")
public void SettingsAndPrivacy()throws InterruptedException
{
driver.findElement(By.xpath("/html/body/div/div/div[3]/div/table/tbody/tr/td[1]/a[3]")).click();
Thread.sleep(2000);
}

@When ("click on personal and account information")
public void PersonalandAccount() throws InterruptedException
{
driver.findElement(By.xpath("/html/body/div/div/div[1]/div/table/tbody/tr/td/div[1]/div[1]/a[1]/div/div/div[2]/div[1]")).click();
Thread.sleep(2000);
}
@When("click on edit")
public void ClickOnEdit() throws InterruptedException
{
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/table[1]/tbody/tr/td[2]/h3/a/span")).click();
Thread.sleep(2000);
}
@When("click on change order of name")
public void ChangeOrdername() throws InterruptedException
{
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/form/div[1]/div/div[1]/a")).click();
Thread.sleep(2000);
}
@When ("click on radio button")
public void ClickOnRadioButton()
{
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/table/tbody/tr/td/div/form/div[2]/fieldset/label[2]/table/tbody/tr/td[2]/input")).click();
}
@When("Enter Saved password")
public void SavedPassword() throws InterruptedException
{
driver.findElement(By.name("save_password")).sendKeys("9632171491");
Thread.sleep(2000);
}
@When("Click on save changes")
public void ClickOnSaveChanges() 
{
driver.findElement(By.name("save")).click();
}
}*/
	
	 ////////////ACCEPTING FRIEND REQUEST/////////
		/*@Given("open the browser")
		public void Openbrowser()
		{
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("disable-notifications");
			driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		}
		@Given("navigate to {string} website")
		public void NavigateToUrl(String s)
		{
			driver.get(s);
		}
		@When("enter a valid email")
	   public void EnteraValidEmail()
	   {
		   driver.findElement(By.name("email")).sendKeys("karthikmoi19961998@gmail.com");
	   }
		@When("enter a valid password")
	   public void EnteraValidPassword()
	   {
		   driver.findElement(By.name("pass")).sendKeys("9632171491");
	   }
		@When("click on Log in button")
	   public void ClickOnLoginbutton()
	   {
		   driver.findElement(By.name("login")).click();   	   
	   }
	    @When ("click on ok")
		public void ClickOk() throws InterruptedException
		{
			driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
			Thread.sleep(2000);
		}
	    @When("Click on Find Friends")
	    public void FindFriends() throws InterruptedException
		{
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]/strong")).click();
			Thread.sleep(2000);
		}
	    
	    @When("click on confirm")
	    public void ClickonConfirm()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/table/tbody/tr/td[2]/div[2]/a[1]")).click();
		}
	}*/
		
		
		
	    ////////////DELETING FRIEND REQUEST/////////
	   /*	@Given("open the browser")
	   	public void Openbrowser()
	   	{
	   		ChromeOptions options = new ChromeOptions(); 
	   		options.addArguments("disable-notifications");
	   		driver=new ChromeDriver(options);
	   	driver.manage().window().maximize();
	   	}
	   	@Given("navigate to {string} website")
	   	public void NavigateToUrl(String s)
	   	{
	   		driver.get(s);
	   	}
	   	@When("enter a valid email")
	      public void EnteraValidEmail()throws InterruptedException
	      {
	   	   driver.findElement(By.name("email")).sendKeys("karthikmoni19961998@gmail.com");
	   	   Thread.sleep(2000);
	      }
	   	@When("enter a valid password")
	      public void EnteraValidPassword()
	      {
	   	   driver.findElement(By.name("pass")).sendKeys("9632171491");
	      }
	   	@When("click on Log in button")
	      public void ClickOnLoginbutton()
	      {
	   	   driver.findElement(By.name("login")).click();   	   
	      }
	       @When ("click on ok")
	   	public void ClickOk()
	   	{
	   		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
	   	}
	       @When("Click on Find Friends") 
	       public void FindFriends() throws InterruptedException
	   	{
	   		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]/strong")).click();
	   		Thread.sleep(2000);
	   	}
	       @When("click on delete request")
	       public void DeleteRequest() throws InterruptedException
	       {
	    	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/table/tbody/tr/td[2]/div[2]/a[2]")).click();
	    	   Thread.sleep(2000);
	       }
	}*/
	    
	   
    /////////LIKING POST/////////////
   /*   @Given("open the browser")
     	public void Openbrowser()
     	{
     		ChromeOptions options = new ChromeOptions(); 
     		options.addArguments("disable-notifications");
     		driver=new ChromeDriver(options);
     	driver.manage().window().maximize();
     	}
     	@Given("navigate to {string} website")
     	public void NavigateToUrl(String s)
     	{
     		driver.get(s);
     	}
     	@When("enter a valid email") 
        public void EnteraValidEmail()throws InterruptedException
        {
     	   driver.findElement(By.name("email")).sendKeys("karthikmoni19961998@gmail.com");
     	   Thread.sleep(2000);
        }
     	@When("enter a valid password")
        public void EnteraValidPassword()
        {
     	   driver.findElement(By.name("pass")).sendKeys("9632171491");
        }
     	@When("click on Log in button")
        public void ClickOnLoginbutton()
        {
     	   driver.findElement(By.name("login")).click();   	   
        }
         @When ("click on ok")
     	public void ClickOk() throws InterruptedException
     	{
     		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
     		Thread.sleep(2000);
     	}  
       @When("Click on like button") 
       public void ClickOnLikeButton() throws InterruptedException
       {
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/section/article/footer/div[2]/span[1]/a[1]")).click();
        Thread.sleep(2000);
        driver.close();
       }
}*/
       
       /////////COMMENTING ON POST//////////////////
       /*@Given("open the browser")
     	public void Openbrowser()
     	{
     		ChromeOptions options = new ChromeOptions(); 
     		options.addArguments("disable-notifications");
     		driver=new ChromeDriver(options);
     	driver.manage().window().maximize();
     	}
     	@Given("navigate to {string} website")
     	public void NavigateToUrl(String s)
     	{
     		driver.get(s);
     	}
     	@When("enter a valid email")
        public void EnteraValidEmail() throws InterruptedException
        {
     	   driver.findElement(By.name("email")).sendKeys("karthikmoni19961998@gmail.com");
     	   Thread.sleep(3000);         }
     	@When("enter a valid password")
        public void EnteraValidPassword()
        {
     	   driver.findElement(By.name("pass")).sendKeys("9632171491");
        }
     	@When("click on Log in button")
        public void ClickOnLoginbutton()
        {
     	   driver.findElement(By.name("login")).click();   	   
        }
         @When ("click on ok")
     	public void ClickOk() throws InterruptedException
     	{
     		driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
     		Thread.sleep(2000); 
     	}
         @When("Click on comment button")
         public void CommentButton()
         {
       	  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/section/article/footer/div[2]/a[1]")).click();
         }
         @When("Enter some valid text")
         public void validText()throws InterruptedException
         {
       	  driver.findElement(By.name("comment_text")).sendKeys("Ranjinikanth is great");
       	  Thread.sleep(2000); 
         }
         @When("click on comment button1")
         public void CommentButton1()throws InterruptedException
         {
       	  driver.findElement(By.xpath("//input[@type='submit']")).click();
       	  Thread.sleep(2000);
       	  driver.close();
         }*/
	