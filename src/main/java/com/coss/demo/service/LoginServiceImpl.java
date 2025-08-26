package com.coss.demo.service;

import com.coss.demo.Utils.LoginUtility;
import com.coss.demo.dto.CossStudentDTO;
import com.coss.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository loginRepo;

    public boolean validateUser(String cossName, String cossEmail, String cossMobile) {
        System.out.println(" in login service");
        String regExName = "[A-Za-z]+";
        String regExMobile ="[0-9]+";
        String regExEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern namePattern = Pattern.compile(regExName, Pattern.CASE_INSENSITIVE);
        Pattern emailPattern = Pattern.compile(regExEmail, Pattern.CASE_INSENSITIVE);
        Pattern mobilePattern = Pattern.compile(regExMobile, Pattern.CASE_INSENSITIVE);
        System.out.println(namePattern.matcher(cossName).matches() +"  namePattern.matcher(cossName).matches()");
        System.out.println(emailPattern.matcher(cossEmail).matches() +" emailPattern.matcher(cossEmail).matches()");
        System.out.println(mobilePattern.matcher(cossMobile).matches() +"  mobilePattern.matcher(cossMobile).matches()");
  System.out.println("cossName "+cossName);
        System.out.println("cossEmail "+cossEmail);
        System.out.println("cossMobile "+cossMobile);






        if(namePattern.matcher(cossName).matches() && emailPattern.matcher(cossEmail).matches() &&
                mobilePattern.matcher(cossMobile).matches())
        {
            CossStudentDTO cossStudentDto = new CossStudentDTO(cossName,cossEmail,cossMobile);


            loginRepo.save(LoginUtility.convertCossStudentDtoToStudent(cossStudentDto));
            return  true;
        }

        return false;

    }
}
