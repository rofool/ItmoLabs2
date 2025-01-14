package labs.Lab3.DataModels;

public record Street(String name, String location) {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Street street = (Street) obj;
        return name.equals(street.name) && location.equals(street.location);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + location.hashCode();
    }

    @Override
    public String toString() {
        return "Street{name='" + name + "', location='" + location + "'}";
    }
}