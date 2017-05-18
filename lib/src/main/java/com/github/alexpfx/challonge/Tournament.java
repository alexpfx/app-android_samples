package com.github.alexpfx.challonge;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexandre on 18/05/2017.
 */

class Tournament {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("description")
    private String description;
    @SerializedName("tournament_type")
    private String tournamentType;
    @SerializedName("started_at")
    private Object startedAt;
    @SerializedName("completed_at")
    private Object completedAt;
    @SerializedName("require_score_agreement")
    private boolean requireScoreAgreement;
    @SerializedName("notify_users_when_matches_open")
    private boolean notifyUsersWhenMatchesOpen;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("state")
    private String state;
    @SerializedName("open_signup")
    private boolean openSignup;
    @SerializedName("notify_users_when_the_tournament_ends")
    private boolean notifyUsersWhenTheTournamentEnds;
    @SerializedName("progress_meter")
    private int progressMeter;
    @SerializedName("quick_advance")
    private boolean quickAdvance;
    @SerializedName("hold_third_place_match")
    private boolean holdThirdPlaceMatch;
    @SerializedName("pts_for_game_win")
    private String ptsForGameWin;
    @SerializedName("pts_for_game_tie")
    private String ptsForGameTie;
    @SerializedName("pts_for_match_win")
    private String ptsForMatchWin;
    @SerializedName("pts_for_match_tie")
    private String ptsForMatchTie;
    @SerializedName("pts_for_bye")
    private String ptsForBye;
    @SerializedName("swiss_rounds")
    private int swissRounds;
    @SerializedName("private")
    private boolean privateX;
    @SerializedName("ranked_by")
    private String rankedBy;
    @SerializedName("show_rounds")
    private boolean showRounds;
    @SerializedName("hide_forum")
    private boolean hideForum;
    @SerializedName("sequential_pairings")
    private boolean sequentialPairings;
    @SerializedName("accept_attachments")
    private boolean acceptAttachments;
    @SerializedName("rr_pts_for_game_win")
    private String rrPtsForGameWin;
    @SerializedName("rr_pts_for_game_tie")
    private String rrPtsForGameTie;
    @SerializedName("rr_pts_for_match_win")
    private String rrPtsForMatchWin;
    @SerializedName("rr_pts_for_match_tie")
    private String rrPtsForMatchTie;
    @SerializedName("created_by_api")
    private boolean createdByApi;
    @SerializedName("credit_capped")
    private boolean creditCapped;
    @SerializedName("category")
    private Object category;
    @SerializedName("hide_seeds")
    private boolean hideSeeds;
    @SerializedName("prediction_method")
    private int predictionMethod;
    @SerializedName("predictions_opened_at")
    private Object predictionsOpenedAt;
    @SerializedName("anonymous_voting")
    private boolean anonymousVoting;
    @SerializedName("max_predictions_per_user")
    private int maxPredictionsPerUser;
    @SerializedName("signup_cap")
    private int signupCap;
    @SerializedName("game_id")
    private Object gameId;
    @SerializedName("participants_count")
    private int participantsCount;
    @SerializedName("group_stages_enabled")
    private boolean groupStagesEnabled;
    @SerializedName("allow_participant_match_reporting")
    private boolean allowParticipantMatchReporting;
    @SerializedName("teams")
    private Object teams;
    @SerializedName("check_in_duration")
    private Object checkInDuration;
    @SerializedName("start_at")
    private Object startAt;
    @SerializedName("started_checking_in_at")
    private Object startedCheckingInAt;
    @SerializedName("tie_breaks")
    private Object tieBreaks;
    @SerializedName("locked_at")
    private Object lockedAt;
    @SerializedName("event_id")
    private Object eventId;
    @SerializedName("public_predictions_before_start_time")
    private Object publicPredictionsBeforeStartTime;
    @SerializedName("ranked")
    private boolean ranked;
    @SerializedName("grand_finals_modifier")
    private Object grandFinalsModifier;
    @SerializedName("predict_the_losers_bracket")
    private Object predictTheLosersBracket;
    @SerializedName("spam")
    private Object spam;
    @SerializedName("ham")
    private Object ham;
    @SerializedName("description_source")
    private String descriptionSource;
    @SerializedName("subdomain")
    private Object subdomain;
    @SerializedName("full_challonge_url")
    private String fullChallongeUrl;
    @SerializedName("live_image_url")
    private String liveImageUrl;
    @SerializedName("sign_up_url")
    private Object signUpUrl;
    @SerializedName("review_before_finalizing")
    private boolean reviewBeforeFinalizing;
    @SerializedName("accepting_predictions")
    private boolean acceptingPredictions;
    @SerializedName("participants_locked")
    private boolean participantsLocked;
    @SerializedName("game_name")
    private Object gameName;
    @SerializedName("participants_swappable")
    private boolean participantsSwappable;
    @SerializedName("team_convertable")
    private boolean teamConvertable;
    @SerializedName("group_stages_were_started")
    private boolean groupStagesWereStarted;

