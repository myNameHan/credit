package com.atguigu.credit.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.credit.bean.NplmBorrowerInfo;
import com.atguigu.credit.bean.NplmContractAttribute;
import com.atguigu.credit.bean.NplmLoanContract;
import com.atguigu.credit.manage.mapper.NplmBorrowerInfoMapper;
import com.atguigu.credit.manage.mapper.NplmContractAttributeMapper;
import com.atguigu.credit.manage.mapper.NplmLoanContractMapper;
import com.atguigu.credit.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    private NplmLoanContractMapper nplmLoanContractMapper;
    @Autowired
    private NplmBorrowerInfoMapper nplmBorrowerInfoMapper;
    @Autowired
    private NplmContractAttributeMapper nplmContractAttributeMapper;

    @Override
    public List<NplmLoanContract> getNPLMLoanContract() {
        List<NplmLoanContract> nplmLoanContracts = nplmLoanContractMapper.selectAll();
        for (NplmLoanContract nplmLoanContract : nplmLoanContracts) {
            NplmBorrowerInfo nplmBorrowerInfo = new NplmBorrowerInfo();
            nplmBorrowerInfo.setId(Integer.valueOf(nplmLoanContract.getBorrowerId()));
            NplmBorrowerInfo borrowerInfo = nplmBorrowerInfoMapper.selectOne(nplmBorrowerInfo);
            nplmLoanContract.setNplmBorrowerInfo(borrowerInfo);

            NplmContractAttribute nplmContractAttribute = new NplmContractAttribute();
            nplmContractAttribute.setLoanContractId(nplmLoanContract.getId());
            NplmContractAttribute contractAttribute = nplmContractAttributeMapper.selectOne(nplmContractAttribute);
            nplmLoanContract.setNplmContractAttribute(contractAttribute);

        }
        return nplmLoanContracts;
    }
}
