// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Pivo extends ModelBase {
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left4;
	private final ModelRenderer finger_left_middle;
	private final ModelRenderer finger_left_left;
	private final ModelRenderer finger_left_right;
	private final ModelRenderer finger_left_back;
	private final ModelRenderer finger_left_back_r1;
	private final ModelRenderer head;
	private final ModelRenderer jaw_bot;
	private final ModelRenderer teeth_bot;
	private final ModelRenderer neck;
	private final ModelRenderer jaw_top;
	private final ModelRenderer greben;
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer dick_cape;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right4;
	private final ModelRenderer finger_right_middle;
	private final ModelRenderer finger_right_left;
	private final ModelRenderer finger_right_right;
	private final ModelRenderer finger_right_back;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;

	public Pivo() {
		textureWidth = 256;
		textureHeight = 128;

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(4.0F, -1.4F, -1.6F);
		setRotationAngle(leg_left, -0.4363F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 147, 0, 0.0F, -2.0F, -4.0F, 6, 14, 8, 0.5F, true));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(0.1F, 12.4F, -2.4F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.639F, 0.0F, 0.0F);
		leg_left2.cubeList.add(new ModelBox(leg_left2, 148, 23, 0.0F, 6.0F, 0.0F, 6, 8, 6, 0.0F, true));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(5.6F, 6.0F, 3.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -1.639F, 0.0F, 0.0F);
		leg_left3.cubeList.add(new ModelBox(leg_left3, 149, 44, -5.2F, 1.3F, 3.0F, 5, 12, 5, 0.0F, true));

		leg_left4 = new ModelRenderer(this);
		leg_left4.setRotationPoint(-5.8F, -7.6F, -5.3F);
		leg_left3.addChild(leg_left4);
		setRotationAngle(leg_left4, 0.4363F, 0.0F, 0.0F);
		leg_left4.cubeList.add(new ModelBox(leg_left4, 143, 64, 0.0F, 21.0F, -4.0F, 6, 4, 8, 0.0F, true));

		finger_left_middle = new ModelRenderer(this);
		finger_left_middle.setRotationPoint(3.0F, 22.5F, -7.0F);
		leg_left4.addChild(finger_left_middle);
		finger_left_middle.cubeList.add(new ModelBox(finger_left_middle, 163, 73, 0.0F, -2.5F, -3.0F, 0, 5, 6, 0.0F, true));

		finger_left_left = new ModelRenderer(this);
		finger_left_left.setRotationPoint(6.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_left);
		setRotationAngle(finger_left_left, 0.0F, -0.2618F, 0.0F);
		finger_left_left.cubeList.add(new ModelBox(finger_left_left, 163, 73, 0.0F, -2.5F, -3.0F, 0, 5, 6, 0.0F, true));

		finger_left_right = new ModelRenderer(this);
		finger_left_right.setRotationPoint(0.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_right);
		setRotationAngle(finger_left_right, 0.0F, 0.2618F, 0.0F);
		finger_left_right.cubeList.add(new ModelBox(finger_left_right, 163, 73, 0.0F, -2.5F, -3.0F, 0, 5, 6, 0.0F, true));

		finger_left_back = new ModelRenderer(this);
		finger_left_back.setRotationPoint(3.0F, 22.5F, 7.0F);
		leg_left4.addChild(finger_left_back);
		

		finger_left_back_r1 = new ModelRenderer(this);
		finger_left_back_r1.setRotationPoint(-4.0F, -3.5F, -0.5F);
		finger_left_back.addChild(finger_left_back_r1);
		setRotationAngle(finger_left_back_r1, -0.1483F, -0.504F, 0.3001F);
		finger_left_back_r1.cubeList.add(new ModelBox(finger_left_back_r1, 138, 70, 0.0F, -4.0F, -3.5F, 0, 8, 7, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -35.6F, -1.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 51, 0, -5.5F, -4.0F, -18.6F, 10, 10, 11, 0.5F, false));

		jaw_bot = new ModelRenderer(this);
		jaw_bot.setRotationPoint(-3.5F, 11.0F, -19.0F);
		head.addChild(jaw_bot);
		setRotationAngle(jaw_bot, 0.3187F, 0.0F, 0.0F);
		jaw_bot.cubeList.add(new ModelBox(jaw_bot, 50, 46, 0.0F, -4.9102F, -3.5626F, 6, 2, 8, 0.0F, false));

		teeth_bot = new ModelRenderer(this);
		teeth_bot.setRotationPoint(0.0F, -1.0F, 0.0F);
		jaw_bot.addChild(teeth_bot);
		teeth_bot.cubeList.add(new ModelBox(teeth_bot, 75, 54, 0.0F, -4.9102F, -3.5626F, 6, 1, 8, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(-4.5F, 4.0F, -5.0F);
		head.addChild(neck);
		setRotationAngle(neck, 0.2618F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 0, 0.0F, -3.5F, -6.1F, 8, 9, 7, 0.0F, false));

		jaw_top = new ModelRenderer(this);
		jaw_top.setRotationPoint(0.5F, -0.4F, -8.5F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1367F, 0.0F, 0.0F);
		jaw_top.cubeList.add(new ModelBox(jaw_top, 50, 25, -5.0F, -3.2559F, -16.6499F, 8, 7, 10, 0.0F, false));

		greben = new ModelRenderer(this);
		greben.setRotationPoint(-0.3956F, -5.59F, -10.9972F);
		head.addChild(greben);
		setRotationAngle(greben, 1.6673F, -1.3591F, -1.7143F);
		greben.cubeList.add(new ModelBox(greben, 1, 64, -11.0F, -12.0F, 0.0F, 23, 31, 0, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 7.0F, 0.9F);
		setRotationAngle(body, 0.182F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 24, -6.0F, -35.0F, -6.3F, 13, 30, 10, 0.5F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -9.0F, 1.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.182F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 216, 0, -3.5F, -4.9948F, 1.2826F, 6, 9, 14, 0.0F, false));

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, -2.4948F, -1.9174F);
		tail.addChild(tail1);
		setRotationAngle(tail1, -0.0911F, 0.0F, 0.0F);
		tail1.cubeList.add(new ModelBox(tail1, 215, 25, -3.0F, -2.5F, 16.0F, 5, 7, 14, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.1F, -2.8948F, -1.9174F);
		tail.addChild(tail2);
		setRotationAngle(tail2, -0.182F, 0.0F, 0.0F);
		tail2.cubeList.add(new ModelBox(tail2, 213, 54, -2.0F, -2.0F, 30.0F, 2, 4, 18, 0.0F, false));

		dick_cape = new ModelRenderer(this);
		dick_cape.setRotationPoint(0.6111F, -0.4029F, -9.2229F);
		body.addChild(dick_cape);
		setRotationAngle(dick_cape, -0.1745F, 0.0F, 0.0F);
		dick_cape.cubeList.add(new ModelBox(dick_cape, 0, 94, -6.5F, -11.5F, 0.0F, 13, 19, 0, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-9.0F, -1.4F, -1.6F);
		setRotationAngle(leg_right, -0.4363F, 0.0F, 0.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 105, 1, 0.0F, -2.0F, -4.0F, 6, 14, 8, 0.5F, true));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(0.1F, 12.4F, -2.4F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.639F, 0.0F, 0.0F);
		leg_right2.cubeList.add(new ModelBox(leg_right2, 106, 24, 0.0F, 6.0F, 0.0F, 6, 8, 6, 0.0F, true));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(5.6F, 6.0F, 3.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -1.639F, 0.0F, 0.0F);
		leg_right3.cubeList.add(new ModelBox(leg_right3, 107, 45, -5.2F, 1.3F, 3.0F, 5, 12, 5, 0.0F, true));

		leg_right4 = new ModelRenderer(this);
		leg_right4.setRotationPoint(-5.8F, -7.6F, -5.3F);
		leg_right3.addChild(leg_right4);
		setRotationAngle(leg_right4, 0.4363F, 0.0F, 0.0F);
		leg_right4.cubeList.add(new ModelBox(leg_right4, 101, 65, 0.0F, 21.0F, -4.0F, 6, 4, 8, 0.0F, true));

		finger_right_middle = new ModelRenderer(this);
		finger_right_middle.setRotationPoint(3.0F, 22.5F, -7.0F);
		leg_right4.addChild(finger_right_middle);
		finger_right_middle.cubeList.add(new ModelBox(finger_right_middle, 121, 74, 0.0F, -2.5F, -3.0F, 0, 5, 6, 0.0F, true));

		finger_right_left = new ModelRenderer(this);
		finger_right_left.setRotationPoint(6.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_left);
		setRotationAngle(finger_right_left, 0.0F, -0.2618F, 0.0F);
		finger_right_left.cubeList.add(new ModelBox(finger_right_left, 121, 74, 0.0F, -2.5F, -3.0F, 0, 5, 6, 0.0F, true));

		finger_right_right = new ModelRenderer(this);
		finger_right_right.setRotationPoint(0.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_right);
		setRotationAngle(finger_right_right, 0.0F, 0.2618F, 0.0F);
		finger_right_right.cubeList.add(new ModelBox(finger_right_right, 121, 74, 0.0F, -2.5F, -3.0F, 0, 5, 6, 0.0F, true));

		finger_right_back = new ModelRenderer(this);
		finger_right_back.setRotationPoint(6.0F, 19.0F, 6.5F);
		leg_right4.addChild(finger_right_back);
		setRotationAngle(finger_right_back, -0.1483F, 0.504F, -0.3001F);
		finger_right_back.cubeList.add(new ModelBox(finger_right_back, 96, 71, 1.0F, -4.0F, -1.5F, 0, 8, 7, 0.0F, true));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(9.0F, -24.0F, -5.0F);
		setRotationAngle(hand_left, 0.0F, 3.1416F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 179, 0, -6.134F, -1.7679F, -4.0F, 8, 8, 9, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(-8.134F, 7.2321F, 1.0F);
		hand_left.addChild(hand_left2);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 179, 19, 0.0F, -5.0F, -4.0F, 7, 22, 7, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-6.0F, -23.0F, -5.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 179, 0, -8.134F, -2.7679F, -5.0F, 8, 8, 9, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(-9.134F, 6.2321F, 0.0F);
		hand_right.addChild(hand_right2);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 179, 19, -1.0F, -5.0F, -4.0F, 7, 22, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg_left.render(f5);
		head.render(f5);
		body.render(f5);
		leg_right.render(f5);
		hand_left.render(f5);
		hand_right.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}