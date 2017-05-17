package com.github.alexpfx.app.android.samples.motos.mvp;

import java.util.List;

/**
 * Created by alexandre on 01/04/2017.
 */

public class Moto {


    /**
     * title : Untitled
     * status : 2
     * type : bracket
     * created : 1366357626
     * changed : 1366357626
     * matches : [{"mid":1,"timestamp":0,"winner":0,"round":1,"group_id":0,"comment_count":0,
     * "file_count":0,"competitors":[{"mid":1,"weight":0,"position":1,"score":null,"tid":187,
     * "comment":null,"icon":null},{"mid":1,"weight":1,"position":8,"score":null,"tid":187,
     * "comment":null,"icon":null}],"winner_mid":5,"winner_weight":0,"position_0":1,
     * "position_1":8,"tid":187},{"mid":2,"timestamp":0,"winner":0,"round":1,"group_id":0,
     * "comment_count":0,"file_count":0,"competitors":[{"mid":2,"weight":0,"position":5,
     * "score":null,"tid":187,"comment":null,"icon":null},{"mid":2,"weight":1,"position":4,
     * "score":null,"tid":187,"comment":null,"icon":null}],"winner_mid":5,"winner_weight":1,
     * "position_0":5,"position_1":4,"tid":187},{"mid":3,"timestamp":0,"winner":0,"round":1,
     * "group_id":0,"comment_count":0,"file_count":0,"competitors":[{"mid":3,"weight":0,
     * "position":3,"score":null,"tid":187,"comment":null,"icon":null},{"mid":3,"weight":1,
     * "position":6,"score":null,"tid":187,"comment":null,"icon":null}],"winner_mid":6,
     * "winner_weight":0,"position_0":3,"position_1":6,"tid":187},{"mid":4,"timestamp":0,
     * "winner":0,"round":1,"group_id":0,"comment_count":0,"file_count":0,
     * "competitors":[{"mid":4,"weight":0,"position":7,"score":null,"tid":187,"comment":null,
     * "icon":null},{"mid":4,"weight":1,"position":2,"score":null,"tid":187,"comment":null,
     * "icon":null}],"winner_mid":6,"winner_weight":1,"position_0":7,"position_1":2,"tid":187},
     * {"mid":5,"timestamp":0,"winner":0,"round":2,"group_id":0,"comment_count":0,"file_count":0,
     * "competitors":[{"mid":5,"weight":0,"position":0,"score":null,"tid":187,"comment":null,
     * "icon":null},{"mid":5,"weight":1,"position":0,"score":null,"tid":187,"comment":null,
     * "icon":null}],"winner_mid":7,"winner_weight":0,"loser_mid":8,"loser_weight":0,"tid":187},
     * {"mid":6,"timestamp":0,"winner":0,"round":2,"group_id":0,"comment_count":0,"file_count":0,
     * "competitors":[{"mid":6,"weight":0,"position":0,"score":null,"tid":187,"comment":null,
     * "icon":null},{"mid":6,"weight":1,"position":0,"score":null,"tid":187,"comment":null,
     * "icon":null}],"winner_mid":7,"winner_weight":1,"loser_mid":8,"loser_weight":1,"tid":187},
     * {"mid":7,"timestamp":0,"winner":0,"round":3,"group_id":0,"comment_count":0,"file_count":0,
     * "competitors":[{"mid":7,"weight":0,"position":0,"score":null,"tid":187,"comment":null,
     * "icon":null},{"mid":7,"weight":1,"position":0,"score":null,"tid":187,"comment":null,
     * "icon":null}],"tid":187}]
     * participants : []
     * admins : []
     * location : null
     * location_url : null
     * twitch : null
     * size : 8
     * waiting_list : true
     * signup : true
     * password : false
     * deadline : 0
     * form : null
     * score_entry : true
     * fee_amount : 0
     * fee_currency : null
     * fee_email : null
     * rounds : null
     * body : []
     * format : 1
     * bronze_match : false
     * tid : 187
     * owner : admin
     * owner_uid : 1
     * fields : [{"fid":123,"label":"my custom field","type":"text"}]
     * picture_original : http://cdn.bracketcloud.com/tournaments/pictures/default.png
     * picture_small : http://cdn.bracketcloud.com/tournaments/pictures/small/default.png
     * picture_medium : http://cdn.bracketcloud.com/tournaments/pictures/medium/default.png
     */

