package com.bibvip.consts;

/**
 * @author ef-LORENZ
 */
public interface LoginElements {
    //LOGIN PAGE
    String LOGINWITHEMAIL = "//span[contains(text(),'Email')]";
    String LOGINWITHMOBILE = "//span[contains(text(),'Mobile')]";
    String EMAILADDRESS_LOGINTB = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[1]/div[2]/input[1]";
    String MOBILE_LOGINTB = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[2]/div[2]/input[1]";
    String PASSWORD_LOGINTB = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[2]/div[1]/div[2]/input[1]";
    String LOGIN_LOGINBTN = "//button[@id='login-btn']";
    String COUNTRYCODE_SELECT = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]";
    String COUNTRYCODE_SEARCH = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]";
    String COUNTRYCODE_SEARCHITEM = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[2]/div[1]/div[2]/div[2]/div[1]";
    String ERROREMAIL_LOGIN = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[2]";
    String ERRORPASSWORD_LOGIN = "//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[2]/div[2]";
    String ERRORMOBILE_LOGIN ="//body/div[3]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[3]";
    String BG = "//body/div[3]/div[1]/div[2]/section[1]/div[1]";
    String SECURITYDIALOG_LOGIN = "/div[3]/div[1]/div[2]/section[1]/div[6]/div[1]/div[1]";
    String SECURITYMODE_EMAIL_LOGIN = "//li[contains(text(),'Email Verification')]";
    String SECURITYDIALOG_VCODETB_LOGIN = "//body/div[3]/div[1]/div[2]/section[1]/div[5]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/input[1]";
    String SECURITYDIALOG_CONFIRMBTN_LOGIN = "//body/div[3]/div[1]/div[2]/section[1]/div[5]/div[1]/div[1]/div[3]/div[1]/button[2]";
    String SECURITYMODE_SELECTION_LOGIN = "//body/div[3]/div[1]/div[2]/section[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]";
    //NAVIGATION HEADER
    String PROFILE_ICON = "//header/div[2]/a[1]/span[1]/*[1]";
    String SPOT_PAGE = "//header/div[1]/div[1]";
    String LOGOUT = "//header/div[2]/a[1]/div[1]/div[5]";
}
