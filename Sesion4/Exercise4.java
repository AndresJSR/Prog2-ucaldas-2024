public class Exercise4 {
    public String user_name;
    public String cellphone;
    public String email;

    public Exercise4(String user_name_param, String cellphone_param, String email_param) {
        this.user_name = user_name_param;
        this.cellphone = cellphone_param;
        this.email = email_param;
    }

    public Exercise4(String user_name_param) {
        this.user_name = user_name_param;
    }

    public Exercise4() {
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCellPhone() {
        return cellphone;
    }

    public void setCellPhone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}