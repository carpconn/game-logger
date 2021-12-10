package org.carpconn.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * GenericLogger
 *
 * A generic list of methods to be inherited by the other models
 *
 * @author carpc on 12/9/2021
 */
public class GenericLogger {
    private DecimalFormat df = new DecimalFormat("#.#");

    public GenericLogger() {
    }

    /**
     * Format a rating to be returned to the user
     *
     * @param rating the un-formatted rating to be formatted
     * @return the formatted rating, to the tenths place
     */
    public Double formatRating(Double rating) {
        df.setRoundingMode(RoundingMode.HALF_UP);
        return Double.parseDouble(df.format(rating));
    }
}
