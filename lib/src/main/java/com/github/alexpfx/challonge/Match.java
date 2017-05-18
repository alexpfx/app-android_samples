package com.github.alexpfx.challonge;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexandre on 18/05/2017.
 */

class Match {
    @SerializedName("attachment_count")
    private Object attachmentCount;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("group_id")
    private Object groupId;
    @SerializedName("has_attachment")
    private boolean hasAttachment;
    @SerializedName("id")
    private int id;
    @SerializedName("identifier")
    private String identifier;
    @SerializedName("location")
    private Object location;
    @SerializedName("loser_id")
    private Object loserId;
    @SerializedName("player1_id")
    private int player1Id;
    @SerializedName("player1_is_prereq_match_loser")
    private boolean player1IsPrereqMatchLoser;
    @SerializedName("player1_prereq_match_id")
    private Object player1PrereqMatchId;
    @SerializedName("player1_votes")
    private Object player1Votes;
    @SerializedName("player2_id")
    private int player2Id;
    @SerializedName("player2_is_prereq_match_loser")
    private boolean player2IsPrereqMatchLoser;
    @SerializedName("player2_prereq_match_id")
    private Object player2PrereqMatchId;
    @SerializedName("player2_votes")
    private Object player2Votes;
    @SerializedName("round")
    private int round;
    @SerializedName("scheduled_time")
    private Object scheduledTime;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("state")
    private String state;
    @SerializedName("tournament_id")
    private int tournamentId;
    @SerializedName("underway_at")
    private Object underwayAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("winner_id")
    private Object winnerId;
    @SerializedName("prerequisite_match_ids_csv")
    private String prerequisiteMatchIdsCsv;
    @SerializedName("scores_csv")
    private String scoresCsv;

    public Object getAttachmentCount() {
        return attachmentCount;
    }

    public void setAttachmentCount(Object attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public boolean isHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getLoserId() {
        return loserId;
    }

    public void setLoserId(Object loserId) {
        this.loserId = loserId;
    }

    public int getPlayer1Id() {
        return player1Id;
    }

    public void setPlayer1Id(int player1Id) {
        this.player1Id = player1Id;
    }

    public boolean isPlayer1IsPrereqMatchLoser() {
        return player1IsPrereqMatchLoser;
    }

    public void setPlayer1IsPrereqMatchLoser(boolean player1IsPrereqMatchLoser) {
        this.player1IsPrereqMatchLoser = player1IsPrereqMatchLoser;
    }

    public Object getPlayer1PrereqMatchId() {
        return player1PrereqMatchId;
    }

    public void setPlayer1PrereqMatchId(Object player1PrereqMatchId) {
        this.player1PrereqMatchId = player1PrereqMatchId;
    }

    public Object getPlayer1Votes() {
        return player1Votes;
    }

    public void setPlayer1Votes(Object player1Votes) {
        this.player1Votes = player1Votes;
    }

    public int getPlayer2Id() {
        return player2Id;
    }

    public void setPlayer2Id(int player2Id) {
        this.player2Id = player2Id;
    }

    public boolean isPlayer2IsPrereqMatchLoser() {
        return player2IsPrereqMatchLoser;
    }

    public void setPlayer2IsPrereqMatchLoser(boolean player2IsPrereqMatchLoser) {
        this.player2IsPrereqMatchLoser = player2IsPrereqMatchLoser;
    }

    public Object getPlayer2PrereqMatchId() {
        return player2PrereqMatchId;
    }

    public void setPlayer2PrereqMatchId(Object player2PrereqMatchId) {
        this.player2PrereqMatchId = player2PrereqMatchId;
    }

    public Object getPlayer2Votes() {
        return player2Votes;
    }

    public void setPlayer2Votes(Object player2Votes) {
        this.player2Votes = player2Votes;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Object getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Object scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Object getUnderwayAt() {
        return underwayAt;
    }

    public void setUnderwayAt(Object underwayAt) {
        this.underwayAt = underwayAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Object winnerId) {
        this.winnerId = winnerId;
    }

    public String getPrerequisiteMatchIdsCsv() {
        return prerequisiteMatchIdsCsv;
    }

    public void setPrerequisiteMatchIdsCsv(String prerequisiteMatchIdsCsv) {
        this.prerequisiteMatchIdsCsv = prerequisiteMatchIdsCsv;
    }

    public String getScoresCsv() {
        return scoresCsv;
    }

    public void setScoresCsv(String scoresCsv) {
        this.scoresCsv = scoresCsv;
    }


    @Override
    public String toString() {
        return "Match{" +
                "attachmentCount=" + attachmentCount +
                ", createdAt='" + createdAt + '\'' +
                ", groupId=" + groupId +
                ", hasAttachment=" + hasAttachment +
                ", id=" + id +
                ", identifier='" + identifier + '\'' +
                ", location=" + location +
                ", loserId=" + loserId +
                ", player1Id=" + player1Id +
                ", player1IsPrereqMatchLoser=" + player1IsPrereqMatchLoser +
                ", player1PrereqMatchId=" + player1PrereqMatchId +
                ", player1Votes=" + player1Votes +
                ", player2Id=" + player2Id +
                ", player2IsPrereqMatchLoser=" + player2IsPrereqMatchLoser +
                ", player2PrereqMatchId=" + player2PrereqMatchId +
                ", player2Votes=" + player2Votes +
                ", round=" + round +
                ", scheduledTime=" + scheduledTime +
                ", startedAt='" + startedAt + '\'' +
                ", state='" + state + '\'' +
                ", tournamentId=" + tournamentId +
                ", underwayAt=" + underwayAt +
                ", updatedAt='" + updatedAt + '\'' +
                ", winnerId=" + winnerId +
                ", prerequisiteMatchIdsCsv='" + prerequisiteMatchIdsCsv + '\'' +
                ", scoresCsv='" + scoresCsv + '\'' +
                '}';
    }
}
