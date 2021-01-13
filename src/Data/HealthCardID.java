package Data;

final public class HealthCardID {
    private final String personalID;

    public HealthCardID(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Argument invàlid");
        }
        this.personalID = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthCardID hcardID = (HealthCardID) o;
        return personalID.equals(hcardID.personalID);
    }

    @Override
    public int hashCode() {
        return personalID.hashCode();
    }

    @Override
    public String toString() {
        return "HealthCardID{" + "personal code='" + personalID + '\'' + '}';
    }
}
