package com.easyspringboot.module;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 4127981264467176967L;
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名(转小写后)
     */
    private String userName;

    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 支付密码
     */
    private String payPassword;

    /**
     * 手机号
     */
    private String phonenumber;

    /**
     * 证件类型
     */
    private String idType;

    /**
     * 身份证
     */
    private String cardNumber;

    /**
     * 姓名
     */
    private String cardName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 注册时间
     */
    private Date joinTime;

    /**
     * 最近一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 风险等级(1-保守型2-稳健型3-激进型)
     */
    private Byte riskLevel;

    /**
     * 邀请码
     */
    private String inviteCode;

    /**
     * 是否补票人
     */
    private Boolean isRobot;

    /**
     * 是否实名认证
     */
    private Boolean isAuthName;

    /**
     * 是否绑定银行卡
     */
    private Boolean isBindingBankcard;

    /**
     * 是否设置支付密码
     */
    private Boolean isSetPayPwd;

    /**
     * 是否绑定邮箱
     */
    private Boolean isBindingEmail;

    /**
     * 是否购买过债权
     */
    private Boolean isBuyLending;

    /**
     * 密码强度(弱、中、强)
     */
    private Byte loginPasswordComplex;

    /**
     * 实名认证时间
     */
    private Date authTime;

    /**
     * 用户名(真实录入的)
     */
    private String userTruename;

    /**
     * 自己的邀请码
     */
    private String selfInviteCode;

    /**
     * 推荐码二维码打开地址
     */
    private String qrCodeUrl;

    /**
     * 1:普通用户，2内部正式员工，3内部兼职员工，4内部补标员
     */
    private Integer type;

    /**
     * 用户状态：1正常，2禁用，3注销，4黑名单
     */
    private Integer status;

    /**
     * 0:未开户:1:开户中;2: 待激活;3:成功; 4:失败
     */
    private Integer accountStatus;

    /**
     * 电子账号
     */
    private String eleAcctNo;

    /**
     * 电子账号开通时间
     */
    private Date eleAcctNoOpenTime;

    /**
     * 第三方通道 XACBANK 西安银行  BAOFOO 宝付
     */
    private String payChannel;

    /**
     * 绑卡时间
     */
    private Date bindingTime;

    /**
     * 购买新标的次数
     */
    private Integer buyNum;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名(转小写后)
     *
     * @return user_name - 用户名(转小写后)
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名(转小写后)
     *
     * @param userName 用户名(转小写后)
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登录密码
     *
     * @return login_password - 登录密码
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 设置登录密码
     *
     * @param loginPassword 登录密码
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    /**
     * 获取支付密码
     *
     * @return pay_password - 支付密码
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * 设置支付密码
     *
     * @param payPassword 支付密码
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    /**
     * 获取手机号
     *
     * @return phonenumber - 手机号
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置手机号
     *
     * @param phonenumber 手机号
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * 获取证件类型
     *
     * @return id_type - 证件类型
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 设置证件类型
     *
     * @param idType 证件类型
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * 获取身份证
     *
     * @return card_number - 身份证
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置身份证
     *
     * @param cardNumber 身份证
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * 获取姓名
     *
     * @return card_name - 姓名
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * 设置姓名
     *
     * @param cardName 姓名
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取注册时间
     *
     * @return join_time - 注册时间
     */
    public Date getJoinTime() {
        return joinTime;
    }

    /**
     * 设置注册时间
     *
     * @param joinTime 注册时间
     */
    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    /**
     * 获取最近一次登录时间
     *
     * @return last_login_time - 最近一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最近一次登录时间
     *
     * @param lastLoginTime 最近一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取风险等级(1-保守型2-稳健型3-激进型)
     *
     * @return risk_level - 风险等级(1-保守型2-稳健型3-激进型)
     */
    public Byte getRiskLevel() {
        return riskLevel;
    }

    /**
     * 设置风险等级(1-保守型2-稳健型3-激进型)
     *
     * @param riskLevel 风险等级(1-保守型2-稳健型3-激进型)
     */
    public void setRiskLevel(Byte riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * 获取邀请码
     *
     * @return invite_code - 邀请码
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置邀请码
     *
     * @param inviteCode 邀请码
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 获取是否补票人
     *
     * @return is_robot - 是否补票人
     */
    public Boolean getIsRobot() {
        return isRobot;
    }

    /**
     * 设置是否补票人
     *
     * @param isRobot 是否补票人
     */
    public void setIsRobot(Boolean isRobot) {
        this.isRobot = isRobot;
    }

    /**
     * 获取是否实名认证
     *
     * @return is_auth_name - 是否实名认证
     */
    public Boolean getIsAuthName() {
        return isAuthName;
    }

    /**
     * 设置是否实名认证
     *
     * @param isAuthName 是否实名认证
     */
    public void setIsAuthName(Boolean isAuthName) {
        this.isAuthName = isAuthName;
    }

    /**
     * 获取是否绑定银行卡
     *
     * @return is_binding_bankcard - 是否绑定银行卡
     */
    public Boolean getIsBindingBankcard() {
        return isBindingBankcard;
    }

    /**
     * 设置是否绑定银行卡
     *
     * @param isBindingBankcard 是否绑定银行卡
     */
    public void setIsBindingBankcard(Boolean isBindingBankcard) {
        this.isBindingBankcard = isBindingBankcard;
    }

    /**
     * 获取是否设置支付密码
     *
     * @return is_set_pay_pwd - 是否设置支付密码
     */
    public Boolean getIsSetPayPwd() {
        return isSetPayPwd;
    }

    /**
     * 设置是否设置支付密码
     *
     * @param isSetPayPwd 是否设置支付密码
     */
    public void setIsSetPayPwd(Boolean isSetPayPwd) {
        this.isSetPayPwd = isSetPayPwd;
    }

    /**
     * 获取是否绑定邮箱
     *
     * @return is_binding_email - 是否绑定邮箱
     */
    public Boolean getIsBindingEmail() {
        return isBindingEmail;
    }

    /**
     * 设置是否绑定邮箱
     *
     * @param isBindingEmail 是否绑定邮箱
     */
    public void setIsBindingEmail(Boolean isBindingEmail) {
        this.isBindingEmail = isBindingEmail;
    }

    /**
     * 获取是否购买过债权
     *
     * @return is_buy_lending - 是否购买过债权
     */
    public Boolean getIsBuyLending() {
        return isBuyLending;
    }

    /**
     * 设置是否购买过债权
     *
     * @param isBuyLending 是否购买过债权
     */
    public void setIsBuyLending(Boolean isBuyLending) {
        this.isBuyLending = isBuyLending;
    }

    /**
     * 获取密码强度(弱、中、强)
     *
     * @return login_password_complex - 密码强度(弱、中、强)
     */
    public Byte getLoginPasswordComplex() {
        return loginPasswordComplex;
    }

    /**
     * 设置密码强度(弱、中、强)
     *
     * @param loginPasswordComplex 密码强度(弱、中、强)
     */
    public void setLoginPasswordComplex(Byte loginPasswordComplex) {
        this.loginPasswordComplex = loginPasswordComplex;
    }

    /**
     * 获取实名认证时间
     *
     * @return auth_time - 实名认证时间
     */
    public Date getAuthTime() {
        return authTime;
    }

    /**
     * 设置实名认证时间
     *
     * @param authTime 实名认证时间
     */
    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    /**
     * 获取用户名(真实录入的)
     *
     * @return user_truename - 用户名(真实录入的)
     */
    public String getUserTruename() {
        return userTruename;
    }

    /**
     * 设置用户名(真实录入的)
     *
     * @param userTruename 用户名(真实录入的)
     */
    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename;
    }

    /**
     * 获取自己的邀请码
     *
     * @return self_invite_code - 自己的邀请码
     */
    public String getSelfInviteCode() {
        return selfInviteCode;
    }

    /**
     * 设置自己的邀请码
     *
     * @param selfInviteCode 自己的邀请码
     */
    public void setSelfInviteCode(String selfInviteCode) {
        this.selfInviteCode = selfInviteCode;
    }

    /**
     * 获取推荐码二维码打开地址
     *
     * @return qr_code_url - 推荐码二维码打开地址
     */
    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    /**
     * 设置推荐码二维码打开地址
     *
     * @param qrCodeUrl 推荐码二维码打开地址
     */
    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    /**
     * 获取1:普通用户，2内部正式员工，3内部兼职员工，4内部补标员
     *
     * @return type - 1:普通用户，2内部正式员工，3内部兼职员工，4内部补标员
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1:普通用户，2内部正式员工，3内部兼职员工，4内部补标员
     *
     * @param type 1:普通用户，2内部正式员工，3内部兼职员工，4内部补标员
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取用户状态：1正常，2禁用，3注销，4黑名单
     *
     * @return status - 用户状态：1正常，2禁用，3注销，4黑名单
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置用户状态：1正常，2禁用，3注销，4黑名单
     *
     * @param status 用户状态：1正常，2禁用，3注销，4黑名单
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取0:未开户:1:开户中;2: 待激活;3:成功; 4:失败
     *
     * @return account_status - 0:未开户:1:开户中;2: 待激活;3:成功; 4:失败
     */
    public Integer getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置0:未开户:1:开户中;2: 待激活;3:成功; 4:失败
     *
     * @param accountStatus 0:未开户:1:开户中;2: 待激活;3:成功; 4:失败
     */
    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 获取电子账号
     *
     * @return ele_acct_no - 电子账号
     */
    public String getEleAcctNo() {
        return eleAcctNo;
    }

    /**
     * 设置电子账号
     *
     * @param eleAcctNo 电子账号
     */
    public void setEleAcctNo(String eleAcctNo) {
        this.eleAcctNo = eleAcctNo;
    }

    /**
     * 获取电子账号开通时间
     *
     * @return ele_acct_no_open_time - 电子账号开通时间
     */
    public Date getEleAcctNoOpenTime() {
        return eleAcctNoOpenTime;
    }

    /**
     * 设置电子账号开通时间
     *
     * @param eleAcctNoOpenTime 电子账号开通时间
     */
    public void setEleAcctNoOpenTime(Date eleAcctNoOpenTime) {
        this.eleAcctNoOpenTime = eleAcctNoOpenTime;
    }

    /**
     * 获取第三方通道 XACBANK 西安银行  BAOFOO 宝付
     *
     * @return pay_channel - 第三方通道 XACBANK 西安银行  BAOFOO 宝付
     */
    public String getPayChannel() {
        return payChannel;
    }

    /**
     * 设置第三方通道 XACBANK 西安银行  BAOFOO 宝付
     *
     * @param payChannel 第三方通道 XACBANK 西安银行  BAOFOO 宝付
     */
    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * 获取绑卡时间
     *
     * @return binding_time - 绑卡时间
     */
    public Date getBindingTime() {
        return bindingTime;
    }

    /**
     * 设置绑卡时间
     *
     * @param bindingTime 绑卡时间
     */
    public void setBindingTime(Date bindingTime) {
        this.bindingTime = bindingTime;
    }

    /**
     * 获取购买新标的次数
     *
     * @return buy_num - 购买新标的次数
     */
    public Integer getBuyNum() {
        return buyNum;
    }

    /**
     * 设置购买新标的次数
     *
     * @param buyNum 购买新标的次数
     */
    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }
}