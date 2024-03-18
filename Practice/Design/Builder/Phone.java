package Practice.Design.Builder;

import Design_Principles.Creational.Builder.Student;

public class Phone {
    private String processor;
    private String os;
    private String company;
    private String modelName;
    private String ram;
    private int id;
    private int storage;

    private Phone(String processor, String os, String company, String modelName, String ram, int id, int storage) {
        this.processor = processor;
        this.os = os;
        this.company = company;
        this.modelName = modelName;
        this.ram = ram;
        this.id = id;
        this.storage = storage;
    }

    public static Builder builder() {
        return new Builder();
    }

      public static  class Builder {
        private String processor;
        private String os;
        private String company;
        private String modelName;
        private String ram;
        private int id;
        private int storage;

        public Builder Processor(String processor) {
           this.processor = processor;
           return this;
        }

        public Builder Os(String os) {
            this.os = os;
            return this;
        }

        public Builder Company(String company) {
            this.company = company;
            return this;
        }

        public Builder ModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder Ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder Storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Phone build() {
            return new Phone(this.processor,this.os,this.company,this.modelName, this.ram,this.id,this.storage);
        }

      }
}
