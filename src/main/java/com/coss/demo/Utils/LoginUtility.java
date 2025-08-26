package com.coss.demo.Utils;

import com.coss.demo.model.CossStudent;
import com.coss.demo.dto.CossStudentDTO;

public class LoginUtility {

    public static CossStudent convertCossStudentDtoToStudent(CossStudentDTO cossStudentDTO){
        CossStudent cs = new CossStudent();
        if(cossStudentDTO.getId()!=null){
            cs.setId(cossStudentDTO.getId());
        }
        cs.setCossMobile(cossStudentDTO.getCossMobile());
        cs.setCossEmail(cossStudentDTO.getCossEmail());
        cs.setCossName(cossStudentDTO.getCossName());
        return cs;

    }
}
