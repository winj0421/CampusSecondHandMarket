package service;

import dto.request.*;
import dto.response.*;
import java.util.List;

public interface UserService {


    // 1. 用户注册与登录
    UserVO register(UserRegisterDTO userRegisterDTO); // 用户注册
    UserVO login(UserLoginDTO userLoginDTO);          // 用户登录
    void resetPassword(ResetPasswordDTO resetPasswordDTO); // 密码重置

    // 2. 用户信息管理
    UserVO getUserInfo(Long userId);                  // 查询用户详细信息
    void updateUserInfo(Long userId, UserUpdateDTO userUpdateDTO); // 修改用户信息
    void changePassword(Long userId, ChangePasswordDTO changePasswordDTO); // 修改密码
    void bindEmail(Long userId, BindEmailDTO bindEmailDTO); // 绑定邮箱
    void bindPhone(Long userId, BindPhoneDTO bindPhoneDTO); // 绑定手机号

    // 3. 用户角色与权限
    String getUserRole(Long userId);                  // 查询用户角色
    void switchUserRole(Long userId, String role);    // 切换用户角色
    void updateUserStatus(Long userId, Integer status); // 启用/禁用/注销账号

    // 4. 用户积分与钱包
    int getUserPoints(Long userId);                   // 查询积分余额
    List<PointRecordVO> getUserPointRecords(Long userId); // 查询积分明细
    void exchangePoints(Long userId, int points);     // 积分兑换
    WalletVO getWalletInfo(Long userId);              // 查询钱包余额
    List<WalletRecordVO> getWalletRecords(Long userId); // 查询钱包明细
    void rechargeWallet(Long userId, RechargeDTO rechargeDTO); // 钱包充值
    void withdrawWallet(Long userId, WithdrawDTO withdrawDTO); // 钱包提现

    // 5. 用户订单与购物车
    List<OrderVO> getUserOrders(Long userId);         // 查询订单列表
    OrderVO getOrderDetail(Long userId, Long orderId);// 查询订单详情
    void addToCart(Long userId, AddToCartDTO addToCartDTO); // 添加商品到购物车
    void updateCart(Long userId, UpdateCartDTO updateCartDTO); // 修改购物车
    void removeFromCart(Long userId, Long productId); // 删除购物车商品
    List<CartItemVO> getCartItems(Long userId);       // 查询购物车内容

    // 6. 用户评价与反馈
    void addProductReview(Long userId, ProductReviewDTO productReviewDTO); // 商品评价
    void addSellerReview(Long userId, SellerReviewDTO sellerReviewDTO);    // 商家服务评价
    List<ReviewVO> getUserReviews(Long userId);        // 查询评价记录

    // 7. 用户历史与浏览记录
    List<BrowseRecordVO> getBrowseRecords(Long userId); // 查询浏览记录
    List<PurchaseRecordVO> getPurchaseRecords(Long userId); // 查询购买记录

    // 8. 账号安全与风控
    List<LoginLogVO> getLoginLogs(Long userId);        // 查询登录日志
    void freezeAccount(Long userId);                   // 冻结账号
    void unfreezeAccount(Long userId);                 // 解冻账号

    // 9. 管理员相关
    List<UserVO> getUserList(UserQueryDTO userQueryDTO); // 查询用户列表（分页、条件）
    void auditUser(Long userId, AuditDTO auditDTO);    // 用户信息审核
    void deleteUser(Long userId);                      // 删除用户
}
