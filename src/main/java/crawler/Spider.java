package crawler;

import Utils.ParsePage;
import Utils.ParseSeed;
import entity.Seed;
import service.Seed_ser;
import service.imp.Seed_ser_imp;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by mac on 03/05/2017.
 */
public class Spider {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String key = in.next();
        Seed conditon = new Seed();
        conditon.setSeed(key);
        Seed_ser seed_ser = new Seed_ser_imp();
        System.out.println("========== LOADING SEED ========== ");
        Seed seed = seed_ser.getSeed(conditon);
        if(seed == null){
            System.err.println("======== THIS SEED NOT EXIST ======");
            return;
        }
        System.out.println("========== START PARSE SEED ==========");
        try {
            ParseSeed.parseSeed(seed);
            System.out.println("========== END PARSE SEED ==========");
        } catch (Exception e) {
            System.out.println("========== EXCEPTION PARSE SEED ==========");
            e.printStackTrace();
        }


    }
}
