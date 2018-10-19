package design.factory.common;

/**
 * 类描述:
 *
 * @createdtime 2018/9/30
 */
public class NuWa {

    public static void main(String[] args) {
        String phone = "13212345678";
        String newPhone = phone.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        System.out.println(newPhone);

        String O  = "";
        for(int i=0;i<10;i++){
            O+=i;
        }
        System.out.println(O);

        NuWa nuWa = new NuWa();
        nuWa.s();
       /* System.out.println("################################################################################################");
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        System.out.println("白人");
        Human whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("黑人");
        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("黄人");
        Human yelloHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yelloHuman.getColor();
        yelloHuman.talk();
        System.out.println("################################################################################################");
        System.out.println("白人");
        Human whiteHuman1 = HumanFactory.staticCreateHuman(WhiteHuman.class);
        whiteHuman1.getColor();
        whiteHuman1.talk();
        System.out.println("黑人");
        Human blackHuman1 =  HumanFactory.staticCreateHuman(BlackHuman.class);
        blackHuman1.getColor();
        blackHuman1.talk();
        System.out.println("黄人");
        Human yelloHuman1 =  HumanFactory.staticCreateHuman(YellowHuman.class);
        yelloHuman1.getColor();
        yelloHuman1.talk();
*/

    }
    public void s(){
        System.out.println(this);
    }
}
