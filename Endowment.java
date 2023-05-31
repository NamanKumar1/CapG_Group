public class Endowment {
    private String endowmentId,holderName,endowmentType,registratiomDate;

    public Endowment(String endowmentId, String holderName, String endowmentType, String registratiomDate) {
        this.endowmentId = endowmentId;
        this.holderName = holderName;
        this.endowmentType = endowmentType;
        this.registratiomDate = registratiomDate;
    }

    public String getEndowmentId() {
        return endowmentId;
    }

    public void setEndowmentId(String endowmentId) {
        this.endowmentId = endowmentId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getEndowmentType() {
        return endowmentType;
    }

    public void setEndowmentType(String endowmentType) {
        this.endowmentType = endowmentType;
    }

    public String getRegistratiomDate() {
        return registratiomDate;
    }

    public void setRegistratiomDate(String registratiomDate) {
        this.registratiomDate = registratiomDate;
    }
}
