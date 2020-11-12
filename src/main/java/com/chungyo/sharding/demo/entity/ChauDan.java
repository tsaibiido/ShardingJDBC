package com.chungyo.sharding.demo.entity;

import java.math.BigInteger;

import com.baomidou.mybatisplus.annotation.TableField;

public class ChauDan {
  @TableField("WagersID")
  private Long WagersID;

  @TableField("GameType")
  private Integer GameType;

  @TableField("WagersType")
  private Integer WagersType;

  @TableField("UserID")
  private Long UserID;

  @TableField("RoundDate")
  private String RoundDate;

  @TableField("WagersDate")
  private String WagersDate;

  @TableField("BetAmount")
  private Double BetAmount;

  @TableField("Commission")
  private Double Commission;

  @TableField("Commissionable")
  private Double Commissionable;

  @TableField("Currency")
  private String Currency;

  @TableField("ExchangeRate")
  private Double ExchangeRate;

  @TableField("Balance")
  private Double Balance;

  @TableField("Result")
  private Integer Result;

  @TableField("Payoff")
  private Double Payoff;

  @TableField("HallID")
  private Integer HallID;

  @TableField("AGID")
  private Integer AGID;

  @TableField("ModifiedDate")
  private String ModifiedDate;

  public static ChauDan build() {
    ChauDan ret = new ChauDan();
    ret.GameType = 5902;
    ret.WagersType = 0;
    ret.UserID = 129697721l;
    ret.RoundDate = "2018-02-01";
    ret.WagersDate = "2018-02-01 00:02:01";
    ret.BetAmount = 5d;
    ret.Commission = 0.05;
    ret.Commissionable = 4.998;
    ret.Currency = "RMB";
    ret.ExchangeRate = 3.0;
    ret.Balance = 0d;
    ret.Result = 200;
    ret.Payoff = -5.0;
    ret.HallID = 6;
    ret.AGID = 26891;
    ret.ModifiedDate = "2018-02-01 12:02:01";

    return ret;
  }

  public Long getWagersID() {
    return WagersID;
  }

  public void setWagersID(Long wagersID) {
    WagersID = wagersID;
  }

  public Integer getGameType() {
    return GameType;
  }

  public void setGameType(Integer gameType) {
    GameType = gameType;
  }

  public Integer getWagersType() {
    return WagersType;
  }

  public void setWagersType(Integer wagersType) {
    WagersType = wagersType;
  }

  public Long getUserID() {
    return UserID;
  }

  public void setUserID(Long userID) {
    UserID = userID;
  }

  public String getRoundDate() {
    return RoundDate;
  }

  public void setRoundDate(String roundDate) {
    RoundDate = roundDate;
  }

  public String getWagersDate() {
    return WagersDate;
  }

  public void setWagersDate(String wagersDate) {
    WagersDate = wagersDate;
  }

  public Double getBetAmount() {
    return BetAmount;
  }

  public void setBetAmount(Double betAmount) {
    BetAmount = betAmount;
  }

  public Double getCommission() {
    return Commission;
  }

  public void setCommission(Double commission) {
    Commission = commission;
  }

  public Double getCommissionable() {
    return Commissionable;
  }

  public void setCommissionable(Double commissionable) {
    Commissionable = commissionable;
  }

  public String getCurrency() {
    return Currency;
  }

  public void setCurrency(String currency) {
    Currency = currency;
  }

  public Double getExchangeRate() {
    return ExchangeRate;
  }

  public void setExchangeRate(Double exchangeRate) {
    ExchangeRate = exchangeRate;
  }

  public Double getBalance() {
    return Balance;
  }

  public void setBalance(Double balance) {
    Balance = balance;
  }

  public Integer getResult() {
    return Result;
  }

  public void setResult(Integer result) {
    Result = result;
  }

  public Double getPayoff() {
    return Payoff;
  }

  public void setPayoff(Double payoff) {
    Payoff = payoff;
  }

  public Integer getHallID() {
    return HallID;
  }

  public void setHallID(Integer hallID) {
    HallID = hallID;
  }

  public Integer getAGID() {
    return AGID;
  }

  public void setAGID(Integer aGID) {
    AGID = aGID;
  }

  public String getModifiedDate() {
    return ModifiedDate;
  }

  public void setModifiedDate(String modifiedDate) {
    ModifiedDate = modifiedDate;
  }
}
