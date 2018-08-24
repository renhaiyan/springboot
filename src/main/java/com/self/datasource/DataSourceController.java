package com.self.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataSourceController {

    @Autowired
    private MyDruidDataSource datasource;
    @RequestMapping("/dataSource")
    @ResponseBody
    public String dataSourcePage(){
        System.out.println(datasource);
        return "datasource";

    }
}
