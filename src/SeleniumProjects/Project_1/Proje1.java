package SeleniumProjects.Project_1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

        public class Proje1 extends Run {
            @Test
            public void Test1() {

                browser.navigate().to("https://itera-qa.azurewebsites.net/home");
                WebElement signUp = browser.findElement(By.xpath("//*[@id='navbarColor01']/form/ul/li[1]/a"));
                signUp.click();

                Function.Wait(1);
                WebElement name = browser.findElement(By.xpath("//*[@class='form-control text-box single-line' and @id='FirstName']"));
                name.sendKeys("emrah121111");
                Function.Wait(1);
                WebElement surname = browser.findElement(By.xpath("//*[@class='form-control text-box single-line' and @name='Surname']"));
                surname.sendKeys("guney121111");
                Function.Wait(1);
                WebElement post = browser.findElement(By.xpath("//*[@name='E_post' and @id='E_post']"));
                post.sendKeys("emrahgun121111@hotmail.com");
                Function.Wait(1);
                WebElement mobile = browser.findElement(By.xpath("//*[@name='Mobile' and @id='Mobile']"));
                mobile.sendKeys("44455256667788811111");
                Function.Wait(1);
                WebElement Uname = browser.findElement(By.xpath("//*[@name='Username' and @id='Username']"));
                Uname.sendKeys("emrah112111");
                Function.Wait(1);
                WebElement Pword = browser.findElement(By.xpath("//*[@name='Password' and @id='Password']"));
                Pword.sendKeys("2123411111");
                Function.Wait(1);
                WebElement Cword = browser.findElement(By.xpath("//*[@id='ConfirmPassword' and @name='ConfirmPassword']"));
                Cword.sendKeys("2123411111");
                Function.Wait(1);
                WebElement Submit = browser.findElement(By.xpath("//*[@id='submit' and @value='Submit']"));
                Submit.click();
                Function.Wait(1);
                WebElement reSUB = browser.findElement(By.xpath("//*[@class='col-md-offset-2 col-md-2']/label[@class='label-success']"));
                Function.Wait(1);
                Assert.assertTrue("test fail", reSUB.getText().equals("Registration Successful"));
                Function.Wait(1);
                quitBrowser();



            }

            @Test
            public void Test2() {
                browser.get("https://itera-qa.azurewebsites.net/");
                WebElement Login = browser.findElement(By.xpath("//*[@href='/Login']"));
                Login.click();
                Function.Wait(1);
                WebElement username = browser.findElement(By.xpath("//*[@id='Username']"));
                username.sendKeys("emrah112");
                Function.Wait(1);
                WebElement pword = browser.findElement(By.xpath("//*[@id='Password']"));
                pword.sendKeys("2123411");
                Function.Wait(1);
                WebElement submit2 = browser.findElement(By.xpath("//*[@name='login']"));
                submit2.click();
                Function.Wait(1);
                WebElement correct = browser.findElement(By.cssSelector("div>h3"));
                Function.Wait(1);
                Assert.assertTrue("test fail", correct.getText().contains("Welcome"));
                quitBrowser();

            }

            @Test
            public void Test3() {
                browser.get("https://itera-qa.azurewebsites.net/");
                WebElement Login = browser.findElement(By.xpath("//*[@href='/Login']"));
                Login.click();
                Function.Wait(1);
                WebElement username = browser.findElement(By.xpath("//*[@id='Username']"));
                username.sendKeys("emrah112");
                Function.Wait(1);
                WebElement pword = browser.findElement(By.xpath("//*[@id='Password']"));
                pword.sendKeys("2123411");
                Function.Wait(1);
                WebElement Cnew = browser.findElement(By.xpath("//*[@class='btn btn-primary']"));
                Cnew.click();
                Function.Wait(1);
                WebElement Cnew2 = browser.findElement(By.xpath("//*[@class='btn btn-primary' and @href='/Customer/Create']"));
                Cnew2.click();
                WebElement Name = browser.findElement(By.xpath("//*[@id='Name']"));
                Name.sendKeys("GRUP13");
                Function.Wait(1);
                WebElement Company = browser.findElement(By.xpath("//*[@id='Company']"));
                Company.sendKeys("SDETs");
                Function.Wait(1);
                WebElement Adress = browser.findElement(By.xpath("//*[@id='Address']"));
                Adress.sendKeys("Beykoz");
                Function.Wait(1);
                WebElement City = browser.findElement(By.xpath("//*[@id='City']"));
                City.sendKeys("Istanbul");
                Function.Wait(1);
                WebElement Phone = browser.findElement(By.xpath("//*[@id='Phone']"));
                Phone.sendKeys("0123456789");
                Function.Wait(1);
                WebElement Email = browser.findElement(By.xpath("//*[@id='Email']"));
                Email.sendKeys("emrahgun@hotmail.com");
                Function.Wait(1);
                WebElement Create = browser.findElement(By.xpath("//*[@type='submit' and @value='Create']"));
                Create.click();
                quitBrowser();
            }
        }


