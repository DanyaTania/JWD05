package com.gourianova.binocularvision.entity;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Player extends User{
    /*
    private String login;
    private DateFormat create_time;
    private DateFormat update_time;
    private Map<DateFormat,DateFormat> today_play_times;//dates of today starts play the game + non reloaded date of today updates play the game
    private BigInteger max_result;//today max result



public  Player(String email){
    this.login=email;
   Map<DateFormat,DateFormat> today_play_times=new HashMap<>();
}

//TODO: to write map adding

    public DateFormat getCreate_time() {
        return create_time;
    }

    public void setCreate_time(DateFormat create_time) {
        this.create_time = create_time;
    }


    public DateFormat getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(DateFormat update_time) {
        this.update_time = update_time;
    }
    //TODO:  max of Sum(update play- start play)<=15 min with warning remark: 3 min left and solve were to put this method
    Date date = null;
    public void addTime(){
        DateFormat dateCreate=getCreate_time();
        DateFormat dateUpdate=getUpdate_time();

    this.today_play_times.put(dateUpdate,dateCreate);
        Date date=null;
        DateFormat dateFormat=new SimpleDateFormat();
        try {
            date = dateFormat.parse(dateCreate.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long time=date.getTime();
        int seconds=date.getSeconds();
                //date.s
        //https://ru.stackoverflow.com/questions/682542/%D0%A1%D1%80%D0%B0%D0%B2%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5-timestamp%D0%BE%D0%B2

        Timestamp timestamp = new Timestamp(time);
        Timestamp current = new Timestamp(System.currentTimeMillis());

        if (current.compareTo(timestamp) == 1) {
            //log.warning("time left");
        }


}

     */
}
