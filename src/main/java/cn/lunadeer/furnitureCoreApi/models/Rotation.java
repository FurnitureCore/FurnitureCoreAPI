package cn.lunadeer.furnitureCoreApi.models;

public enum Rotation {
    R_0(0f),
    R_22_5(22.5f),
    R_45(45f),
    R_67_5(67.5f),
    R_90(90f),
    R_112_5(112.5f),
    R_135(135f),
    R_157_5(157.5f),
    R_180(180f),
    R_202_5(202.5f),
    R_225(225f),
    R_247_5(247.5f),
    R_270(270f),
    R_292_5(292.5f),
    R_315(315f),
    R_337_5(337.5f);


    private final float angle;

    Rotation(float angle) {
        this.angle = angle;
    }

    public float getAngle() {
        return angle;
    }

    public Rotation next() {
        int index = this.ordinal();
        return values()[(index + 1) % values().length];
    }

    public static Rotation fromYaw(float yaw) {
        // find the closest angle
        float angle = yaw % 360;
        if (angle < 0) {
            angle += 360;
        }
        if (angle < 11.25) {
            return R_0;
        } else if (angle < 33.75) {
            return R_22_5;
        } else if (angle < 56.25) {
            return R_45;
        } else if (angle < 78.75) {
            return R_67_5;
        } else if (angle < 101.25) {
            return R_90;
        } else if (angle < 123.75) {
            return R_112_5;
        } else if (angle < 146.25) {
            return R_135;
        } else if (angle < 168.75) {
            return R_157_5;
        } else if (angle < 191.25) {
            return R_180;
        } else if (angle < 213.75) {
            return R_202_5;
        } else if (angle < 236.25) {
            return R_225;
        } else if (angle < 258.75) {
            return R_247_5;
        } else if (angle < 281.25) {
            return R_270;
        } else if (angle < 303.75) {
            return R_292_5;
        } else if (angle < 326.25) {
            return R_315;
        } else if (angle < 348.75) {
            return R_337_5;
        } else {
            return R_0;
        }
    }
}
