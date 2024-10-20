package Model;

public interface ComparableObject extends Comparable<ComparableObject>{

    @Override
    int compareTo(ComparableObject other);
}
