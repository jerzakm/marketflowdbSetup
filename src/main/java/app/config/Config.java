package app.config;

public class Config {
    private String dbUrl;
    private String user;
    private String pwd;

    public Config() {
    }

    public Config(String dbUrl, String user, String pwd) {
        this.dbUrl = dbUrl;
        this.user = user;
        this.pwd = pwd;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
