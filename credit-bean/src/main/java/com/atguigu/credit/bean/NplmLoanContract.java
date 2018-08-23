package com.atguigu.credit.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class NplmLoanContract implements Serializable{

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer  id;                         // varchar(32) not null comment 'id',
  @Column
  Integer loanContractNum;         //varchar(64) comment '合同编号',
  @Column
  Integer  borrowerId;               //varchar(32) comment '借款人id',
  @Column
  String ecifId;                    // varchar(20) comment 'ecif客户号',
  @Column
  String proCategoryCode;       //varchar(64) comment '产品分类代码',
  @Column
  String proCategoryName;       //varchar(128) comment '产品分类名称',
  @Column
  Integer productInfoId;             //int comment '产品信息id',
  @Column
  Integer loanInstalments;               //int comment '贷款分期数',
  @Column
  String loanInstalmentUnit;   //varchar(64) comment '贷款分期单位',
  @Column
  Integer loanAmount;                     // int comment '贷款金额',
  @Column
  Integer preFee;                    //int comment '前期费用',
  @Column
  Integer putAmount;                 // int comment '放款金额',
  @Column
  String creditType;                 // varchar(2) comment '贷款形式 1为信用，2为担保，3为抵押，4为其他',
  @Column
  String payMod;                 // varchar(6) comment '支付方式 third:第三方渠道  bank:银行渠道',
  @Column
  String  repayWay;              // varchar(2) comment '还款方式
  @Column
  String loanType;               //varchar(2) comment '放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）',
  @Column
  int saleDepartmentId;              //int comment '销售部门id',
  @Column
  String repayAccountName;      //varchar(32) comment '还款账户姓名',
  @Column
  String repayAcctIdenType;         //varchar(2) comment '还款账户证件类型',
  @Column
  String repayAcctIdenNum;         //varchar(30) comment '还款账户证件号',
  @Column
  String repayAccount;               //varchar(30) comment '还款账户',
  @Column
  String repayAccountType;          //varchar(2) comment '还款账户卡折标识',
  @Column
  String repayAccountBankid;      //varchar(12) comment '还款账户银行行别代码',
  @Column
  String repayActBranchNo;              //varchar(32) comment '还款账户开户行行号(支付行号)',
  @Column
  String repayAccountBankName;     //varchar(128) comment '还款账户开户行名称',
  @Column
  String publicPrivate;              //varchar(2) comment '还款账户对公对私标识',
  @Column
  String repayActProvince;           //varchar(64) comment '还款账户开户省',
  @Column
  String repayAccountCity;          //varchar(64) comment '还款账户开户市',
  @Column
  String posStatus;                   //varchar(10) comment 'pos验证状态 未验证 0014 已验证为空',
  @Column
  Date startDate;                    //date comment '首期还款日',
  @Column
  Date endDate;                      //date comment '末期还款日',
  @Column
  String contractSource;                  //varchar(30) comment '合同来源：
  @Column
  Integer repayBalance;                  //int default '0' comment '未分配还款额',
  @Column
  String contractType;                //varchar(2) comment '合同状态: -1：合同废止 0：未放款，1：还款中，2：逾期，9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清',
  @Column
  String creator;                      //varchar(32) comment '创建者',
  @Column
  String  updater;                     // varchar(32) comment '末次修改者',
  @Column
  Date createTime;               //timestamp comment '创建时间',
  @Column
  Date updateTime;                   //timestamp comment '末次修改时间',
  @Column
  String remark;                       //varchar(256) comment '备注',
  @Column
  String cycleCreditId;              //varchar(32) comment '循环授信编号',
  @Column
  String updateType;                  // varchar(20) comment '修改类型',
  @Transient
  NplmBorrowerInfo nplmBorrowerInfo;
  @Transient
  NplmContractAttribute nplmContractAttribute;

  public NplmBorrowerInfo getNplmBorrowerInfo() {
    return nplmBorrowerInfo;
  }

  public void setNplmBorrowerInfo(NplmBorrowerInfo nplmBorrowerInfo) {
    this.nplmBorrowerInfo = nplmBorrowerInfo;
  }

  public NplmContractAttribute getNplmContractAttribute() {
    return nplmContractAttribute;
  }

  public void setNplmContractAttribute(NplmContractAttribute nplmContractAttribute) {
    this.nplmContractAttribute = nplmContractAttribute;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(Integer loanContractNum) {
    this.loanContractNum = loanContractNum;
  }

  public Integer getBorrowerId() {
    return borrowerId;
  }

  public void setBorrowerId(Integer borrowerId) {
    this.borrowerId = borrowerId;
  }

  public String getEcifId() {
    return ecifId;
  }

  public void setEcifId(String ecifId) {
    this.ecifId = ecifId;
  }

  public String getProCategoryCode() {
    return proCategoryCode;
  }

  public void setProCategoryCode(String proCategoryCode) {
    this.proCategoryCode = proCategoryCode;
  }

  public String getProCategoryName() {
    return proCategoryName;
  }

  public void setProCategoryName(String proCategoryName) {
    this.proCategoryName = proCategoryName;
  }

  public Integer getProductInfoId() {
    return productInfoId;
  }

  public void setProductInfoId(Integer productInfoId) {
    this.productInfoId = productInfoId;
  }

  public Integer getLoanInstalments() {
    return loanInstalments;
  }

  public void setLoanInstalments(Integer loanInstalments) {
    this.loanInstalments = loanInstalments;
  }

  public String getLoanInstalmentUnit() {
    return loanInstalmentUnit;
  }

  public void setLoanInstalmentUnit(String loanInstalmentUnit) {
    this.loanInstalmentUnit = loanInstalmentUnit;
  }

  public Integer getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(Integer loanAmount) {
    this.loanAmount = loanAmount;
  }

  public Integer getPreFee() {
    return preFee;
  }

  public void setPreFee(Integer preFee) {
    this.preFee = preFee;
  }

  public Integer getPutAmount() {
    return putAmount;
  }

  public void setPutAmount(Integer putAmount) {
    this.putAmount = putAmount;
  }

  public String getCreditType() {
    return creditType;
  }

  public void setCreditType(String creditType) {
    this.creditType = creditType;
  }

  public String getPayMod() {
    return payMod;
  }

  public void setPayMod(String payMod) {
    this.payMod = payMod;
  }

  public String getRepayWay() {
    return repayWay;
  }

  public void setRepayWay(String repayWay) {
    this.repayWay = repayWay;
  }

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }

  public Integer getSaleDepartmentId() {
    return saleDepartmentId;
  }

  public void setSaleDepartmentId(int saleDepartmentId) {
    this.saleDepartmentId = saleDepartmentId;
  }

  public String getRepayAccountName() {
    return repayAccountName;
  }

  public void setRepayAccountName(String repayAccountName) {
    this.repayAccountName = repayAccountName;
  }

  public String getRepayAcctIdenType() {
    return repayAcctIdenType;
  }

  public void setRepayAcctIdenType(String repayAcctIdenType) {
    this.repayAcctIdenType = repayAcctIdenType;
  }

  public String getRepayAcctIdenNum() {
    return repayAcctIdenNum;
  }

  public void setRepayAcctIdenNum(String repayAcctIdenNum) {
    this.repayAcctIdenNum = repayAcctIdenNum;
  }

  public String getRepayAccount() {
    return repayAccount;
  }

  public void setRepayAccount(String repayAccount) {
    this.repayAccount = repayAccount;
  }

  public String getRepayAccountType() {
    return repayAccountType;
  }

  public void setRepayAccountType(String repayAccountType) {
    this.repayAccountType = repayAccountType;
  }

  public String getRepayAccountBankid() {
    return repayAccountBankid;
  }

  public void setRepayAccountBankid(String repayAccountBankid) {
    this.repayAccountBankid = repayAccountBankid;
  }

  public String getRepayActBranchNo() {
    return repayActBranchNo;
  }

  public void setRepayActBranchNo(String repayActBranchNo) {
    this.repayActBranchNo = repayActBranchNo;
  }

  public String getRepayAccountBankName() {
    return repayAccountBankName;
  }

  public void setRepayAccountBankName(String repayAccountBankName) {
    this.repayAccountBankName = repayAccountBankName;
  }

  public String getPublicPrivate() {
    return publicPrivate;
  }

  public void setPublicPrivate(String publicPrivate) {
    this.publicPrivate = publicPrivate;
  }

  public String getRepayActProvince() {
    return repayActProvince;
  }

  public void setRepayActProvince(String repayActProvince) {
    this.repayActProvince = repayActProvince;
  }

  public String getRepayAccountCity() {
    return repayAccountCity;
  }

  public void setRepayAccountCity(String repayAccountCity) {
    this.repayAccountCity = repayAccountCity;
  }

  public String getPosStatus() {
    return posStatus;
  }

  public void setPosStatus(String posStatus) {
    this.posStatus = posStatus;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getContractSource() {
    return contractSource;
  }

  public void setContractSource(String contractSource) {
    this.contractSource = contractSource;
  }

  public Integer getRepayBalance() {
    return repayBalance;
  }

  public void setRepayBalance(Integer repayBalance) {
    this.repayBalance = repayBalance;
  }

  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getCycleCreditId() {
    return cycleCreditId;
  }

  public void setCycleCreditId(String cycleCreditId) {
    this.cycleCreditId = cycleCreditId;
  }

  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }
}

