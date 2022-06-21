package ru.netology.manager;

import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

public class ProductManager {

        private ProductRepository repository; //инициализация

        public ProductManager(ProductRepository repo) { // конструктор
            this.repository = repo;
        }

        public void add(Product product) { // add - это принимать
            repository.add(product);
        }

        public Product[] findAll() { // findAll - найти всё
            Product[] products = repository.findAll();
            return products;
        }

        public void removeById(int id) { // removeById - удалить под этим id
            repository.removeById(id);
        }

        public boolean matches(Product product, String search) { // //  метод определения соответствия товара product запросу search
            if (product.getProductName().contains(search)) {
                return true;
            } else {
                return false;
            }
        }


        public Product[] searchBy(String text) { // метод searchBy(String text), который возвращает массив найденных товаров
            Product[] result = new Product[0];
            for (Product product : repository.findAll()) {
                if (matches(product, text)) {
                    Product[] tmp = new Product[result.length + 1];
                    for (int i = 0; i < result.length; i++) {
                        tmp[i] = result[i];
                    }
                    tmp[tmp.length - 1] = product;
                    result = tmp;
                }
            }
            return result;
        }

    }
