package builder.PhoneExample;

public class PhoneBuilder {

    private Phone phone;

    public PhoneBuilder() {
        phone = new Phone();
    }

    public PhoneBuilder withMark(String mark) {
        phone.setMark(mark);
        return this;
    }

    public PhoneBuilder withModel(String model) {
        phone.setModel(model);
        return this;
    }

    public PhoneBuilder withProcessor(Processor processor) {
        phone.setProcessor(processor);
        return this;
    }

    public PhoneBuilder withRam(int ram) {
        phone.setRam(ram);
        return this;
    }

    public PhoneBuilder withCamera(boolean camera) {
        phone.setCamera(camera);
        return this;
    }

    public Phone build() {
        return phone;
    }
}
