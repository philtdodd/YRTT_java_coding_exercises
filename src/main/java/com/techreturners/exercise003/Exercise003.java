package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {
    private static String[] Flavours = {
        "Pistachio",
        "Raspberry Ripple",
        "Vanilla",
        "Mint Chocolate Chip",
        "Chocolate",
        "Mango Sorbet"
    };

    int getIceCreamCode(String iceCreamFlavour) {
        //throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
        return Arrays.asList(Flavours).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        //throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
        return Flavours;
    }

}
