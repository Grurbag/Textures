// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer body_top;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right4;
	private final ModelRenderer hand_right2;
	private final ModelRenderer hand_right3;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right4;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left4;
	private final ModelRenderer dick_cape;
	private final ModelRenderer wing_right;
	private final ModelRenderer wing_right2;
	private final ModelRenderer wing_right3;
	private final ModelRenderer wing_right4;
	private final ModelRenderer wing_right5;
	private final ModelRenderer wing_right6;
	private final ModelRenderer wing_pereponka_right;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_left2;
	private final ModelRenderer wing_left3;
	private final ModelRenderer wing_left4;
	private final ModelRenderer wing_left5;
	private final ModelRenderer wing_left6;
	private final ModelRenderer wing_pereponka_left;
	private final ModelRenderer head;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right2;
	private final ModelRenderer horn_right3;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left3;
	private final ModelRenderer neck;
	private final ModelRenderer horn_head_top_right;
	private final ModelRenderer horn_head_top_right2;
	private final ModelRenderer horn_head_top_left;
	private final ModelRenderer horn_head_top_left2;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left_r1;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_left3;
	private final ModelRenderer hand_left4;

	public custom_model() {
		textureWidth = 264;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0F, -12.0F, -1.0F);
		setRotationAngle(body, 0.2618F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -8.5F, -8.0F, -4.0F, 16, 18, 12, 0.0F, false));

		body_top = new ModelRenderer(this);
		body_top.setRotationPoint(-2.0F, 37.0F, -1.0F);
		body.addChild(body_top);
		body_top.cubeList.add(new ModelBox(body_top, 63, 9, -11.2588F, -58.0341F, -5.0F, 24, 13, 15, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-10.0F, -27.5F, -3.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 0, 34, -8.0F, -4.5F, -5.0F, 8, 13, 10, 0.0F, false));

		hand_right4 = new ModelRenderer(this);
		hand_right4.setRotationPoint(-5.0F, 21.5F, -6.0F);
		hand_right.addChild(hand_right4);
		hand_right4.cubeList.add(new ModelBox(hand_right4, 0, 77, -2.0F, -14.0F, 1.5F, 7, 9, 8, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(-5.0F, 11.5F, -5.0F);
		hand_right.addChild(hand_right2);
		setRotationAngle(hand_right2, -0.5236F, 0.0F, 0.0F);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 0, 57, -1.5F, -1.0F, 1.0F, 6, 10, 7, 0.0F, false));

		hand_right3 = new ModelRenderer(this);
		hand_right3.setRotationPoint(1.0F, 6.0F, -1.0F);
		hand_right2.addChild(hand_right3);
		hand_right3.cubeList.add(new ModelBox(hand_right3, 0, 96, -3.0F, 3.0F, 1.5F, 7, 6, 8, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-4.0F, -4.0F, 4.0F);
		setRotationAngle(leg_right, -1.5708F, -0.9163F, 1.5708F);
		leg_right.cubeList.add(new ModelBox(leg_right, 80, 37, -6.0F, -3.5F, -2.0F, 10, 17, 9, 0.0F, false));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(3.6637F, 13.7931F, 0.0F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 0.0F, 0.0F, -1.309F);
		leg_right2.cubeList.add(new ModelBox(leg_right2, 79, 65, -2.1637F, -7.2931F, -1.0F, 8, 13, 7, 0.0F, false));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(2.0F, 8.0F, -3.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, 0.0F, 0.0F, -2.4871F);
		leg_right3.cubeList.add(new ModelBox(leg_right3, 83, 88, -1.6637F, -5.2931F, 2.5F, 7, 10, 6, 0.0F, false));

		leg_right4 = new ModelRenderer(this);
		leg_right4.setRotationPoint(5.0F, 0.0F, 0.0F);
		leg_right3.addChild(leg_right4);
		setRotationAngle(leg_right4, 0.0F, 0.0F, -3.1416F);
		leg_right4.cubeList.add(new ModelBox(leg_right4, 86, 108, -2.1637F, 3.7069F, 1.5F, 7, 6, 8, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(7.0F, -4.0F, 4.0F);
		setRotationAngle(leg_left, -1.5708F, -0.9163F, 1.5708F);
		leg_left.cubeList.add(new ModelBox(leg_left, 80, 37, -6.0F, -3.5F, -7.0F, 10, 17, 9, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(3.6637F, 13.7931F, 9.0F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 0.0F, 0.0F, -1.309F);
		leg_left2.cubeList.add(new ModelBox(leg_left2, 79, 65, -2.1637F, -7.2931F, -15.0F, 8, 13, 7, 0.0F, false));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(2.0F, 8.0F, -3.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, 0.0F, 0.0F, -2.4871F);
		leg_left3.cubeList.add(new ModelBox(leg_left3, 83, 88, -1.6637F, -5.2931F, -11.5F, 7, 10, 6, 0.0F, false));

		leg_left4 = new ModelRenderer(this);
		leg_left4.setRotationPoint(5.0F, 0.0F, 0.0F);
		leg_left3.addChild(leg_left4);
		setRotationAngle(leg_left4, 0.0F, 0.0F, -3.1416F);
		leg_left4.cubeList.add(new ModelBox(leg_left4, 86, 108, -2.1637F, 3.7069F, -12.5F, 7, 6, 8, 0.0F, false));

		dick_cape = new ModelRenderer(this);
		dick_cape.setRotationPoint(3.0F, 25.0F, -2.0F);
		setRotationAngle(dick_cape, 0.0F, -1.5708F, 0.0F);
		dick_cape.cubeList.add(new ModelBox(dick_cape, 39, 37, 0.0F, -32.0F, -4.0F, 0, 19, 12, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(-5.5F, -25.0F, 4.5F);
		setRotationAngle(wing_right, -0.6151F, -1.2548F, 0.1516F);
		wing_right.cubeList.add(new ModelBox(wing_right, 240, 0, -5.579F, -17.7542F, -3.3209F, 7, 18, 5, 0.0F, false));

		wing_right2 = new ModelRenderer(this);
		wing_right2.setRotationPoint(-0.079F, -23.7542F, 3.1791F);
		wing_right.addChild(wing_right2);
		setRotationAngle(wing_right2, 0.6271F, 0.0F, 0.0F);
		wing_right2.cubeList.add(new ModelBox(wing_right2, 248, 28, -3.5F, -13.0F, -9.5F, 4, 18, 4, 0.0F, false));

		wing_right3 = new ModelRenderer(this);
		wing_right3.setRotationPoint(0.0F, -10.0F, 1.0F);
		wing_right2.addChild(wing_right3);
		setRotationAngle(wing_right3, -0.6819F, 0.0F, 0.0F);
		wing_right3.cubeList.add(new ModelBox(wing_right3, 248, 28, -3.5F, -13.0F, -9.5F, 4, 18, 4, 0.0F, false));

		wing_right4 = new ModelRenderer(this);
		wing_right4.setRotationPoint(0.0F, -10.0F, 1.0F);
		wing_right3.addChild(wing_right4);
		setRotationAngle(wing_right4, -0.6819F, 0.0F, 0.0F);
		wing_right4.cubeList.add(new ModelBox(wing_right4, 248, 28, -3.5F, -13.0F, -9.5F, 4, 18, 4, 0.0F, false));

		wing_right5 = new ModelRenderer(this);
		wing_right5.setRotationPoint(0.0F, -10.0F, 1.0F);
		wing_right4.addChild(wing_right5);
		setRotationAngle(wing_right5, -0.6819F, 0.0F, 0.0F);
		wing_right5.cubeList.add(new ModelBox(wing_right5, 248, 28, -3.0F, -13.0F, -9.5F, 3, 18, 3, 0.0F, false));

		wing_right6 = new ModelRenderer(this);
		wing_right6.setRotationPoint(0.0F, -9.0F, 1.0F);
		wing_right5.addChild(wing_right6);
		setRotationAngle(wing_right6, -0.0711F, 0.0F, 0.0F);
		wing_right6.cubeList.add(new ModelBox(wing_right6, 248, 28, -2.5F, -10.0F, -9.5F, 2, 7, 2, 0.0F, false));

		wing_pereponka_right = new ModelRenderer(this);
		wing_pereponka_right.setRotationPoint(-1.079F, -11.7542F, -0.8209F);
		wing_right.addChild(wing_pereponka_right);
		wing_pereponka_right.cubeList.add(new ModelBox(wing_pereponka_right, 188, 22, -0.5F, -48.0F, -8.0F, 0, 68, 38, 0.0F, false));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(6.5F, -25.0F, 3.5F);
		setRotationAngle(wing_left, -0.8068F, 1.3622F, -0.2845F);
		wing_left.cubeList.add(new ModelBox(wing_left, 240, 0, -2.2478F, -17.9899F, -2.0874F, 7, 18, 5, 0.0F, false));

		wing_left2 = new ModelRenderer(this);
		wing_left2.setRotationPoint(3.2522F, -23.9899F, 4.4126F);
		wing_left.addChild(wing_left2);
		setRotationAngle(wing_left2, 0.6271F, 0.0F, 0.0F);
		wing_left2.cubeList.add(new ModelBox(wing_left2, 248, 28, -3.5F, -13.0F, -9.5F, 4, 18, 4, 0.0F, false));

		wing_left3 = new ModelRenderer(this);
		wing_left3.setRotationPoint(0.0F, -10.0F, 1.0F);
		wing_left2.addChild(wing_left3);
		setRotationAngle(wing_left3, -0.6819F, 0.0F, 0.0F);
		wing_left3.cubeList.add(new ModelBox(wing_left3, 248, 28, -3.5F, -13.0F, -9.5F, 4, 18, 4, 0.0F, false));

		wing_left4 = new ModelRenderer(this);
		wing_left4.setRotationPoint(0.0F, -10.0F, 1.0F);
		wing_left3.addChild(wing_left4);
		setRotationAngle(wing_left4, -0.6819F, 0.0F, 0.0F);
		wing_left4.cubeList.add(new ModelBox(wing_left4, 248, 28, -3.5F, -13.0F, -9.5F, 4, 18, 4, 0.0F, false));

		wing_left5 = new ModelRenderer(this);
		wing_left5.setRotationPoint(0.0F, -10.0F, 1.0F);
		wing_left4.addChild(wing_left5);
		setRotationAngle(wing_left5, -0.6819F, 0.0F, 0.0F);
		wing_left5.cubeList.add(new ModelBox(wing_left5, 248, 28, -3.0F, -13.0F, -9.5F, 3, 18, 3, 0.0F, false));

		wing_left6 = new ModelRenderer(this);
		wing_left6.setRotationPoint(0.0F, -9.0F, 1.0F);
		wing_left5.addChild(wing_left6);
		setRotationAngle(wing_left6, -0.0711F, 0.0F, 0.0F);
		wing_left6.cubeList.add(new ModelBox(wing_left6, 248, 28, -2.5F, -10.0F, -9.5F, 2, 7, 2, 0.0F, false));

		wing_pereponka_left = new ModelRenderer(this);
		wing_pereponka_left.setRotationPoint(2.2522F, -11.9899F, 0.4126F);
		wing_left.addChild(wing_pereponka_left);
		wing_pereponka_left.cubeList.add(new ModelBox(wing_pereponka_left, 188, 22, -0.5F, -48.0F, -8.0F, 0, 68, 38, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -26.0F, -7.5F);
		head.cubeList.add(new ModelBox(head, 141, 0, -9.0F, -15.0F, -17.0F, 18, 18, 18, -3.0F, false));

		horn_right = new ModelRenderer(this);
		horn_right.setRotationPoint(-8.5F, -8.0F, -9.5F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 0.9957F, -0.7573F, -2.7329F);
		horn_right.cubeList.add(new ModelBox(horn_right, 53, 0, -1.5F, -5.0F, -1.5F, 3, 9, 3, 0.0F, false));

		horn_right2 = new ModelRenderer(this);
		horn_right2.setRotationPoint(-1.0F, -8.0F, -1.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, 2.6003F, -0.4978F, 2.8498F);
		horn_right2.cubeList.add(new ModelBox(horn_right2, 68, 0, -0.5F, -5.0F, 0.0F, 2, 9, 2, 0.0F, false));

		horn_right3 = new ModelRenderer(this);
		horn_right3.setRotationPoint(-1.0F, -6.0F, 0.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, -0.5672F, 0.0F, 0.0F);
		horn_right3.cubeList.add(new ModelBox(horn_right3, 68, 12, 1.0F, -5.0F, 1.0F, 1, 6, 1, 0.0F, false));

		horn_left = new ModelRenderer(this);
		horn_left.setRotationPoint(8.5F, -9.0F, -10.5F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 0.63F, 0.3414F, 2.3653F);
		horn_left.cubeList.add(new ModelBox(horn_left, 53, 0, -0.5F, -5.0F, -1.5F, 3, 9, 3, 0.0F, false));

		horn_left2 = new ModelRenderer(this);
		horn_left2.setRotationPoint(1.0F, -8.0F, -1.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 2.4511F, -0.2162F, -3.0162F);
		horn_left2.cubeList.add(new ModelBox(horn_left2, 68, 0, -0.5F, -5.0F, 0.0F, 2, 9, 2, 0.0F, false));

		horn_left3 = new ModelRenderer(this);
		horn_left3.setRotationPoint(-1.0F, -6.0F, 0.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, -0.5672F, 0.0F, 0.0F);
		horn_left3.cubeList.add(new ModelBox(horn_left3, 68, 12, 1.0F, -5.0F, 1.0F, 1, 6, 1, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(4.0F, -4.0F, -8.0F);
		head.addChild(neck);
		setRotationAngle(neck, -0.6545F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 118, 38, -12.0F, -10.0F, -7.0F, 16, 16, 18, -3.0F, false));

		horn_head_top_right = new ModelRenderer(this);
		horn_head_top_right.setRotationPoint(2.5F, -14.0F, -12.5F);
		head.addChild(horn_head_top_right);
		setRotationAngle(horn_head_top_right, 0.124F, 0.2017F, 0.3339F);
		horn_head_top_right.cubeList.add(new ModelBox(horn_head_top_right, 68, 0, -0.5F, -5.0F, 0.0F, 2, 9, 2, 0.0F, false));

		horn_head_top_right2 = new ModelRenderer(this);
		horn_head_top_right2.setRotationPoint(-1.0F, -6.0F, 0.0F);
		horn_head_top_right.addChild(horn_head_top_right2);
		setRotationAngle(horn_head_top_right2, -0.5672F, 0.0F, 0.0F);
		horn_head_top_right2.cubeList.add(new ModelBox(horn_head_top_right2, 68, 12, 1.0F, -5.0F, 1.0F, 1, 6, 1, 0.0F, false));

		horn_head_top_left = new ModelRenderer(this);
		horn_head_top_left.setRotationPoint(-3.5F, -14.0F, -12.5F);
		head.addChild(horn_head_top_left);
		setRotationAngle(horn_head_top_left, 0.0889F, 0.085F, -0.2073F);
		horn_head_top_left.cubeList.add(new ModelBox(horn_head_top_left, 68, 0, -0.5F, -5.0F, 0.0F, 2, 9, 2, 0.0F, false));

		horn_head_top_left2 = new ModelRenderer(this);
		horn_head_top_left2.setRotationPoint(-1.0F, -6.0F, 0.0F);
		horn_head_top_left.addChild(horn_head_top_left2);
		setRotationAngle(horn_head_top_left2, -0.5672F, 0.0F, 0.0F);
		horn_head_top_left2.cubeList.add(new ModelBox(horn_head_top_left2, 68, 12, 1.0F, -5.0F, 1.0F, 1, 6, 1, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(13.0F, -27.5F, -3.0F);
		

		hand_left_r1 = new ModelRenderer(this);
		hand_left_r1.setRotationPoint(1.0F, 48.5F, -17.0F);
		hand_left.addChild(hand_left_r1);
		setRotationAngle(hand_left_r1, 0.0F, 3.1416F, 0.0F);
		hand_left_r1.cubeList.add(new ModelBox(hand_left_r1, 0, 34, -7.0F, -53.0F, -22.0F, 8, 13, 10, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(3.0F, 21.5F, -6.0F);
		hand_left.addChild(hand_left2);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 0, 77, -2.0F, -14.0F, 1.5F, 7, 9, 8, 0.0F, false));

		hand_left3 = new ModelRenderer(this);
		hand_left3.setRotationPoint(3.0F, 11.5F, -5.0F);
		hand_left.addChild(hand_left3);
		setRotationAngle(hand_left3, -0.5236F, 0.0F, 0.0F);
		hand_left3.cubeList.add(new ModelBox(hand_left3, 0, 57, -1.5F, -1.0F, 1.0F, 6, 10, 7, 0.0F, false));

		hand_left4 = new ModelRenderer(this);
		hand_left4.setRotationPoint(1.0F, 6.0F, -1.0F);
		hand_left3.addChild(hand_left4);
		hand_left4.cubeList.add(new ModelBox(hand_left4, 0, 96, -3.0F, 3.0F, 1.5F, 7, 6, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		hand_right.render(f5);
		leg_right.render(f5);
		leg_left.render(f5);
		dick_cape.render(f5);
		wing_right.render(f5);
		wing_left.render(f5);
		head.render(f5);
		hand_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}