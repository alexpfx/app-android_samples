package com.github.alexpfx;

public class ChallongeTournamentBuilder {
    private String mName;
    private String mTournament_type;
    private String mDescription;
    private String mOpen_signup;
    private String mRanked_by;
    private String mUrl;
    private int mSignup_cap;
    private int mGrand_final_modifiers;

    public ChallongeTournamentBuilder name(String name) {
        mName = name;
        return this;
    }

    public ChallongeTournamentBuilder tournament_type(String tournament_type) {
        mTournament_type = tournament_type;
        return this;
    }



    public ChallongeTournamentBuilder description(String description) {
        mDescription = description;
        return this;
    }

    public ChallongeTournamentBuilder open_signup(String open_signup) {
        mOpen_signup = open_signup;
        return this;
    }

    public ChallongeTournamentBuilder ranked_by(String ranked_by) {
        mRanked_by = ranked_by;
        return this;
    }

    public ChallongeTournamentBuilder signup_cap(int signup_cap) {
        mSignup_cap = signup_cap;
        return this;
    }

    public ChallongeTournamentBuilder grand_final_modifiers(int grand_final_modifiers) {
        mGrand_final_modifiers = grand_final_modifiers;
        return this;
    }

    public ChallongeTournamentBuilder url (String url){
        mUrl = url;
        return this;
    }

    public ChallongeTournament createChallongeTournament() {
        return new ChallongeTournament(mName, mTournament_type, mDescription, mOpen_signup,
                mRanked_by, mSignup_cap, mGrand_final_modifiers, mUrl);
    }
}