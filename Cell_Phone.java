package CodeWithHarryOOPS;

public class Cell_Phone {
    private String phoneName;
    private String serialNo;

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void silentMode(){
        System.out.println("Cell Phone vibrating");
    }

    public void noSilentMode(){
        System.out.println("Cell Phone ringing");
    }

    public void cellPhoneDetail(){
        System.out.println("Name of cell phone: "+phoneName);
        System.out.println("Serial number of cell phone: "+serialNo);
    }
}
