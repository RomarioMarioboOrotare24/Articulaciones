package data.structure;

public class Vertex {
    private String label;
    private ListLinked<Edge> edges;
    private State state;
    private int jumps;
    private Vertex parent;
    private int timeIn;
    private int timeOut;
    private double distance;
    private int sonsNumber;
    private Type type;
    private Vertex ancestor;
    
    public Vertex(String label)
    {
        this.label = label;
        this.edges = new ListLinked<>();
        this.jumps = 0;
        this.state = State.NO_VISITADO;
        this.sonsNumber=0;
        this.type = Type.NONE;
    }

    public void setAncestor(Vertex vertex) {
        ancestor = vertex;
    }

    public Vertex getAncestor() {
        return ancestor;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setSonsNumber(int sonsNumber) {
        this.sonsNumber = sonsNumber;
    }

    public int getSonsNumber() {
        return sonsNumber;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setTimeIn(int time) {
        this.timeIn = time;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeOut(int time) {
        this.timeOut = time;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public Vertex getParent() {
        return parent;
    }

    public int getJumps() {
        return jumps;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    public void setStatus(State state)
    {
        this.state = state;
    }

    public State getState()
    {
        return state;
    }

    public String getLabel()
    {
        return label;
    }

    public ListLinked<Edge> getEdges()
    {
        return edges;
    }

    public String toString()
    {
        return "Vertex={label={"+label+"},edges={"+edges+"}}";
    }

    public void addEdge(Edge edge)
    {
        edges.add(edge);
    }

    public void addEdge(Vertex v1, Vertex v2, double weight)
    {
        Edge edge = new Edge(v1, v2, weight);
        edges.add(edge);
    }
}
