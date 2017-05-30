package models;

import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.ArrayList;


public class Acceso {


    public int id;


    public double standar_time_ac=0;


    public int fallos_ac=0;


    public Item itemsAcceso;


}
