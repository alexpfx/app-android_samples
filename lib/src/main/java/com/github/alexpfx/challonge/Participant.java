package com.github.alexpfx.challonge;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexandre on 18/05/2017.
 */

class Participant {
    @SerializedName("active")
    private boolean active;
    @SerializedName("checked_in_at")
    private Object checkedInAt;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("final_rank")
    private Object finalRank;
    @SerializedName("group_id")
    private Object groupId;
    @SerializedName("icon")
    private Object icon;
    @SerializedName("id")
    private int id;
    @SerializedName("invitation_id")
    private Object invitationId;
    @SerializedName("invite_email")
    private Object inviteEmail;
    @SerializedName("misc")
    private Object misc;
    @SerializedName("name")
    private String name;
    @SerializedName("on_waiting_list")
    private boolean onWaitingList;
    @SerializedName("seed")
    private int seed;
    @SerializedName("tournament_id")
    private int tournamentId;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("challonge_username")
    private Object challongeUsername;
    @SerializedName("challonge_email_address_verified")
    private Object challongeEmailAddressVerified;
    @SerializedName("removable")
    private boolean removable;
    @SerializedName("participatable_or_invitation_attached")
    private boolean participatableOrInvitationAttached;
    @SerializedName("confirm_remove")
    private boolean confirmRemove;
    @SerializedName("invitation_pending")
    private boolean invitationPending;
    @SerializedName("display_name_with_invitation_email_address")
    private String displayNameWithInvitationEmailAddress;
    @SerializedName("email_hash")
    private Object emailHash;
    @SerializedName("username")
    private Object username;
    @SerializedName("attached_participatable_portrait_url")
    private Object attachedParticipatablePortraitUrl;
    @SerializedName("can_check_in")
    private boolean canCheckIn;
    @SerializedName("checked_in")
    private boolean checkedIn;
    @SerializedName("reactivatable")
    private boolean reactivatable;

