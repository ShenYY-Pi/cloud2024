package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付交易表
 * @TableName t_pay
 */
@TableName(value ="t_pay")
public class TPay implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 支付流水号
     */
    private String pay_no;

    /**
     * 订单流水号
     */
    private String order_no;

    /**
     * 用户账号ID
     */
    private Integer user_id;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 删除标志，默认0不删除，1删除
     */
    private Integer deleted;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新时间
     */
    private Date update_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 支付流水号
     */
    public String getPay_no() {
        return pay_no;
    }

    /**
     * 支付流水号
     */
    public void setPay_no(String pay_no) {
        this.pay_no = pay_no;
    }

    /**
     * 订单流水号
     */
    public String getOrder_no() {
        return order_no;
    }

    /**
     * 订单流水号
     */
    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    /**
     * 用户账号ID
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * 用户账号ID
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * 交易金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 交易金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 删除标志，默认0不删除，1删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 删除标志，默认0不删除，1删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 创建时间
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * 创建时间
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * 更新时间
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * 更新时间
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TPay other = (TPay) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPay_no() == null ? other.getPay_no() == null : this.getPay_no().equals(other.getPay_no()))
            && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPay_no() == null) ? 0 : getPay_no().hashCode());
        result = prime * result + ((getOrder_no() == null) ? 0 : getOrder_no().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pay_no=").append(pay_no);
        sb.append(", order_no=").append(order_no);
        sb.append(", user_id=").append(user_id);
        sb.append(", amount=").append(amount);
        sb.append(", deleted=").append(deleted);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}