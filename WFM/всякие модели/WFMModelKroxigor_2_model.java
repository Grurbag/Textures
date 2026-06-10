// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelKroxigor_2_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer body_top;
	private final ModelRenderer greben_body;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right_2;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left_2;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_2;
	private final ModelRenderer finger_leg_left_1;
	private final ModelRenderer finger_leg_left_2;
	private final ModelRenderer finger_leg_left_2_r1;
	private final ModelRenderer finger_leg_left_3;
	private final ModelRenderer finger_leg_left_3_r1;
	private final ModelRenderer tail;
	private final ModelRenderer greben_tail;
	private final ModelRenderer tail_2;
	private final ModelRenderer tail_3;
	private final ModelRenderer head;
	private final ModelRenderer head_top;
	private final ModelRenderer jaw;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right_r1;
	private final ModelRenderer leg_right_2;
	private final ModelRenderer finger_leg_right_1;
	private final ModelRenderer finger_leg_right_2;
	private final ModelRenderer finger_leg_right_2_r1;
	private final ModelRenderer finger_leg_right_3;
	private final ModelRenderer finger_leg_right_3_r1;

	public WFMModelKroxigor_2_model() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.2638F, 0.2992F);
		setRotationAngle(body, 0.4363F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 2, 0, -5.0F, -8.0F, -4.0F, 10, 16, 8, 0.0F, false));

		body_top = new ModelRenderer(this);
		body_top.setRotationPoint(0.0F, 15.0417F, -7.3442F);
		body.addChild(body_top);
		body_top.cubeList.add(new ModelBox(body_top, 0, 27, -7.0F, -24.0417F, 1.3442F, 14, 6, 11, 0.0F, false));

		greben_body = new ModelRenderer(this);
		greben_body.setRotationPoint(0.0F, 15.0417F, -7.3442F);
		body.addChild(greben_body);
		greben_body.cubeList.add(new ModelBox(greben_body, 0, 47, -4.5F, -27.0417F, 1.3442F, 9, 16, 13, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-6.0F, 2.5F, -2.5F);
		hand_right.cubeList.add(new ModelBox(hand_right, 26, 77, -5.0F, -3.5F, -3.5F, 6, 7, 7, 0.0F, false));

		hand_right_2 = new ModelRenderer(this);
		hand_right_2.setRotationPoint(-3.5F, 6.5F, 0.0F);
		hand_right.addChild(hand_right_2);
		hand_right_2.cubeList.add(new ModelBox(hand_right_2, 26, 93, -2.5F, -6.0F, -2.5F, 5, 12, 5, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(8.0F, 2.5F, -3.5F);
		hand_left.cubeList.add(new ModelBox(hand_left, 0, 77, -3.0F, -3.5F, -3.5F, 6, 7, 7, 0.0F, false));

		hand_left_2 = new ModelRenderer(this);
		hand_left_2.setRotationPoint(-8.0F, 23.5F, -4.5F);
		hand_left.addChild(hand_left_2);
		hand_left_2.cubeList.add(new ModelBox(hand_left_2, 0, 93, 7.0F, -23.0F, 2.0F, 5, 12, 5, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(4.0F, 13.7819F, 2.2453F);
		setRotationAngle(leg_left, -0.2618F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 47, 1, -3.0F, -3.0F, -4.0F, 6, 8, 6, 0.0F, false));

		leg_left_2 = new ModelRenderer(this);
		leg_left_2.setRotationPoint(-5.0F, 11.635F, -5.1121F);
		leg_left.addChild(leg_left_2);
		setRotationAngle(leg_left_2, 0.2618F, 0.0F, 0.0F);
		leg_left_2.cubeList.add(new ModelBox(leg_left_2, 45, 15, 2.5F, -6.4539F, 3.0402F, 5, 7, 5, 0.0F, false));

		finger_leg_left_1 = new ModelRenderer(this);
		finger_leg_left_1.setRotationPoint(3.0F, -0.1094F, 1.9127F);
		leg_left_2.addChild(finger_leg_left_1);
		setRotationAngle(finger_leg_left_1, 0.0F, 0.3491F, 0.0F);
		finger_leg_left_1.cubeList.add(new ModelBox(finger_leg_left_1, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		finger_leg_left_2 = new ModelRenderer(this);
		finger_leg_left_2.setRotationPoint(5.0F, -0.1094F, 1.9127F);
		leg_left_2.addChild(finger_leg_left_2);
		

		finger_leg_left_2_r1 = new ModelRenderer(this);
		finger_leg_left_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger_leg_left_2.addChild(finger_leg_left_2_r1);
		setRotationAngle(finger_leg_left_2_r1, 0.0F, 0.0F, 0.0F);
		finger_leg_left_2_r1.cubeList.add(new ModelBox(finger_leg_left_2_r1, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		finger_leg_left_3 = new ModelRenderer(this);
		finger_leg_left_3.setRotationPoint(7.4641F, -0.1094F, 2.1806F);
		leg_left_2.addChild(finger_leg_left_3);
		setRotationAngle(finger_leg_left_3, 0.0F, -0.3491F, 0.0F);
		

		finger_leg_left_3_r1 = new ModelRenderer(this);
		finger_leg_left_3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger_leg_left_3.addChild(finger_leg_left_3_r1);
		setRotationAngle(finger_leg_left_3_r1, 0.0F, 0.0F, 0.0F);
		finger_leg_left_3_r1.cubeList.add(new ModelBox(finger_leg_left_3_r1, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 13.7255F, 4.5066F);
		setRotationAngle(tail, -0.4363F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 55, 48, -2.5F, -4.3452F, -1.1874F, 5, 7, 6, 0.0F, false));

		greben_tail = new ModelRenderer(this);
		greben_tail.setRotationPoint(-0.5F, -1.5708F, -3.194F);
		tail.addChild(greben_tail);
		greben_tail.cubeList.add(new ModelBox(greben_tail, 84, 48, 0.5F, -5.3335F, 3.0173F, 0, 6, 16, 0.0F, false));

		tail_2 = new ModelRenderer(this);
		tail_2.setRotationPoint(0.0F, 10.4292F, -9.694F);
		tail.addChild(tail_2);
		tail_2.cubeList.add(new ModelBox(tail_2, 56, 64, -1.5F, -13.6614F, 13.0381F, 3, 5, 6, 0.0F, false));

		tail_3 = new ModelRenderer(this);
		tail_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail_2.addChild(tail_3);
		tail_3.cubeList.add(new ModelBox(tail_3, 56, 78, -1.0F, -12.5951F, 17.3584F, 2, 4, 6, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.5F, -6.5F);
		head.cubeList.add(new ModelBox(head, 76, 0, -4.0F, -2.5F, -11.5F, 8, 3, 11, 0.0F, false));

		head_top = new ModelRenderer(this);
		head_top.setRotationPoint(0.0F, 24.5F, 0.5F);
		head.addChild(head_top);
		head_top.cubeList.add(new ModelBox(head_top, 76, 16, -3.0F, -28.0F, -10.0F, 6, 2, 9, 0.0F, false));

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 24.5F, 0.5F);
		head.addChild(jaw);
		jaw.cubeList.add(new ModelBox(jaw, 72, 31, -3.5F, -24.0F, -11.0F, 7, 2, 11, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-4.0F, 14.7722F, 1.0233F);
		setRotationAngle(leg_right, -0.2618F, 0.0F, 0.0F);
		

		leg_right_r1 = new ModelRenderer(this);
		leg_right_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right.addChild(leg_right_r1);
		setRotationAngle(leg_right_r1, 0.0F, 0.0F, 0.0F);
		leg_right_r1.cubeList.add(new ModelBox(leg_right_r1, 52, 92, -3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F, false));

		leg_right_2 = new ModelRenderer(this);
		leg_right_2.setRotationPoint(0.0F, 5.71F, 0.6485F);
		leg_right.addChild(leg_right_2);
		setRotationAngle(leg_right_2, 0.2618F, 0.0F, 0.0F);
		leg_right_2.cubeList.add(new ModelBox(leg_right_2, 50, 106, -2.5F, -3.5F, -2.5F, 5, 7, 5, 0.0F, false));

		finger_leg_right_1 = new ModelRenderer(this);
		finger_leg_right_1.setRotationPoint(-2.0F, 2.8445F, -3.6275F);
		leg_right_2.addChild(finger_leg_right_1);
		setRotationAngle(finger_leg_right_1, 0.0F, 0.48F, 0.0F);
		finger_leg_right_1.cubeList.add(new ModelBox(finger_leg_right_1, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		finger_leg_right_2 = new ModelRenderer(this);
		finger_leg_right_2.setRotationPoint(0.0F, 2.8445F, -3.6275F);
		leg_right_2.addChild(finger_leg_right_2);
		

		finger_leg_right_2_r1 = new ModelRenderer(this);
		finger_leg_right_2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger_leg_right_2.addChild(finger_leg_right_2_r1);
		setRotationAngle(finger_leg_right_2_r1, 0.0F, 0.0F, 0.0F);
		finger_leg_right_2_r1.cubeList.add(new ModelBox(finger_leg_right_2_r1, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

		finger_leg_right_3 = new ModelRenderer(this);
		finger_leg_right_3.setRotationPoint(2.4641F, 2.8445F, -3.3596F);
		leg_right_2.addChild(finger_leg_right_3);
		setRotationAngle(finger_leg_right_3, 0.0F, -0.5236F, 0.0F);
		

		finger_leg_right_3_r1 = new ModelRenderer(this);
		finger_leg_right_3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		finger_leg_right_3.addChild(finger_leg_right_3_r1);
		setRotationAngle(finger_leg_right_3_r1, 0.0F, 0.0F, 0.0F);
		finger_leg_right_3_r1.cubeList.add(new ModelBox(finger_leg_right_3_r1, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		hand_right.render(f5);
		hand_left.render(f5);
		leg_left.render(f5);
		tail.render(f5);
		head.render(f5);
		leg_right.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}