import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search1 {

	public static void main(String[] args) throws InterruptedException {
		
		//navigate to chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to Luma application
		driver.get("https://magento.softwaretestingboard.com/men.html");
		
		
		//getting address of the parent window for window handling
		String parent_add=driver.getWindowHandle();
				
		//to get the confirmation that where the selenium is
		System.out.println(driver.getCurrentUrl());	
				
		//to locating create new account web element		
		WebElement acc=driver.findElement(By.xpath("//a[text()='Create an Account']"));
		acc.click();
	
		//waiting 3sec
		Thread.sleep(3000);
		
		//getting the address of both parent and child window
		Set<String> add=driver.getWindowHandles();
		for(String e:add)
		{
			if(e.equals(parent_add))
			{
				
			}
			else {
				driver.switchTo().window(e);
			}
		}
		System.out.println(driver.getCurrentUrl());
		
		//filling the create new account form
		WebElement fname=driver.findElement(By.xpath("//input[@id='firstname']"));
		fname.sendKeys("Shn");
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastname']"));
		lname.sendKeys("Krlt");
		WebElement email=driver.findElement(By.xpath("//input[@id='email_address']"));
		email.sendKeys("shnkr@gmail.com");
		WebElement pw=driver.findElement(By.xpath("//input[@id='password']"));
		pw.sendKeys("Shnk@123");
		WebElement cpw=driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		cpw.sendKeys("Shnk@123");
		
		WebElement btn=driver.findElement(By.xpath("//button[@class='action submit primary']"));
		btn.click();
		
		//to locate sign in web element
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shnkr@gmail.com");

		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Shnk@123");

		String create_add=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		
		Thread.sleep(3000);
		
		Set<String> acc_add=driver.getWindowHandles();
		for(String s:acc_add)
		{
			if(s.equals(create_add))
			{
				
			}
			else {
				driver.switchTo().window(s);
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//locating women webElement
		WebElement women=driver.findElement(By.xpath("//a[@id='ui-id-4']"));
		women.click();
		
		System.out.println(driver.getCurrentUrl());
		
		//locating jackets webElement
		WebElement jack=driver.findElement(By.xpath("//a[text()='Jackets']"));
		jack.click();
		
		System.out.println(driver.getCurrentUrl());
		
		String parent_address=driver.getWindowHandle();
		
		//selecting the product
		WebElement select=driver.findElement(By.xpath("//img[@alt='Juno Jacket']"));
		select.click();
		
		Set<String> child_add=driver.getWindowHandles();
		
		for(String s:child_add)
		{
			if(s.equals(parent_address))
			{
				
			}
			else {
				driver.switchTo().window(s);
			}		
		}
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		// select size
		driver.findElement(By.xpath("//div[text()='M']")).click();
		
		//select color
		driver.findElement(By.xpath("//div[@id='option-label-color-93-item-50']")).click();
		
		//add to cart
		WebElement addcart=driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
		addcart.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		Thread.sleep(3000);
		String p_add=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(6000);
		
		Set<String> c_add=driver.getWindowHandles();
		
		for(String a:c_add)
		{
			if(a.equals(p_add)) 
			{
				
			}
			else {
				driver.switchTo().window(a);
			}
		}
		
		
		System.out.println(driver.getCurrentUrl());
	
		Thread.sleep(3000);
		
       // shipping address
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Jayanagar");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");

		//dropdown2 box
				WebElement dropdown2=driver.findElement(By.xpath("//select[@name='country_id']"));
				dropdown2.click();
				Select sel=new Select(dropdown2);
				sel.selectByVisibleText("India");
		    
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("586000");
		
		//dropdown1 box
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='region_id']"));
		dropdown1.click();
		Select sel1=new Select(dropdown1);
		sel1.selectByVisibleText("Karnataka");
    
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9876543210");
		
        driver.findElement(By.xpath("//input[@name='ko_unique_2']")).click();
	
        String ship_add=driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
        
        Thread.sleep(3000);
        
        Set<String> place_add=driver.getWindowHandles();

        for(String s:place_add)
        {
      	    if(s.equals(ship_add))
	         {
		
	           }
	        else {
		         driver.switchTo().window(s);
	           }
         }

         System.out.println(driver.getCurrentUrl());

         Thread.sleep(3000);
         
         String order_add=driver.getWindowHandle();
         driver.findElement(By.xpath("//button[@class='action primary checkout']")).click();

         Thread.sleep(3000);
         
         Set<String> success_add=driver.getWindowHandles();
         for(String a:success_add)
         {
         	if(a.equals(order_add))
	          {
		
	           }
	        else {
		        driver.switchTo().window(a);
	           }
          }

          System.out.println(driver.getCurrentUrl());

          WebElement ele=driver.findElement(By.xpath("//span[@class='base']"));
          
          //to get the confirmation that order is placed or not
          System.out.println(ele.getText());

}

}
