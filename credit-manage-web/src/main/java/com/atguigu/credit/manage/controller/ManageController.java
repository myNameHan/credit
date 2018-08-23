package com.atguigu.credit.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.credit.bean.NplmLoanContract;
import com.atguigu.credit.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ManageController {

    @Reference
    private ManageService manageService;

    @RequestMapping("index")
    public String getIndex(){
        return "index";
    }
    @RequestMapping("contractList")
    public String getIndex2(Model model){
        List<NplmLoanContract> ContractList = manageService.getNPLMLoanContract();
        model.addAttribute("ContractList",ContractList);
        return "ContractList";
    }




}
