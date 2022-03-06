package inpt.sud.springbackkot.dao

import inpt.sud.springbackkot.data.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource

interface CategoryRepository : JpaRepository<Category?, Long?>