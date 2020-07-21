package com.arop.patternOperations.builder.cake;

import java.util.Objects;

public class Cake {
    private String name = "Undefined";
    private String shortCakes;
    private int layers = 1;
    private String cream;
    private String nuts;
    private String fruits;
    private String driedFruits;
    private String jam;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake = (Cake) o;
        return layers == cake.layers &&
                name.equals(cake.name) &&
                Objects.equals(shortCakes, cake.shortCakes) &&
                Objects.equals(cream, cake.cream) &&
                Objects.equals(nuts, cake.nuts) &&
                Objects.equals(fruits, cake.fruits) &&
                Objects.equals(driedFruits, cake.driedFruits) &&
                Objects.equals(jam, cake.jam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortCakes, layers, cream, nuts, fruits, driedFruits, jam);
    }

    @Override
    public String toString() {
        String resultConcat = "Cake{" +
                "name = '" + name + '\'' + ", layers = '" + layers + '\'';
        if (shortCakes != null) {
            resultConcat += ", shortCakes = '" + shortCakes + '\'';
        }
        if (cream != null) {
            resultConcat += ", cream = '" + cream + '\'';
        }
        if (nuts != null) {
            resultConcat += ", nuts = '" + nuts + '\'';
        }
        if (fruits != null) {
            resultConcat += ", fruits = '" + fruits + '\'';
        }
        if (driedFruits != null) {
            resultConcat += ", driedFruits = '" + driedFruits + '\'';
        }
        if (jam != null) {
            resultConcat += ", jam = '" + jam + '\'';
        }
        resultConcat += '}';

        return resultConcat;
    }

    public static class Builder {
        private Cake newCake;

        public Builder() {
            newCake = new Cake();
        }

        public Builder setName(String name) {
            newCake.name = name;
            return this;
        }

        public Builder setShortCakes(String shortCakes) {
            newCake.shortCakes = shortCakes;
            return this;
        }

        public Builder setLayers(int layers) {
            newCake.layers = layers;
            return this;
        }

        public Builder setCream(String cream) {
            newCake.cream = cream;
            return this;
        }

        public Builder setNuts(String nuts) {
            newCake.nuts = nuts;
            return this;
        }

        public Builder setFruits(String fruits) {
            newCake.fruits = fruits;
            return this;
        }

        public Builder setDriedFruits(String driedFruits) {
            newCake.driedFruits = driedFruits;
            return this;
        }

        public Builder setJam(String jam) {
            newCake.jam = jam;
            return this;
        }

        public Cake build() {
            return newCake;
        }
    }
}