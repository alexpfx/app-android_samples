package com.github.alexpfx.challonge;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexandre on 18/05/2017.
 */

public class CreateParticipantResponse {


    @SerializedName("participant")
    private Participant participant;

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
}
