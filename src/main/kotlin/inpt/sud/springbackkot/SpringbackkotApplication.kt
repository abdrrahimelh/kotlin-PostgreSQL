package inpt.sud.springbackkot


import inpt.sud.springbackkot.dao.CategoryRepository
import inpt.sud.springbackkot.dao.ProductRepository
import inpt.sud.springbackkot.data.Product
import net.bytebuddy.utility.RandomString
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.lang.Exception
import java.util.*

@SpringBootApplication
class SpringbackkotApplication : CommandLineRunner {
    @Autowired
    var productRepository: ProductRepository? = null

    @Autowired
    var categoryRepository: CategoryRepository? = null


    @Throws(Exception::class)
    override fun run(vararg args: String?) {
        categoryRepository?.save(inpt.sud.springbackkot.data.Category(1, "Computers", null, null))
        categoryRepository?.save(inpt.sud.springbackkot.data.Category(2, "Printers", null, null))
        categoryRepository?.save(inpt.sud.springbackkot.data.Category(3, "Smartphones", null, null))
        val rnd = Random()
        categoryRepository?.findAll()?.forEach { category ->
            for (i in 0..9) {
                val p = Product()
                p.name=RandomString.make(10)
                p.currentPrice=((100 + rnd.nextInt(10000)).toDouble())
                p.isAvailable=(rnd.nextBoolean())
                p.isPromotion=(rnd.nextBoolean())
                p.isSelected=(rnd.nextBoolean())
                p.category=(category)
                p.photoName=("unknown.png")
                productRepository?.save(p)

            }
        }
    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<SpringbackkotApplication>(*args)
        }
    }
    }


