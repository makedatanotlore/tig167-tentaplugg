package makedatanotlore;

public class Builder {
    private String name;
    private String city;
    private String street;

    public String name(){
        return name;
    }

    public String city(){
        return city;
    }

    public String street(){
        return street;
    }

    public Builder(String name, String city, String street) {
    this.name = name;
    this.city = city;
    this.street = street;
    System.out.println("- created new builder");
    System.out.println("-- name: " + name);
    System.out.println("-- city: " + city);
    System.out.println("-- street: " + street);
    }

    public static class BuilderBuilder{
        private String name;
        private String city;
        private String street;

        public BuilderBuilder(){
            System.out.println("Builder.BuilderBuilder: START");
        }

        public BuilderBuilder name(String name){
            this.name = name;
            System.out.println("- set name to " + name);
            return this;
        }

        public BuilderBuilder city(String city){
            this.city = city;
            System.out.println("- set city to " + city);
            return this;
        }

        public BuilderBuilder street(String street){
            this.street = street;
            System.out.println("- set street to " + street);
            return this;
        }

        public Builder build(){
            System.out.println("- returning new builder");
            return new Builder(this.name, this.city, this.street);
        }
    }
}
