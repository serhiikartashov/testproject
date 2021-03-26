package model;

public abstract class Citizen {

    public static final String CITY_OF_UKRAINE = "Ivano-Frankivsk";

    private String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Citizen(String id) {
        Id = id;
    }

    public abstract boolean isUkrainian();
}
