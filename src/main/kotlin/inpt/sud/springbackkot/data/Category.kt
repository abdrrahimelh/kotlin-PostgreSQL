package inpt.sud.springbackkot.data

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString
import java.io.Serializable
import javax.persistence.*

@Entity
@Data
@ToString
class Category : Serializable {
    constructor(id: Long?, name: String?, description: String?, products: Collection<Product>?) {
        this.id = id
        this.description = description
        this.name = name
        this.products = products
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null
    var name: String? = null
    var description: String? = null

    @OneToMany(mappedBy = "category")
    private var products: Collection<Product>? = null
    fun getProducts(): Collection<Product>? {
        return products
    }

    fun setProducts(products: Collection<Product>?) {
        this.products = products
    }

    constructor() {}
}