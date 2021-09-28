package com.ibm.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.model.Login;
import com.ibm.repo.LoginRepo;

@Service
public class LoginService {
    @Autowired
    LoginRepo logRepo;
    public void postDataServ(Login l) {
        // TODO Auto-generated method stub
        logRepo.save(l);
    }
    public Login getDataServ(String userName, String password) {
        // TODO Auto-generated method stub
        return logRepo.findByUserNameAndPassword(userName, password);
    }
}