    private Participant(Builder builder) {
        setActive(builder.active);
        setCheckedInAt(builder.checkedInAt);
        setCreatedAt(builder.createdAt);
        setFinalRank(builder.finalRank);
        setGroupId(builder.groupId);
        setIcon(builder.icon);
        setId(builder.id);
        setInvitationId(builder.invitationId);
        setInviteEmail(builder.inviteEmail);
        setMisc(builder.misc);
        setName(builder.name);
        setOnWaitingList(builder.onWaitingList);
        setSeed(builder.seed);
        setTournamentId(builder.tournamentId);
        setUpdatedAt(builder.updatedAt);
        setChallongeUsername(builder.challongeUsername);
        setChallongeEmailAddressVerified(builder.challongeEmailAddressVerified);
        setRemovable(builder.removable);
        setParticipatableOrInvitationAttached(builder.participatableOrInvitationAttached);
        setConfirmRemove(builder.confirmRemove);
        setInvitationPending(builder.invitationPending);
        setDisplayNameWithInvitationEmailAddress(builder.displayNameWithInvitationEmailAddress);
        setEmailHash(builder.emailHash);
        setUsername(builder.username);
        setAttachedParticipatablePortraitUrl(builder.attachedParticipatablePortraitUrl);
        setCanCheckIn(builder.canCheckIn);
        setCheckedIn(builder.checkedIn);
        setReactivatable(builder.reactivatable);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Object getCheckedInAt() {
        return checkedInAt;
    }

    public void setCheckedInAt(Object checkedInAt) {
        this.checkedInAt = checkedInAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getFinalRank() {
        return finalRank;
    }

    public void setFinalRank(Object finalRank) {
        this.finalRank = finalRank;
    }

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Object getIcon() {
        return icon;
    }

    public void setIcon(Object icon) {
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Object invitationId) {
        this.invitationId = invitationId;
    }

    public Object getInviteEmail() {
        return inviteEmail;
    }

    public void setInviteEmail(Object inviteEmail) {
        this.inviteEmail = inviteEmail;
    }

    public Object getMisc() {
        return misc;
    }

    public void setMisc(Object misc) {
        this.misc = misc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnWaitingList() {
        return onWaitingList;
    }

    public void setOnWaitingList(boolean onWaitingList) {
        this.onWaitingList = onWaitingList;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getChallongeUsername() {
        return challongeUsername;
    }

    public void setChallongeUsername(Object challongeUsername) {
        this.challongeUsername = challongeUsername;
    }

    public Object getChallongeEmailAddressVerified() {
        return challongeEmailAddressVerified;
    }

    public void setChallongeEmailAddressVerified(Object challongeEmailAddressVerified) {
        this.challongeEmailAddressVerified = challongeEmailAddressVerified;
    }

    public boolean isRemovable() {
        return removable;
    }

    public void setRemovable(boolean removable) {
        this.removable = removable;
    }

    public boolean isParticipatableOrInvitationAttached() {
        return participatableOrInvitationAttached;
    }

    public void setParticipatableOrInvitationAttached(boolean participatableOrInvitationAttached) {
        this.participatableOrInvitationAttached = participatableOrInvitationAttached;
    }

    public boolean isConfirmRemove() {
        return confirmRemove;
    }

    public void setConfirmRemove(boolean confirmRemove) {
        this.confirmRemove = confirmRemove;
    }

    public boolean isInvitationPending() {
        return invitationPending;
    }

    public void setInvitationPending(boolean invitationPending) {
        this.invitationPending = invitationPending;
    }

    public String getDisplayNameWithInvitationEmailAddress() {
        return displayNameWithInvitationEmailAddress;
    }

    public void setDisplayNameWithInvitationEmailAddress(
            String displayNameWithInvitationEmailAddress) {
        this.displayNameWithInvitationEmailAddress = displayNameWithInvitationEmailAddress;
    }

    public Object getEmailHash() {
        return emailHash;
    }

    public void setEmailHash(Object emailHash) {
        this.emailHash = emailHash;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getAttachedParticipatablePortraitUrl() {
        return attachedParticipatablePortraitUrl;
    }

    public void setAttachedParticipatablePortraitUrl(Object attachedParticipatablePortraitUrl) {
        this.attachedParticipatablePortraitUrl = attachedParticipatablePortraitUrl;
    }

    public boolean isCanCheckIn() {
        return canCheckIn;
    }

    public void setCanCheckIn(boolean canCheckIn) {
        this.canCheckIn = canCheckIn;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public boolean isReactivatable() {
        return reactivatable;
    }

    public void setReactivatable(boolean reactivatable) {
        this.reactivatable = reactivatable;
    }

    public static final class Builder {
        private boolean active;
        private Object checkedInAt;
        private String createdAt;
        private Object finalRank;
        private Object groupId;
        private Object icon;
        private int id;
        private Object invitationId;
        private Object inviteEmail;
        private Object misc;
        private String name;
        private boolean onWaitingList;
        private int seed;
        private int tournamentId;
        private String updatedAt;
        private Object challongeUsername;
        private Object challongeEmailAddressVerified;
        private boolean removable;
        private boolean participatableOrInvitationAttached;
        private boolean confirmRemove;
        private boolean invitationPending;
        private String displayNameWithInvitationEmailAddress;
        private Object emailHash;
        private Object username;
        private Object attachedParticipatablePortraitUrl;
        private boolean canCheckIn;
        private boolean checkedIn;
        private boolean reactivatable;

        private Builder() {
        }

        public Builder active(boolean val) {
            active = val;
            return this;
        }

        public Builder checkedInAt(Object val) {
            checkedInAt = val;
            return this;
        }

        public Builder createdAt(String val) {
            createdAt = val;
            return this;
        }

        public Builder finalRank(Object val) {
            finalRank = val;
            return this;
        }

        public Builder groupId(Object val) {
            groupId = val;
            return this;
        }

        public Builder icon(Object val) {
            icon = val;
            return this;
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder invitationId(Object val) {
            invitationId = val;
            return this;
        }

        public Builder inviteEmail(Object val) {
            inviteEmail = val;
            return this;
        }

        public Builder misc(Object val) {
            misc = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder onWaitingList(boolean val) {
            onWaitingList = val;
            return this;
        }

        public Builder seed(int val) {
            seed = val;
            return this;
        }

        public Builder tournamentId(int val) {
            tournamentId = val;
            return this;
        }

        public Builder updatedAt(String val) {
            updatedAt = val;
            return this;
        }

        public Builder challongeUsername(Object val) {
            challongeUsername = val;
            return this;
        }

        public Builder challongeEmailAddressVerified(Object val) {
            challongeEmailAddressVerified = val;
            return this;
        }

        public Builder removable(boolean val) {
            removable = val;
            return this;
        }

        public Builder participatableOrInvitationAttached(boolean val) {
            participatableOrInvitationAttached = val;
            return this;
        }

        public Builder confirmRemove(boolean val) {
            confirmRemove = val;
            return this;
        }

        public Builder invitationPending(boolean val) {
            invitationPending = val;
            return this;
        }

        public Builder displayNameWithInvitationEmailAddress(String val) {
            displayNameWithInvitationEmailAddress = val;
            return this;
        }

        public Builder emailHash(Object val) {
            emailHash = val;
            return this;
        }

        public Builder username(Object val) {
            username = val;
            return this;
        }

        public Builder attachedParticipatablePortraitUrl(Object val) {
            attachedParticipatablePortraitUrl = val;
            return this;
        }

        public Builder canCheckIn(boolean val) {
            canCheckIn = val;
            return this;
        }

        public Builder checkedIn(boolean val) {
            checkedIn = val;
            return this;
        }

        public Builder reactivatable(boolean val) {
            reactivatable = val;
            return this;
        }

        public Participant build() {
            return new Participant(this);
        }
    }
}
