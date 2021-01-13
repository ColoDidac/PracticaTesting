package Data;

final public class DigitalSignature {

    private final byte[] doctorSignature;

    public DigitalSignature(byte code[]) { this.doctorSignature = code; }
    public DigitalSignature(){throw new IllegalArgumentException("falta un argument"); }
    public byte[] getdoctorSignature() { return doctorSignature; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSignature dSignature = (DigitalSignature) o;
        return doctorSignature.equals(dSignature.doctorSignature);
    }
    @Override
    public int hashCode() { return doctorSignature.hashCode(); }

    @Override
    public String toString() {
        return "HealthCardID{" + "personal code='" + doctorSignature + '\'' + '}';
}

}

