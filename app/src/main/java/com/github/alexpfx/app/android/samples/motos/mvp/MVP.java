package com.github.alexpfx.app.android.samples.motos.mvp;

import android.os.Bundle;

/**
 * Created by alexandre on 01/04/2017.
 */

public interface MVP {
    interface Model {
        void retrieveMotos();
        void isFavorite (Moto moto);


    }
}
