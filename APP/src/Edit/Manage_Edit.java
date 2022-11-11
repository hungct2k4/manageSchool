package Edit;

public class Manage_Edit {
    public int type;
    public String newinfor;

    
    public Manage_Edit(int type, String newinfor) {
        this.type = type;
        this.newinfor = newinfor;
    }

    public Manage_Edit() {
        this.type = 0;
        this.newinfor = "";
    }

    public Integer getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getNewinfor() {
        return newinfor;
    }
    public void setNewinfor(String newinfor) {
        this.newinfor = newinfor;
    }
}
