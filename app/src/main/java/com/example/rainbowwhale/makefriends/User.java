package com.example.rainbowwhale.makefriends;

/**
 * Created by rainbowwhale on 2015-09-05.
 */

public class User {
    String name, nick, desc;
    Boolean gender;
    Integer portrate;
    User next;


    public User(String name, String nick, String desc, Boolean gender, Integer portrate) {
        this.name = name;
        this.nick = nick;
        this.desc = desc;
        this.gender = gender;
        this.portrate = portrate;
        this.next = null;
    }

    public void Append(String name, String nick, String desc, Boolean gender, Integer portrate){
        this.next = new User(name, nick, desc, gender, portrate);
    }

    public void Drop(){

    }


    public String getNick() {
        return nick;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getPortrate() {
        return portrate;
    }

    public User getNext() {
        return next;
    }

    public String getName() {
        return name;
    }

    public Boolean getGender() {
        return gender;
    }
}
