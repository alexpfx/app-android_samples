package com.github.alexpfx;

/**
 * Created by alexandre on 17/05/2017.
 */

public class ChallongeTournament {

    private String name;
    private String tournament_type;
    private String description;
    private String open_signup;
    private String ranked_by;
    private int signup_cap;
    private int grand_final_modifiers;
    private String url;


    public ChallongeTournament(String name, String tournament_type, String description,
            String open_signup, String ranked_by, int signup_cap, int grand_final_modifiers,
            String url) {
        this.url = url;
        this.name = name;
        this.tournament_type = tournament_type;
        this.description = description;
        this.open_signup = open_signup;
        this.ranked_by = ranked_by;
        this.signup_cap = signup_cap;
        this.grand_final_modifiers = grand_final_modifiers;
    }


}