    private Tournament(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setUrl(builder.url);
        setDescription(builder.description);
        setTournamentType(builder.tournamentType);
        setStartedAt(builder.startedAt);
        setCompletedAt(builder.completedAt);
        setRequireScoreAgreement(builder.requireScoreAgreement);
        setNotifyUsersWhenMatchesOpen(builder.notifyUsersWhenMatchesOpen);
        setCreatedAt(builder.createdAt);
        setUpdatedAt(builder.updatedAt);
        setState(builder.state);
        setOpenSignup(builder.openSignup);
        setNotifyUsersWhenTheTournamentEnds(builder.notifyUsersWhenTheTournamentEnds);
        setProgressMeter(builder.progressMeter);
        setQuickAdvance(builder.quickAdvance);
        setHoldThirdPlaceMatch(builder.holdThirdPlaceMatch);
        setPtsForGameWin(builder.ptsForGameWin);
        setPtsForGameTie(builder.ptsForGameTie);
        setPtsForMatchWin(builder.ptsForMatchWin);
        setPtsForMatchTie(builder.ptsForMatchTie);
        setPtsForBye(builder.ptsForBye);
        setSwissRounds(builder.swissRounds);
        setPrivateX(builder.privateX);
        setRankedBy(builder.rankedBy);
        setShowRounds(builder.showRounds);
        setHideForum(builder.hideForum);
        setSequentialPairings(builder.sequentialPairings);
        setAcceptAttachments(builder.acceptAttachments);
        setRrPtsForGameWin(builder.rrPtsForGameWin);
        setRrPtsForGameTie(builder.rrPtsForGameTie);
        setRrPtsForMatchWin(builder.rrPtsForMatchWin);
        setRrPtsForMatchTie(builder.rrPtsForMatchTie);
        setCreatedByApi(builder.createdByApi);
        setCreditCapped(builder.creditCapped);
        setCategory(builder.category);
        setHideSeeds(builder.hideSeeds);
        setPredictionMethod(builder.predictionMethod);
        setPredictionsOpenedAt(builder.predictionsOpenedAt);
        setAnonymousVoting(builder.anonymousVoting);
        setMaxPredictionsPerUser(builder.maxPredictionsPerUser);
        setSignupCap(builder.signupCap);
        setGameId(builder.gameId);
        setParticipantsCount(builder.participantsCount);
        setGroupStagesEnabled(builder.groupStagesEnabled);
        setAllowParticipantMatchReporting(builder.allowParticipantMatchReporting);
        setTeams(builder.teams);
        setCheckInDuration(builder.checkInDuration);
        setStartAt(builder.startAt);
        setStartedCheckingInAt(builder.startedCheckingInAt);
        setTieBreaks(builder.tieBreaks);
        setLockedAt(builder.lockedAt);
        setEventId(builder.eventId);
        setPublicPredictionsBeforeStartTime(builder.publicPredictionsBeforeStartTime);
        setRanked(builder.ranked);
        setGrandFinalsModifier(builder.grandFinalsModifier);
        setPredictTheLosersBracket(builder.predictTheLosersBracket);
        setSpam(builder.spam);
        setHam(builder.ham);
        setDescriptionSource(builder.descriptionSource);
        setSubdomain(builder.subdomain);
        setFullChallongeUrl(builder.fullChallongeUrl);
        setLiveImageUrl(builder.liveImageUrl);
        setSignUpUrl(builder.signUpUrl);
        setReviewBeforeFinalizing(builder.reviewBeforeFinalizing);
        setAcceptingPredictions(builder.acceptingPredictions);
        setParticipantsLocked(builder.participantsLocked);
        setGameName(builder.gameName);
        setParticipantsSwappable(builder.participantsSwappable);
        setTeamConvertable(builder.teamConvertable);
        setGroupStagesWereStarted(builder.groupStagesWereStarted);
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public Object getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Object startedAt) {
        this.startedAt = startedAt;
    }

