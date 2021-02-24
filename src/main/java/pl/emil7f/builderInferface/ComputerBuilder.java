package pl.emil7f.builderInferface;

import java.time.LocalDate;

public interface ComputerBuilder {

    Computer build();

    ComputerBuilder setProcessor(Double processor);

    ComputerBuilder setMemoryRam(Integer memoryRam);

    ComputerBuilder setScreenSize(Double screenSize);

    ComputerBuilder setCreation(LocalDate creation);

    ComputerBuilder setWeight(Double weight);

    ComputerBuilder setOperationSystem(String operationSystem);


}
