package kajitool.web.domain.model;

import java.util.Date;
import java.util.List;

public class Recipe {
    private Long id;
    private String name;
    private int version;
    private Date updateAt;
    private List<RecipeDetail> recipeDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public List<RecipeDetail> getRecipeDetails() {
        return recipeDetails;
    }

    public void setRecipeDetails(List<RecipeDetail> recipeDetails) {
        this.recipeDetails = recipeDetails;
    }
}
