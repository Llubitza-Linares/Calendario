package factoryDevices;

public class FactoryDevice {

    public static IDevice make(String devideType){
        IDevice device;

        switch (devideType.toLowerCase()){
            case "android":
                device= new Android();
                break;
            case "ios":
                device= new Ios();
                break;
            default:
                device= new WindowsPhone();
                break;
        }
        return device;
    }
}

