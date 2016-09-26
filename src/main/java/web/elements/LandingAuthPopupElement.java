package web.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.pages.AbstractPageObject;

/**
 * @since Sep 25, 2016
 * @author Aleksei
 */
public class LandingAuthPopupElement extends AbstractPageObject {

    @FindBy(css = ".simplepopup .bHSignIn")
    private WebElement blockPopupAuth;

    @FindBy(css = ".simplepopup a.login-signin")
    private WebElement linkSignInWithEmail;

    @FindBy(css = ".simplepopup .signin [type='email']")
    private WebElement inputSignInEmail;

    @FindBy(css = ".simplepopup .signin [type='password']")
    private WebElement inputSignInPassword;

    @FindBy(css = ".simplepopup .signin [type='submit']")
    private WebElement buttonSignInSubmit;

    @FindBy(css = ".simplepopup .signup [type='email']")
    private WebElement inputSignUpEmail;

    @FindBy(css = ".simplepopup .signup .password[type='password']")
    private WebElement inputSignUpPassword;

    @FindBy(css = ".simplepopup .signup .confirmpassword[type='password']")
    private WebElement inputSignUpPasswordConfirm;

    @FindBy(css = ".simplepopup .signup [type='submit']")
    private WebElement buttonSignUpSubmit;

    @FindBy(css = ".simplepopup .signin a.signup")
    private WebElement linkSignUpWhenSignIn;

    @FindBy(className = "close")
    private WebElement iconClose;

    @FindBy(className = "simplepopup")
    private WebElement blockAuthPopup;

    @FindBy(xpath = "//div[contains(@class,'simplepopup')]//div[contains(@ng-bind,'landing_invalid_login')]")
    private WebElement textInvalidLogin;

    public LandingAuthPopupElement(WebDriver driver) {
        super(driver);
    }

    public void waitForPopupAuth() {
        waitFor(blockPopupAuth);
    }

    public void clickLinkSignInWithEmail() {
        linkSignInWithEmail.click();
    }

    public void clickLinkSignUp() {
        linkSignUpWhenSignIn.click();
    }

    public void typeSignUpEmail(String email) {
        inputSignUpEmail.sendKeys(email);
    }

    public void typeSignUpPassword(String password) {
        inputSignUpPassword.sendKeys(password);
    }

    public void typeSignUpPasswordConfirm(String passwordConfirm) {
        inputSignUpPasswordConfirm.sendKeys(passwordConfirm);
    }

    public void pressButtonSubmitSignUp() {
        buttonSignUpSubmit.click();
        waitForElementNotPresent(buttonSignUpSubmit);
    }

    public void typeSignInEmail(String email) {
        inputSignInEmail.sendKeys(email);
    }

    public void typeSignInPassword(String password) {
        inputSignInPassword.sendKeys(password);
    }

    public void pressButtonSubmitSignIn() {
        buttonSignInSubmit.click();
        waitForElementNotPresent(buttonSignInSubmit);
    }

    public void clickIconClosePopup() {
        iconClose.click();
    }

    public boolean isblockAuthPopupVisible() {
        return waitForElementNotPresent(blockAuthPopup);
    }

    public boolean isInvalidLoginOrPasswordDisplayed() {
        return waitForElementPresent(textInvalidLogin);
    }
}
