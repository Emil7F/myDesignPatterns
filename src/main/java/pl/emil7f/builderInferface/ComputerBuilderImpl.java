package pl.emil7f.builderInferface;

import java.time.LocalDate;

public class ComputerBuilderImpl implements ComputerBuilder {

    private Computer computer;

    public ComputerBuilderImpl(Double processor, Integer memorySize) {
        this.computer = new Computer(processor,memorySize);
    }

    @Override
    public Computer build() {
        return computer;
    }

    @Override
    public ComputerBuilder setProcessor(Double processor) {
        computer.setProcessor(processor);
        return this;
    }

    @Override
    public ComputerBuilder setMemoryRam(Integer memoryRam) {
        computer.setMemoryRam(memoryRam);
        return this;
    }

    @Override
    public ComputerBuilder setScreenSize(Double screenSize) {
        computer.setScreenSize(screenSize);
        return this;
    }

    @Override
    public ComputerBuilder setCreation(LocalDate creation) {
        computer.setCreation(creation);
        return this;
    }

    @Override
    public ComputerBuilder setWeight(Double weight) {
    computer.setWeight(weight);
        return this;
    }

    @Override
    public ComputerBuilder setOperationSystem(String operationSystem) {
        computer.setOperationSystem(operationSystem);
        return this;
    }
}
