package edu.escuelaing.arep.secureapp;

import org.json.JSONObject;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        try {
            port(433);

            secure("keystores/ecikeystore.p12", "prueba", null, null);
        } catch(Exception e){
            e.printStackTrace();
        }
        post("/",(req,res)->{
            JSONObject jsonObject = new JSONObject(req.body());
            return Calculator.calculate(jsonObject.get("operation").toString(),Double.parseDouble(jsonObject.get("value").toString()));
        });

    }
}
