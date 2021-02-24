package pl.emil7f.builderInferface;

import java.time.LocalDate;

public class Computer {

    private Double processor;
    private Integer memoryRam;
    private Double screenSize;
    private LocalDate creation;
    private Double weight;
    private String operationSystem;

    public Computer(Double processor, Integer memoryRam) {
        this.processor = processor;
        this.memoryRam = memoryRam;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memoryRam=" + memoryRam +
                ", screenSize=" + screenSize +
                ", creation=" + creation +
                ", weight=" + weight +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }

    public void setProcessor(Double processor) {
        this.processor = processor;
    }

    public void setMemoryRam(Integer memoryRam) {
        this.memoryRam = memoryRam;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public void setCreation(LocalDate creation) {
        this.creation = creation;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
