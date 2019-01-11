public class Builder {
    private String name;
    private String city;
    private String street;

    public Builder(String name, String city, String street) {
    this.name = name;
    this.city = city;
    this.street = street;
    }

    public static class BuilderBuilder{
        private String name;
        private String city;
        private String street;

        public BuilderBuilder(){}

        public BuilderBuilder name(String name){
            this.name = name;
            return this;
        }

        public BuilderBuilder city(String city){
            this.city = city;
            return this;
        }

        public BuilderBuilder street(String street){
            this.street = street;
            return this;
        }

        public Builder get(){
            return new Builder(this.name, this.city, this.street);
        }
    }
}
