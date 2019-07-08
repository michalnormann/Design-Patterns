package builder.CarExample;

public class EngineBuilder {
    private Engine engine;

    public EngineBuilder() {
        engine = new Engine();
    }

    public EngineBuilder withEngineCapacity(double engineCapacity) {
        engine.setEngineCapacity(engineCapacity);
        return this;
    }

    public EngineBuilder withFuelType(FuelType fuelType) {
        engine.setFuelType(fuelType);
        return this;
    }

    public EngineBuilder withTurbo(boolean turbo) {
        engine.setTurbo(turbo);
        return this;
    }

    public Engine build() {
        return engine;
    }
}
