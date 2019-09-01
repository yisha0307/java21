class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperatuer to -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("checking the temperature.");
        spirit.checkTemprature();
        spirit.showAttributes();   
        
        MarsRobot opportunity = new MarsRobot();
        opportunity.speed = 3;
        opportunity.temperature = -100;
        opportunity.status = "coming up";
        
        opportunity.showAttributes();
    }
}