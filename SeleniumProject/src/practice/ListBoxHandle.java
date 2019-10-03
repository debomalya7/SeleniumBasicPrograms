package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testpackages.BaseClass;

public class ListBoxHandle extends BaseClass{

	public static void main(String[] args) {
		driver.get("C:\\Users\\debma\\Desktop\\ListBox_Breakfast.html");
		WebElement list=driver.findElement(By.id("mtr"));
		Select s=new Select(list);
		List<WebElement>options=s.getOptions();
		int size=options.size();
		System.out.println("Number of element present inside Listbox is "+size);
		ArrayList<String>list3=new ArrayList<String>();
		for (WebElement webElement : options) {
			String text=webElement.getText();
			System.out.println(text);
			list3.add(text);
		}
		Collections.sort(list3);
		System.out.println("*********Sorted Order***********");
		for (String string : list3) {
			System.out.println(string );
		}
		System.out.println("**********************");
		TreeSet<String>list2= new TreeSet<String>();
		for (WebElement allOptions : options) {
			String textString=allOptions.getText();
			//System.out.println(textString);
			list2.add(textString);
		}
		System.out.println(list2);
		s.selectByIndex(0);
		s.selectByValue("p");
		s.selectByVisibleText("POORI");
		System.out.println("***********Print all Selected options ****************");
		List<WebElement>allSelectedOption=s.getAllSelectedOptions();
		int number=allSelectedOption.size();
		System.out.println("Number of element selected in the box is"+number);
		for (WebElement webElement : allSelectedOption) {
			System.out.println(webElement.getText());		
		}
		System.out.println("********Check wether multiselect or not");
		Boolean mul=s.isMultiple();
		System.out.println("Mutliselet "+mul);
		if(mul) {
			WebElement firstSelectedElement=s.getFirstSelectedOption();
			System.out.println(firstSelectedElement.getText());
			s.deselectByIndex(0);
			WebElement firstSelectedElement1=s.getFirstSelectedOption();
			System.out.println("After Deselecting the first selected option is "+firstSelectedElement1.getText());
			

			
		}
		driver.close();

	}

}
