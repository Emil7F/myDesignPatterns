package pl.emil7f.builderInferface;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        LocalDate creationDate = LocalDate.of(2021, 01, 25);
        ComputerBuilderImpl computerBuilder = new ComputerBuilderImpl(8000D, 8);
        Computer computer = computerBuilder
                .setScreenSize(17D)
                .setCreation(creationDate)
                .setWeight(2D)
                .setOperationSystem("Windows 10")
                .build();

        System.out.println(computer.toString());
    }
}
