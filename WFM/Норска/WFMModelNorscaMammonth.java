// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNorscaMammonth extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer jaw_lower;
	private final ModelRenderer tusk_lower_right;
	private final ModelRenderer tusk_lower_right_r1;
	private final ModelRenderer tusk_lower_right2;
	private final ModelRenderer tusk_lower_right2_r1;
	private final ModelRenderer tusk_lower_right3;
	private final ModelRenderer tusk_lower_right3_r1;
	private final ModelRenderer tusk_lower_left;
	private final ModelRenderer tusk_lower_left_r1;
	private final ModelRenderer tusk_lower_left2;
	private final ModelRenderer tusk_lower_left2_r1;
	private final ModelRenderer tusk_lower_left3;
	private final ModelRenderer tusk_lower_left3_r1;
	private final ModelRenderer jaw_upper;
	private final ModelRenderer trunk;
	private final ModelRenderer trunk2;
	private final ModelRenderer trunk3;
	private final ModelRenderer trunk4;
	private final ModelRenderer tusk_left;
	private final ModelRenderer tusk_left2;
	private final ModelRenderer tusk_left3;
	private final ModelRenderer tusk_left4;
	private final ModelRenderer tusk_left5;
	private final ModelRenderer tusk_right;
	private final ModelRenderer tusk_right2;
	private final ModelRenderer tusk_right3;
	private final ModelRenderer tusk_right4;
	private final ModelRenderer tusk_right5;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer Neck;
	private final ModelRenderer Body;
	private final ModelRenderer Back;
	private final ModelRenderer saddle;
	private final ModelRenderer harness_back;
	private final ModelRenderer harness_front;
	private final ModelRenderer fence;
	private final ModelRenderer rider_saddle_left;
	private final ModelRenderer ride_saddle;
	private final ModelRenderer rider_saddle_right;
	private final ModelRenderer pole;
	private final ModelRenderer pole2;
	private final ModelRenderer pole3;
	private final ModelRenderer pole4;
	private final ModelRenderer pole5;
	private final ModelRenderer pole6;
	private final ModelRenderer pole7;
	private final ModelRenderer pole8;
	private final ModelRenderer top_saddle;
	private final ModelRenderer pole_big;
	private final ModelRenderer pole_big2;
	private final ModelRenderer pole_big3;
	private final ModelRenderer pole_big4;
	private final ModelRenderer fence_top;
	private final ModelRenderer Back2;
	private final ModelRenderer leg_left_front;
	private final ModelRenderer leg_left_front2;
	private final ModelRenderer leg_left_back;
	private final ModelRenderer leg_left_back2;
	private final ModelRenderer leg_right_front;
	private final ModelRenderer leg_right_front2;
	private final ModelRenderer leg_right_back;
	private final ModelRenderer leg_right_back2;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;

	public WFMModelNorscaMammonth() {
		textureWidth = 256;
		textureHeight = 256;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -8.0F, -11.5F);
		setRotationAngle(Head, -0.1745F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -5.5F, -7.5652F, -16.3994F, 11, 12, 10, 0.0F, false));

		jaw_lower = new ModelRenderer(this);
		jaw_lower.setRotationPoint(0.0F, 2.9044F, -5.0521F);
		Head.addChild(jaw_lower);
		setRotationAngle(jaw_lower, 0.1745F, 0.0F, 0.0F);
		jaw_lower.cubeList.add(new ModelBox(jaw_lower, 0, 23, -5.0F, -8.5F, -3.0F, 10, 15, 5, 0.0F, false));

		tusk_lower_right = new ModelRenderer(this);
		tusk_lower_right.setRotationPoint(-3.0F, 10.0F, 0.0F);
		jaw_lower.addChild(tusk_lower_right);
		setRotationAngle(tusk_lower_right, 0.1309F, 0.0F, 0.0F);
		

		tusk_lower_right_r1 = new ModelRenderer(this);
		tusk_lower_right_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tusk_lower_right.addChild(tusk_lower_right_r1);
		setRotationAngle(tusk_lower_right_r1, 0.0F, 0.0F, 0.2618F);
		tusk_lower_right_r1.cubeList.add(new ModelBox(tusk_lower_right_r1, 29, 96, -3.5132F, -3.9153F, -1.2389F, 4, 9, 3, 0.0F, false));

		tusk_lower_right2 = new ModelRenderer(this);
		tusk_lower_right2.setRotationPoint(0.0F, -1.0F, 1.0F);
		tusk_lower_right.addChild(tusk_lower_right2);
		setRotationAngle(tusk_lower_right2, -0.1309F, 0.0F, 0.0F);
		

		tusk_lower_right2_r1 = new ModelRenderer(this);
		tusk_lower_right2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tusk_lower_right2.addChild(tusk_lower_right2_r1);
		setRotationAngle(tusk_lower_right2_r1, 0.0F, 0.0F, 0.2618F);
		tusk_lower_right2_r1.cubeList.add(new ModelBox(tusk_lower_right2_r1, 29, 110, -3.0176F, 4.0681F, -1.0F, 3, 7, 2, 0.0F, false));

		tusk_lower_right3 = new ModelRenderer(this);
		tusk_lower_right3.setRotationPoint(-4.3646F, 11.5801F, -0.6476F);
		tusk_lower_right2.addChild(tusk_lower_right3);
		setRotationAngle(tusk_lower_right3, -0.2182F, 0.0F, 0.0F);
		

		tusk_lower_right3_r1 = new ModelRenderer(this);
		tusk_lower_right3_r1.setRotationPoint(3.3646F, -12.557F, -1.0F);
		tusk_lower_right3.addChild(tusk_lower_right3_r1);
		setRotationAngle(tusk_lower_right3_r1, 0.0F, 0.0F, 0.2618F);
		tusk_lower_right3_r1.cubeList.add(new ModelBox(tusk_lower_right3_r1, 31, 121, -1.5054F, 10.1139F, 0.5671F, 2, 5, 1, 0.0F, false));

		tusk_lower_left = new ModelRenderer(this);
		tusk_lower_left.setRotationPoint(5.0F, 10.0F, 0.0F);
		jaw_lower.addChild(tusk_lower_left);
		setRotationAngle(tusk_lower_left, 0.1135F, 0.0653F, -0.5199F);
		

		tusk_lower_left_r1 = new ModelRenderer(this);
		tusk_lower_left_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tusk_lower_left.addChild(tusk_lower_left_r1);
		setRotationAngle(tusk_lower_left_r1, 0.0F, 0.0F, 0.2618F);
		tusk_lower_left_r1.cubeList.add(new ModelBox(tusk_lower_left_r1, 29, 96, -2.4868F, -3.9153F, -1.2389F, 4, 9, 3, 0.0F, false));

		tusk_lower_left2 = new ModelRenderer(this);
		tusk_lower_left2.setRotationPoint(0.0F, -1.0F, 1.0F);
		tusk_lower_left.addChild(tusk_lower_left2);
		setRotationAngle(tusk_lower_left2, -0.1309F, 0.0F, 0.0F);
		

		tusk_lower_left2_r1 = new ModelRenderer(this);
		tusk_lower_left2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tusk_lower_left2.addChild(tusk_lower_left2_r1);
		setRotationAngle(tusk_lower_left2_r1, 0.0F, 0.0F, 0.2618F);
		tusk_lower_left2_r1.cubeList.add(new ModelBox(tusk_lower_left2_r1, 29, 110, -1.9918F, 4.066F, -0.9653F, 3, 7, 2, 0.0F, false));

		tusk_lower_left3 = new ModelRenderer(this);
		tusk_lower_left3.setRotationPoint(-4.3646F, 11.5801F, -0.6476F);
		tusk_lower_left2.addChild(tusk_lower_left3);
		setRotationAngle(tusk_lower_left3, -0.2182F, 0.0F, 0.0F);
		

		tusk_lower_left3_r1 = new ModelRenderer(this);
		tusk_lower_left3_r1.setRotationPoint(3.3646F, -12.557F, -1.0F);
		tusk_lower_left3.addChild(tusk_lower_left3_r1);
		setRotationAngle(tusk_lower_left3_r1, 0.0F, 0.0F, 0.2618F);
		tusk_lower_left3_r1.cubeList.add(new ModelBox(tusk_lower_left3_r1, 31, 121, -0.4831F, 10.0985F, 0.658F, 2, 5, 1, 0.0F, false));

		jaw_upper = new ModelRenderer(this);
		jaw_upper.setRotationPoint(0.0F, 6.9044F, -13.0521F);
		Head.addChild(jaw_upper);
		jaw_upper.cubeList.add(new ModelBox(jaw_upper, 0, 43, -5.5F, -2.4696F, -2.3473F, 11, 8, 7, 0.0F, false));

		trunk = new ModelRenderer(this);
		trunk.setRotationPoint(1.0F, 6.0F, 0.0F);
		jaw_upper.addChild(trunk);
		trunk.cubeList.add(new ModelBox(trunk, 59, 0, -4.0F, -0.4696F, -2.3473F, 6, 7, 4, 0.0F, false));

		trunk2 = new ModelRenderer(this);
		trunk2.setRotationPoint(-1.0F, 10.5F, 0.0F);
		trunk.addChild(trunk2);
		setRotationAngle(trunk2, -0.3054F, 0.0F, 0.0F);
		trunk2.cubeList.add(new ModelBox(trunk2, 59, 14, -2.0F, -4.774F, -3.9235F, 4, 7, 4, 0.0F, false));

		trunk3 = new ModelRenderer(this);
		trunk3.setRotationPoint(0.0F, 6.0F, -2.0F);
		trunk2.addChild(trunk3);
		setRotationAngle(trunk3, -0.3054F, 0.0F, 0.0F);
		trunk3.cubeList.add(new ModelBox(trunk3, 60, 27, -1.5F, -4.4142F, -3.4142F, 3, 7, 3, 0.0F, false));

		trunk4 = new ModelRenderer(this);
		trunk4.setRotationPoint(0.0F, 6.0F, -1.0F);
		trunk3.addChild(trunk4);
		setRotationAngle(trunk4, -0.3054F, 0.0F, 0.0F);
		trunk4.cubeList.add(new ModelBox(trunk4, 60, 27, -1.5F, -3.9235F, -3.774F, 3, 7, 3, 0.0F, false));

		tusk_left = new ModelRenderer(this);
		tusk_left.setRotationPoint(6.0F, 0.0F, 0.0F);
		jaw_upper.addChild(tusk_left);
		setRotationAngle(tusk_left, 0.0F, 0.0F, -0.2182F);
		tusk_left.cubeList.add(new ModelBox(tusk_left, 0, 94, -3.5737F, -1.4229F, -2.4473F, 4, 8, 5, 0.0F, false));

		tusk_left2 = new ModelRenderer(this);
		tusk_left2.setRotationPoint(-1.0F, 12.5F, 0.0F);
		tusk_left.addChild(tusk_left2);
		setRotationAngle(tusk_left2, 0.0F, 0.0F, -0.2182F);
		tusk_left2.cubeList.add(new ModelBox(tusk_left2, 0, 110, -1.1676F, -6.7851F, -1.3473F, 4, 11, 3, 0.0F, false));

		tusk_left3 = new ModelRenderer(this);
		tusk_left3.setRotationPoint(1.0F, 9.0F, 0.0F);
		tusk_left2.addChild(tusk_left3);
		setRotationAngle(tusk_left3, -0.0579F, 0.2555F, -0.3565F);
		tusk_left3.cubeList.add(new ModelBox(tusk_left3, 0, 126, 0.4453F, -6.3811F, -1.0616F, 3, 11, 3, 0.0F, false));

		tusk_left4 = new ModelRenderer(this);
		tusk_left4.setRotationPoint(0.0F, 5.0F, 0.0F);
		tusk_left3.addChild(tusk_left4);
		setRotationAngle(tusk_left4, -0.9599F, 0.0F, 0.0F);
		tusk_left4.cubeList.add(new ModelBox(tusk_left4, 0, 142, 0.4453F, -1.7417F, -2.1666F, 3, 7, 3, 0.0F, false));

		tusk_left5 = new ModelRenderer(this);
		tusk_left5.setRotationPoint(0.0F, 5.0F, 0.0F);
		tusk_left4.addChild(tusk_left5);
		setRotationAngle(tusk_left5, -0.9599F, 0.0F, 0.0F);
		tusk_left5.cubeList.add(new ModelBox(tusk_left5, 0, 155, 0.9453F, -0.4698F, -2.2767F, 2, 7, 2, 0.0F, false));

		tusk_right = new ModelRenderer(this);
		tusk_right.setRotationPoint(-2.0F, 0.0F, 0.0F);
		jaw_upper.addChild(tusk_right);
		setRotationAngle(tusk_right, 0.0F, 0.0F, 0.2182F);
		tusk_right.cubeList.add(new ModelBox(tusk_right, 0, 94, -4.4263F, -0.4229F, -2.4473F, 4, 8, 5, 0.0F, false));

		tusk_right2 = new ModelRenderer(this);
		tusk_right2.setRotationPoint(-3.0F, 12.5F, 0.0F);
		tusk_right.addChild(tusk_right2);
		setRotationAngle(tusk_right2, 0.0F, 0.0F, 0.2182F);
		tusk_right2.cubeList.add(new ModelBox(tusk_right2, 0, 110, -2.8324F, -6.7851F, -1.3473F, 4, 11, 3, 0.0F, false));

		tusk_right3 = new ModelRenderer(this);
		tusk_right3.setRotationPoint(-1.0F, 9.0F, 0.0F);
		tusk_right2.addChild(tusk_right3);
		setRotationAngle(tusk_right3, -0.0258F, -0.2147F, 0.2028F);
		tusk_right3.cubeList.add(new ModelBox(tusk_right3, 0, 126, -2.2219F, -6.578F, -1.1298F, 3, 11, 3, 0.0F, false));

		tusk_right4 = new ModelRenderer(this);
		tusk_right4.setRotationPoint(0.0F, 5.0F, 0.0F);
		tusk_right3.addChild(tusk_right4);
		setRotationAngle(tusk_right4, -0.9599F, 0.0F, 0.0F);
		tusk_right4.cubeList.add(new ModelBox(tusk_right4, 0, 142, -2.2219F, -1.7987F, -2.3671F, 3, 7, 3, 0.0F, false));

		tusk_right5 = new ModelRenderer(this);
		tusk_right5.setRotationPoint(0.0F, 5.0F, 0.0F);
		tusk_right4.addChild(tusk_right5);
		setRotationAngle(tusk_right5, -0.9599F, 0.0F, 0.0F);
		tusk_right5.cubeList.add(new ModelBox(tusk_right5, 0, 155, -1.7219F, -0.3383F, -2.4384F, 2, 7, 2, 0.0F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(-1.0F, -0.5956F, -5.0521F);
		Head.addChild(ear_left);
		setRotationAngle(ear_left, -0.1745F, -0.5236F, 0.5236F);
		ear_left.cubeList.add(new ModelBox(ear_left, 80, 0, 0.9735F, -9.7131F, -5.1075F, 8, 8, 1, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(1.0F, -0.5956F, -5.0521F);
		Head.addChild(ear_right);
		setRotationAngle(ear_right, -0.1745F, 0.5236F, -0.5236F);
		ear_right.cubeList.add(new ModelBox(ear_right, 80, 11, -8.9735F, -9.7131F, -5.1075F, 8, 8, 1, 0.0F, false));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 0.4044F, -1.5521F);
		Head.addChild(Neck);
		setRotationAngle(Neck, 0.3054F, 0.0F, 0.0F);
		Neck.cubeList.add(new ModelBox(Neck, 0, 63, -4.95F, -9.9829F, -6.7389F, 10, 15, 12, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -2.0F, -3.0F);
		Body.cubeList.add(new ModelBox(Body, 150, 0, -9.0F, -16.0F, -8.0F, 18, 20, 35, 0.0F, false));

		Back = new ModelRenderer(this);
		Back.setRotationPoint(0.0F, -6.0F, 3.0F);
		Body.addChild(Back);
		Back.cubeList.add(new ModelBox(Back, 154, 55, -6.0F, -12.0F, -10.0F, 12, 2, 33, 0.0F, false));

		saddle = new ModelRenderer(this);
		saddle.setRotationPoint(2.0F, -12.5F, 9.0F);
		Back.addChild(saddle);
		setRotationAngle(saddle, 0.0F, -0.7854F, 0.0F);
		saddle.cubeList.add(new ModelBox(saddle, 144, 131, -17.0F, -0.5F, -14.0F, 28, 1, 28, 0.0F, false));

		harness_back = new ModelRenderer(this);
		harness_back.setRotationPoint(-3.0F, 18.5F, 6.5F);
		saddle.addChild(harness_back);
		setRotationAngle(harness_back, 0.0F, 0.7854F, 0.0F);
		harness_back.cubeList.add(new ModelBox(harness_back, 103, 131, -4.5F, -18.5F, 2.0F, 19, 25, 2, 0.0F, false));

		harness_front = new ModelRenderer(this);
		harness_front.setRotationPoint(-3.0F, 19.5F, -9.5F);
		saddle.addChild(harness_front);
		setRotationAngle(harness_front, 0.0F, 0.7418F, 0.0F);
		harness_front.cubeList.add(new ModelBox(harness_front, 103, 131, -16.5F, -19.5F, -1.0F, 19, 25, 2, 0.0F, false));

		fence = new ModelRenderer(this);
		fence.setRotationPoint(0.0F, -1.0F, 0.0F);
		saddle.addChild(fence);
		fence.cubeList.add(new ModelBox(fence, 144, 163, -17.0F, -5.5F, -14.0F, 28, 6, 28, 0.0F, false));

		rider_saddle_left = new ModelRenderer(this);
		rider_saddle_left.setRotationPoint(-15.0F, 0.0F, -14.0F);
		saddle.addChild(rider_saddle_left);
		setRotationAngle(rider_saddle_left, -0.137F, -0.954F, 0.1489F);
		rider_saddle_left.cubeList.add(new ModelBox(rider_saddle_left, 160, 206, -37.0F, -2.0F, -1.0F, 38, 2, 3, 0.0F, false));

		ride_saddle = new ModelRenderer(this);
		ride_saddle.setRotationPoint(-9.8759F, -2.5F, 2.1983F);
		rider_saddle_left.addChild(ride_saddle);
		setRotationAngle(ride_saddle, 0.0436F, 0.2182F, 0.0F);
		ride_saddle.cubeList.add(new ModelBox(ride_saddle, 149, 215, -17.5F, 0.0F, -6.5F, 35, 0, 13, 0.0F, false));

		rider_saddle_right = new ModelRenderer(this);
		rider_saddle_right.setRotationPoint(-16.0F, 0.0F, -13.0F);
		saddle.addChild(rider_saddle_right);
		setRotationAngle(rider_saddle_right, -0.0491F, -0.6087F, 0.1055F);
		rider_saddle_right.cubeList.add(new ModelBox(rider_saddle_right, 160, 206, -37.0F, -2.0F, -1.0F, 38, 2, 3, 0.0F, false));

		pole = new ModelRenderer(this);
		pole.setRotationPoint(-17.0F, 0.0F, -14.0F);
		saddle.addChild(pole);
		pole.cubeList.add(new ModelBox(pole, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		pole2 = new ModelRenderer(this);
		pole2.setRotationPoint(-3.0F, 0.0F, -14.0F);
		saddle.addChild(pole2);
		pole2.cubeList.add(new ModelBox(pole2, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		pole3 = new ModelRenderer(this);
		pole3.setRotationPoint(11.0F, 0.0F, -14.0F);
		saddle.addChild(pole3);
		pole3.cubeList.add(new ModelBox(pole3, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		pole4 = new ModelRenderer(this);
		pole4.setRotationPoint(11.0F, 0.0F, 0.0F);
		saddle.addChild(pole4);
		pole4.cubeList.add(new ModelBox(pole4, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		pole5 = new ModelRenderer(this);
		pole5.setRotationPoint(11.0F, 0.0F, 14.0F);
		saddle.addChild(pole5);
		pole5.cubeList.add(new ModelBox(pole5, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		pole6 = new ModelRenderer(this);
		pole6.setRotationPoint(-3.0F, 0.0F, 14.0F);
		saddle.addChild(pole6);
		pole6.cubeList.add(new ModelBox(pole6, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		pole7 = new ModelRenderer(this);
		pole7.setRotationPoint(-17.0F, 0.0F, 14.0F);
		saddle.addChild(pole7);
		pole7.cubeList.add(new ModelBox(pole7, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		pole8 = new ModelRenderer(this);
		pole8.setRotationPoint(-17.0F, 0.0F, 0.0F);
		saddle.addChild(pole8);
		pole8.cubeList.add(new ModelBox(pole8, 248, 244, -1.0F, -10.0F, -1.0F, 2, 10, 2, 0.0F, false));

		top_saddle = new ModelRenderer(this);
		top_saddle.setRotationPoint(-2.0F, -20.0F, 2.0F);
		saddle.addChild(top_saddle);
		top_saddle.cubeList.add(new ModelBox(top_saddle, 182, 240, -9.0F, -0.5F, -9.0F, 15, 1, 15, 0.0F, false));

		pole_big = new ModelRenderer(this);
		pole_big.setRotationPoint(5.0F, 20.0F, 5.0F);
		top_saddle.addChild(pole_big);
		pole_big.cubeList.add(new ModelBox(pole_big, 248, 208, -1.0F, -31.0F, -1.0F, 2, 31, 2, 0.0F, false));

		pole_big2 = new ModelRenderer(this);
		pole_big2.setRotationPoint(-8.0F, 20.0F, 5.0F);
		top_saddle.addChild(pole_big2);
		pole_big2.cubeList.add(new ModelBox(pole_big2, 248, 208, -1.0F, -31.0F, -1.0F, 2, 31, 2, 0.0F, false));

		pole_big3 = new ModelRenderer(this);
		pole_big3.setRotationPoint(-8.0F, 20.0F, -8.0F);
		top_saddle.addChild(pole_big3);
		pole_big3.cubeList.add(new ModelBox(pole_big3, 248, 208, -1.0F, -31.0F, -1.0F, 2, 31, 2, 0.0F, false));

		pole_big4 = new ModelRenderer(this);
		pole_big4.setRotationPoint(5.0F, 20.0F, -8.0F);
		top_saddle.addChild(pole_big4);
		pole_big4.cubeList.add(new ModelBox(pole_big4, 248, 208, -1.0F, -31.0F, -1.0F, 2, 31, 2, 0.0F, false));

		fence_top = new ModelRenderer(this);
		fence_top.setRotationPoint(2.0F, -1.0F, -2.0F);
		top_saddle.addChild(fence_top);
		fence_top.cubeList.add(new ModelBox(fence_top, 121, 235, -11.0F, -5.5F, -7.0F, 15, 6, 15, 0.0F, false));

		Back2 = new ModelRenderer(this);
		Back2.setRotationPoint(0.0F, 16.0F, 3.0F);
		Body.addChild(Back2);
		Back2.cubeList.add(new ModelBox(Back2, 154, 91, -6.0F, -12.0F, -10.0F, 12, 2, 33, 0.0F, false));

		leg_left_front = new ModelRenderer(this);
		leg_left_front.setRotationPoint(5.4F, -2.0F, -6.6F);
		leg_left_front.cubeList.add(new ModelBox(leg_left_front, 84, 62, -3.3F, -2.0F, -3.5F, 8, 16, 8, 0.0F, false));

		leg_left_front2 = new ModelRenderer(this);
		leg_left_front2.setRotationPoint(0.0F, 16.0F, 0.0F);
		leg_left_front.addChild(leg_left_front2);
		leg_left_front2.cubeList.add(new ModelBox(leg_left_front2, 53, 40, -3.3F, -2.0F, -3.5F, 8, 12, 8, 0.0F, false));

		leg_left_back = new ModelRenderer(this);
		leg_left_back.setRotationPoint(5.4F, -2.0F, 19.4F);
		leg_left_back.cubeList.add(new ModelBox(leg_left_back, 52, 62, -3.3F, -2.0F, -3.5F, 8, 16, 8, 0.0F, false));

		leg_left_back2 = new ModelRenderer(this);
		leg_left_back2.setRotationPoint(0.0F, 16.0F, 0.0F);
		leg_left_back.addChild(leg_left_back2);
		leg_left_back2.cubeList.add(new ModelBox(leg_left_back2, 53, 40, -3.3F, -2.0F, -3.5F, 8, 12, 8, 0.0F, false));

		leg_right_front = new ModelRenderer(this);
		leg_right_front.setRotationPoint(-6.6F, -2.0F, -6.6F);
		leg_right_front.cubeList.add(new ModelBox(leg_right_front, 116, 62, -3.5F, -2.0F, -3.5F, 8, 16, 8, 0.0F, false));

		leg_right_front2 = new ModelRenderer(this);
		leg_right_front2.setRotationPoint(0.0F, 16.0F, 0.0F);
		leg_right_front.addChild(leg_right_front2);
		leg_right_front2.cubeList.add(new ModelBox(leg_right_front2, 53, 40, -3.5F, -2.0F, -3.5F, 8, 12, 8, 0.0F, false));

		leg_right_back = new ModelRenderer(this);
		leg_right_back.setRotationPoint(-6.6F, -2.0F, 19.4F);
		leg_right_back.cubeList.add(new ModelBox(leg_right_back, 52, 62, -3.5F, -2.0F, -3.5F, 8, 16, 8, 0.0F, false));

		leg_right_back2 = new ModelRenderer(this);
		leg_right_back2.setRotationPoint(0.0F, 16.0F, -26.0F);
		leg_right_back.addChild(leg_right_back2);
		leg_right_back2.cubeList.add(new ModelBox(leg_right_back2, 53, 40, -3.5F, -2.0F, 22.5F, 8, 12, 8, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -8.0F, 24.0F);
		setRotationAngle(tail, 0.2967F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 107, 0, -1.0F, 0.0F, -2.0F, 2, 10, 2, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, -3.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.1134F, 0.0F, 0.0F);
		tail2.cubeList.add(new ModelBox(tail2, 107, 12, -1.0F, 9.7F, -0.2F, 2, 6, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Body.render(f5);
		leg_left_front.render(f5);
		leg_left_back.render(f5);
		leg_right_front.render(f5);
		leg_right_back.render(f5);
		tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}