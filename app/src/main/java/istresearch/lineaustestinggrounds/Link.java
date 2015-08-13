package istresearch.lineaustestinggrounds;

/**
 * Created by Titch on 6/25/2015.
 */
public class Link <N, M>
{
    private N node1;
    private M node2;
    private int referenceFrom1To2;
    private int referenceFrom2To1;

    public Link(N n, M m)
    {
        node1 = n;
        node2 = m;
    }

    public N getNode1()
    {
        return node1;
    }

    public M getNode2()
    {
        return node2;
    }

    public int getReferenceTypeFromNode1ToNode2() { return referenceFrom1To2; }

    public void setReferenceTypeFromNode1ToNode2(int refType)
    {
        referenceFrom1To2 = refType;
    }

    public int getReferenceTypeFromNode2ToNode1() { return referenceFrom2To1; }

    public void setReferenceTypeFromNode2ToNode1(int refType)
    {
        referenceFrom1To2 = refType;
    }
}
