<<<<<<< HEAD
public class HealthEndowment extends Endowment {

    private String healthCareCenter;
    private int holderAge;
    public HealthEndowment(String endowmentId, String holderName, String endowmentType, String registratiomDate, String healthCareCenter, int holderAge) {
        super(endowmentId, holderName, endowmentType, registratiomDate);
        this.healthCareCenter=healthCareCenter;
        this.holderAge=holderAge;
    }

    public String getHealthCareCenter() {
        return healthCareCenter;
    }

    public void setHealthCareCenter(String healthCareCenter) {
        this.healthCareCenter = healthCareCenter;
    }

    public int getHolderAge() {
        return holderAge;
    }

    public void setHolderAge(int holderAge) {
        this.holderAge = holderAge;
    }

    public  double calculateEndowment(){
        if(holderAge<=30){
            return 120000;
        } else if (holderAge>30 && holderAge<60) {
            return  200000;
        }
        else {
            return 500000;
        }
=======
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
>>>>>>> origin/Divyansh
    }
}
