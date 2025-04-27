package entity;


public class UserCoupon {

  private long id;
  private long userId;
  private long couponId;
  private long status;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp usedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getCouponId() {
    return couponId;
  }

  public void setCouponId(long couponId) {
    this.couponId = couponId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUsedAt() {
    return usedAt;
  }

  public void setUsedAt(java.sql.Timestamp usedAt) {
    this.usedAt = usedAt;
  }

}
