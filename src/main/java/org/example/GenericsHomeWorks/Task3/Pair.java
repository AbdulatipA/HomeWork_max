package org.example.GenericsHomeWorks.Task3;

public class Pair<FirstType, SecondType> {
   private FirstType firstType;
   private SecondType secondType;

    public FirstType getFirstType() {
        return firstType;
    }

    public void setFirstType(FirstType firstType) {
        this.firstType = firstType;
    }

    public SecondType getSecondType() {
        return secondType;
    }

    public void setSecondType(SecondType secondType) {
        this.secondType = secondType;
    }


    public Pair(FirstType type, SecondType parameter) {
        this.firstType = type;
        this.secondType = parameter;
    }
}


