package com.itschool.course;

public enum Season {
    SPRING("it is green outside", 1) {
        @Override
        String action() {
            return "action made on spring";
        }
    },
    SUMMER("it is hot", 2) {
        @Override
        String action() {
            return null;
        }
    },
    AUTUMN("leafs are falling", 3) {
        @Override
        String action() {
            return null;
        }
    },
    WINTER("it is snowing", 4) {
        @Override
        String action() {
            return "action made in winter";
        }
    };

    private final String description;
    private final int number;

    Season(String description, int number) {
        this.description = description;
        this.number = number;
    }

    abstract String action();

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }
}
