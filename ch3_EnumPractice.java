enum Food
{
	Pizza, Chicken, IceCream, Cookies, Pasta
}
public class ch3_EnumPractice {

	public static void main(String[] args) {
		Food f1 = Food.Pizza;
		Food f2 = Food.Chicken;
		Food f3 = Food.IceCream;
		Food f4 = Food.Cookies;
		Food f5 = Food.Pasta;
		System.out.println(f1+" "+f2+" "+f3+" "+ f4+ " "+f5);
		System.out.println(f1.ordinal()+" "+f2.ordinal()+" "+f3.ordinal()+" "+ f4.ordinal()+ " "+f5.ordinal());

	}

}
