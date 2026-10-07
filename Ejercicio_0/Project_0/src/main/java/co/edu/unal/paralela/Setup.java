package co.edu.unal.paralela;

import static edu.rice.pcdp.PCDP.finish;
import static edu.rice.pcdp.PCDP.async;

public final class Setup{

    private Setup(){}

    public static int setup(final int val){
        final int[] resultado = new int[1];
        finish(()->{
            async(()->{
                resultado[0] = val;
            });
        });
        return resultado[0];
    }
}


