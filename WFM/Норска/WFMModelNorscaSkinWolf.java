// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNorscaSkinWolf extends ModelBase {
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left4;
	private final ModelRenderer finger_left_middle;
	private final ModelRenderer finger_left_left;
	private final ModelRenderer finger_left_right;
	private final ModelRenderer head;
	private final ModelRenderer jaw_bot;
	private final ModelRenderer teeth_bot;
	private final ModelRenderer jaw_top;
	private final ModelRenderer nose;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer body;
	private final ModelRenderer dick_cape;
	private final ModelRenderer tail;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right4;
	private final ModelRenderer finger_right_middle;
	private final ModelRenderer finger_right_left;
	private final ModelRenderer finger_right_right;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;
	private final ModelRenderer claws_right;
	private final ModelRenderer claw_right;
	private final ModelRenderer claw_right2;
	private final ModelRenderer claw_right3;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;
	private final ModelRenderer claws_left;
	private final ModelRenderer claw_left;
	private final ModelRenderer claw_left2;
	private final ModelRenderer claw_left3;

	public WFMModelNorscaSkinWolf() {
		textureWidth = 256;
		textureHeight = 128;

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(4.0F, -1.4F, -1.6F);
		setRotationAngle(leg_left, -0.4363F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 147, 0, 0.0F, -3.8126F, -4.8452F, 6, 16, 8, 0.5F, true));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(0.1F, 12.4F, -2.4F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.639F, 0.0F, 0.0F);
		leg_left2.cubeList.add(new ModelBox(leg_left2, 148, 26, 0.0F, 5.5F, 0.0F, 6, 8, 6, 0.0F, true));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(5.6F, 6.0F, 3.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -1.639F, 0.0F, 0.0F);
		leg_left3.cubeList.add(new ModelBox(leg_left3, 149, 43, -5.2F, -0.5126F, 2.1548F, 5, 14, 5, 0.0F, true));

		leg_left4 = new ModelRenderer(this);
		leg_left4.setRotationPoint(-5.8F, -7.6F, -5.3F);
		leg_left3.addChild(leg_left4);
		setRotationAngle(leg_left4, 0.4363F, 0.0F, 0.0F);
		leg_left4.cubeList.add(new ModelBox(leg_left4, 143, 64, 0.0F, 21.0F, -4.0F, 6, 4, 8, 0.0F, true));

		finger_left_middle = new ModelRenderer(this);
		finger_left_middle.setRotationPoint(3.0F, 22.5F, -7.0F);
		leg_left4.addChild(finger_left_middle);
		finger_left_middle.cubeList.add(new ModelBox(finger_left_middle, 163, 73, 0.0F, -2.5F, -5.0F, 0, 5, 8, 0.0F, true));

		finger_left_left = new ModelRenderer(this);
		finger_left_left.setRotationPoint(6.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_left);
		setRotationAngle(finger_left_left, 0.0F, -0.2618F, 0.0F);
		finger_left_left.cubeList.add(new ModelBox(finger_left_left, 163, 73, 0.0F, -2.5F, -5.0F, 0, 5, 8, 0.0F, true));

		finger_left_right = new ModelRenderer(this);
		finger_left_right.setRotationPoint(0.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_right);
		setRotationAngle(finger_left_right, 0.0F, 0.2618F, 0.0F);
		finger_left_right.cubeList.add(new ModelBox(finger_left_right, 163, 73, 0.0F, -2.5F, -5.0F, 0, 5, 8, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -24.6F, -10.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 51, 0, -5.5F, -7.3823F, -11.4523F, 10, 11, 10, 0.5F, false));

		jaw_bot = new ModelRenderer(this);
		jaw_bot.setRotationPoint(-3.5F, 11.6101F, -12.0266F);
		head.addChild(jaw_bot);
		setRotationAngle(jaw_bot, 0.3187F, 0.0F, 0.0F);
		jaw_bot.cubeList.add(new ModelBox(jaw_bot, 50, 46, 0.0F, -7.5374F, -4.6102F, 6, 2, 8, 0.0F, false));

		teeth_bot = new ModelRenderer(this);
		teeth_bot.setRotationPoint(0.0F, -1.0F, 0.0F);
		jaw_bot.addChild(teeth_bot);
		teeth_bot.cubeList.add(new ModelBox(teeth_bot, 75, 54, 0.0F, -8.5374F, -4.6102F, 6, 2, 8, 0.0F, false));

		jaw_top = new ModelRenderer(this);
		jaw_top.setRotationPoint(0.5F, 0.2101F, -1.5266F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1367F, 0.0F, 0.0F);
		jaw_top.cubeList.add(new ModelBox(jaw_top, 50, 25, -5.0F, -5.6501F, -18.1559F, 8, 7, 10, 0.0F, false));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.5F, 0.2101F, -2.5266F);
		head.addChild(nose);
		setRotationAngle(nose, 0.1367F, 0.0F, 0.0F);
		nose.cubeList.add(new ModelBox(nose, 77, 24, -3.0F, -5.6501F, -18.1559F, 4, 2, 4, 0.0F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(4.0F, -0.3899F, -5.0266F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, 0.2618F, 0.0F);
		ear_left.cubeList.add(new ModelBox(ear_left, 0, 0, 1.4706F, -9.1667F, -3.7561F, 0, 7, 7, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(-7.0F, -0.3899F, -5.0266F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, 0.0F, -0.2618F, 0.0F);
		ear_right.cubeList.add(new ModelBox(ear_right, 0, 0, 0.5294F, -9.1667F, -3.7561F, 0, 7, 7, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 7.0F, 0.9F);
		setRotationAngle(body, 0.182F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 24, -6.0F, -35.967F, -5.9379F, 13, 29, 10, 0.5F, false));

		dick_cape = new ModelRenderer(this);
		dick_cape.setRotationPoint(0.6111F, -0.4029F, -9.2229F);
		body.addChild(dick_cape);
		setRotationAngle(dick_cape, -0.1745F, 0.0F, 0.0F);
		dick_cape.cubeList.add(new ModelBox(dick_cape, 0, 71, -6.5F, -13.4999F, 0.015F, 13, 19, 0, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.6111F, -0.4029F, 7.7771F);
		body.addChild(tail);
		setRotationAngle(tail, 0.0F, -1.5708F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 32, 70, -4.1379F, -12.467F, 0.0F, 13, 19, 0, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-5.0F, -1.4F, -1.6F);
		setRotationAngle(leg_right, -0.4363F, 0.0F, 0.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 105, 1, -4.0F, -3.8126F, -4.8452F, 6, 16, 8, 0.5F, true));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(-3.9F, 12.4F, -2.4F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.639F, 0.0F, 0.0F);
		leg_right2.cubeList.add(new ModelBox(leg_right2, 106, 27, 0.0F, 5.5F, 0.0F, 6, 8, 6, 0.0F, true));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(5.6F, 6.0F, 3.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -1.639F, 0.0F, 0.0F);
		leg_right3.cubeList.add(new ModelBox(leg_right3, 107, 44, -5.2F, -0.5126F, 2.1548F, 5, 14, 5, 0.0F, true));

		leg_right4 = new ModelRenderer(this);
		leg_right4.setRotationPoint(-5.8F, -7.6F, -5.3F);
		leg_right3.addChild(leg_right4);
		setRotationAngle(leg_right4, 0.4363F, 0.0F, 0.0F);
		leg_right4.cubeList.add(new ModelBox(leg_right4, 101, 65, 0.0F, 21.0F, -4.0F, 6, 4, 8, 0.0F, true));

		finger_right_middle = new ModelRenderer(this);
		finger_right_middle.setRotationPoint(3.0F, 22.5F, -7.0F);
		leg_right4.addChild(finger_right_middle);
		finger_right_middle.cubeList.add(new ModelBox(finger_right_middle, 121, 74, 0.0F, -2.5F, -5.0F, 0, 5, 8, 0.0F, true));

		finger_right_left = new ModelRenderer(this);
		finger_right_left.setRotationPoint(6.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_left);
		setRotationAngle(finger_right_left, 0.0F, -0.2618F, 0.0F);
		finger_right_left.cubeList.add(new ModelBox(finger_right_left, 121, 74, 0.0F, -2.5F, -5.0F, 0, 5, 8, 0.0F, true));

		finger_right_right = new ModelRenderer(this);
		finger_right_right.setRotationPoint(0.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_right);
		setRotationAngle(finger_right_right, 0.0F, 0.2618F, 0.0F);
		finger_right_right.cubeList.add(new ModelBox(finger_right_right, 121, 74, 0.0F, -2.5F, -5.0F, 0, 5, 8, 0.0F, true));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-6.0F, -23.0F, -5.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 179, 0, -8.134F, -4.7679F, -5.0F, 8, 8, 9, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(-9.134F, 6.2321F, 0.0F);
		hand_right.addChild(hand_right2);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 179, 19, -1.0F, -7.0F, -4.0F, 7, 24, 7, 0.0F, false));

		claws_right = new ModelRenderer(this);
		claws_right.setRotationPoint(2.5F, 13.5F, -0.5F);
		hand_right2.addChild(claws_right);
		setRotationAngle(claws_right, 1.5708F, 0.0F, 0.0F);
		claws_right.cubeList.add(new ModelBox(claws_right, 0, 96, -3.5F, -3.5F, -3.5F, 7, 7, 7, 0.0F, false));

		claw_right = new ModelRenderer(this);
		claw_right.setRotationPoint(-3.5F, -4.5F, -7.5F);
		claws_right.addChild(claw_right);
		setRotationAngle(claw_right, 0.0F, 0.1745F, 0.0F);
		claw_right.cubeList.add(new ModelBox(claw_right, 0, 106, 0.0F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));

		claw_right2 = new ModelRenderer(this);
		claw_right2.setRotationPoint(0.5F, -4.5F, -7.5F);
		claws_right.addChild(claw_right2);
		claw_right2.cubeList.add(new ModelBox(claw_right2, 0, 106, -0.366F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));

		claw_right3 = new ModelRenderer(this);
		claw_right3.setRotationPoint(4.5F, -4.5F, -7.5F);
		claws_right.addChild(claw_right3);
		setRotationAngle(claw_right3, 0.0F, -0.1745F, 0.0F);
		claw_right3.cubeList.add(new ModelBox(claw_right3, 0, 106, -0.866F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(9.0F, -24.0F, -5.0F);
		setRotationAngle(hand_left, 0.0F, 3.1416F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 179, 0, -6.134F, -3.7679F, -4.0F, 8, 8, 9, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(-8.134F, 7.2321F, 1.0F);
		hand_left.addChild(hand_left2);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 179, 19, 0.0F, -7.0F, -4.0F, 7, 24, 7, 0.0F, false));

		claws_left = new ModelRenderer(this);
		claws_left.setRotationPoint(3.5F, 13.5F, -0.5F);
		hand_left2.addChild(claws_left);
		setRotationAngle(claws_left, -1.5708F, 0.0F, 3.1416F);
		claws_left.cubeList.add(new ModelBox(claws_left, 0, 96, -3.5F, -3.5F, -3.5F, 7, 7, 7, 0.0F, false));

		claw_left = new ModelRenderer(this);
		claw_left.setRotationPoint(-3.5F, -4.5F, -7.5F);
		claws_left.addChild(claw_left);
		setRotationAngle(claw_left, 0.0F, 0.1745F, 0.0F);
		claw_left.cubeList.add(new ModelBox(claw_left, 0, 106, 0.0F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));

		claw_left2 = new ModelRenderer(this);
		claw_left2.setRotationPoint(0.5F, -4.5F, -7.5F);
		claws_left.addChild(claw_left2);
		claw_left2.cubeList.add(new ModelBox(claw_left2, 0, 106, -0.366F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));

		claw_left3 = new ModelRenderer(this);
		claw_left3.setRotationPoint(4.5F, -4.5F, -7.5F);
		claws_left.addChild(claw_left3);
		setRotationAngle(claw_left3, 0.0F, -0.1745F, 0.0F);
		claw_left3.cubeList.add(new ModelBox(claw_left3, 0, 106, -0.866F, -5.0F, -7.0F, 0, 10, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg_left.render(f5);
		head.render(f5);
		body.render(f5);
		leg_right.render(f5);
		hand_right.render(f5);
		hand_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}