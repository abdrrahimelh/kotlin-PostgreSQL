package inpt.sud.springbackkot.dao

import inpt.sud.springbackkot.data.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface ProductRepository : JpaRepository<Product?, Long?>