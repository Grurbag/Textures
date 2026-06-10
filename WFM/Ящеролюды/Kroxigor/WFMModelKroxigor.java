// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer body_top;
	private final ModelRenderer greben_body;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_r1;
	private final ModelRenderer leg_left2;
	private final ModelRenderer leg_left2_r1;
	private final ModelRenderer finger_leg_left_1;
	private final ModelRenderer finger_leg_left_1_r1;
	private final ModelRenderer finger_leg_left_2;
	private final ModelRenderer finger_leg_left_2_r1;
	private final ModelRenderer finger_leg_left_3;
	private final ModelRenderer finger_leg_left_3_r1;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right_r1;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_right2_r1;
	private final ModelRenderer finger_leg_right_1;
	private final ModelRenderer finger_leg_left_1_r2;
	private final ModelRenderer finger_leg_right_2;
	private final ModelRenderer finger_leg_left_2_r2;
	private final ModelRenderer finger_leg_right_3;
	private final ModelRenderer finger_leg_left_3_r2;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer greben_tail;
	private final ModelRenderer greben_tail_r1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail2_r1;
	private final ModelRenderer tail3;
	private final ModelRenderer tail3_r1;
	private final ModelRenderer head;
	private final ModelRenderer head_top;
	private final ModelRenderer jaw;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right_r1;
	private final ModelRenderer hand_right2;
	private final ModelRenderer hand_right2_r1;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 23.0F, 0.0F);
		setRotationAngle(body, 0.4363F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 2, 0, -5.0F, -23.0417F, 3.3442F, 10, 16, 8, 0.0F, false));

		body_top = new ModelRenderer(this);
		body_top.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_top);
		body_top.cubeList.add(new ModelBox(body_top, 0, 27, -7.0F, -24.0417F, 1.3442F, 14, 6, 11, 0.0F, false));

		greben_body = new ModelRenderer(this);
		greben_body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(greben_body);
		greben_body.cubeList.add(new ModelBox(greben_body, 0, 47, -4.5F, -27.0417F, 1.3442F, 9, 16, 13, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(-1.0F, 24.0F, -4.0F);
		setRotationAngle(leg_left, 0.0873F, 0.0F, 0.0F);
		

		leg_left_r1 = new ModelRenderer(this);
		leg_left_r1.setRotationPoint(5.0F, -10.245F, 0.1387F);
		leg_left.addChild(leg_left_r1);
		setRotationAngle(leg_left_r1, -0.2618F, 0.0F, 0.0F);
		leg_left_r1.cubeList.add(new ModelBox(leg_left_r1, 47, 1, -3.0F, -5.2155F, 3.8937F, 6, 8, 6, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left.addChild(leg_left2);
		

		leg_left2_r1 = new ModelRenderer(this);
		leg_left2_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
		leg_left2.addChild(leg_left2_r1);
		setRotationAngle(leg_left2_r1, -0.0436F, 0.0F, 0.0F);
		leg_left2_r1.cubeList.add(new ModelBox(leg_left2_r1, 45, 15, 2.5F, -4.6947F, 2.9933F, 5, 7, 5, 0.0F, false));

		finger_leg_left_1 = new ModelRenderer(this);
		finger_leg_left_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(finger_leg_left_1);
		

		finger_leg_left_1_r1 = new ModelRenderer(this);
		finger_leg_left_1_r1.setRotationPoint(3.0F, -0.7195F, -5.0607F);
		finger_leg_left_1.addChild(finger_leg_left_1_r1);
		setRotationAngle(finger_leg_left_1_r1, 0.0F, 0.3923F, -0.0181F);
		finger_leg_left_1_r1.cubeList.add(new ModelBox(finger_leg_left_1_r1, 0, 0, -3.1762F, 0.11F, 4.4394F, 1, 1, 4, 0.0F, false));

		finger_leg_left_2 = new ModelRenderer(this);
		finger_leg_left_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(finger_leg_left_2);
		

		finger_leg_left_2_r1 = new ModelRenderer(this);
		finger_leg_left_2_r1.setRotationPoint(3.0F, -0.7195F, -5.0607F);
		finger_leg_left_2.addChild(finger_leg_left_2_r1);
		setRotationAngle(finger_leg_left_2_r1, 0.0F, 0.0F, 0.0F);
		finger_leg_left_2_r1.cubeList.add(new ModelBox(finger_leg_left_2_r1, 0, 0, 1.5F, 0.1101F, 4.9734F, 1, 1, 4, 0.0F, false));

		finger_leg_left_3 = new ModelRenderer(this);
		finger_leg_left_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_left2.addChild(finger_leg_left_3);
		

		finger_leg_left_3_r1 = new ModelRenderer(this);
		finger_leg_left_3_r1.setRotationPoint(3.0F, -0.7195F, -5.0607F);
		finger_leg_left_3.addChild(finger_leg_left_3_r1);
		setRotationAngle(finger_leg_left_3_r1, 0.0F, -0.5236F, 0.0F);
		finger_leg_left_3_r1.cubeList.add(new ModelBox(finger_leg_left_3_r1, 0, 0, 6.9867F, 0.1101F, 2.0391F, 1, 1, 4, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-9.0F, 24.0F, -4.0F);
		setRotationAngle(leg_right, 0.0873F, 0.0F, 0.0F);
		

		leg_right_r1 = new ModelRenderer(this);
		leg_right_r1.setRotationPoint(5.0F, -10.245F, 0.1387F);
		leg_right.addChild(leg_right_r1);
		setRotationAngle(leg_right_r1, -2.8798F, 0.0F, -3.1416F);
		leg_right_r1.cubeList.add(new ModelBox(leg_right_r1, 47, 1, -3.0F, -5.2155F, -9.8937F, 6, 8, 6, 0.0F, false));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right.addChild(leg_right2);
		

		leg_right2_r1 = new ModelRenderer(this);
		leg_right2_r1.setRotationPoint(5.0F, -3.564F, -1.4331F);
		leg_right2.addChild(leg_right2_r1);
		setRotationAngle(leg_right2_r1, -3.0979F, 0.0F, 3.1397F);
		leg_right2_r1.cubeList.add(new ModelBox(leg_right2_r1, 45, 15, -2.4988F, -3.195F, -9.4934F, 5, 7, 5, 0.0F, false));

		finger_leg_right_1 = new ModelRenderer(this);
		finger_leg_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(finger_leg_right_1);
		

		finger_leg_left_1_r2 = new ModelRenderer(this);
		finger_leg_left_1_r2.setRotationPoint(3.0F, -0.7195F, -5.0607F);
		finger_leg_right_1.addChild(finger_leg_left_1_r2);
		setRotationAngle(finger_leg_left_1_r2, 0.0F, 0.3923F, -0.0181F);
		finger_leg_left_1_r2.cubeList.add(new ModelBox(finger_leg_left_1_r2, 0, 0, -3.1762F, 0.11F, 4.4394F, 1, 1, 4, 0.0F, false));

		finger_leg_right_2 = new ModelRenderer(this);
		finger_leg_right_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(finger_leg_right_2);
		

		finger_leg_left_2_r2 = new ModelRenderer(this);
		finger_leg_left_2_r2.setRotationPoint(3.0F, -0.7195F, -5.0607F);
		finger_leg_right_2.addChild(finger_leg_left_2_r2);
		setRotationAngle(finger_leg_left_2_r2, 0.0F, 0.0F, 0.0F);
		finger_leg_left_2_r2.cubeList.add(new ModelBox(finger_leg_left_2_r2, 0, 0, 1.5F, 0.1101F, 4.9734F, 1, 1, 4, 0.0F, false));

		finger_leg_right_3 = new ModelRenderer(this);
		finger_leg_right_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right2.addChild(finger_leg_right_3);
		

		finger_leg_left_3_r2 = new ModelRenderer(this);
		finger_leg_left_3_r2.setRotationPoint(3.0F, -0.7195F, -5.0607F);
		finger_leg_right_3.addChild(finger_leg_left_3_r2);
		setRotationAngle(finger_leg_left_3_r2, 0.0F, -0.5236F, 0.0F);
		finger_leg_left_3_r2.cubeList.add(new ModelBox(finger_leg_left_3_r2, 0, 0, 6.9867F, 0.1101F, 2.0391F, 1, 1, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 25.0F, -5.0F);
		

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(-0.5F, -12.0F, 13.5F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, -0.4363F, 0.0F, 0.0F);
		tail_r1.cubeList.add(new ModelBox(tail_r1, 55, 48, -2.0F, -2.0F, -4.5F, 5, 7, 6, 0.0F, false));

		greben_tail = new ModelRenderer(this);
		greben_tail.setRotationPoint(-0.5F, -12.0F, 6.5F);
		tail.addChild(greben_tail);
		

		greben_tail_r1 = new ModelRenderer(this);
		greben_tail_r1.setRotationPoint(0.0F, 0.0F, 7.0F);
		greben_tail.addChild(greben_tail_r1);
		setRotationAngle(greben_tail_r1, -0.4363F, 0.0F, 0.0F);
		greben_tail_r1.cubeList.add(new ModelBox(greben_tail_r1, 84, 48, 0.5F, -5.0F, -4.5F, 0, 6, 16, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(tail2);
		

		tail2_r1 = new ModelRenderer(this);
		tail2_r1.setRotationPoint(-0.5F, -12.0F, 13.5F);
		tail2.addChild(tail2_r1);
		setRotationAngle(tail2_r1, -0.4363F, 0.0F, 0.0F);
		tail2_r1.cubeList.add(new ModelBox(tail2_r1, 56, 64, -1.0F, -1.0F, 0.5F, 3, 5, 6, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail2.addChild(tail3);
		

		tail3_r1 = new ModelRenderer(this);
		tail3_r1.setRotationPoint(-0.5F, -12.0F, 13.5F);
		tail3.addChild(tail3_r1);
		setRotationAngle(tail3_r1, -0.4363F, 0.0F, 0.0F);
		tail3_r1.cubeList.add(new ModelBox(tail3_r1, 56, 78, -0.5F, 0.0F, 5.5F, 2, 4, 6, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 27.0F, -6.0F);
		head.cubeList.add(new ModelBox(head, 76, 0, -4.0F, -27.0F, -12.0F, 8, 3, 11, 0.0F, false));

		head_top = new ModelRenderer(this);
		head_top.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(head_top);
		head_top.cubeList.add(new ModelBox(head_top, 76, 16, -3.0F, -28.0F, -10.0F, 6, 2, 9, 0.0F, false));

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(jaw);
		jaw.cubeList.add(new ModelBox(jaw, 72, 31, -3.5F, -24.0F, -11.0F, 7, 2, 11, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(0.0F, 26.0F, -8.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 0, 77, 5.0F, -27.0F, 1.0F, 6, 7, 7, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_left.addChild(hand_left2);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 0, 93, 7.0F, -23.0F, 2.0F, 5, 12, 5, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-16.0F, 26.0F, -7.0F);
		

		hand_right_r1 = new ModelRenderer(this);
		hand_right_r1.setRotationPoint(8.0F, -23.5F, 4.5F);
		hand_right.addChild(hand_right_r1);
		setRotationAngle(hand_right_r1, 0.0F, 3.1416F, 0.0F);
		hand_right_r1.cubeList.add(new ModelBox(hand_right_r1, 0, 77, -3.0F, -3.5F, -3.5F, 6, 7, 7, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(-3.0F, 0.0F, 0.0F);
		hand_right.addChild(hand_right2);
		

		hand_right2_r1 = new ModelRenderer(this);
		hand_right2_r1.setRotationPoint(9.5F, -17.0F, 4.5F);
		hand_right2.addChild(hand_right2_r1);
		setRotationAngle(hand_right2_r1, 0.0F, 3.1416F, 0.0F);
		hand_right2_r1.cubeList.add(new ModelBox(hand_right2_r1, 0, 93, -2.5F, -6.0F, -2.5F, 5, 12, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leg_left.render(f5);
		leg_right.render(f5);
		tail.render(f5);
		head.render(f5);
		hand_left.render(f5);
		hand_right.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}