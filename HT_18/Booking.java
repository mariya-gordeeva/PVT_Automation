package automationFramework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
	public static void main(String[] args) {
		String exePath = "D:\\Chrome_Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://booking.com/");
		WebElement searchLine = driver.findElement(By.xpath(".//input[@type=\"search\"]"));
		searchLine.sendKeys("Moscow, Russia");
		WebElement calendar = driver.findElement(By.xpath(".//div[@class=\"xp__dates xp__group\"]"));
		calendar.click();
		LocalDate today = LocalDate.now();
		LocalDate checkInDate = today.plusMonths(1);
		LocalDate checkOutDate = checkInDate.plusDays(3);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedcheckInDate = checkInDate.format(formatter);
		String formattedCheckOutDate = checkOutDate.format(formatter);
		String checkInDateXPath = ".//td[@data-date=\"" + formattedcheckInDate + "\"]";
		String CheckOutDateXPath = ".//td[@data-date=\"" + formattedCheckOutDate + "\"]";
		WebElement date = driver.findElement(By.xpath(checkInDateXPath));
		date.click();
		date = driver.findElement(By.xpath(CheckOutDateXPath));
		date.click();
		WebElement guestDd = driver.findElement(By.xpath(".//label[@id=\"xp__guests__toggle\"]"));
		guestDd.click();
		WebElement guestDdNoRooms = driver.findElement(By.xpath(".//select[@name=\"no_rooms\"]//option[@value=\"1\"]"));
		guestDdNoRooms.click();
		WebElement guestDdAdults = driver
				.findElement(By.xpath(".//select[@name=\"group_adults\"]//option[@value=\"1\"]"));
		guestDdAdults.click();
		WebElement guestDdChildren = driver
				.findElement(By.xpath(".//select[@name=\"group_children\"]//option[@value=\"1\"]"));
		guestDdChildren.click();
		WebElement searchButton = driver.findElement(By.xpath(".//button[@class=\"sb-searchbox__button  \"]"));
		searchButton.submit();
		WebElement isFound = driver.findElement(By.xpath(".//h2[contains(text(), \"найдено\"| \"найден\")]"));
		System.out.println(isFound.isDisplayed() ? "There are free rooms on these dates."
				: "Sorry, there sre no free rooms on these dates.");
		WebElement filterByRating = driver.findElement(By.xpath("(.//a[@data-name=\"review_score\"])[1]"));
		filterByRating.click();		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement firstLinkToHotel = driver.findElement(By.xpath("(.//a[@class=\"hotel_name_link url\"])[1]"));
		firstLinkToHotel.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement score = driver.findElement(By.xpath(".//div[@class=\"bui-review-score__badge\"]"));
		System.out.println("Rating is " + score.getText());
		driver.close();
		driver.quit();
	}

}
