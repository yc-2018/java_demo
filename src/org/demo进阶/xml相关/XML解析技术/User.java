//仰晨study 创建时间2023/2/14 23:41 星期二
package org.demo进阶.xml相关.XML解析技术;

public class User {
    private String id;
    private String name;
    private String password;
    private String phone;
    private boolean isAdmin;

    public User() {
    }

    public User(String id, String name, String password, String phone, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.isAdmin = isAdmin;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return isAdmin
     */
    public boolean isIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置
     * @param isAdmin
     */
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", password = " + password + ", phone = " + phone + ", isAdmin = " + isAdmin + "}";
    }
}