    public Object getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Object completedAt) {
        this.completedAt = completedAt;
    }

    public boolean isRequireScoreAgreement() {
        return requireScoreAgreement;
    }

    public void setRequireScoreAgreement(boolean requireScoreAgreement) {
        this.requireScoreAgreement = requireScoreAgreement;
    }

    public boolean isNotifyUsersWhenMatchesOpen() {
        return notifyUsersWhenMatchesOpen;
    }

    public void setNotifyUsersWhenMatchesOpen(boolean notifyUsersWhenMatchesOpen) {
        this.notifyUsersWhenMatchesOpen = notifyUsersWhenMatchesOpen;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isOpenSignup() {
        return openSignup;
    }

    public void setOpenSignup(boolean openSignup) {
        this.openSignup = openSignup;
    }

    public boolean isNotifyUsersWhenTheTournamentEnds() {
        return notifyUsersWhenTheTournamentEnds;
    }

    public void setNotifyUsersWhenTheTournamentEnds(boolean notifyUsersWhenTheTournamentEnds) {
        this.notifyUsersWhenTheTournamentEnds = notifyUsersWhenTheTournamentEnds;
    }

    public int getProgressMeter() {
        return progressMeter;
    }

    public void setProgressMeter(int progressMeter) {
        this.progressMeter = progressMeter;
    }

    public boolean isQuickAdvance() {
        return quickAdvance;
    }

    public void setQuickAdvance(boolean quickAdvance) {
        this.quickAdvance = quickAdvance;
    }

    public boolean isHoldThirdPlaceMatch() {
        return holdThirdPlaceMatch;
    }

    public void setHoldThirdPlaceMatch(boolean holdThirdPlaceMatch) {
        this.holdThirdPlaceMatch = holdThirdPlaceMatch;
    }

    public String getPtsForGameWin() {
        return ptsForGameWin;
    }

    public void setPtsForGameWin(String ptsForGameWin) {
        this.ptsForGameWin = ptsForGameWin;
    }

    public String getPtsForGameTie() {
        return ptsForGameTie;
    }

    public void setPtsForGameTie(String ptsForGameTie) {
        this.ptsForGameTie = ptsForGameTie;
    }

    public String getPtsForMatchWin() {
        return ptsForMatchWin;
    }

    public void setPtsForMatchWin(String ptsForMatchWin) {
        this.ptsForMatchWin = ptsForMatchWin;
    }

    public String getPtsForMatchTie() {
        return ptsForMatchTie;
    }

    public void setPtsForMatchTie(String ptsForMatchTie) {
        this.ptsForMatchTie = ptsForMatchTie;
    }

    public String getPtsForBye() {
        return ptsForBye;
    }

    public void setPtsForBye(String ptsForBye) {
        this.ptsForBye = ptsForBye;
    }

    public int getSwissRounds() {
        return swissRounds;
    }

    public void setSwissRounds(int swissRounds) {
        this.swissRounds = swissRounds;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    public String getRankedBy() {
        return rankedBy;
    }

    public void setRankedBy(String rankedBy) {
        this.rankedBy = rankedBy;
    }

    public boolean isShowRounds() {
        return showRounds;
    }

    public void setShowRounds(boolean showRounds) {
        this.showRounds = showRounds;
    }

    public boolean isHideForum() {
        return hideForum;
    }

    public void setHideForum(boolean hideForum) {
        this.hideForum = hideForum;
    }

    public boolean isSequentialPairings() {
        return sequentialPairings;
    }

    public void setSequentialPairings(boolean sequentialPairings) {
        this.sequentialPairings = sequentialPairings;
    }

    public boolean isAcceptAttachments() {
        return acceptAttachments;
    }

    public void setAcceptAttachments(boolean acceptAttachments) {
        this.acceptAttachments = acceptAttachments;
    }

    public String getRrPtsForGameWin() {
        return rrPtsForGameWin;
    }

    public void setRrPtsForGameWin(String rrPtsForGameWin) {
        this.rrPtsForGameWin = rrPtsForGameWin;
    }

    public String getRrPtsForGameTie() {
        return rrPtsForGameTie;
    }

    public void setRrPtsForGameTie(String rrPtsForGameTie) {
        this.rrPtsForGameTie = rrPtsForGameTie;
    }

    public String getRrPtsForMatchWin() {
        return rrPtsForMatchWin;
    }

    public void setRrPtsForMatchWin(String rrPtsForMatchWin) {
        this.rrPtsForMatchWin = rrPtsForMatchWin;
    }

    public String getRrPtsForMatchTie() {
        return rrPtsForMatchTie;
    }

    public void setRrPtsForMatchTie(String rrPtsForMatchTie) {
        this.rrPtsForMatchTie = rrPtsForMatchTie;
    }

    public boolean isCreatedByApi() {
        return createdByApi;
    }

    public void setCreatedByApi(boolean createdByApi) {
        this.createdByApi = createdByApi;
    }

    public boolean isCreditCapped() {
        return creditCapped;
    }

    public void setCreditCapped(boolean creditCapped) {
        this.creditCapped = creditCapped;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public boolean isHideSeeds() {
        return hideSeeds;
    }

    public void setHideSeeds(boolean hideSeeds) {
        this.hideSeeds = hideSeeds;
    }

    public int getPredictionMethod() {
        return predictionMethod;
    }

    public void setPredictionMethod(int predictionMethod) {
        this.predictionMethod = predictionMethod;
    }

    public Object getPredictionsOpenedAt() {
        return predictionsOpenedAt;
    }

    public void setPredictionsOpenedAt(Object predictionsOpenedAt) {
        this.predictionsOpenedAt = predictionsOpenedAt;
    }

    public boolean isAnonymousVoting() {
        return anonymousVoting;
    }

    public void setAnonymousVoting(boolean anonymousVoting) {
        this.anonymousVoting = anonymousVoting;
    }

    public int getMaxPredictionsPerUser() {
        return maxPredictionsPerUser;
    }

    public void setMaxPredictionsPerUser(int maxPredictionsPerUser) {
        this.maxPredictionsPerUser = maxPredictionsPerUser;
    }

    public int getSignupCap() {
        return signupCap;
    }

    public void setSignupCap(int signupCap) {
        this.signupCap = signupCap;
    }

    public Object getGameId() {
        return gameId;
    }

    public void setGameId(Object gameId) {
        this.gameId = gameId;
    }

    public int getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(int participantsCount) {
        this.participantsCount = participantsCount;
    }

    public boolean isGroupStagesEnabled() {
        return groupStagesEnabled;
    }

    public void setGroupStagesEnabled(boolean groupStagesEnabled) {
        this.groupStagesEnabled = groupStagesEnabled;
    }

    public boolean isAllowParticipantMatchReporting() {
        return allowParticipantMatchReporting;
    }

    public void setAllowParticipantMatchReporting(boolean allowParticipantMatchReporting) {
        this.allowParticipantMatchReporting = allowParticipantMatchReporting;
    }

    public Object getTeams() {
        return teams;
    }

    public void setTeams(Object teams) {
        this.teams = teams;
    }

    public Object getCheckInDuration() {
        return checkInDuration;
    }

    public void setCheckInDuration(Object checkInDuration) {
        this.checkInDuration = checkInDuration;
    }

    public Object getStartAt() {
        return startAt;
    }

    public void setStartAt(Object startAt) {
        this.startAt = startAt;
    }

    public Object getStartedCheckingInAt() {
        return startedCheckingInAt;
    }

    public void setStartedCheckingInAt(Object startedCheckingInAt) {
        this.startedCheckingInAt = startedCheckingInAt;
    }

    public Object getTieBreaks() {
        return tieBreaks;
    }

    public void setTieBreaks(Object tieBreaks) {
        this.tieBreaks = tieBreaks;
    }

    public Object getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(Object lockedAt) {
        this.lockedAt = lockedAt;
    }

    public Object getEventId() {
        return eventId;
    }

    public void setEventId(Object eventId) {
        this.eventId = eventId;
    }

    public Object getPublicPredictionsBeforeStartTime() {
        return publicPredictionsBeforeStartTime;
    }

    public void setPublicPredictionsBeforeStartTime(Object publicPredictionsBeforeStartTime) {
        this.publicPredictionsBeforeStartTime = publicPredictionsBeforeStartTime;
    }

    public boolean isRanked() {
        return ranked;
    }

    public void setRanked(boolean ranked) {
        this.ranked = ranked;
    }

    public Object getGrandFinalsModifier() {
        return grandFinalsModifier;
    }

    public void setGrandFinalsModifier(Object grandFinalsModifier) {
        this.grandFinalsModifier = grandFinalsModifier;
    }

    public Object getPredictTheLosersBracket() {
        return predictTheLosersBracket;
    }

    public void setPredictTheLosersBracket(Object predictTheLosersBracket) {
        this.predictTheLosersBracket = predictTheLosersBracket;
    }

    public Object getSpam() {
        return spam;
    }

    public void setSpam(Object spam) {
        this.spam = spam;
    }

    public Object getHam() {
        return ham;
    }

    public void setHam(Object ham) {
        this.ham = ham;
    }

    public String getDescriptionSource() {
        return descriptionSource;
    }

    public void setDescriptionSource(String descriptionSource) {
        this.descriptionSource = descriptionSource;
    }

    public Object getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(Object subdomain) {
        this.subdomain = subdomain;
    }

    public String getFullChallongeUrl() {
        return fullChallongeUrl;
    }

    public void setFullChallongeUrl(String fullChallongeUrl) {
        this.fullChallongeUrl = fullChallongeUrl;
    }

    public String getLiveImageUrl() {
        return liveImageUrl;
    }

    public void setLiveImageUrl(String liveImageUrl) {
        this.liveImageUrl = liveImageUrl;
    }

    public Object getSignUpUrl() {
        return signUpUrl;
    }

    public void setSignUpUrl(Object signUpUrl) {
        this.signUpUrl = signUpUrl;
    }

    public boolean isReviewBeforeFinalizing() {
        return reviewBeforeFinalizing;
    }

    public void setReviewBeforeFinalizing(boolean reviewBeforeFinalizing) {
        this.reviewBeforeFinalizing = reviewBeforeFinalizing;
    }

    public boolean isAcceptingPredictions() {
        return acceptingPredictions;
    }

    public void setAcceptingPredictions(boolean acceptingPredictions) {
        this.acceptingPredictions = acceptingPredictions;
    }

    public boolean isParticipantsLocked() {
        return participantsLocked;
    }

    public void setParticipantsLocked(boolean participantsLocked) {
        this.participantsLocked = participantsLocked;
    }

    public Object getGameName() {
        return gameName;
    }

    public void setGameName(Object gameName) {
        this.gameName = gameName;
    }

    public boolean isParticipantsSwappable() {
        return participantsSwappable;
    }

    public void setParticipantsSwappable(boolean participantsSwappable) {
        this.participantsSwappable = participantsSwappable;
    }

    public boolean isTeamConvertable() {
        return teamConvertable;
    }

    public void setTeamConvertable(boolean teamConvertable) {
        this.teamConvertable = teamConvertable;
    }

    public boolean isGroupStagesWereStarted() {
        return groupStagesWereStarted;
    }

    public void setGroupStagesWereStarted(boolean groupStagesWereStarted) {
        this.groupStagesWereStarted = groupStagesWereStarted;
    }

    public static final class Builder {
        private int id;
        private String name;
        private String url;
        private String description;
        private String tournamentType;
        private Object startedAt;
        private Object completedAt;
        private boolean requireScoreAgreement;
        private boolean notifyUsersWhenMatchesOpen;
        private String createdAt;
        private String updatedAt;
        private String state;
        private boolean openSignup;
        private boolean notifyUsersWhenTheTournamentEnds;
        private int progressMeter;
        private boolean quickAdvance;
        private boolean holdThirdPlaceMatch;
        private String ptsForGameWin;
        private String ptsForGameTie;
        private String ptsForMatchWin;
        private String ptsForMatchTie;
        private String ptsForBye;
        private int swissRounds;
        private boolean privateX;
        private String rankedBy;
        private boolean showRounds;
        private boolean hideForum;
        private boolean sequentialPairings;
        private boolean acceptAttachments;
        private String rrPtsForGameWin;
        private String rrPtsForGameTie;
        private String rrPtsForMatchWin;
        private String rrPtsForMatchTie;
        private boolean createdByApi;
        private boolean creditCapped;
        private Object category;
        private boolean hideSeeds;
        private int predictionMethod;
        private Object predictionsOpenedAt;
        private boolean anonymousVoting;
        private int maxPredictionsPerUser;
        private int signupCap;
        private Object gameId;
        private int participantsCount;
        private boolean groupStagesEnabled;
        private boolean allowParticipantMatchReporting;
        private Object teams;
        private Object checkInDuration;
        private Object startAt;
        private Object startedCheckingInAt;
        private Object tieBreaks;
        private Object lockedAt;
        private Object eventId;
        private Object publicPredictionsBeforeStartTime;
        private boolean ranked;
        private Object grandFinalsModifier;
        private Object predictTheLosersBracket;
        private Object spam;
        private Object ham;
        private String descriptionSource;
        private Object subdomain;
        private String fullChallongeUrl;
        private String liveImageUrl;
        private Object signUpUrl;
        private boolean reviewBeforeFinalizing;
        private boolean acceptingPredictions;
        private boolean participantsLocked;
        private Object gameName;
        private boolean participantsSwappable;
        private boolean teamConvertable;
        private boolean groupStagesWereStarted;

        private Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder url(String val) {
            url = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder tournamentType(String val) {
            tournamentType = val;
            return this;
        }

        public Builder startedAt(Object val) {
            startedAt = val;
            return this;
        }

        public Builder completedAt(Object val) {
            completedAt = val;
            return this;
        }

        public Builder requireScoreAgreement(boolean val) {
            requireScoreAgreement = val;
            return this;
        }

        public Builder notifyUsersWhenMatchesOpen(boolean val) {
            notifyUsersWhenMatchesOpen = val;
            return this;
        }

        public Builder createdAt(String val) {
            createdAt = val;
            return this;
        }

        public Builder updatedAt(String val) {
            updatedAt = val;
            return this;
        }

        public Builder state(String val) {
            state = val;
            return this;
        }

        public Builder openSignup(boolean val) {
            openSignup = val;
            return this;
        }

        public Builder notifyUsersWhenTheTournamentEnds(boolean val) {
            notifyUsersWhenTheTournamentEnds = val;
            return this;
        }

        public Builder progressMeter(int val) {
            progressMeter = val;
            return this;
        }

        public Builder quickAdvance(boolean val) {
            quickAdvance = val;
            return this;
        }

        public Builder holdThirdPlaceMatch(boolean val) {
            holdThirdPlaceMatch = val;
            return this;
        }

        public Builder ptsForGameWin(String val) {
            ptsForGameWin = val;
            return this;
        }

        public Builder ptsForGameTie(String val) {
            ptsForGameTie = val;
            return this;
        }

        public Builder ptsForMatchWin(String val) {
            ptsForMatchWin = val;
            return this;
        }

        public Builder ptsForMatchTie(String val) {
            ptsForMatchTie = val;
            return this;
        }

        public Builder ptsForBye(String val) {
            ptsForBye = val;
            return this;
        }

        public Builder swissRounds(int val) {
            swissRounds = val;
            return this;
        }

        public Builder privateX(boolean val) {
            privateX = val;
            return this;
        }

        public Builder rankedBy(String val) {
            rankedBy = val;
            return this;
        }

        public Builder showRounds(boolean val) {
            showRounds = val;
            return this;
        }

        public Builder hideForum(boolean val) {
            hideForum = val;
            return this;
        }

        public Builder sequentialPairings(boolean val) {
            sequentialPairings = val;
            return this;
        }

        public Builder acceptAttachments(boolean val) {
            acceptAttachments = val;
            return this;
        }

        public Builder rrPtsForGameWin(String val) {
            rrPtsForGameWin = val;
            return this;
        }

        public Builder rrPtsForGameTie(String val) {
            rrPtsForGameTie = val;
            return this;
        }

        public Builder rrPtsForMatchWin(String val) {
            rrPtsForMatchWin = val;
            return this;
        }

        public Builder rrPtsForMatchTie(String val) {
            rrPtsForMatchTie = val;
            return this;
        }

        public Builder createdByApi(boolean val) {
            createdByApi = val;
            return this;
        }

        public Builder creditCapped(boolean val) {
            creditCapped = val;
            return this;
        }

        public Builder category(Object val) {
            category = val;
            return this;
        }

        public Builder hideSeeds(boolean val) {
            hideSeeds = val;
            return this;
        }

        public Builder predictionMethod(int val) {
            predictionMethod = val;
            return this;
        }

        public Builder predictionsOpenedAt(Object val) {
            predictionsOpenedAt = val;
            return this;
        }

        public Builder anonymousVoting(boolean val) {
            anonymousVoting = val;
            return this;
        }

        public Builder maxPredictionsPerUser(int val) {
            maxPredictionsPerUser = val;
            return this;
        }

        public Builder signupCap(int val) {
            signupCap = val;
            return this;
        }

        public Builder gameId(Object val) {
            gameId = val;
            return this;
        }

        public Builder participantsCount(int val) {
            participantsCount = val;
            return this;
        }

        public Builder groupStagesEnabled(boolean val) {
            groupStagesEnabled = val;
            return this;
        }

        public Builder allowParticipantMatchReporting(boolean val) {
            allowParticipantMatchReporting = val;
            return this;
        }

        public Builder teams(Object val) {
            teams = val;
            return this;
        }

        public Builder checkInDuration(Object val) {
            checkInDuration = val;
            return this;
        }

        public Builder startAt(Object val) {
            startAt = val;
            return this;
        }

        public Builder startedCheckingInAt(Object val) {
            startedCheckingInAt = val;
            return this;
        }

        public Builder tieBreaks(Object val) {
            tieBreaks = val;
            return this;
        }

        public Builder lockedAt(Object val) {
            lockedAt = val;
            return this;
        }

        public Builder eventId(Object val) {
            eventId = val;
            return this;
        }

        public Builder publicPredictionsBeforeStartTime(Object val) {
            publicPredictionsBeforeStartTime = val;
            return this;
        }

        public Builder ranked(boolean val) {
            ranked = val;
            return this;
        }

        public Builder grandFinalsModifier(Object val) {
            grandFinalsModifier = val;
            return this;
        }

        public Builder predictTheLosersBracket(Object val) {
            predictTheLosersBracket = val;
            return this;
        }

        public Builder spam(Object val) {
            spam = val;
            return this;
        }

        public Builder ham(Object val) {
            ham = val;
            return this;
        }

        public Builder descriptionSource(String val) {
            descriptionSource = val;
            return this;
        }

        public Builder subdomain(Object val) {
            subdomain = val;
            return this;
        }

        public Builder fullChallongeUrl(String val) {
            fullChallongeUrl = val;
            return this;
        }

        public Builder liveImageUrl(String val) {
            liveImageUrl = val;
            return this;
        }

        public Builder signUpUrl(Object val) {
            signUpUrl = val;
            return this;
        }

        public Builder reviewBeforeFinalizing(boolean val) {
            reviewBeforeFinalizing = val;
            return this;
        }

        public Builder acceptingPredictions(boolean val) {
            acceptingPredictions = val;
            return this;
        }

        public Builder participantsLocked(boolean val) {
            participantsLocked = val;
            return this;
        }

        public Builder gameName(Object val) {
            gameName = val;
            return this;
        }

        public Builder participantsSwappable(boolean val) {
            participantsSwappable = val;
            return this;
        }

        public Builder teamConvertable(boolean val) {
            teamConvertable = val;
            return this;
        }

        public Builder groupStagesWereStarted(boolean val) {
            groupStagesWereStarted = val;
            return this;
        }

        public Tournament build() {
            return new Tournament(this);
        }
    }
}
