package co.com.choucair.steps.profile;

import co.com.choucair.pageObjects.profile.ProfilePage;
import co.com.choucair.pageObjects.profile.CreateAccountPage;

public class CreateAccountSteps {

    ProfilePage profilePage;
    CreateAccountPage createAccountPage;

    public CreateAccountSteps(ProfilePage profilePage, CreateAccountPage createAccountPage){
        this.profilePage = profilePage;
        this.createAccountPage = createAccountPage;
    }


}
