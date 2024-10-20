package Model;

public class Tree {

    public Tree rightSon;
    public ComparableObject data;
    public Tree leftSon;


    public Tree(){
        this.rightSon = null;
        this.leftSon = null;
    
    }

    public Tree(ComparableObject data) {
        this.rightSon = null;
        this.leftSon = null;
        this.data = data;
    }
}
