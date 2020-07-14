/**
 * Demo class
 *
 * @author Sirius
 * @date 2020-07-14 17:15
 */
package com.sirius.domain;

public class UserId {
    private Integer id;
    private char flag;

    public UserId(Integer id, char flag) {
        this.id = id;
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public char getFlag() {
        return flag;
    }

    public void setFlag(char flag) {
        this.flag = flag;
    }
}
