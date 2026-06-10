// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_r1;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left2_r1;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left3_r1;
	private final ModelRenderer finger_left_1;
	private final ModelRenderer finger_left_2;
	private final ModelRenderer finger_left_3;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right_r1;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right2_r1;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right3_r1;
	private final ModelRenderer finger_right_1;
	private final ModelRenderer finger_right_2;
	private final ModelRenderer finger_right_3;
	private final ModelRenderer hand_left;
	private final ModelRenderer wing_left;
	private final ModelRenderer hand_right;
	private final ModelRenderer wing_right;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 21.0F, 5.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.2618F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 16, 16, -4.0F, -24.0F, -2.0F, 8, 14, 4, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(3.0F, 10.0F, 1.0F);
		setRotationAngle(leg_left, -0.1745F, 0.0F, 0.0F);
		

		leg_left_r1 = new ModelRenderer(this);
		leg_left_r1.setRotationPoint(2.0F, -13.8633F, -1.5628F);
		leg_left.addChild(leg_left_r1);
		setRotationAngle(leg_left_r1, -0.4363F, 0.0F, 0.0F);
		leg_left_r1.cubeList.add(new ModelBox(leg_left_r1, 0, 16, -4.4F, 9.7704F, 5.2429F, 4, 10, 4, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(2.0F, 6.1367F, -15.5628F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.8762F, 0.0F, 0.0F);
		

		leg_left2_r1 = new ModelRenderer(this);
		leg_left2_r1.setRotationPoint(0.0F, -5.0F, 0.0F);
		leg_left2.addChild(leg_left2_r1);
		setRotationAngle(leg_left2_r1, -0.4363F, 0.0F, 0.0F);
		leg_left2_r1.cubeList.add(new ModelBox(leg_left2_r1, 0, 30, -4.5F, 17.37F, 2.5961F, 4, 7, 3, 0.0F, false));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(1.0F, 10.0F, -17.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, 1.6581F, 0.0F, 0.0F);
		

		leg_left3_r1 = new ModelRenderer(this);
		leg_left3_r1.setRotationPoint(0.0F, -5.0F, 0.0F);
		leg_left3.addChild(leg_left3_r1);
		setRotationAngle(leg_left3_r1, -0.4363F, 0.0F, 0.0F);
		leg_left3_r1.cubeList.add(new ModelBox(leg_left3_r1, 0, 40, -5.0F, 10.1296F, -2.3144F, 3, 7, 3, 0.0F, false));

		finger_left_1 = new ModelRenderer(this);
		finger_left_1.setRotationPoint(0.0F, 0.0F, 1.0F);
		leg_left3.addChild(finger_left_1);
		setRotationAngle(finger_left_1, -0.2182F, 0.0F, 0.0F);
		finger_left_1.cubeList.add(new ModelBox(finger_left_1, 0, 50, -4.0F, 5.0F, -5.0F, 1, 1, 4, 0.0F, false));

		finger_left_2 = new ModelRenderer(this);
		finger_left_2.setRotationPoint(0.0F, 0.0F, 1.0F);
		leg_left3.addChild(finger_left_2);
		setRotationAngle(finger_left_2, -0.2233F, -0.2129F, 0.0479F);
		finger_left_2.cubeList.add(new ModelBox(finger_left_2, 0, 50, -6.0822F, 5.0F, -4.8815F, 1, 1, 4, 0.0F, false));

		finger_left_3 = new ModelRenderer(this);
		finger_left_3.setRotationPoint(1.0F, 0.0F, 0.0F);
		leg_left3.addChild(finger_left_3);
		setRotationAngle(finger_left_3, -0.2256F, 0.2555F, -0.0579F);
		finger_left_3.cubeList.add(new ModelBox(finger_left_3, 0, 55, -2.7059F, 5.0F, -4.8296F, 1, 1, 5, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-2.6F, 10.3295F, 1.3293F);
		setRotationAngle(leg_right, -0.1745F, 0.0F, 0.0F);
		

		leg_right_r1 = new ModelRenderer(this);
		leg_right_r1.setRotationPoint(2.6F, -14.1306F, -1.9444F);
		leg_right.addChild(leg_right_r1);
		setRotationAngle(leg_right_r1, -0.4363F, 0.0F, 0.0F);
		leg_right_r1.cubeList.add(new ModelBox(leg_right_r1, 0, 16, -4.6F, 9.7704F, 5.2429F, 4, 10, 4, 0.0F, false));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(2.6F, 5.8694F, -15.9444F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.8762F, 0.0F, 0.0F);
		

		leg_right2_r1 = new ModelRenderer(this);
		leg_right2_r1.setRotationPoint(0.0F, -5.0F, 0.0F);
		leg_right2.addChild(leg_right2_r1);
		setRotationAngle(leg_right2_r1, -0.4363F, 0.0F, 0.0F);
		leg_right2_r1.cubeList.add(new ModelBox(leg_right2_r1, 0, 30, -4.5F, 17.37F, 2.5961F, 4, 7, 3, 0.0F, false));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(1.0F, 10.0F, -17.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, 1.6581F, 0.0F, 0.0F);
		

		leg_right3_r1 = new ModelRenderer(this);
		leg_right3_r1.setRotationPoint(0.0F, -5.0F, 0.0F);
		leg_right3.addChild(leg_right3_r1);
		setRotationAngle(leg_right3_r1, -0.4363F, 0.0F, 0.0F);
		leg_right3_r1.cubeList.add(new ModelBox(leg_right3_r1, 0, 40, -5.0F, 10.1296F, -2.3144F, 3, 7, 3, 0.0F, false));

		finger_right_1 = new ModelRenderer(this);
		finger_right_1.setRotationPoint(0.0F, 0.0F, 1.0F);
		leg_right3.addChild(finger_right_1);
		setRotationAngle(finger_right_1, -0.2182F, 0.0F, 0.0F);
		finger_right_1.cubeList.add(new ModelBox(finger_right_1, 0, 50, -4.0F, 5.0F, -5.0F, 1, 1, 4, 0.0F, false));

		finger_right_2 = new ModelRenderer(this);
		finger_right_2.setRotationPoint(0.0F, 0.0F, 1.0F);
		leg_right3.addChild(finger_right_2);
		setRotationAngle(finger_right_2, -0.2233F, -0.2129F, 0.0479F);
		finger_right_2.cubeList.add(new ModelBox(finger_right_2, 0, 50, -6.0822F, 5.0F, -4.8815F, 1, 1, 4, 0.0F, false));

		finger_right_3 = new ModelRenderer(this);
		finger_right_3.setRotationPoint(1.0F, -0.0622F, 0.0522F);
		leg_right3.addChild(finger_right_3);
		setRotationAngle(finger_right_3, -0.2256F, 0.2555F, -0.0579F);
		finger_right_3.cubeList.add(new ModelBox(finger_right_3, 0, 55, -2.7059F, 5.0F, -4.8296F, 1, 1, 5, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, 0.0F, 0.0F);
		setRotationAngle(hand_left, 0.0F, 0.0F, -0.0873F);
		hand_left.cubeList.add(new ModelBox(hand_left, 40, 16, -1.1743F, -2.0076F, -3.0F, 4, 14, 4, 0.0F, true));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(0.8257F, 10.9924F, -4.0F);
		hand_left.addChild(wing_left);
		setRotationAngle(wing_left, 0.0F, 1.5708F, 0.0F);
		wing_left.cubeList.add(new ModelBox(wing_left, 48, 0, -13.0F, -11.0F, 0.5F, 8, 12, 0, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-5.0F, 0.0F, 0.0F);
		setRotationAngle(hand_right, 0.0F, 0.0F, 0.0873F);
		hand_right.cubeList.add(new ModelBox(hand_right, 40, 16, -2.8257F, -2.0076F, -3.0F, 4, 14, 4, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(11.1743F, 10.9924F, -4.0F);
		hand_right.addChild(wing_right);
		setRotationAngle(wing_right, 0.0F, 1.5708F, 0.0F);
		wing_right.cubeList.add(new ModelBox(wing_right, 48, 0, -13.0F, -11.0F, -12.5F, 8, 12, 0, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, -2.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(2.0F, -2.0F, -11.0F);
		head.addChild(nose);
		nose.cubeList.add(new ModelBox(nose, 32, 8, -5.5F, -6.0F, 6.5F, 7, 8, 0, 0.0F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(4.0F, -2.0F, -7.0F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, 2.0508F, 0.0F);
		ear_left.cubeList.add(new ModelBox(ear_left, 24, 0, -11.5F, -6.0F, -2.0F, 8, 8, 0, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(-5.0F, -2.0F, -7.0F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, 0.0F, 1.1781F, 0.0F);
		ear_right.cubeList.add(new ModelBox(ear_right, 24, 0, -11.5F, -6.0F, 2.6134F, 8, 8, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leg_left.render(f5);
		leg_right.render(f5);
		hand_left.render(f5);
		hand_right.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}