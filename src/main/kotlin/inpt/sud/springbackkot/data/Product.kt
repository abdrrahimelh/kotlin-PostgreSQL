package inpt.sud.springbackkot.data

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString
import java.io.Serializable
import javax.persistence.*

@Entity
@Data
@AllArgsConstructor
@ToString
class Product : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var name: String? = null
    var description: String? = null
    var currentPrice = 0.0
    var isPromotion = false
    var isSelected = false
    var isAvailable = false
    var photoName: String? = null

    @ManyToOne
    var category: Category? = null
}