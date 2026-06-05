@RestController
public class ProductController {  
         @GetMApping("/productsList")
         public  List<Products> getProducts(@RequestBody Products prod){
            return List<Products> prod= getProds(prod);
          }

        @PostMapping("/updateProducts")
        public  String SaveProducts(@RequestBody Products prod){
              return List<Products> prod= SaveProds(prod);
        }



}