package com.zblog.common.dal.entity;

import com.zblog.common.util.constants.UserConstants;

public class User extends BaseEntity{
  private String nickName;
  private String realName;
  private String email;
  private String status = UserConstants.USER_STATUS_NORMAL;
  private String description;

  public String getNickName(){
    return nickName;
  }

  public void setNickName(String nickName){
    this.nickName = nickName;
  }

  public String getRealName(){
    return realName;
  }

  public void setRealName(String realName){
    this.realName = realName;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getStatus(){
    return status;
  }

  public void setStatus(String status){
    this.status = status;
  }

  public String getDescription(){
    return description;
  }

  public void setDescription(String description){
    this.description = description;
  }
  
}