    private String title;
    private int status;
    private String type;
    private int created;
    private int changed;
    private Object location;
    private Object location_url;
    private Object twitch;
    private int size;
    private boolean waiting_list;
    private boolean signup;
    private boolean password;
    private int deadline;
    private Object form;
    private boolean score_entry;
    private int fee_amount;
    private Object fee_currency;
    private Object fee_email;
    private Object rounds;
    private int format;
    private boolean bronze_match;
    private int tid;
    private String owner;
    private int owner_uid;
    private String picture_original;
    private String picture_small;
    private String picture_medium;
    private List<MatchesBean> matches;
    private List<?> participants;
    private List<?> admins;
    private List<?> body;
    private List<FieldsBean> fields;

    public Moto() {


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getChanged() {
        return changed;
    }

    public void setChanged(int changed) {
        this.changed = changed;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getLocation_url() {
        return location_url;
    }

    public void setLocation_url(Object location_url) {
        this.location_url = location_url;
    }

    public Object getTwitch() {
        return twitch;
    }

    public void setTwitch(Object twitch) {
        this.twitch = twitch;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isWaiting_list() {
        return waiting_list;
    }

    public void setWaiting_list(boolean waiting_list) {
        this.waiting_list = waiting_list;
    }

    public boolean isSignup() {
        return signup;
    }

    public void setSignup(boolean signup) {
        this.signup = signup;
    }

    public boolean isPassword() {
        return password;
    }

    public void setPassword(boolean password) {
        this.password = password;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public Object getForm() {
        return form;
    }

    public void setForm(Object form) {
        this.form = form;
    }

    public boolean isScore_entry() {
        return score_entry;
    }

    public void setScore_entry(boolean score_entry) {
        this.score_entry = score_entry;
    }

    public int getFee_amount() {
        return fee_amount;
    }

    public void setFee_amount(int fee_amount) {
        this.fee_amount = fee_amount;
    }

    public Object getFee_currency() {
        return fee_currency;
    }

    public void setFee_currency(Object fee_currency) {
        this.fee_currency = fee_currency;
    }

    public Object getFee_email() {
        return fee_email;
    }

    public void setFee_email(Object fee_email) {
        this.fee_email = fee_email;
    }

    public Object getRounds() {
        return rounds;
    }

    public void setRounds(Object rounds) {
        this.rounds = rounds;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public boolean isBronze_match() {
        return bronze_match;
    }

    public void setBronze_match(boolean bronze_match) {
        this.bronze_match = bronze_match;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getOwner_uid() {
        return owner_uid;
    }

    public void setOwner_uid(int owner_uid) {
        this.owner_uid = owner_uid;
    }

    public String getPicture_original() {
        return picture_original;
    }

    public void setPicture_original(String picture_original) {
        this.picture_original = picture_original;
    }

    public String getPicture_small() {
        return picture_small;
    }

    public void setPicture_small(String picture_small) {
        this.picture_small = picture_small;
    }

    public String getPicture_medium() {
        return picture_medium;
    }

    public void setPicture_medium(String picture_medium) {
        this.picture_medium = picture_medium;
    }

    public List<MatchesBean> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchesBean> matches) {
        this.matches = matches;
    }

    public List<?> getParticipants() {
        return participants;
    }

    public void setParticipants(List<?> participants) {
        this.participants = participants;
    }

    public List<?> getAdmins() {
        return admins;
    }

    public void setAdmins(List<?> admins) {
        this.admins = admins;
    }

    public List<?> getBody() {
        return body;
    }

    public void setBody(List<?> body) {
        this.body = body;
    }

    public List<FieldsBean> getFields() {
        return fields;
    }

    public void setFields(List<FieldsBean> fields) {
        this.fields = fields;
    }
}
