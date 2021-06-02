package onedigitalinnovation.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor opcional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não esta presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não esta presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não esta presente"));

        Optional<String> optionalNullErro = Optional.of("");

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}
