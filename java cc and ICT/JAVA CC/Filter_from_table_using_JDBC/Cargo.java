package java_lc_cc.Filter_from_table_using_JDBC;

public class Cargo {
    
    private Integer id;
    private String name;
    private Float width;
    private Float height;
    private Float weight;

    public Cargo(Integer id, String name,Float width,Float height, Float weight) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    
}

