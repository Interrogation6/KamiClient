package haven;

public enum Theme {
    Pretty(WindowX.DecoratorType.Big),
    Small(WindowX.DecoratorType.Slim),
    Black(WindowX.DecoratorType.Slim2);
    
    private final WindowX.DecoratorType deco;
    
    Theme(WindowX.DecoratorType deco) {
        this.deco = deco;
    }
    
    public WindowX.Decorator deco() {
        return WindowX.decoratorByType(deco);
    }
}
