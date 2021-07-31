package com.batch.steps;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.batch.dto.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class IProcessor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public IProcessor() {
    	 DEPT_NAMES.put("001", "Technology");
         DEPT_NAMES.put("002", "Operations");
         DEPT_NAMES.put("003", "Accounts");
    }

    @Override
    public User process(User user) throws Exception {
        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        user.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
        return user;
    }
    
}
