package com.company.planes;

public class OldPlane {
    private OldEngine oldEngine;

    public OldPlane(OldEngine oldEngine) {
        System.out.println("old by constructor !");
        this.oldEngine = oldEngine;
    }

    public OldEngine getOldEngine() {
        return oldEngine;
    }

    @Override
    public String toString() {
        return "OldPlane{" +
                "oldEngine=" + oldEngine +
                '}';
    }
}
