package ro.fasttrackit.code.ex1;

import java.util.Collection;
import java.util.HashSet;

public class Bouquet {
        private final HashSet<String> bouquet;


        public Bouquet(HashSet<Flower> bouquet) {
            this.bouquet = new HashSet<>();
        }

        public void addFlower(String newflower) {
            bouquet.add(newflower);
        }

        public void removeflower(String flower) {
            bouquet.remove(flower);
        }

        public Collection<String> getAll() {
            return new HashSet<>(this.bouquet);
        }

        @Override
        public String toString() {
            return "Bouquet{" +
                    "bouquet=" + bouquet +
                    '}';
        }
    }


