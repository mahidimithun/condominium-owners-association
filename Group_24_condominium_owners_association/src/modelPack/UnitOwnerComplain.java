package modelPack;

public class UnitOwnerComplain {

    private String message;

    public UnitOwnerComplain() {
    }

//    public UnitOwnerComplain(String message) {
//        this.message = message;
//    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UnitOwnerComplain{" + "message=" + message + '}';
    }

}
