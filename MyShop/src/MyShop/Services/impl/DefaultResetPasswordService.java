package MyShop.Services.impl;

import MyShop.Enteties.User;
import MyShop.Services.ResetPasswordService;
import MyShop.Utils.mail.MailSender;

public class DefaultResetPasswordService implements ResetPasswordService {

    private MailSender mailSender;

    {
        mailSender = DefaultMailSender.getInstance();
    }

    @Override
    public void resetPasswordForUser(User user) {
        mailSender.sendEmail(user.getEmail(), "Please, use this password to login: " + user.getPassword());
    }
}
