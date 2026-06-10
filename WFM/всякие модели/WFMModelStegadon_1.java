// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelStegadon extends ModelBase {
	private final ModelRenderer Tail;
	private final ModelRenderer tail_1;
	private final ModelRenderer Body;
	private final ModelRenderer neck;
	private final ModelRenderer body_front;
	private final ModelRenderer Leg2;
	private final ModelRenderer leg2_1;
	private final ModelRenderer leg2_2;
	private final ModelRenderer leg2_3;
	private final ModelRenderer Leg3;
	private final ModelRenderer leg3_1;
	private final ModelRenderer leg3_2;
	private final ModelRenderer leg3_3;
	private final ModelRenderer Head;
	private final ModelRenderer mouth;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_middle_top;
	private final ModelRenderer horn_middle_top_1;
	private final ModelRenderer cluv;
	private final ModelRenderer horn_middle_bot;
	private final ModelRenderer horn_middle_bot_1;
	private final ModelRenderer greben;
	private final ModelRenderer Leg4;
	private final ModelRenderer leg4_1;
	private final ModelRenderer leg4_2;
	private final ModelRenderer leg4_3;
	private final ModelRenderer Rug;
	private final ModelRenderer Leg1;
	private final ModelRenderer leg1_1;
	private final ModelRenderer leg1_2;
	private final ModelRenderer leg1_3;

	public WFMModelStegadon() {
		textureWidth = 512;
		textureHeight = 512;

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(-9.0F, -14.0F, 23.0F);
		setRotationAngle(Tail, -0.6981F, 0.0F, 0.0F);
		Tail.cubeList.add(new ModelBox(Tail, 218, 0, 0.0F, 0.0F, 0.0F, 18, 10, 28, 0.0F, false));

		tail_1 = new ModelRenderer(this);
		tail_1.setRotationPoint(3.0F, 1.0F, 25.0F);
		Tail.addChild(tail_1);
		setRotationAngle(tail_1, 0.0744F, 0.0F, 0.0F);
		tail_1.cubeList.add(new ModelBox(tail_1, 312, 0, 0.0F, 0.0F, 0.0F, 12, 6, 18, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-13.0F, -8.0F, -8.0F);
		setRotationAngle(Body, 0.0436F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, 0.0F, 0.0F, 0.0F, 26, 20, 36, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(-3.0F, 6.0F, -12.0F);
		Body.addChild(neck);
		neck.cubeList.add(new ModelBox(neck, 0, 89, 10.0F, 0.0F, -6.0F, 12, 12, 12, 0.0F, false));

		body_front = new ModelRenderer(this);
		body_front.setRotationPoint(-6.0F, 4.0F, -6.0F);
		Body.addChild(body_front);
		body_front.cubeList.add(new ModelBox(body_front, 0, 57, 10.0F, 0.0F, -6.0F, 18, 16, 16, 0.0F, false));

		Leg2 = new ModelRenderer(this);
		Leg2.setRotationPoint(13.0F, 0.0F, 14.0F);
		Leg2.cubeList.add(new ModelBox(Leg2, 112, 67, 0.0F, -6.0F, 0.0F, 6, 15, 12, 0.0F, false));

		leg2_1 = new ModelRenderer(this);
		leg2_1.setRotationPoint(0.0F, 5.5F, 2.0F);
		Leg2.addChild(leg2_1);
		setRotationAngle(leg2_1, 0.4098F, 0.0F, 0.0F);
		leg2_1.cubeList.add(new ModelBox(leg2_1, 112, 100, 0.0F, 0.0F, -1.0F, 6, 13, 8, 0.0F, false));

		leg2_2 = new ModelRenderer(this);
		leg2_2.setRotationPoint(-13.0F, 8.3F, -12.0F);
		leg2_1.addChild(leg2_2);
		setRotationAngle(leg2_2, -0.8652F, 0.0F, 0.0F);
		leg2_2.cubeList.add(new ModelBox(leg2_2, 112, 128, 13.0F, -11.0F, 9.0F, 6, 10, 6, 0.0F, false));

		leg2_3 = new ModelRenderer(this);
		leg2_3.setRotationPoint(0.0F, 6.8F, 4.4F);
		leg2_2.addChild(leg2_3);
		setRotationAngle(leg2_3, -1.1383F, 0.0F, 0.0F);
		leg2_3.cubeList.add(new ModelBox(leg2_3, 112, 149, 12.5F, -13.5F, -5.0F, 7, 8, 4, 0.0F, false));

		Leg3 = new ModelRenderer(this);
		Leg3.setRotationPoint(-15.0F, 0.0F, -17.0F);
		Leg3.cubeList.add(new ModelBox(Leg3, 150, 67, 0.0F, 0.0F, 0.0F, 6, 12, 10, 0.0F, false));

		leg3_1 = new ModelRenderer(this);
		leg3_1.setRotationPoint(0.0F, 5.5F, 0.0F);
		Leg3.addChild(leg3_1);
		setRotationAngle(leg3_1, 0.4098F, 0.0F, 0.0F);
		leg3_1.cubeList.add(new ModelBox(leg3_1, 150, 91, 0.0F, 0.0F, 0.0F, 6, 13, 6, 0.0F, false));

		leg3_2 = new ModelRenderer(this);
		leg3_2.setRotationPoint(15.0F, 8.3F, 19.0F);
		leg3_1.addChild(leg3_2);
		setRotationAngle(leg3_2, -0.8652F, 0.0F, 0.0F);
		leg3_2.cubeList.add(new ModelBox(leg3_2, 150, 110, -15.0F, 12.0F, -12.0F, 6, 10, 6, 0.0F, false));

		leg3_3 = new ModelRenderer(this);
		leg3_3.setRotationPoint(0.0F, 6.8F, 4.4F);
		leg3_2.addChild(leg3_3);
		setRotationAngle(leg3_3, -1.1383F, 0.0F, 0.0F);
		leg3_3.cubeList.add(new ModelBox(leg3_3, 150, 126, -15.5F, 14.0F, 7.0F, 7, 8, 4, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 6.0F, -28.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 150, -8.0F, -8.0F, -11.0F, 16, 12, 16, 0.0F, false));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(5.0F, 5.0F, -7.0F);
		Head.addChild(mouth);
		setRotationAngle(mouth, 0.0744F, 0.0F, 0.0F);
		mouth.cubeList.add(new ModelBox(mouth, 0, 125, -10.0F, -9.0F, -9.0F, 9, 7, 9, 0.0F, false));

		horn_left = new ModelRenderer(this);
		horn_left.setRotationPoint(17.0F, -5.0F, 15.4F);
		Head.addChild(horn_left);
		setRotationAngle(horn_left, -1.9705F, 0.0F, 0.0F);
		horn_left.cubeList.add(new ModelBox(horn_left, 0, 224, -10.0F, 12.0F, -2.0F, 3, 15, 3, 0.0F, false));

		horn_right = new ModelRenderer(this);
		horn_right.setRotationPoint(-1.0F, -5.0F, 15.4F);
		Head.addChild(horn_right);
		setRotationAngle(horn_right, -1.9705F, 0.0F, 0.0F);
		horn_right.cubeList.add(new ModelBox(horn_right, 0, 224, -10.0F, 12.0F, -2.0F, 3, 15, 3, 0.0F, false));

		horn_middle_top = new ModelRenderer(this);
		horn_middle_top.setRotationPoint(17.5F, -3.4F, 15.4F);
		Head.addChild(horn_middle_top);
		setRotationAngle(horn_middle_top, -2.4131F, 0.0F, 0.0F);
		horn_middle_top.cubeList.add(new ModelBox(horn_middle_top, 0, 250, -19.0F, 12.5F, 10.0F, 3, 8, 3, 0.0F, false));

		horn_middle_top_1 = new ModelRenderer(this);
		horn_middle_top_1.setRotationPoint(0.6F, 0.4F, 0.5F);
		horn_middle_top.addChild(horn_middle_top_1);
		setRotationAngle(horn_middle_top_1, -0.3187F, 0.0F, 0.0F);
		horn_middle_top_1.cubeList.add(new ModelBox(horn_middle_top_1, 0, 270, -19.0F, 15.0F, 15.9F, 2, 4, 2, 0.0F, false));

		cluv = new ModelRenderer(this);
		cluv.setRotationPoint(5.0F, 5.0F, -10.0F);
		Head.addChild(cluv);
		setRotationAngle(cluv, 0.7854F, -0.5918F, -0.5009F);
		cluv.cubeList.add(new ModelBox(cluv, 0, 300, -7.7F, -9.0F, 0.0F, 6, 3, 6, 0.0F, false));

		horn_middle_bot = new ModelRenderer(this);
		horn_middle_bot.setRotationPoint(17.6F, 1.2F, 7.5F);
		Head.addChild(horn_middle_bot);
		setRotationAngle(horn_middle_bot, -2.4131F, 0.0F, 0.0F);
		horn_middle_bot.cubeList.add(new ModelBox(horn_middle_bot, 0, 250, -19.0F, 12.5F, 10.0F, 3, 8, 3, 0.0F, false));

		horn_middle_bot_1 = new ModelRenderer(this);
		horn_middle_bot_1.setRotationPoint(0.6F, 0.4F, 0.5F);
		horn_middle_bot.addChild(horn_middle_bot_1);
		setRotationAngle(horn_middle_bot_1, -0.3187F, 0.0F, 0.0F);
		horn_middle_bot_1.cubeList.add(new ModelBox(horn_middle_bot_1, 0, 270, -19.0F, 15.0F, 15.9F, 2, 4, 2, 0.0F, false));

		greben = new ModelRenderer(this);
		greben.setRotationPoint(-6.0F, -10.7F, 19.6F);
		Head.addChild(greben);
		setRotationAngle(greben, -0.67F, 0.0F, 0.0F);
		greben.cubeList.add(new ModelBox(greben, 0, 186, -8.5F, -2.0F, -12.4F, 28, 20, 2, 0.0F, false));

		Leg4 = new ModelRenderer(this);
		Leg4.setRotationPoint(-19.0F, 0.0F, 14.0F);
		Leg4.cubeList.add(new ModelBox(Leg4, 112, 67, 0.0F, -6.0F, 0.0F, 6, 15, 12, 0.0F, false));

		leg4_1 = new ModelRenderer(this);
		leg4_1.setRotationPoint(0.0F, 5.5F, 2.0F);
		Leg4.addChild(leg4_1);
		setRotationAngle(leg4_1, 0.4098F, 0.0F, 0.0F);
		leg4_1.cubeList.add(new ModelBox(leg4_1, 112, 100, 0.0F, 0.0F, -1.0F, 6, 13, 8, 0.0F, false));

		leg4_2 = new ModelRenderer(this);
		leg4_2.setRotationPoint(19.0F, 8.3F, -12.0F);
		leg4_1.addChild(leg4_2);
		setRotationAngle(leg4_2, -0.8652F, 0.0F, 0.0F);
		leg4_2.cubeList.add(new ModelBox(leg4_2, 112, 128, -19.0F, -10.0F, 9.0F, 6, 10, 6, 0.0F, false));

		leg4_3 = new ModelRenderer(this);
		leg4_3.setRotationPoint(0.0F, 1.3F, 2.4F);
		leg4_2.addChild(leg4_3);
		setRotationAngle(leg4_3, -1.1383F, 0.0F, 0.0F);
		leg4_3.cubeList.add(new ModelBox(leg4_3, 112, 149, -19.5F, -13.5F, 0.0F, 7, 8, 4, 0.0F, false));

		Rug = new ModelRenderer(this);
		Rug.setRotationPoint(-10.0F, -13.0F, -2.0F);
		setRotationAngle(Rug, 0.0436F, 0.0F, 0.0F);
		Rug.cubeList.add(new ModelBox(Rug, 125, 0, 0.0F, 0.0F, 0.0F, 20, 7, 26, 0.0F, false));

		Leg1 = new ModelRenderer(this);
		Leg1.setRotationPoint(9.0F, -0.1F, -17.0F);
		Leg1.cubeList.add(new ModelBox(Leg1, 150, 67, 0.0F, 0.0F, 0.0F, 6, 12, 10, 0.0F, false));

		leg1_1 = new ModelRenderer(this);
		leg1_1.setRotationPoint(0.0F, 5.5F, 1.0F);
		Leg1.addChild(leg1_1);
		setRotationAngle(leg1_1, 0.4098F, 0.0F, 0.0F);
		leg1_1.cubeList.add(new ModelBox(leg1_1, 150, 91, 0.0F, 0.0F, 0.0F, 6, 13, 6, 0.0F, false));

		leg1_2 = new ModelRenderer(this);
		leg1_2.setRotationPoint(-9.0F, 8.4F, 19.0F);
		leg1_1.addChild(leg1_2);
		setRotationAngle(leg1_2, -0.8652F, 0.0F, 0.0F);
		leg1_2.cubeList.add(new ModelBox(leg1_2, 150, 110, 9.0F, 14.0F, -12.0F, 6, 10, 6, 0.0F, false));

		leg1_3 = new ModelRenderer(this);
		leg1_3.setRotationPoint(0.0F, 1.3F, 3.4F);
		leg1_2.addChild(leg1_3);
		setRotationAngle(leg1_3, -1.1383F, 0.0F, 0.0F);
		leg1_3.cubeList.add(new ModelBox(leg1_3, 150, 126, 8.5F, 16.0F, 14.0F, 7, 8, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Tail.render(f5);
		Body.render(f5);
		Leg2.render(f5);
		Leg3.render(f5);
		Head.render(f5);
		Leg4.render(f5);
		Rug.render(f5);
		Leg1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}