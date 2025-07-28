public class Student {

    private String id;
    private String name;

    private int ai;
    private int probabilityAndStatistics;
    private int ethics;
    private int dbms;
    private int coal;
    private int sda;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    // Getters and setters for id and name
    public String getId() { return id; }
    public String getName() { return name; }
  
    // Getters and setters for subjects
    public int getAI() { return ai; }
    public void setAI(int ai) { this.ai = ai; }
    public int getProbabilityAndStatistics() { return probabilityAndStatistics; }
    public void setProbabilityAndStatistics(int ps) { this.probabilityAndStatistics = ps; }
    public int getEthics() { return ethics; }
    public void setEthics(int ethics) { this.ethics = ethics; }
    public int getDBMS() { return dbms; }
    public void setDBMS(int dbms) { this.dbms = dbms; }
    public int getCoal() { return coal; }
    public void setCoal(int coal) { this.coal = coal; }
    public int getSDA() { return sda; }
    public void setSDA(int sda) { this.sda = sda; }
}

