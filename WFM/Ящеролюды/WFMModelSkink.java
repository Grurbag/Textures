// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelSkink extends ModelBase {
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
	private final ModelRenderer neck;
	private final ModelRenderer jaw_top;
	private final ModelRenderer teeth_top;
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
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;

	public WFMModelSkink() {
		textureWidth = 256;
		textureHeight = 128;

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(4.0F, -4.4F, 7.4F);
		setRotationAngle(leg_left, -0.4363F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 149, 2, 0.0F, -4.8588F, -2.6387F, 6, 20, 6, 0.5F, true));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(0.1F, 20.6126F, -12.9144F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.639F, 0.0F, 0.0F);
		leg_left2.cubeList.add(new ModelBox(leg_left2, 146, 39, 0.0F, 17.1962F, 4.318F, 5, 8, 5, 0.0F, true));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(5.6F, 6.0F, 3.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, -1.639F, 0.0F, 0.0F);
		leg_left3.cubeList.add(new ModelBox(leg_left3, 147, 60, -5.2F, -3.7714F, 13.8757F, 4, 12, 4, 0.0F, true));

		leg_left4 = new ModelRenderer(this);
		leg_left4.setRotationPoint(-5.8F, -7.6F, -5.3F);
		leg_left3.addChild(leg_left4);
		setRotationAngle(leg_left4, 0.4363F, 0.0F, 0.0F);
		leg_left4.cubeList.add(new ModelBox(leg_left4, 140, 79, 0.0F, 21.0F, 8.0F, 6, 4, 8, 0.0F, true));

		finger_left_middle = new ModelRenderer(this);
		finger_left_middle.setRotationPoint(3.0F, 22.5F, -7.0F);
		leg_left4.addChild(finger_left_middle);
		finger_left_middle.cubeList.add(new ModelBox(finger_left_middle, 160, 88, 0.0F, -2.5F, 9.0F, 0, 5, 6, 0.0F, true));

		finger_left_left = new ModelRenderer(this);
		finger_left_left.setRotationPoint(6.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_left);
		setRotationAngle(finger_left_left, 0.0F, -0.2618F, 0.0F);
		finger_left_left.cubeList.add(new ModelBox(finger_left_left, 160, 88, 3.1058F, -2.5F, 8.5911F, 0, 5, 6, 0.0F, true));

		finger_left_right = new ModelRenderer(this);
		finger_left_right.setRotationPoint(0.0F, 22.5F, -6.0F);
		leg_left4.addChild(finger_left_right);
		setRotationAngle(finger_left_right, 0.0F, 0.2618F, 0.0F);
		finger_left_right.cubeList.add(new ModelBox(finger_left_right, 160, 88, -3.1058F, -2.5F, 8.5911F, 0, 5, 6, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -20.6F, -12.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 52, 1, -5.5F, -5.644F, -14.4409F, 10, 10, 10, 0.5F, false));

		jaw_bot = new ModelRenderer(this);
		jaw_bot.setRotationPoint(-3.5F, 8.3101F, -26.7952F);
		head.addChild(jaw_bot);
		setRotationAngle(jaw_bot, 0.3187F, 0.0F, 0.0F);
		jaw_bot.cubeList.add(new ModelBox(jaw_bot, 52, 48, 0.0F, -0.9611F, 7.6247F, 6, 2, 6, 0.0F, false));

		teeth_bot = new ModelRenderer(this);
		teeth_bot.setRotationPoint(0.0F, -1.0F, 0.0F);
		jaw_bot.addChild(teeth_bot);
		teeth_bot.cubeList.add(new ModelBox(teeth_bot, 77, 56, 0.0F, -0.6611F, 7.6247F, 6, 1, 6, -0.1F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(-4.5F, -3.6899F, -13.7952F);
		head.addChild(neck);
		setRotationAngle(neck, 1.3526F, 0.0F, 0.0F);
		neck.cubeList.add(new ModelBox(neck, 0, 0, -0.5F, 8.3973F, -4.5337F, 9, 9, 7, 0.0F, false));

		jaw_top = new ModelRenderer(this);
		jaw_top.setRotationPoint(0.5F, -3.0899F, -16.2952F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1367F, 0.0F, 0.0F);
		jaw_top.cubeList.add(new ModelBox(jaw_top, 52, 27, -5.0F, -1.0353F, -4.8996F, 8, 7, 8, 0.0F, false));

		teeth_top = new ModelRenderer(this);
		teeth_top.setRotationPoint(-4.0F, 7.4F, -12.5F);
		jaw_top.addChild(teeth_top);
		setRotationAngle(teeth_top, 0.0873F, 0.0F, 0.0F);
		teeth_top.cubeList.add(new ModelBox(teeth_top, 77, 67, 0.0F, -2.7257F, 8.0236F, 6, 2, 6, -0.1F, false));

		greben = new ModelRenderer(this);
		greben.setRotationPoint(-0.3956F, -8.2799F, -22.7924F);
		head.addChild(greben);
		setRotationAngle(greben, -1.5817F, 0.0568F, -1.577F);
		greben.cubeList.add(new ModelBox(greben, 1, 64, -11.7226F, -25.8749F, -0.1359F, 23, 23, 0, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 3.9F);
		setRotationAngle(body, 0.9238F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 24, -6.0F, -25.4252F, 0.9335F, 13, 30, 10, 0.5F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(1.0F, 0.0F, 7.0F);
		body.addChild(tail);
		setRotationAngle(tail, -1.142F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 219, 0, -3.5F, -4.8899F, -0.3321F, 6, 9, 9, 0.0F, false));

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 4.2074F, -16.2477F);
		tail.addChild(tail1);
		setRotationAngle(tail1, 0.258F, 0.0F, 0.0F);
		tail1.cubeList.add(new ModelBox(tail1, 217, 19, -3.0F, -2.0226F, 22.9905F, 5, 7, 15, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.1F, 8.8074F, -15.2477F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.4288F, 0.0F, 0.0F);
		tail2.cubeList.add(new ModelBox(tail2, 214, 47, -2.0F, 0.5093F, 36.7347F, 2, 4, 19, 0.0F, false));

		dick_cape = new ModelRenderer(this);
		dick_cape.setRotationPoint(0.6111F, -7.4029F, -13.2229F);
		body.addChild(dick_cape);
		setRotationAngle(dick_cape, -0.9599F, 0.0F, 0.0F);
		dick_cape.cubeList.add(new ModelBox(dick_cape, 0, 88, -6.5F, -11.9334F, 11.9922F, 13, 19, 0, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-4.0F, -5.4F, 7.4F);
		setRotationAngle(leg_right, -0.4363F, 0.0F, 0.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 107, 3, -5.0F, -3.9525F, -2.2161F, 6, 20, 6, 0.5F, true));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(-4.9F, 21.5189F, -12.4918F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.639F, 0.0F, 0.0F);
		leg_right2.cubeList.add(new ModelBox(leg_right2, 107, 38, 1.0F, 17.1962F, 4.318F, 5, 8, 5, 0.0F, true));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(5.6F, 6.0F, 3.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, -1.639F, 0.0F, 0.0F);
		leg_right3.cubeList.add(new ModelBox(leg_right3, 108, 59, -4.2F, -3.7714F, 13.8757F, 4, 12, 4, 0.0F, true));

		leg_right4 = new ModelRenderer(this);
		leg_right4.setRotationPoint(-5.8F, -7.6F, -5.3F);
		leg_right3.addChild(leg_right4);
		setRotationAngle(leg_right4, 0.4363F, 0.0F, 0.0F);
		leg_right4.cubeList.add(new ModelBox(leg_right4, 101, 78, 0.0F, 21.0F, 8.0F, 6, 4, 8, 0.0F, true));

		finger_right_middle = new ModelRenderer(this);
		finger_right_middle.setRotationPoint(3.0F, 22.5F, -7.0F);
		leg_right4.addChild(finger_right_middle);
		finger_right_middle.cubeList.add(new ModelBox(finger_right_middle, 121, 87, 0.0F, -2.5F, 9.0F, 0, 5, 6, 0.0F, true));

		finger_right_left = new ModelRenderer(this);
		finger_right_left.setRotationPoint(6.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_left);
		setRotationAngle(finger_right_left, 0.0F, -0.2618F, 0.0F);
		finger_right_left.cubeList.add(new ModelBox(finger_right_left, 121, 87, 3.1058F, -2.5F, 8.5911F, 0, 5, 6, 0.0F, true));

		finger_right_right = new ModelRenderer(this);
		finger_right_right.setRotationPoint(0.0F, 22.5F, -6.0F);
		leg_right4.addChild(finger_right_right);
		setRotationAngle(finger_right_right, 0.0F, 0.2618F, 0.0F);
		finger_right_right.cubeList.add(new ModelBox(finger_right_right, 121, 87, -3.1058F, -2.5F, 8.5911F, 0, 5, 6, 0.0F, true));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(8.0F, -17.0F, -9.0F);
		setRotationAngle(hand_left, 0.0F, 3.1416F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 181, 2, -6.1341F, -4.7679F, -3.0F, 7, 8, 7, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(-9.1341F, 4.2321F, 12.0F);
		hand_left.addChild(hand_left2);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 181, 21, 2.0F, -5.0F, -14.0F, 5, 25, 5, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-6.0F, -18.0F, -9.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 181, 2, -7.134F, -3.7679F, -4.0F, 7, 8, 7, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(-9.134F, 5.2321F, -11.0F);
		hand_right.addChild(hand_right2);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 181, 21, 1.0F, -5.0F, 8.0F, 5, 25, 5, 0.0F, false));
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