// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer body_r1;
	private final ModelRenderer Body2;
	private final ModelRenderer body2_r1;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right_r1;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right2_r1;
	private final ModelRenderer leg_right3;
	private final ModelRenderer leg_right3_r1;
	private final ModelRenderer leg_right_finger_1;
	private final ModelRenderer leg_right_finger_1_r1;
	private final ModelRenderer leg_right_finger_2;
	private final ModelRenderer leg_right_finger_2_r1;
	private final ModelRenderer leg_right_finger_3;
	private final ModelRenderer leg_right_finger_3_r1;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_r1;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left2_r1;
	private final ModelRenderer leg_left3;
	private final ModelRenderer leg_left3_r1;
	private final ModelRenderer leg_left_finger_1;
	private final ModelRenderer leg_left_finger_1_r1;
	private final ModelRenderer leg_left_finger_2;
	private final ModelRenderer leg_left_finger_2_r1;
	private final ModelRenderer leg_left_finger_3;
	private final ModelRenderer leg_left_finger_3_r1;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;
	private final ModelRenderer fang_left;
	private final ModelRenderer fang_left2;
	private final ModelRenderer fang_left2_r1;
	private final ModelRenderer wing_left;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;
	private final ModelRenderer fang_right;
	private final ModelRenderer fang_right2;
	private final ModelRenderer fang_right2_r1;
	private final ModelRenderer wing_right;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer nose;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(5.0F, 13.0F, 1.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-5.0F, -12.0F, 6.0F);
		Body.addChild(body_r1);
		setRotationAngle(body_r1, 0.7854F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 70, 0, -8.0F, -12.0F, -7.0F, 16, 22, 12, 0.0F, false));

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, -7.0F, -6.0F);
		Body.addChild(Body2);
		setRotationAngle(Body2, 0.7854F, 0.0F, 0.0F);
		

		body2_r1 = new ModelRenderer(this);
		body2_r1.setRotationPoint(-5.0F, -12.0F, 6.0F);
		Body2.addChild(body2_r1);
		setRotationAngle(body2_r1, 0.7854F, 0.0F, 0.0F);
		body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 0, -10.0F, -6.0F, -9.0F, 20, 18, 14, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -7.0F, -6.0F);
		Body.addChild(neck);
		setRotationAngle(neck, 0.7854F, 0.0F, 0.0F);
		

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(-5.0F, -12.0F, 6.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, 1.1781F, 0.0F, 0.0F);
		neck_r1.cubeList.add(new ModelBox(neck_r1, 78, 35, -7.0F, -13.0F, -6.0F, 13, 9, 12, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-8.0F, 5.0F, 7.5F);
		setRotationAngle(leg_right, -0.3054F, 0.0F, 0.0F);
		

		leg_right_r1 = new ModelRenderer(this);
		leg_right_r1.setRotationPoint(0.0F, 2.8612F, 0.9021F);
		leg_right.addChild(leg_right_r1);
		setRotationAngle(leg_right_r1, 0.4363F, 0.0F, 0.0F);
		leg_right_r1.cubeList.add(new ModelBox(leg_right_r1, 0, 32, -3.0F, -6.0F, -3.5F, 6, 12, 8, 0.0F, false));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(10.0F, 20.8612F, 19.4021F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 1.2654F, 0.0F, 0.0F);
		

		leg_right2_r1 = new ModelRenderer(this);
		leg_right2_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_right2.addChild(leg_right2_r1);
		setRotationAngle(leg_right2_r1, 0.4363F, 0.0F, 0.0F);
		leg_right2_r1.cubeList.add(new ModelBox(leg_right2_r1, 0, 52, -2.5F, -6.0F, -1.5F, 5, 12, 6, 0.0F, false));

		leg_right3 = new ModelRenderer(this);
		leg_right3.setRotationPoint(-1.0F, 0.0F, 0.0F);
		leg_right2.addChild(leg_right3);
		setRotationAngle(leg_right3, 1.2654F, 0.0F, 0.0F);
		

		leg_right3_r1 = new ModelRenderer(this);
		leg_right3_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_right3.addChild(leg_right3_r1);
		setRotationAngle(leg_right3_r1, 0.8727F, 0.0F, 0.0F);
		leg_right3_r1.cubeList.add(new ModelBox(leg_right3_r1, 0, 71, -1.0F, 9.0F, -16.5F, 4, 12, 5, 0.0F, false));

		leg_right_finger_1 = new ModelRenderer(this);
		leg_right_finger_1.setRotationPoint(1.0F, 15.0F, 1.0F);
		leg_right3.addChild(leg_right_finger_1);
		setRotationAngle(leg_right_finger_1, 1.2654F, 0.0F, 0.0F);
		

		leg_right_finger_1_r1 = new ModelRenderer(this);
		leg_right_finger_1_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_right_finger_1.addChild(leg_right_finger_1_r1);
		setRotationAngle(leg_right_finger_1_r1, 1.2217F, 0.0F, 0.0F);
		leg_right_finger_1_r1.cubeList.add(new ModelBox(leg_right_finger_1_r1, 0, 89, -0.5F, 11.0F, -16.5F, 1, 6, 2, 0.0F, false));

		leg_right_finger_2 = new ModelRenderer(this);
		leg_right_finger_2.setRotationPoint(1.0F, 15.0F, 1.0F);
		leg_right3.addChild(leg_right_finger_2);
		setRotationAngle(leg_right_finger_2, 1.2654F, 0.0F, 0.0F);
		

		leg_right_finger_2_r1 = new ModelRenderer(this);
		leg_right_finger_2_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_right_finger_2.addChild(leg_right_finger_2_r1);
		setRotationAngle(leg_right_finger_2_r1, 1.2217F, 0.0F, 0.0F);
		leg_right_finger_2_r1.cubeList.add(new ModelBox(leg_right_finger_2_r1, 0, 89, -2.5F, 11.0F, -16.5F, 1, 6, 2, 0.0F, false));

		leg_right_finger_3 = new ModelRenderer(this);
		leg_right_finger_3.setRotationPoint(5.0F, 15.0F, 1.0F);
		leg_right3.addChild(leg_right_finger_3);
		setRotationAngle(leg_right_finger_3, 1.2654F, 0.0F, 0.0F);
		

		leg_right_finger_3_r1 = new ModelRenderer(this);
		leg_right_finger_3_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_right_finger_3.addChild(leg_right_finger_3_r1);
		setRotationAngle(leg_right_finger_3_r1, 1.2217F, 0.0F, 0.0F);
		leg_right_finger_3_r1.cubeList.add(new ModelBox(leg_right_finger_3_r1, 0, 89, -2.5F, 11.0F, -16.5F, 1, 6, 2, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(8.0F, 5.0F, 7.5F);
		setRotationAngle(leg_left, -0.3054F, 0.0F, 0.0F);
		

		leg_left_r1 = new ModelRenderer(this);
		leg_left_r1.setRotationPoint(0.0F, 2.8612F, 0.9021F);
		leg_left.addChild(leg_left_r1);
		setRotationAngle(leg_left_r1, 0.4363F, 0.0F, 0.0F);
		leg_left_r1.cubeList.add(new ModelBox(leg_left_r1, 0, 32, -3.0F, -6.0F, -3.5F, 6, 12, 8, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(10.0F, 20.8612F, 19.4021F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 1.2654F, 0.0F, 0.0F);
		

		leg_left2_r1 = new ModelRenderer(this);
		leg_left2_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_left2.addChild(leg_left2_r1);
		setRotationAngle(leg_left2_r1, 0.4363F, 0.0F, 0.0F);
		leg_left2_r1.cubeList.add(new ModelBox(leg_left2_r1, 0, 52, -2.5F, -6.0F, -1.5F, 5, 12, 6, 0.0F, false));

		leg_left3 = new ModelRenderer(this);
		leg_left3.setRotationPoint(-1.0F, 0.0F, 0.0F);
		leg_left2.addChild(leg_left3);
		setRotationAngle(leg_left3, 1.2654F, 0.0F, 0.0F);
		

		leg_left3_r1 = new ModelRenderer(this);
		leg_left3_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_left3.addChild(leg_left3_r1);
		setRotationAngle(leg_left3_r1, 0.8727F, 0.0F, 0.0F);
		leg_left3_r1.cubeList.add(new ModelBox(leg_left3_r1, 0, 71, -1.0F, 9.0F, -16.5F, 4, 12, 5, 0.0F, false));

		leg_left_finger_1 = new ModelRenderer(this);
		leg_left_finger_1.setRotationPoint(1.0F, 15.0F, 1.0F);
		leg_left3.addChild(leg_left_finger_1);
		setRotationAngle(leg_left_finger_1, 1.2654F, 0.0F, 0.0F);
		

		leg_left_finger_1_r1 = new ModelRenderer(this);
		leg_left_finger_1_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_left_finger_1.addChild(leg_left_finger_1_r1);
		setRotationAngle(leg_left_finger_1_r1, 1.2217F, 0.0F, 0.0F);
		leg_left_finger_1_r1.cubeList.add(new ModelBox(leg_left_finger_1_r1, 0, 89, -0.5F, 11.0F, -16.5F, 1, 6, 2, 0.0F, false));

		leg_left_finger_2 = new ModelRenderer(this);
		leg_left_finger_2.setRotationPoint(1.0F, 15.0F, 1.0F);
		leg_left3.addChild(leg_left_finger_2);
		setRotationAngle(leg_left_finger_2, 1.2654F, 0.0F, 0.0F);
		

		leg_left_finger_2_r1 = new ModelRenderer(this);
		leg_left_finger_2_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_left_finger_2.addChild(leg_left_finger_2_r1);
		setRotationAngle(leg_left_finger_2_r1, 1.2217F, 0.0F, 0.0F);
		leg_left_finger_2_r1.cubeList.add(new ModelBox(leg_left_finger_2_r1, 0, 89, -2.5F, 11.0F, -16.5F, 1, 6, 2, 0.0F, false));

		leg_left_finger_3 = new ModelRenderer(this);
		leg_left_finger_3.setRotationPoint(5.0F, 15.0F, 1.0F);
		leg_left3.addChild(leg_left_finger_3);
		setRotationAngle(leg_left_finger_3, 1.2654F, 0.0F, 0.0F);
		

		leg_left_finger_3_r1 = new ModelRenderer(this);
		leg_left_finger_3_r1.setRotationPoint(-10.0F, -16.0F, 9.5F);
		leg_left_finger_3.addChild(leg_left_finger_3_r1);
		setRotationAngle(leg_left_finger_3_r1, 1.2217F, 0.0F, 0.0F);
		leg_left_finger_3_r1.cubeList.add(new ModelBox(leg_left_finger_3_r1, 0, 89, -2.5F, 11.0F, -16.5F, 1, 6, 2, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(12.5F, -6.0F, -9.0F);
		setRotationAngle(hand_left, 0.4363F, 0.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 30, 33, -3.5F, -2.4358F, -3.4552F, 6, 12, 8, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(0.0F, 8.5642F, -2.4552F);
		hand_left.addChild(hand_left2);
		setRotationAngle(hand_left2, -0.8727F, 0.0F, 0.0F);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 34, 54, -2.5F, -6.0F, -1.0F, 4, 29, 5, 0.0F, false));

		fang_left = new ModelRenderer(this);
		fang_left.setRotationPoint(0.0F, 3.0F, 8.0F);
		hand_left2.addChild(fang_left);
		setRotationAngle(fang_left, -1.3526F, 0.0F, 0.0F);
		fang_left.cubeList.add(new ModelBox(fang_left, 53, 55, -1.5F, 11.0F, 16.0F, 2, 7, 2, 0.0F, false));

		fang_left2 = new ModelRenderer(this);
		fang_left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang_left.addChild(fang_left2);
		setRotationAngle(fang_left2, -1.3526F, 0.0F, 0.0F);
		

		fang_left2_r1 = new ModelRenderer(this);
		fang_left2_r1.setRotationPoint(12.5F, 26.0F, 7.0F);
		fang_left2.addChild(fang_left2_r1);
		setRotationAngle(fang_left2_r1, 2.2689F, 0.0F, 0.0F);
		fang_left2_r1.cubeList.add(new ModelBox(fang_left2_r1, 55, 64, -13.5F, 35.0F, 20.0F, 1, 4, 1, 0.0F, false));

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(0.0F, 14.5642F, -2.4552F);
		hand_left.addChild(wing_left);
		setRotationAngle(wing_left, -0.8727F, 0.0F, 0.0F);
		wing_left.cubeList.add(new ModelBox(wing_left, 34, 76, -0.5F, -12.0F, -1.0F, 0, 31, 13, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-11.5F, -6.0F, -9.0F);
		setRotationAngle(hand_right, 0.4363F, 0.0F, 0.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 30, 33, -3.5F, -2.4358F, -3.4552F, 6, 12, 8, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(0.0F, 8.5642F, -2.4552F);
		hand_right.addChild(hand_right2);
		setRotationAngle(hand_right2, -0.8727F, 0.0F, 0.0F);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 34, 54, -2.5F, -6.0F, -1.0F, 4, 29, 5, 0.0F, false));

		fang_right = new ModelRenderer(this);
		fang_right.setRotationPoint(0.0F, 3.0F, 8.0F);
		hand_right2.addChild(fang_right);
		setRotationAngle(fang_right, -1.3526F, 0.0F, 0.0F);
		fang_right.cubeList.add(new ModelBox(fang_right, 53, 55, -1.5F, 11.0F, 16.0F, 2, 7, 2, 0.0F, false));

		fang_right2 = new ModelRenderer(this);
		fang_right2.setRotationPoint(0.0F, 0.0F, 0.0F);
		fang_right.addChild(fang_right2);
		setRotationAngle(fang_right2, -1.3526F, 0.0F, 0.0F);
		

		fang_right2_r1 = new ModelRenderer(this);
		fang_right2_r1.setRotationPoint(12.5F, 26.0F, 7.0F);
		fang_right2.addChild(fang_right2_r1);
		setRotationAngle(fang_right2_r1, 2.2689F, 0.0F, 0.0F);
		fang_right2_r1.cubeList.add(new ModelBox(fang_right2_r1, 55, 64, -13.5F, 35.0F, 20.0F, 1, 4, 1, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(0.0F, 14.5642F, -2.4552F);
		hand_right.addChild(wing_right);
		setRotationAngle(wing_right, -0.8727F, 0.0F, 0.0F);
		wing_right.cubeList.add(new ModelBox(wing_right, 34, 76, -0.5F, -12.0F, -1.0F, 0, 31, 13, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, -0.9818F, -20.7343F);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -0.5182F, -0.2657F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.2618F, 0.0F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 88, 56, -5.0F, -4.5F, -9.0F, 10, 10, 10, 0.0F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(4.5F, -3.0182F, 11.7343F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, 2.0508F, 0.0F);
		ear_left.cubeList.add(new ModelBox(ear_left, 59, 0, 9.5F, 0.0F, 9.0F, 8, 8, 0, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(-5.5F, 2.9818F, -12.2657F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, 0.0F, 1.1781F, 0.0F);
		ear_right.cubeList.add(new ModelBox(ear_right, 59, 0, -11.5F, -6.0F, 2.6134F, 8, 8, 0, 0.0F, false));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(2.5F, 5.9818F, -15.2657F);
		head.addChild(nose);
		setRotationAngle(nose, 0.2618F, 0.0F, 0.0F);
		nose.cubeList.add(new ModelBox(nose, 61, 35, -6.5F, -7.0F, 6.5F, 8, 8, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		leg_right.render(f5);
		leg_left.render(f5);
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