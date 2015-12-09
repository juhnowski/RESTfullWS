package ru.balov;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-09T18:27:34")
@StaticMetamodel(Pets.class)
public class Pets_ { 

    public static volatile SingularAttribute<Pets, String> owner;
    public static volatile SingularAttribute<Pets, Date> birthdate;
    public static volatile SingularAttribute<Pets, String> speciesName;
    public static volatile SingularAttribute<Pets, String> nickname;
    public static volatile SingularAttribute<Pets, Boolean> male;

}