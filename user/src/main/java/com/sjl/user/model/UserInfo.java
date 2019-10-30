package com.sjl.user.model;

/**
 * UserInfo
 *
 * @author 沈建林
 * @date 2019/10/30
 */
public class UserInfo {
    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}

