package bg.softuni.cooking.repository;

import bg.softuni.cooking.model.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, Long> {

    //@Query("SELECT l FROM LogEntity l WHERE l.recipe.id = :id")
    //List<LogEntity> logsToDelete(@Param ("id") Long recipeId);
}
