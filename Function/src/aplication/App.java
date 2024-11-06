package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Produto;
import util.UpperCaseName;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> list = new ArrayList<>();

        // Adicionando instancias de produtos a lista
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("NoteBook", 700.00));
        list.add(new Produto("Cabo HDMI", 90.00));
        list.add(new Produto("PlayStation 5", 3900.50));

        // Obtendo uma stream a partir da lista "list" e chamando a função "map", que
        // aplica uma função a cada elemento da stream, gerando assim uma nova stream
        List<String> upperCaseNames = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}
