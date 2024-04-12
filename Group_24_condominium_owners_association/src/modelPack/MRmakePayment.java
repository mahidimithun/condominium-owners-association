
package modelPack;

/**
 *
 * @author HP
 */
public class MRmakePayment {
    
    String paymentCode;
    String paymentType;
    String unitOwnerId;
    String amount;

    public MRmakePayment(String paymentCode, String paymentType, String unitOwnerId, String amount) {
        this.paymentCode = paymentCode;
        this.paymentType = paymentType;
        this.unitOwnerId = unitOwnerId;
        this.amount = amount;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getUnitOwnerId() {
        return unitOwnerId;
    }

    public void setUnitOwnerId(String unitOwnerId) {
        this.unitOwnerId = unitOwnerId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MRmakePayment{" + "paymentCode=" + paymentCode + ", paymentType=" + paymentType + ", unitOwnerId=" + unitOwnerId + ", amount=" + amount + '}';
    }
    
    
    
}
