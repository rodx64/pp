package com.rba.pp.solid.s.wrong;

public interface IUser {
    User insert();
    User update(User user);
    void delete(int id);

    // Wrong, because the Manager shouldn't be responsible to send emails
    void sendEmailAfterCreation();
}
